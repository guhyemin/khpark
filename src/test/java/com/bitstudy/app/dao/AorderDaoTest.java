package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AorderDto;
import com.bitstudy.app.domain.OrderListDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class AorderDaoTest {

    @Autowired
    AorderDao aorderDao;

    @Test
    public void insertAorder() {
        AorderDto aorderDto = new AorderDto(1,1,1,"VIP1","VIP2","hyemin");

        aorderDao.insertAorder(aorderDto);
    }

    @Test
    public void selectAorder() {
        List<OrderListDto> aaa = aorderDao.selectAorder("hyemin");
        System.out.println("렛쭈고"+aaa);
    }

    @Test
    public void deleteAorder() {
    }
}