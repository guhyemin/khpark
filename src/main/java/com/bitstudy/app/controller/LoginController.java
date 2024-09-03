package com.bitstudy.app.controller;

import com.bitstudy.app.domain.LoginDto;
import com.bitstudy.app.domain.UserDto;
import com.bitstudy.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.util.List;

@Controller
public class LoginController {
    /* 할일
     * 1. id pw 받아오고 loginchk  성공을 하면 세션 만들어서 메인페이지보내주기 그런데 로그인 상태 유지를 체크하면 쿠키 만들어주기
     * 2. a태그에 로고 비밀번호찾기 아이디찾기 회원가입 페이지 다 링크 걸어주기
     * 3. 로그아웃 기능도 넣어줄거임 >> 세션삭제하고 로그인 페이지 다시보여주면 되겠죠
     *
     * */

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        String c_id = "";  //세션 만들기위해 쿠키에있는 벨류값 저장해줄려고 만든 변수
        Cookie[] cookies =request.getCookies(); // 쿠키 전부들고와서 배열로 저장
        if (cookies != null){
            for(Cookie c : cookies) {  //배열 돌리면서 우리가 넣은 쿠키 이름이랑 같은 애(instagram_id) value 값저장.
                if (c.getName().equals("u_id")){
                    c_id = c.getValue();
                }
            }
        }

        if (!c_id.equals("")){  //! 붙여서 같지않다면
            HttpSession session = request.getSession();
            session.setAttribute("u_id",c_id);
            return "redirect:/"; //그걸로 세션만들어서 바로 메인으로
        }

        return "login_page";
    }

    @PostMapping("/loginChk")
    public String loginChk(HttpServletRequest request, HttpServletResponse response, LoginDto loginDto) throws Exception {
        int result = userService.loginPass(loginDto);

        if (result== 0) {
            String msg = URLEncoder.encode("잘못된 정보입니다.", "UTF-8");
            return "redirect:/login?msg=" + msg;
        }

        HttpSession session = request.getSession();
        session.setAttribute("u_id",loginDto.getU_id());

        Cookie cookie = new Cookie("u_id",loginDto.getU_id());
        // if는()안에 적은 내용이 true이면 동작을함
        // 우리는 자동로그인 박스를 체크하면 true, 안하면false  == loginDto.isChk()
        // 우리는 if 안에서 동작하는내용이 체크를 안하면 시간을 없애서 바로삭제하는게 원하는거에여
        // 즉 자동로그인 박스를 체크하지 않으면 여기 동작시켜야함

        if (!loginDto.isChk()){
            cookie.setMaxAge(0);
        }
        response.addCookie(cookie);

        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session,HttpServletResponse response) {
        // 세션지우는 명령어임.
        session.invalidate();


        Cookie myCookie = new Cookie("u_id", null);  // 같은이름 쿠키 값을 null로 설정
        myCookie.setMaxAge(0);  // 남은 만료시간을 0으로 설정
        response.addCookie(myCookie); //쿠키 보내주기

        return "redirect:/";
    }


    /*여기부터는 아이디찾기, 비밀번호 찾기 할거임
     * - 아이디찾기
     * 입력한정보 유저dto에 받을거임 받고 그정보로 작업하고 맞으면 아이디를 어떻게 보여주지 ?
     * 방법1. id를 id넣는창에 넣어준다.
     * 방법2. 팝업 하나띄워서 넣어준다.
     * 검사까지만 일단하는걸로.
     *
     * - 비밀번호 찾기
     * 이것도 userDto에 받아와서 체크하고 값받아오면 그걸 띄워주기
     * 검사까지만 하는걸로
     *
     * */

    @PostMapping("/findId")
    public ResponseEntity<String> findId(@RequestBody UserDto userDto){
        System.out.println("여기에요: " + userDto);
        try {
            String u_id = userService.selectIdFind(userDto);
            System.out.println("결과값: " + u_id);

            if (u_id != null){
                return new ResponseEntity<String>(u_id, HttpStatus.OK);// 200
            }
            else{
                return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);// 400
            }
        }
        catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);// 400
        }
    };


    @PostMapping("/findPW")
    public ResponseEntity<String> findPw(@RequestBody UserDto userDto){
        try {
            System.out.println("여기에요: " + userDto);
            String u_pw = userService.selectPwFind(userDto);
            System.out.println("결과값: " + u_pw);
            if (u_pw != null){
                return new ResponseEntity<String>(u_pw, HttpStatus.OK);// 200
            }
            else{
                return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);// 400
            }
        }
        catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);// 400
        }
    };


}
