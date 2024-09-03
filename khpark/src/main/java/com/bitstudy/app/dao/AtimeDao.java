package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AtimeDto;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public interface AtimeDao {
    int insertAtime(Map map);

    List<AtimeDto> selectAtime (Integer at_d_seqno);

    Integer selectAtSeqno(Map map);

    int deleteAtime(Integer at_seqno);
}
