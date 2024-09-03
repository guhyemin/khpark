package com.bitstudy.app.dao;


import com.bitstudy.app.domain.SeatDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository

public class SeatImpl implements SeatDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.seatMapper.";

    @Override
    public int insertseat(SeatDto seatDto){
        return Session.insert(namespace+"insertseat",seatDto);
    }

    @Override
    public int updateSeat(Map map){
        return Session.update(namespace+"updateSeat",map);
    }

    @Override
    public List<String> selectSeat(Integer s_t_seqno){
        return Session.selectList(namespace+"selectSeat",s_t_seqno);
    }

    @Override
    public int deleteSeat(Integer s_seqno){
        return Session.delete(namespace+"deleteSeat",s_seqno);
    }
}
