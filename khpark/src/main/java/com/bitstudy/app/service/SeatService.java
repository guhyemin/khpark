package com.bitstudy.app.service;

import com.bitstudy.app.dao.SeatDao;
import com.bitstudy.app.domain.SeatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SeatService {
    @Autowired
    SeatDao seatDao;

    public int insertseat(SeatDto seatDto){
        return seatDao.insertseat(seatDto);
    }

    public int updateSeat(int s_t_seqno, String s_seat){
        Map map = new HashMap();
        map.put("s_t_seqno", s_t_seqno);
        map.put("s_seat", s_seat);
        return seatDao.updateSeat(map);
    }


    public List<String> selectSeat(Integer s_t_seqno){
        return seatDao.selectSeat(s_t_seqno);
    }


    public int deleteSeat(Integer s_seqno){
        return seatDao.deleteSeat(s_seqno);
    }









}
