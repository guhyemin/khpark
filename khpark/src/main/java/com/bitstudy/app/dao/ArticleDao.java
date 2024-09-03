package com.bitstudy.app.dao;

import com.bitstudy.app.domain.ArticleDto;

import java.util.List;
import java.util.Map;

public interface ArticleDao {
    int insertArticle(ArticleDto articleDto);

    int updateArticle(Map map);

    Integer selectOrderCount(Integer a_seqno);

    ArticleDto selectArticle(Integer a_seqno);

    List<ArticleDto> selectCateRanking(Integer a_ct_seqno);

    List<ArticleDto> selectNew();

    List<ArticleDto> keywordList(Integer a_k_seqno);

    List<ArticleDto> selectSearch(Map map);

    int searchCount(String keyword);

    int deleteArticle(Integer a_seqno);
}
