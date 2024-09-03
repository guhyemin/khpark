package com.bitstudy.app.dao;

import com.bitstudy.app.domain.SeatDto;

import java.util.List;
import java.util.Map;

public interface SeatDao {
    int insertseat(SeatDto seatDto);

    int updateSeat(Map map);

    List<String> selectSeat(Integer s_t_seqno);

    int deleteSeat(Integer s_seqno);
}
