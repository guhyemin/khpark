package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AtimeDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AtimeDaoTest {
    @Autowired
    AtimeDao atimeDao;

    @Test
    public void insertAtime() {
        //480바퀴...?*2..? 960...?
        //for문.. 두바퀴..?
        for (int i = 0; i < 480; i++) {
            for (int j = 0; j < 2; j++) {
                Time time = new Time(16+(3*j), 00, 00);
                Map map = new HashMap();
                map.put("at_d_seqno", 1+i);
                map.put("at_time", time);

                atimeDao.insertAtime(map);
            }
        }
    }

    @Test
    public void selectAtime() {
        List<AtimeDto> aaa = atimeDao.selectAtime(1);
        System.out.println("찍혀?"+aaa);

    }



    @Test
    public void deleteAtime() {
        atimeDao.deleteAtime(2);
    }
}