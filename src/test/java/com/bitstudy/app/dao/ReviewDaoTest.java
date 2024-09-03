package com.bitstudy.app.dao;

import com.bitstudy.app.domain.ReviewDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ReviewDaoTest {
    @Autowired
    ReviewDao reviewDao;

    @Test
    public void insertReview() {
        ReviewDto reviewDto = new ReviewDto("상민","노잼","재미없어요",1);
        reviewDao.insertReview(reviewDto);
    }

    @Test
    public void deleteReview() {
        reviewDao.deleteReview("상민");
    }
}