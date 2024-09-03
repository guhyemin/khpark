package com.bitstudy.app.service;

import com.bitstudy.app.dao.KeywordDao;
import com.bitstudy.app.domain.KeywordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KeywordService {
    @Autowired
    KeywordDao keywordDao;

    public int insertKeyword(String k_title){
        return keywordDao.insertKeyword(k_title);
    }

    public List<KeywordDto> selectKeyword(){
        return keywordDao.selectKeyword();
    }


    public int deleteKeyword(Integer k_seqno) {
        return keywordDao.deleteKeyword(k_seqno);
    }

























}
