package com.bitstudy.app.dao;

import com.bitstudy.app.domain.KeywordDto;

import java.util.List;

public interface KeywordDao {
    int insertKeyword(String k_title);

    List<KeywordDto> selectKeyword();


    int deleteKeyword(Integer k_seqno);
}
