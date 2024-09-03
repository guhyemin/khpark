package com.bitstudy.app.controller;


import com.bitstudy.app.domain.UserDto;
import com.bitstudy.app.service.CashService;
import com.bitstudy.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @Autowired
    CashService cashService;

    @GetMapping("/register")
    public String register(){

        return "register_page";


    }

    @PostMapping("/register/join")
    public String join(UserDto userDto) throws Exception {
        try {
            int result = userService.insertUser(userDto);
            if(result == 1){
                cashService.insertCash(userDto.getU_id());
            }


            return "redirect:/login";

        } catch (Exception e) {
            String msg = URLEncoder.encode("사용 불가능한 아이디입니다.", "UTF-8");
            return "redirect:/register?msg=" + msg;
        }
    }




}
