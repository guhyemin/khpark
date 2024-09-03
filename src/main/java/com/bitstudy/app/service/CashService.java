package com.bitstudy.app.service;


import com.bitstudy.app.dao.CashDao;
import com.bitstudy.app.dao.CateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CashService {
    @Autowired
    CashDao cashDao;


    public int insertCash(String c_user){
        return cashDao.insertCash(c_user);
    }


    public Integer selectId(String c_user){
        return cashDao.selectId(c_user);
    }



    public int updateCash(Integer c_cash,String c_user){
        Map map = new HashMap();
        map.put("c_cash",c_cash);
        map.put("c_user",c_user);


        return cashDao.updateCash(map);
    }

    public int deleteId(String c_user){
        return cashDao.deleteId(c_user);
    }






}
