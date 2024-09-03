package com.bitstudy.app.dao;


import com.bitstudy.app.domain.CateDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class CateImpl implements CateDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.cateMapper.";


    @Override
    public int insertCate(String ct_name){
        return Session.insert(namespace+"insertCate",ct_name);
    }

    @Override
    public Integer selectCate(String ct_name){
        return Session.selectOne(namespace+"selectCate",ct_name);
    }

    @Override
    public List<CateDto> selectCateAll(){
        return Session.selectList(namespace+"selectCateAll");
    }

    @Override
    public int deleteCate(Integer ct_seqno){
        return Session.delete(namespace+"deleteCate",ct_seqno);
    }















}
