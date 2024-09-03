package com.bitstudy.app.dao;


import com.bitstudy.app.domain.ArticleDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ArticleImpl implements ArticleDao {
    @Autowired
    SqlSession Session;

    String namespace = "com.bitstudy.app.dao.articleMapper.";

    @Override
    public int insertArticle(ArticleDto articleDto){
        System.out.println("들어왔음"+articleDto);
        return Session.insert(namespace+"insertArticle",articleDto);
    }

    @Override
    public int updateArticle(Map map){
        return Session.update(namespace+"updateArticle",map);
    }

    @Override
    public Integer selectOrderCount(Integer a_seqno){
        return Session.selectOne(namespace+"selectOrderCount",a_seqno);
    }


    @Override
    public ArticleDto selectArticle(Integer a_seqno){
        return Session.selectOne(namespace+"selectArticle",a_seqno);
    }

    @Override
    public List<ArticleDto> selectCateRanking(Integer a_ct_seqno){
        return Session.selectList(namespace+"selectCateRanking",a_ct_seqno);
    }

    @Override
    public List<ArticleDto> selectNew(){
        return Session.selectList(namespace+"selectNew");
    }

    @Override
    public List<ArticleDto> keywordList(Integer a_k_seqno){
        return Session.selectList(namespace+"keywordList",a_k_seqno);
    }

    @Override
    public List<ArticleDto> selectSearch(Map map){
        return Session.selectList(namespace+"selectSearch",map);
    }

    @Override
    public int searchCount(String keyword){
        return Session.selectOne(namespace+"searchCount",keyword);
    }

    @Override
    public int deleteArticle(Integer a_seqno){
        return Session.delete(namespace+"deleteArticle",a_seqno);
    }

}
