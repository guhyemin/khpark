package com.bitstudy.app.service;

import com.bitstudy.app.dao.AdateDao;
import com.bitstudy.app.domain.AdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class AdateService {
    @Autowired
    AdateDao adateDao;

    public int insertAdate(Integer ad_a_seqno, Date ad_date){
        Map map = new HashMap();
        map.put("ad_a_seqno",ad_a_seqno);
        map.put("ad_date",ad_date);
        return adateDao.insertAdate(map);
    }


    public List<AdateDto> selectAdate(Integer ad_a_seqno){
        return adateDao.selectAdate(ad_a_seqno);
    }

    public Integer selectAdSeqno(Integer ad_a_seqno, Date ad_date){
        Map map = new HashMap();
        map.put("ad_a_seqno",ad_a_seqno);
        map.put("ad_date",ad_date);
        return adateDao.selectAdSeqno(map);
    }
//    public Integer selectAdSeqno2(Integer ad_a_seqno, String ad_date){
//
//
//        Map map = new HashMap();
//        map.put("ad_a_seqno",ad_a_seqno);
//        map.put("ad_date",ad_date);
//        return adateDao.selectAdSeqno(map);
//    }


    public int deleteAdate(Integer ad_seqno){
        return adateDao.deleteAdate(ad_seqno);
    }












}
