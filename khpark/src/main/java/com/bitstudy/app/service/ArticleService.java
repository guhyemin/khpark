package com.bitstudy.app.service;

import com.bitstudy.app.dao.ArticleDao;
import com.bitstudy.app.domain.ArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class ArticleService {
    @Autowired
    ArticleDao articleDao;



    public int insertArticle(ArticleDto articleDto){
        return articleDao.insertArticle(articleDto);
    }


    public int updateArticle(Integer a_order_count,Integer a_seqno){
        Map map = new HashMap();
        map.put("a_order_count",a_order_count);
        map.put("a_seqno",a_seqno);
        return articleDao.updateArticle(map);
    }


    public Integer selectOrderCount(Integer a_seqno){
        return articleDao.selectOrderCount(a_seqno);
    }

    public ArticleDto selectArticle(Integer a_seqno){
        return articleDao.selectArticle(a_seqno);
    }

    public List<ArticleDto> selectCateRanking(Integer a_ct_seqno){
        return articleDao.selectCateRanking(a_ct_seqno);
    }


    public List<ArticleDto> selectNew(){
        return articleDao.selectNew();
    }

    public List<ArticleDto> keywordList(Integer a_k_seqno){
        return articleDao.keywordList(a_k_seqno);
    }

    public List<ArticleDto> selectSearch(Integer offset, String keyword, String option){
        Map map = new HashMap();
        map.put("offset",offset);
        map.put("keyword",keyword);
        map.put("option",option);

        return articleDao.selectSearch(map);
    }

    public Integer searchCount(String keyword){
        return articleDao.searchCount(keyword);
    }

    public int deleteArticle(Integer a_seqno){
        return articleDao.deleteArticle(a_seqno);
    }












}














