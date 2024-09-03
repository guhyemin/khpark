package com.bitstudy.app.service;

import com.bitstudy.app.dao.AtimeDao;
import com.bitstudy.app.domain.AtimeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AtimeService {
    @Autowired
    AtimeDao atimeDao;

/*    public int insertAtime(Integer at_d_seqno,Time at_time){
        Map map = new HashMap();
        map.put("at_d_seqno",at_d_seqno);
        map.put("at_time",at_time);
        return atimeDao.insertAtime(map);
    }*/


    public List<AtimeDto> selectAtime(Integer at_d_seqno){
        return atimeDao.selectAtime(at_d_seqno);
    }

    public Integer selectAtSeqno(Integer at_d_seqno, Time at_time){
        Map map = new HashMap();
        map.put("at_d_seqno",at_d_seqno);
        map.put("at_time",at_time);
        return atimeDao.selectAtSeqno(map);
    }


    public int deleteAtime(Integer at_seqno){
        return atimeDao.deleteAtime(at_seqno);
    }














}
