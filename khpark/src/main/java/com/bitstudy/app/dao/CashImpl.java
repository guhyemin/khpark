package com.bitstudy.app.dao;


import com.bitstudy.app.domain.CashDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public class CashImpl implements CashDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.cashMapper.";

    @Override
    public int insertCash(String c_user){
        return Session.insert(namespace+"insertCash",c_user);
    }

    @Override
    public Integer selectId(String c_user){
        return Session.selectOne(namespace+"selectId",c_user);
    }

    @Override
    public int updateCash(Map map){
        return Session.update(namespace+"updateCash",map);
    }

    @Override
    public int deleteId(String c_user){
        return Session.delete(namespace+"deleteId",c_user);
    }

}
