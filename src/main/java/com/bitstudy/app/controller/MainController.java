package com.bitstudy.app.controller;

import com.bitstudy.app.domain.ArticleDto;
import com.bitstudy.app.domain.CateDto;
import com.bitstudy.app.domain.KeywordDto;
import com.bitstudy.app.service.ArticleService;
import com.bitstudy.app.service.CateService;
import com.bitstudy.app.service.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller

/*할 일
 * 장르별 랭킹
 * 추천 키워드 별로 아티클 뽑아오기
 * 포이치로 카테고리 찍어주기
 * 검색창에 a태그로 키워드 들고 서치페이지로 보내주기
 * 로그인/회원가입 다 걸어주기
 * 로그인 되어 있으면 아이디 띄워주기
 * 로그아웃 띄워주기 로그인 논
 * 내정보는 로그인 되어있을 때는 마이페이지 보내주고 안 되어 있으면 로그인하라고 alert로 띄워주고 로그인창 보내주기
 * 카테 누르면 키워드로 카테 들고 검색페이지 넘겨주기 a태그
 * 장르별 카테 포이치로 돌려주고 밑에 박스는 ajax로 찍어주기
 * 티켓오픈 누르면 맞는 상세페이지 a태그 걸기
 * 추천 키워드 ajax 로 찍기
 *
 *
 *
 *
 * */
/*
 *
 * 한 일
 * 로그인/회원가입 다 걸어주기
 *
 *
 * */

public class MainController {
    @Autowired
    CateService cateService;

    @Autowired
    KeywordService keywordService;

    @Autowired
    ArticleService articleService;


    @GetMapping("/")
    public String index(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
//        session.setAttribute("u_id","dayoung");
        String u_id = (String) session.getAttribute("u_id");

        //이녀석은 카테리스트 다 들고와서 보여주는 애
        List<CateDto> cateList = cateService.selectCateAll();


        //이녀석은 키워드리스트 다 들고와서 보여주는 애
        List<KeywordDto> keywordList = keywordService.selectKeyword();



        model.addAttribute("cateList",cateList);
        model.addAttribute("keywordList",keywordList);


        return "index";
    }


    @GetMapping("/cateArticle/")
    @ResponseBody
    public ResponseEntity<List<ArticleDto>> cateArticle(Integer a_ct_seqno){
        try {
            List<ArticleDto> articleList = articleService.selectCateRanking(a_ct_seqno);
            return new ResponseEntity<List<ArticleDto>>(articleList, HttpStatus.OK);// 200

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<ArticleDto>> (HttpStatus.BAD_REQUEST);// 400
        }

    }



    @GetMapping("/keywordArticle/")
    @ResponseBody
    public ResponseEntity<List<ArticleDto>> keywordArticle(Integer k_seqno){
        try {
            List<ArticleDto> keywordList = articleService.keywordList(k_seqno);
            return new ResponseEntity<List<ArticleDto>>(keywordList, HttpStatus.OK);// 200

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<ArticleDto>> (HttpStatus.BAD_REQUEST);// 400
        }
    }





























}
