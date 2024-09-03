package com.bitstudy.app.controller;

import com.bitstudy.app.domain.ArticleDto;
import com.bitstudy.app.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    ArticleService articleService;


    @GetMapping("/searchPage")
    public String searchPage(String keyword, Model model,String option) {
        if (keyword == null)keyword="";

            //처음 들어오면 공연시간 임박순으로 뜨게
            if(option ==  null){
                option = "a_e_date";
            }
        System.out.println("키워드받아옴: "+keyword);

        System.out.println("option받아옴: "+option);

        //입력한 키워드에 따라 검색된 아티클 수
        Integer searchCount = articleService.searchCount(keyword);

        //limit 시작 숫자, 키워드, 옵션에 따라 검색된 아티클 리스트
        List<ArticleDto> selectSearch = articleService.selectSearch(0,keyword,option);


        //첫 화면에서 아티클 날짜 포맷 바꿔주기
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> startTime = new ArrayList<>();
        List<String> endTime = new ArrayList<>();
        for (ArticleDto article : selectSearch) {
            startTime.add(sdf.format(article.getA_s_date()) ) ;
            endTime.add(sdf.format(article.getA_e_date()) ) ;
        }
        model.addAttribute("startTime", startTime);
        model.addAttribute("endTime", endTime);



        model.addAttribute("searchCount", searchCount); //ajax 에 사용
        model.addAttribute("searchList", selectSearch); //jsp foreach문에 사용

        return "search_page";
    }


    //더보기 누르면 추가되는 아티클들(ajax)
    @GetMapping("/plusArticle")
    @ResponseBody
    public ResponseEntity<List<ArticleDto>> articleList(String keyword, String option,Integer offset) {
        try {
            if(option == null || option.equals("")){
                option = "a_e_date";
            }

            System.out.println("키워드받아옴: "+keyword);
            System.out.println("offset받아옴: "+offset);
            System.out.println("option받아옴: "+option);

            //위에 getmapping("searchPage")에서 받아온거 여기서도
            List<ArticleDto> articleList = articleService.selectSearch(offset,keyword,option);
            //ajax 부분의 success:function (result) 의 result에 담긴다
            return new ResponseEntity<List<ArticleDto>>(articleList, HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<ArticleDto>>(HttpStatus.BAD_REQUEST);
        }
    }




}
