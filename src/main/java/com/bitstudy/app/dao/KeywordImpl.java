package com.bitstudy.app.dao;


import com.bitstudy.app.domain.KeywordDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class KeywordImpl implements KeywordDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.keywordMapper.";

    @Override
    public int insertKeyword(String k_title){
        return Session.insert(namespace+"insertKeyword",k_title);
    }

    @Override
    public List<KeywordDto> selectKeyword(){
        return Session.selectList(namespace+"selectKeyword");
    }

    @Override
    public int deleteKeyword(Integer k_seqno){
        return Session.delete(namespace+"deleteKeyword",k_seqno);
    }











}
