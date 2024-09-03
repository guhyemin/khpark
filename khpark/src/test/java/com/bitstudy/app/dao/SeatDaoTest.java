package com.bitstudy.app.dao;

import com.bitstudy.app.domain.SeatDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class SeatDaoTest {
    @Autowired
    SeatDao seatDao;

    @Test
    public void insertseat() {

        String[]ttt = {"VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","VIP","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","R","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","S","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B","B"};




        for (int i = 0; i < 960; i++){
            for (int j = 0; j < 150; j++) {
                SeatDto seatDto = new SeatDto(i+1, ttt[j]+(j%30+1));
                seatDao.insertseat(seatDto);
            }
    }
    }

//    @Test
//    public void updateSeat() {
//        seatDao.updateSeat(1);
//    }

    @Test
    public void selectSeat() {
        List<String> seatDto = seatDao.selectSeat(1);
        System.out.println(seatDto);
    }

    @Test
    public void deleteSeat() {
        seatDao.deleteSeat(1);
    }
}