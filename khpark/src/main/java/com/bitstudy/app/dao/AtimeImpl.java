package com.bitstudy.app.dao;


import com.bitstudy.app.domain.AtimeDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;
import java.util.Map;

@Repository
public class AtimeImpl implements AtimeDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.a_timeMapper.";


    @Override
    public int insertAtime(Map map){
        return Session.insert(namespace+"insertAtime",map);
    }


    @Override
    public List<AtimeDto> selectAtime(Integer at_d_seqno){
        return Session.selectList(namespace+"selectAtime",at_d_seqno);
    }

    @Override
    public Integer selectAtSeqno(Map map) {
        return Session.selectOne(namespace+"selectAtSeqno",map);
    }

    @Override
    public int deleteAtime(Integer at_seqno){
        return Session.delete(namespace+"deleteAtime",at_seqno);
    }





}
