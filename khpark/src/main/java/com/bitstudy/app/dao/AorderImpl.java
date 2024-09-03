package com.bitstudy.app.dao;


import com.bitstudy.app.domain.AorderDto;
import com.bitstudy.app.domain.ArticleDto;
import com.bitstudy.app.domain.OrderListDto;
import com.bitstudy.app.domain.SeatListDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository

public class AorderImpl implements AorderDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.a_orderMapper.";

    @Override
    public int insertAorder(AorderDto aorderDto){
        return Session.insert(namespace+"insertAorder",aorderDto);
    }

    @Override
    public List<OrderListDto> selectAorder(String ao_user){
        return Session.selectList(namespace+"selectAorder",ao_user);
    }

    @Override
    public List<SeatListDto> selectSeatList(Map map){
        return Session.selectList(namespace+"selectSeatList",map);
    }

    @Override
    public Integer selectOrderCount(Map map){
        return Session.selectOne(namespace+"selectOrderCount",map);
    }

    @Override
    public List<ArticleDto> selectReviewList(String ao_user){
        return Session.selectList(namespace+"selectReviewList",ao_user);
    }
    @Override
    public int deleteAorder(Integer ao_user){
        return Session.delete(namespace+"deleteAorder",ao_user);
    }

}
