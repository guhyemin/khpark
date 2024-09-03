package com.bitstudy.app.service;


import com.bitstudy.app.dao.UserDao;
import com.bitstudy.app.domain.LoginDto;
import com.bitstudy.app.domain.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public int insertUser(UserDto userDto){
        return userDao.insertUser(userDto);
    }

    public UserDto selectUser (String u_id){
        return userDao.selectUser(u_id);
    }

    public String selectIdFind (UserDto userDto){
        return userDao.selectIdFind(userDto);
    }

    public String selectPwFind (UserDto userDto){
        return userDao.selectPwFind(userDto);
    }

    public UserDto selectMypage (String u_id){
        return userDao.selectMypage(u_id);
    }


    public int updateUser(UserDto userDto){
        return userDao.updateUser(userDto);
    }



    public int deleteUser (String u_id){
        return userDao.deleteUser(u_id);
    }

    //로그인 체크할려고 만든 겁니다.
    public int loginPass(LoginDto loginDto) {
        /*아이디 보내서 아이디의 정보받아오면 그정보 있으면 아이디는 있다는거 없으면 아이디 없다는거니깐 로그인 실패
         * 아이디 있으면 비밀번호랑 같은지 확인
         * 같으면 성공 틀리면 실패
         * */
        String u_id = loginDto.getU_id();
        String u_pw = loginDto.getU_pw();
        UserDto userDto = userDao.selectUser(u_id);
        if(userDto == null){
            return 0;
        }
        if (userDto.getU_pw().equals(u_pw) ){
            return 1;
        }
        else {
            return 0;
        }
    };





}
