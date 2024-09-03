package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AdateDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AdateDaoTest {
    @Autowired
    AdateDao adateDao;

    @Test
    public void insertAdate() {
        /*데이터 설정법
        * 설정할 연도에 -1900 하고,
        * 월은 -1해서 설정해야함
        * */

        for(int j=0; j<120; j++){
            for (int i=0; i<4; i++){
                Date date = new Date(2024-1900,05,12+j+(2*i));
                Map map = new HashMap();
                map.put("ad_a_seqno",j+1);
                map.put("ad_date",date);
                adateDao.insertAdate(map);
            }
        }

    }

    @Test
    public void selectAdate() {
        List<AdateDto> aaa = adateDao.selectAdate(1);
        System.out.println("여기예요"+aaa);
    }

    @Test
    public void deleteAdate() {
        adateDao.deleteAdate(3);
    }
}