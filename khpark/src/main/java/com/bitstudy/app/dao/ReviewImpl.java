package com.bitstudy.app.dao;


import com.bitstudy.app.domain.ReviewDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ReviewImpl implements ReviewDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.reviewMapper.";

    @Override
    public int insertReview(ReviewDto reviewDto){
        return Session.insert(namespace+"insertReview",reviewDto);
    }

    @Override
    public int deleteReview(String r_writer){
        return Session.delete(namespace+"deleteReview",r_writer);
    }
}
