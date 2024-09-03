package com.bitstudy.app.dao;

import com.bitstudy.app.domain.CateDto;

import java.util.List;

public interface CateDao {
    int insertCate(String ct_name);

    Integer selectCate(String ct_name);

    List<CateDto> selectCateAll();

    int deleteCate(Integer ct_seqno);
}
