package com.bitstudy.app.controller;

import com.bitstudy.app.domain.*;
import com.bitstudy.app.service.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.net.URLEncoder;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class DetailController {
    @Autowired
    ArticleService articleService;
    @Autowired
    AdateService adateService;
    @Autowired
    AtimeService atimeService;
    @Autowired
    SeatService seatService;
    @Autowired
    AorderService aoderService;
    @Autowired
    CashService cashService;


    @GetMapping("/detailPage")
    public String detailPage(Integer a_seqno, Model model, HttpSession session) throws Exception {
        String user = (String) session.getAttribute("u_id");
        Integer userCash = cashService.selectId(user); // 로그인하고있는 user가 보유하고 있는 cash 받아오기
        model.addAttribute("currentCash", userCash);

        // 사용자가 누른 아티클 정보 가져오기
        ArticleDto selectArticle = articleService.selectArticle(a_seqno);
        System.out.println("이정보받아올꺼야 :" + selectArticle);

        //첫 화면에서 아티클 날짜 포맷 바꿔주기 yyyy-mm-dd 형식으로
        Date startTime = selectArticle.getA_s_date();
        Date endTime = selectArticle.getA_e_date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String startDate = sdf.format(startTime);
        String endDate = sdf.format(endTime);

        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);

        model.addAttribute("selectArticle", selectArticle);//jsp 화면 띄워주는데에 사용


        // 해당 아티클의 해당 공연날짜 yyyy-mm-dd포맷으로 변형시켜 배열로 받아오기
        List<AdateDto> selectAdate = adateService.selectAdate(a_seqno);
        SimpleDateFormat adateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<String> adateList = new ArrayList<>();
        for (AdateDto adate : selectAdate) {
            adateList.add(adateFormat.format(adate.getAd_date()));
        }

        // JSON 변환
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonDates = objectMapper.writeValueAsString(adateList);
        System.out.println("adate 잘 뽑아오니?:" + adateList);

        model.addAttribute("adateList", jsonDates);
//        model.addAttribute("selectAdate", selectAdate);

        return "detail_page";
    }


    // ajax 날짜에 해당하는 공연시간 가져오기
    @GetMapping("/getTIme/")
    @ResponseBody
    public ResponseEntity<List<AtimeDto>> getTIme(Integer a_seqno, String a_date) {
        try {
            System.out.println("들고온 날짜입니다." + a_date);

            //stirng으로(yyyy-mm-dd) 바꿨던 날짜 다시 date타입으로 변환
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(a_date);

            //timeList = 해당 날짜의 공연시간 뽑아온 리스트
            Integer result = adateService.selectAdSeqno(a_seqno, date);
            List<AtimeDto> timeList = atimeService.selectAtime(result);

            System.out.println("timeList="+timeList);
            return new ResponseEntity<List<AtimeDto>>(timeList, HttpStatus.OK);// 200

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<AtimeDto>>(HttpStatus.BAD_REQUEST);// 400
        }
    }


    // ajax 좌석 가져오기
    @GetMapping("/getSeat/")
    @ResponseBody
    public ResponseEntity<List<String>> getSeat(Integer t_seqno) {
        try {
            System.out.println("t_seqno="+t_seqno);

            //timeResult = 선택한 시간에 이미 구매된 좌석 띄워주기
            List<String> timeResult = seatService.selectSeat(t_seqno);
            System.out.println("이미 구매된 좌석들: "+timeResult);
            return new ResponseEntity<List<String>>(timeResult, HttpStatus.OK);// 200


        } catch (Exception e) {
            return new ResponseEntity<List<String>>(HttpStatus.BAD_REQUEST);// 400
        }
    }



    // ajax 티켓예매 화면에서 정보들 받아와 넘겨줌 (Integer a_seqno ~ Integer update_cash)
    @PostMapping("/ticket/save/")
    @ResponseBody
    public String saveTicket(HttpSession session, Integer a_seqno, String a_date, String a_time, String[] a_seat, Integer update_cash) throws Exception {

        String u_id = (String) session.getAttribute("u_id");
        if (u_id == null){
            return "redirect:/login";
        }
        else {
            try {
                List<SeatListDto> selectSeatList = aoderService.selectSeatList(a_seqno, u_id);
                System.out.println("이 아티클에서 좌석 뭐뭐 구매했어? = " + selectSeatList);

                if (selectSeatList.size() == 2){
                    throw new RuntimeException("강제로 발생시킨 예외");
                }
                else if(selectSeatList.size() == 1){
                    if (selectSeatList.get(0).getAo_s_seat2() != null){
                        throw new RuntimeException("강제로 발생시킨 예외");
                    }
                    else if (a_seat.length >= 2){
                        String msg = URLEncoder.encode("해당 공연에 1 좌석이 예매되어있습니다. 한 공연당 최대 2 좌석 구매 가능합니다.", "UTF-8");
                        throw new RuntimeException("강제로 발생시킨 예외"+msg);
                    }
                }



                //넘어오는 a_date의 타입을(위에 string yyyy-mm-dd로 바꿔주었기 때문에) DB와 맞게 date타입으로 변환
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(a_date);
                System.out.println("변환된 Date 객체: " + date);

                //넘어오는 a_time의 타입을 DB와 맞게 Time타입으로 변환
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime at_time = LocalTime.parse(a_time, formatter);
                Time sqlTime = Time.valueOf(at_time);

                Integer dateSeqno = adateService.selectAdSeqno(a_seqno, date); //변환된 a_date
                Integer timdSeqno = atimeService.selectAtSeqno(dateSeqno, sqlTime); //변환된 a_time


                // 주문 테이블에 예매한 정보들 set 해주기
                AorderDto aorderDto = new AorderDto();
                aorderDto.setAo_a_seqno(a_seqno);
                aorderDto.setAo_d_seqno(dateSeqno);
                aorderDto.setAo_t_seqno(timdSeqno);
                aorderDto.setAo_s_seat1(a_seat[0]); // 배열로 받아온 좌석 중 첫번째꺼 넣기
                if (a_seat.length >= 2) {
                    aorderDto.setAo_s_seat2(a_seat[1]);
                } // 배열로 받아온 좌석 중 두번째꺼 넣기
                aorderDto.setAo_user(u_id); // 로그인 한 user 넣어주기
                System.out.println("aorderDto=" + aorderDto);


                aoderService.insertAorder(aorderDto); // 위의 결과로 set해준 aorderDto 주문테이블에 insert해주기
                cashService.updateCash(update_cash, u_id); // 예매했으니 쓴 포인트만큼 차감한 cash update 해주기
                seatService.updateSeat(timdSeqno, a_seat[0]); //이미 구매된 좌석인걸 파악하기 위해 s_value 값을 1로 변경해주기 2좌석이면 하나 더 넣어주게 if문 진행
                if (a_seat.length >= 2) {
                    seatService.updateSeat(timdSeqno, a_seat[1]);
                }
                

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null; //예매완료 후 예매 진행중이던 화면 보여주기
    }
}
