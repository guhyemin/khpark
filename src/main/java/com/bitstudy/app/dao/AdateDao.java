package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AdateDto;

import java.util.List;
import java.util.Map;

public interface AdateDao {
    int insertAdate(Map map);

    List<AdateDto> selectAdate(Integer ad_a_seqno);

    Integer selectAdSeqno(Map map);

    int deleteAdate(Integer ad_seqno);
}
