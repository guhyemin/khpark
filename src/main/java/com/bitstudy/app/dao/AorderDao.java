package com.bitstudy.app.dao;

import com.bitstudy.app.domain.AorderDto;
import com.bitstudy.app.domain.ArticleDto;
import com.bitstudy.app.domain.OrderListDto;
import com.bitstudy.app.domain.SeatListDto;

import java.util.List;
import java.util.Map;

public interface AorderDao {
    int insertAorder(AorderDto aorderDto);

    List<OrderListDto> selectAorder(String ao_user);

    List<SeatListDto> selectSeatList(Map map);

    Integer selectOrderCount(Map map);

    List<ArticleDto> selectReviewList(String ao_user);

    int deleteAorder(Integer ao_user);
}
