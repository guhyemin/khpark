package com.bitstudy.app.service;

import com.bitstudy.app.dao.ReviewDao;
import com.bitstudy.app.domain.ReviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    ReviewDao reviewDao;

    public int insertReview(ReviewDto reviewDto){
        return reviewDao.insertReview(reviewDto);
    }



    public int deleteReview(String r_writer){
        return reviewDao.deleteReview(r_writer);
    }

































}
