package com.bitstudy.app.dao;


import com.bitstudy.app.domain.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class UserImpl implements UserDao {

    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.userMapper.";

    @Override
    public int insertUser(UserDto userDto){
    return Session.insert(namespace+"insertUser",userDto);
    }

    @Override
    public UserDto selectUser(String u_id){
        return Session.selectOne(namespace+"selectUser",u_id);
    }

    @Override
    public String selectIdFind(UserDto userDto){
        return Session.selectOne(namespace +"selectIdFind",userDto);
    }

    @Override
    public String selectPwFind(UserDto userDto){
        return Session.selectOne(namespace+"selectPwFind",userDto);
    }


    @Override
    public UserDto selectMypage(String u_id){
        return Session.selectOne(namespace+"selectMypage",u_id);
    }

    @Override
    public int updateUser(UserDto userDto){
        return Session.update(namespace+"updateUser",userDto);
    }

    @Override
    public int deleteUser(String u_id){
        return Session.delete(namespace+"deleteUser",u_id);
    }













}
