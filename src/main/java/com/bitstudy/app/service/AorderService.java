package com.bitstudy.app.service;

import com.bitstudy.app.dao.AorderDao;
import com.bitstudy.app.domain.AorderDto;
import com.bitstudy.app.domain.ArticleDto;
import com.bitstudy.app.domain.OrderListDto;
import com.bitstudy.app.domain.SeatListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class AorderService {
    @Autowired
    AorderDao aorderDao;


    public int insertAorder(AorderDto aorderDto){
        return aorderDao.insertAorder(aorderDto);
    }



    public List<OrderListDto> selectAorder(String ao_user){
        return aorderDao.selectAorder(ao_user);
    }

    public List<SeatListDto> selectSeatList(Integer ao_a_seqno, String ao_user){
        Map map = new HashMap();
        map.put("ao_a_seqno", ao_a_seqno);
        map.put("ao_user", ao_user);

        return aorderDao.selectSeatList(map);
    }

    public Integer selectOrderCount(Integer ao_a_seqno, String ao_user){
        Map map = new HashMap();
        map.put("ao_a_seqno", ao_a_seqno);
        map.put("ao_user", ao_user);

        return aorderDao.selectOrderCount(map);
    }

    public List<ArticleDto> selectReviewList(String ao_user){
        return aorderDao.selectReviewList(ao_user);
    }


    public int deleteAorder(Integer ao_user){
        return aorderDao.deleteAorder(ao_user);
    }

































}
