package com.bitstudy.app.dao;


import com.bitstudy.app.domain.AdateDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AdateImpl implements AdateDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.a_dateMapper.";

    @Override
    public int insertAdate(Map map){
        return Session.insert(namespace+"insertAdate",map);
    }

    @Override
    public List<AdateDto> selectAdate(Integer ad_a_seqno){
        return Session.selectList(namespace+"selectAdate",ad_a_seqno);
    }

    @Override
    public Integer selectAdSeqno(Map map) {
        return Session.selectOne(namespace+"selectAdSeqno",map);
    }

    @Override
    public int deleteAdate(Integer ad_seqno){
        return Session.delete(namespace+"deleteAdate",ad_seqno);
    }
}
