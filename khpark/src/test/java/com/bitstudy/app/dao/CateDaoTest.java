package com.bitstudy.app.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class CateDaoTest {
    @Autowired
    CateDao cateDao;


    @Test
    public void insertCate() {
        String[] cate = {"뮤지컬","콘서트","클래식/무용","전시/행사","연극","아동/가족"};

        for(int i=0; i<6; i++){
            cateDao.insertCate(cate[i]);
        }
    }

    @Test
    public void selectCate() {
        Integer aaa = cateDao.selectCate("뮤지컬");
        System.out.println("카테예요"+aaa);
    }

    @Test
    public void deleteCate() {
        cateDao.deleteCate(4);
    }
}