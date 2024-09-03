package com.bitstudy.app.dao;

import com.bitstudy.app.domain.CashDto;

import java.util.Map;

public interface CashDao {
    int insertCash(String c_user);

    Integer selectId(String c_user);

    int updateCash(Map map);

    int deleteId(String c_user);
}
