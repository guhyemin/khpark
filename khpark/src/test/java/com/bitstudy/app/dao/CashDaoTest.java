package com.bitstudy.app.dao;

import com.bitstudy.app.domain.CateDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class CashDaoTest {
    @Autowired
    CashDao cashDao;

    @Test
    public void insertCash() {
        cashDao.insertCash("hyemin1");
    }

    @Test
    public void selectId() {
        Integer aaa = cashDao.selectId("상민");
        System.out.println("여기예요"+aaa);
    }

    @Test
    public void updateCash() {
        Map map = new HashMap();
        map.put("c_cash",200000);
        map.put("c_user","hyemin1");

        cashDao.updateCash(map);
    }

    @Test
    public void deleteId() {
        cashDao.deleteId("상민");

    }
}