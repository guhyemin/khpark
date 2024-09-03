package com.bitstudy.app.dao;

import com.bitstudy.app.domain.UserDto;

public interface UserDao {
    int insertUser(UserDto userDto);

    UserDto selectUser(String u_id);

    String selectIdFind(UserDto userDto);

    String selectPwFind(UserDto userDto);

    UserDto selectMypage(String u_id);

    int updateUser(UserDto userDto);

    int deleteUser(String u_id);
}
