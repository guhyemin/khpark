package com.bitstudy.app.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class KeywordDaoTest {
    @Autowired
    KeywordDao keywordDao;



    @Test
    public void insertKeyword() {
        String[] keyword = {"아이들과 보기좋은","어른들끼리 보기좋은","연인들끼리 보기좋은","도파민이 싹도는"};

        for(int i=0; i<4; i++){
            keywordDao.insertKeyword(keyword[i]);
        }
    }

    @Test
    public void deleteKeyword() {
        keywordDao.deleteKeyword(1);
    }
}