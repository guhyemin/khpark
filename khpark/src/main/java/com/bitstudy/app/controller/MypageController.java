package com.bitstudy.app.controller;

import com.bitstudy.app.domain.*;
import com.bitstudy.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller

/*후기작성
 * 일단 세션에서 아이디값 가져와서 그 아이디값이 예매한 목록 가져와서 띄워주기
 * 그리고 저장하기 누르면 디비에 넣어주기
 *
 * 세세st
 * 세션에있는 아이디 들고와서 그유저가 예매한 게시글 고유번호 들고와서
 * 유저가 구매한 공연 목록을 들고오기 (맵퍼 만들어야함. 조인 해야함!)
 * 리스트(목록)를 모델에담서 찍어 주기만 하면됨 얼마나간단함 아이쉽다.
 *
 * */


public class MypageController {
    @Autowired
    UserService userService;

    @Autowired
    CashService cashService;

    @Autowired
    AorderService aorderService;

    @Autowired
    ArticleService articleService;

    @Autowired
    ReviewService reviewService;

    @GetMapping("/myPage")
    public String myPage(HttpSession session, Model model){
        String user = (String) session.getAttribute("u_id");


        if(user == null){
            return "redirect:/login";
        }

        UserDto userDto = userService.selectMypage(user);
        List<ArticleDto> reviewList = aorderService.selectReviewList(user);

        List<OrderListDto> orderListDto = aorderService.selectAorder(user);
        System.out.println(orderListDto);

        //예매내역에서 아티클 날짜 포맷 바꿔주기
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //패턴만들어주기
        List<String> getTime = new ArrayList<>(); //패턴으로만든 시간 넣어줄 리스트


        for (OrderListDto article : orderListDto) {  //포이치문 돌립니다
            getTime.add(sdf.format(article.getAd_date()) ) ; // 리스트에 date를 패턴형식으로 바꿔서 넣어주기
        }


        model.addAttribute("getTime", getTime);
        model.addAttribute("userDto",userDto);
        model.addAttribute("reviewList",reviewList);
        model.addAttribute("orderListDto",orderListDto);


        return "my_page";
    }

    /*
     * 로그인한 사람 캐시 들고와서 저장
     * 충전할 금액 받아오기
     * 둘이 더해서 로그인한 사람 캐시 업데이트
     * */

    @PostMapping("/point")
    public String point(HttpSession session,String cash){
        String user = (String) session.getAttribute("u_id");
        String ttt  =  cash.replaceAll(",",""); // 포인트를 한국단위로 , 찍어서 문자열로 받아옴 그래서 , 없애주기
        Integer aaa = Integer.valueOf(ttt); // 없앤 포인트를 숫자형으로 변환해서 저장
        Integer userCash = cashService.selectId(user); // 원래유저 포인트 들고오기
        cashService.updateCash((aaa+userCash),user);


        return "redirect:/myPage";

    }


    /* 비밀번호 업데이트
     * 유저 비밀번호 가져와서 저장
     * 유저가 적은 비밀번호 맞는지 확인하고
     * 새로운 비밀번호로 업데이트해주기
     * */

    @PostMapping("/pwUpdate")
    public String pwUpdate(HttpSession session,String nowPw,String upPw){
        String user = (String) session.getAttribute("u_id");
        UserDto userDto =  userService.selectUser(user);
        String userPw = userDto.getU_pw();
        if(!userPw.equals(nowPw)){ // 입력한 현재 비밀번호가 같지않을때
            return "redirect:/myPage?mode1=1";
        }
        userDto.setU_pw(upPw); // 업데이트할 비밀번호를 검색해서 들고온 내정보에 셋!
        System.out.println("최신정보: " + userDto);
        userService.updateUser(userDto);

        return "redirect:/myPage?mode1=0";
    }



    @PostMapping("/numUpdate")
    public String numUpdate(HttpSession session,String upNum){
        String user = (String) session.getAttribute("u_id");
        UserDto userDto =  userService.selectUser(user);

        userDto.setU_num(upNum);
        userService.updateUser(userDto);

        return "redirect:/myPage?mode1=0";
    }

    @PostMapping("/answerUpdate")
    public String answerUpdate(HttpSession session,String upAnswer){
        String user = (String) session.getAttribute("u_id");
        UserDto userDto =  userService.selectUser(user);

        userDto.setU_question(upAnswer);
        userService.updateUser(userDto);

        return "redirect:/myPage?mode1=0";

    }


    @PostMapping("/review")
    public ResponseEntity<String> review(@RequestBody ReviewDto reviewDto,HttpSession session){

        try {
            String user = (String)session.getAttribute("u_id");
            reviewDto.setR_writer(user);
            reviewService.insertReview(reviewDto);


            HttpHeaders responseHeader = new HttpHeaders();
            responseHeader.add("content-type","text/html; charset=UTF-8");
            return new ResponseEntity<String> ("리뷰가 등록 되었습니다.",responseHeader, HttpStatus.OK);// 200
        }
        catch (Exception e) {

            e.printStackTrace();
            return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);// 400

        }
    };


    @GetMapping("/deleteUser")
    public String deleteUser(HttpSession session, HttpServletResponse response){
        String user = (String) session.getAttribute("u_id");
        Integer deleteUser = userService.deleteUser(user);

        // 세션지우는 명령어임.
        session.invalidate();


        Cookie myCookie = new Cookie("u_id", null);  // 같은이름 쿠키 값을 null로 설정
        myCookie.setMaxAge(0);  // 남은 만료시간을 0으로 설정
        response.addCookie(myCookie); //쿠키 보내주기

        return "redirect:/";
    }











}
