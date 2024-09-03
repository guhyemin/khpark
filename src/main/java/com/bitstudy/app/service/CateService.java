package com.bitstudy.app.service;

import com.bitstudy.app.dao.CateDao;
import com.bitstudy.app.domain.CateDto;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateService {
    @Autowired
    CateDao cateDao;

    public int insertCate(String ct_name){
        return cateDao.insertCate(ct_name);
    }

    public int selectCate(String ct_name){
        return cateDao.selectCate(ct_name);
    }

    public List<CateDto> selectCateAll(){return cateDao.selectCateAll();}

    public int deleteCate(Integer ct_seqno){
        return cateDao.deleteCate(ct_seqno);
    }










}
