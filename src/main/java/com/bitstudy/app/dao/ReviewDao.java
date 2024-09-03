package com.bitstudy.app.dao;

import com.bitstudy.app.domain.ReviewDto;

public interface ReviewDao {
    int insertReview(ReviewDto reviewDto);

    int deleteReview(String r_writer);
}
