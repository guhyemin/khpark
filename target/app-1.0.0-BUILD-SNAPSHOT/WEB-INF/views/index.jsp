<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2024-07-29
  Time: 오후 3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import = "java.net.URLDecoder"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>kh파크</title>
    <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/main_page.css'/>">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>


</head>
<body>
<header class="header">
    <div class="header_inner">
        <a href="<c:url value="/"></c:url>" class="h_logo">
            <span>KH-</span>
            <span>PARK</span>
        </a>
        <form class="h_search_box" action="/searchPage" method="get">
            <input type="text" class="h_search" name="keyword">
            <input type="submit" class="search_icon_box">
        </form>



        <div class="h_info_box">
            <a href="./index.html" class="respnsive_block dis_flex">
                <div class="header_icon h_icon1"></div>
                <span>홈</span>
            </a>

            <a href="<c:url value="${sessionScope.u_id == null?'/register':'#'}"></c:url>" class="respnsive_none">
                <span>
                    <c:choose>
                        <c:when test="${sessionScope.u_id == null}">
                            회원가입
                        </c:when>
                        <c:otherwise>
                            안녕하세요 ${sessionScope.u_id} 님
                        </c:otherwise>
                    </c:choose>
                </span>
            </a>
            <a href="<c:url value="${sessionScope.u_id == null?'/login':'/logout'}"></c:url>" class="dis_flex">
                <div class="header_icon h_icon2"></div>
                <span>
                    ${sessionScope.u_id == null?'로그인':'로그아웃'}
                </span>
            </a>

            <a href="<c:url value="/myPage"></c:url>" class="dis_flex">
                <div class="header_icon h_icon3"></div>
                <span>내정보</span>
            </a>
            <a href="/" class="respnsive_block dis_flex top_btn">
                <div class="header_icon h_icon4"></div>
                <span>TOP</span>
            </a>
        </div>
    </div>
    <div class="block_pan"></div>
</header>
<main class="main">
    <!-- 메인배너 -->
    <section class="sec_1 sec">
        <div class="sec_1_top">
            <c:forEach var="list" items="${cateList}">
                <a href="/searchPage?keyword=${list.ct_name}">
                    <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="36" height="36" fill="none" viewBox="0 0 36 36"><path fill="#fff" d="M0 0h36v36H0z"></path><path fill="#5194FF" d="m6.757 19.48 4.747.343 2.063 2.958 3.096 2.442-.31 2.236-1.892 2.543-2.51.621h-1.892l-2.201-1.1-1.72-2.064-.481-6.776 1.1-1.204Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M29.518 20.026a9.792 9.792 0 0 0 .878-4.067V8.806c0-1.823-1.742-3.139-3.537-2.816a35.277 35.277 0 0 1-12.583 0c-1.794-.323-3.537.993-3.537 2.816v7.153a9.82 9.82 0 0 0 9.823 9.823h.012c2.39 0 4.58-.853 6.282-2.27M16.446 12.712h2.122M22.568 12.712h2.121"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M17.081 18.76c2.32 2.204 4.642 2.204 6.95 0M17.081 25.671a5.75 5.75 0 0 1-5.72 5.154h-.007a5.75 5.75 0 0 1-5.75-5.751v-4.17c0-1.077 1.028-1.853 2.087-1.664a20.77 20.77 0 0 0 3.663.328M9.148 23.731h.934"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M9.73 27.117c1.022-.97 2.044-.97 3.061 0"></path></svg>
                    <div style="display: none">${list.ct_seqno}</div>
                    <span>${list.ct_name}</span>
                </a>
            </c:forEach>
            <a href="#">
                <img src="../img/mini_opt1.png" alt="토핑" class="respnsive_block">
                <span>토핑</span>
            </a>
            <a href="#">
                <img src="../img/mini_opt2.png" alt="MD샵" class="respnsive_block">
                <span>MD샵</span>
            </a>
            <a href="#" class="respnsive_none f_color"><span>랭킹</span></a>
            <a href="#" class="respnsive_none f_color"><span>오픈공지</span></a>
        </div>
        <div class="swiper mySwiper">
            <div class="swiper-wrapper">
            </div>
            <div class="swiper-pagination"></div>
        </div>
    </section>
    <!-- 배너 밑에 광고 -->
    <section class="sec_2 sec">
        <div class="ad_box">
            <a href="#" class="ad_box_link"><div class="ad ad_1"></div></a>
            <a href="#" class="ad_box_link"><div class="ad ad_2"></div></a>
            <a href="#" class="ad_box_link"><div class="ad ad_3"></div></a>
            <a href="#" class="ad_box_link"><div class="ad ad_4"></div></a>
            <a href="#" class="ad_box_link"><div class="ad ad_5"></div></a>
            <a href="#" class="ad_box_link"><div class="ad ad_6"></div></a>
        </div>
    </section>
    <!-- 장르별 랭킹 -->
    <section class="sec_3 sec">
        <p class="sec_title">장르별 랭킹</p>
        <div class="genre">
            <c:forEach var="list" items="${cateList}">
                <div style="display:none;">${list.getCt_seqno()}</div>
                <span class="genre_opt">${list.getCt_name()}</span>
            </c:forEach>
        </div>
        <!-- 뮤지컬 -->
        <div class="swiper_rank_box first_block">
            <div class="swiper rank1">
                <div class="swiper-wrapper swiper_rank">
                </div>
            </div>
            <div class="swiper-button-next rank_bth_next_1">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev rank_bth_prev_1">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>
        <!-- 콘서트 -->
        <div class="swiper_rank_box">
            <div class="swiper rank2">
                <div class="swiper-wrapper swiper_rank">
                </div>
            </div>
            <div class="swiper-button-next rank_bth_next_2">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev rank_bth_prev_2">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>
        <!-- 스포츠 -->
        <div class="swiper_rank_box">
            <div class="swiper rank3">
                <div class="swiper-wrapper swiper_rank">
                </div>
            </div>
            <div class="swiper-button-next rank_bth_next_3">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev rank_bth_prev_3">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>
        <!-- 연극 -->
        <div class="swiper_rank_box">
            <div class="swiper rank4">
                <div class="swiper-wrapper swiper_rank">
                </div>
            </div>
            <div class="swiper-button-next rank_bth_next_4">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev rank_bth_prev_4">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>
        <!-- 클래식 -->
        <div class="swiper_rank_box">
            <div class="swiper rank5">
                <div class="swiper-wrapper swiper_rank">
                </div>
            </div>
            <div class="swiper-button-next rank_bth_next_5">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev rank_bth_prev_5">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>
    </section>
    <!-- 티켓 오픈 -->
    <section class="sec_4 sec">
        <p class="sec_title">티켓오픈</p>
        <div class="open_ticket">
        </div>
    </section>
    <!-- KH파크 영상 -->
    <section class="sec_5 sec">
        <p class="sec_title">KH파크 PLAY</p>
        <div class="play_genre">
        </div>
        <!-- 영상 -->
        <div class="kh_play_box first_block">
            <div class="swiper kh_play1">
                <div class="swiper-wrapper play_swiper">
                </div>
            </div>
            <div class="swiper-button-next kh_btn_R play_btn_next1">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev kh_btn_L play_btn_prev1">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>

    </section>
    <!-- 추천 키워드 -->
    <section class="sec_6 sec">
        <p class="sec_title">추천 키워드</p>
        <div class="recommend_keyword">
            <c:forEach var="list" items="${keywordList}">
                <div style="display: none">${list.k_seqno}</div>
                <span class="keyword_opt">${list.getK_title()}</span>
            </c:forEach>

        </div>
        <!-- 키워드 옵션1 -->
        <div class="keyword_swiper_box first_block">
            <div class="swiper recommend_swiper1">
                <div class="swiper-wrapper swiper_recommend swiper_recommend_1">
                </div>
            </div>
            <div class="swiper-button-next recommend_btn_next_1">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
            <div class="swiper-button-prev recommend_btn_prev_!">
                <img src="https://openimage.interpark.com/UI/tour/pages/main/slide_arrow.svg" alt="">
            </div>
        </div>

    </section>
    <!-- 중간 배너 -->
    <section class="sec_7 sec">
        <a href="#">
            <img src="https://tickets.interpark.com/images/best-review-banner-image.svg" alt="중간배너">
        </a>
    </section>
    <!-- 관람 후기 -->
    <section class="sec_8 sec">
        <p class="sec_title">베스트 관람후기</p>
        <div class="review_box_outer">
        </div>
        <div class="review_popup">
            <p class="pop_title">리뷰</p>
            <div class="pop_img_box put_value"><!-- js에서 넣기 --></div>
            <div class="pop_scroll_box">
                <p class="scroll_title put_value"><!-- js에서 넣기 --></p>
                <p class="scroll_sub_title put_value"><!-- js에서 넣기 --></p>
                <p class="scroll_content put_value"><!-- js에서 넣기 --></p>
            </div>
            <div class="pop_reivew_info">
                <img src="https://tickets.interpark.com/images/profiles/m_2.svg" alt="프로필사진" class="pop_user_img">
                <div class="pop_reivew_info_txt">
                    <span class="pop_user_name put_value"><!-- js에서 넣기 --></span>
                    <div class="pop_scor_box">
                        <img src="../img/star.png" alt="별점사진" class="star_png">
                        <span class="put_value"><!-- js에서 넣기 --></span>
                    </div>
                </div>
            </div>
            <p class="pop_close_btn">닫기</p>
        </div>
    </section>
</main>
<footer class="footer">
    <div class="f_top">
        <div class="f_top_inner">
            <a href="#"><span>회사소개</span></a>
            <a href="#"><span>이용약관</span></a>
            <a href="#"><span>개인정보처리방침</span></a>
            <a href="#"><span>여행약관</span></a>
            <a href="#"><span>티켓판매안내</span></a>
            <a href="#"><span>공지사항</span></a>
            <a href="#"><span>고객센터</span></a>
        </div>
    </div>
    <div class="f_txt_box">
        <div class="f_txt_outer">
            <div class="f_txt_title_box">
                <span class="f_txt_title">(주)KH-PARK</span>
                <span class="drop"> ▼</span>
            </div>
            <span class="f_txt">주소 서울 서초구 테헤란로 13</span>
            <span class="f_txt">사업자등록번호 000-00-00000</span>
            <span class="f_txt">통신판매업신고 0000-서울강남-00000</span>
            <span class="f_txt">관광사업증 등록번호 : 제0000-00호</span>
        </div>
        <div class="f_txt_outer">
            <div class="f_txt_title_box">
                <span class="f_txt_title">고객센터 </span>
                <span class="drop"> ▼</span>
            </div>
            <span class="f_txt">투어 0000-0000｜티켓 0000-0000</span>
            <span class="f_txt">팩스 00-000-0000</span>
            <span class="f_txt">해외항공 00-0000-0000｜국내항공 00-0000-0000</span>
            <span class="f_txt">투어 1:1문의｜티켓 1:1문의</span>
        </div>
        <div class="f_txt_outer">
            <div class="f_txt_title_box">
                <span class="f_txt_title">전자금융거래 분쟁처리 담당 </span>
                <span class="drop"> ▼</span>
            </div>
            <span class="f_txt">투어 0000-0000 ｜티켓 0000-0000</span>
            <span class="f_txt">팩스 00-000-0000｜이메일 aaaaa@naver.com</span>
            <span class="f_txt">안전보호책임자 aaa@aaa.com</span>
            <span class="f_txt">개인정보보호책임자 aaa@aaa.com</span>
        </div>
    </div>
</footer>
<script>
    $(document).ready(function(){
        // 한자리 수면 앞에 0 붙이는 함수
        function zero(num) {
            if(num < 10) {
                return "0"+num;
            }
            return num;
        }


        /*
        * 키워드 누르면 키워드 고유번호 받아와서 저장하고 에이젝스로 컨트롤러 보내서
        * 그 키워드로 검색한 아티클 리스트 들고와서 찍어주기
        *
        * */
        $(document).on('click','.keyword_opt',function() {
            let k_seqno = $(this).prev().text()
            console.log(k_seqno)
            $.ajax({
                url: "/keywordArticle/?k_seqno="+k_seqno, // 요청할 URI
                type: "get", // 전송 타입

                success: function(result){



                    let tmp = "";
                    let num = 1 ;
                    result.forEach(function (rowResult) {


                        let dt = new Date(rowResult.a_s_date);
                        let syear = dt.getFullYear();
                        let smonth = dt.getMonth() + 1;
                        let sdate = dt.getDate();

                        let dt2 = new Date(rowResult.a_e_date);
                        let eyear = dt2.getFullYear();
                        let emonth = dt2.getMonth() + 1;
                        let edate = dt2.getDate();

                        tmp += `
                            <div class="swiper-slide recommend_slide swiper-slide-active" role="group" aria-label="${'${num}'} / 10" style="width: 189.4px; margin-right: 20px;">
                                <a href="/detailPage?a_seqno=${'${rowResult.a_seqno}'}">
                                    <img src="<c:url value="/img/article/${'${rowResult.a_img}'}"/>"  alt="공연정보${'${num}'}" class="slide_img">
                                </a>
                                <div class="content_txt_box">
                                    <span>${'${rowResult.a_title}'}</span>
                                    <span>${'${rowResult.a_location}'}</span>
                                    <span>${'${syear}'}-${'${zero(smonth)}'}-${'${zero(sdate)}'} ~ ${'${eyear}'}-${'${zero(emonth)}'}-${'${zero(edate)}'}</span>
                                </div>
                            </div>
                        `
                        num++
                    })
                    $('.swiper_recommend ').html(tmp)
                },
                error: function(){
                    alert("오류가 발생했습니돠")
                }
            });

            //키워드오피티라는 클래스가진애 전부 기본색 먹이고 클린한 친구만 다른색 준거임.
            $('.keyword_opt').css({
                color: "black",
                backgroundColor: "white",
                border:"1px solid gray"
            })
            $(this).css({
                color: "white",
                backgroundColor: "#8e43e7",
                border:"1px solid #8e43e7"
            })

        });



        $(document).on('click','.genre_opt',function() {
            let a_ct_seqno = $(this).prev().text()
            console.log(a_ct_seqno)
            $.ajax({
                url: "/cateArticle/?a_ct_seqno="+a_ct_seqno, // 요청할 URI
                type: "get", // 전송 타입

                success: function(result){



                    let tmp = "";
                    let num = 1 ;
                    result.forEach(function (rowResult) {


                        let dt = new Date(rowResult.a_s_date);
                        let syear = dt.getFullYear();
                        let smonth = dt.getMonth() + 1;
                        let sdate = dt.getDate();

                        let dt2 = new Date(rowResult.a_e_date);
                        let eyear = dt2.getFullYear();
                        let emonth = dt2.getMonth() + 1;
                        let edate = dt2.getDate();

                        tmp += `
                        <div class="swiper-slide rank_slide pos_box swiper-slide-active" role="group" aria-label=" ${'${num}'}/ 10" style="width: 189.4px; margin-right: 20px;">
                            <a href="/detailPage?a_seqno=${'${rowResult.a_seqno}'}" class="pos_box">
                                <img src="<c:url value="/img/article/${'${rowResult.a_img}'} "/>" alt="공연정보0" class="slide_img">
                                <span class="num_pos num_pos_0">${'${num}'}<span>
                            </span></span></a>
                            <div class="content_txt_box">
                                <span>${'${rowResult.a_title}'}</span>
                                <span>${'${rowResult.a_location}'}</span>
                                <span>${'${syear}'}-${'${zero(smonth)}'}-${'${zero(sdate)}'} ~ ${'${eyear}'}-${'${zero(emonth)}'}-${'${zero(edate)}'} </span>
                            </div>
                        </div>
                        `
                        num++
                    })
                    $('.swiper_rank').html(tmp)
                },
                error: function(){
                    alert("오류가 발생했습니돠")
                }
            });

        });





        document.getElementsByClassName("keyword_opt")[0].click();
        document.getElementsByClassName("genre_opt")[0].click();



    });




</script>
<script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
<script src="<c:url value='/js/common.js'/>"></script>
<script src="<c:url value='/js/main_page.js'/>"></script>
</body>


</html>
