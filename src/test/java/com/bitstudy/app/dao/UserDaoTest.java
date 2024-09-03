package com.bitstudy.app.dao;

import com.bitstudy.app.domain.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDaoTest {
    @Autowired
    UserDao userDao;


    @Test
    public void insertUser() {
        UserDto userDto = new UserDto("sangmin", "1234", "상민", "010000000", "둥둥이", "1220 ");
        System.out.println("만들어진거: " + userDto);
        userDao.insertUser(userDto);
    };

    @Test
    public void selectUser() {
        UserDto userDto = userDao.selectUser("sangmin");
    };

    @Test
    public void selectIdFind (){
        UserDto userDto = new UserDto();
        userDto.setU_name("상민");
        userDto.setU_pw("1234");
        userDto.setU_birth("0203");
        userDto.setU_num("010000000");
        userDto.setU_question("둥둥이");

        System.out.println("???" + userDto);

        String aaa = userDao.selectIdFind(userDto);
        System.out.println("찍어보고있을거에요" + aaa);
    };

    @Test
    public void selectPwFind (){
        UserDto userDto = new UserDto();
        userDto.setU_id("sangmin");
        userDto.setU_name("상민");
        userDto.setU_birth("0203");
        userDto.setU_pw("010000000");

        System.out.println("여기여기" + userDto);

        String bbb = userDao.selectPwFind(userDto);
        System.out.println("왓더왓어" + bbb);
    };

    @Test
    public void selectMypage (){
    UserDto aaa = userDao.selectMypage("sangmin");
        System.out.println("졸려요" + aaa);
    };

    @Test
    public void updateUser(){
    UserDto userDto = new UserDto("sangmin", "1234", "상투민", "010000000", "퐁퐁이", "0203");
    userDao.updateUser(userDto);
    };

    @Test
    public void deleteUser(){
    userDao.deleteUser("sangmin");
    };























}