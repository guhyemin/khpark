<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2024-07-29
  Time: 오후 6:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.net.URLDecoder"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>검색결과 페이지</title>
    <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/search_page.css'/>">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>
<header class="header">
    <div class="header_inner">
        <a href="<c:url value="/"></c:url>" class="h_logo">
            <span>KH-</span>
            <span>PARK</span>
        </a>
        <form class="h_search_box" action="/searchPage" method="get">
            <input type="text" class="h_search" name="keyword" value="${param.keyword}">
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
    <nav class="nav">
        <div class="nav_inner">
            <a href="./searchPage?keyword=뮤지컬">
                <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="36" height="36" fill="none" viewBox="0 0 36 36"><path fill="#fff" d="M0 0h36v36H0z"></path><path fill="#5194FF" d="m6.757 19.48 4.747.343 2.063 2.958 3.096 2.442-.31 2.236-1.892 2.543-2.51.621h-1.892l-2.201-1.1-1.72-2.064-.481-6.776 1.1-1.204Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M29.518 20.026a9.792 9.792 0 0 0 .878-4.067V8.806c0-1.823-1.742-3.139-3.537-2.816a35.277 35.277 0 0 1-12.583 0c-1.794-.323-3.537.993-3.537 2.816v7.153a9.82 9.82 0 0 0 9.823 9.823h.012c2.39 0 4.58-.853 6.282-2.27M16.446 12.712h2.122M22.568 12.712h2.121"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M17.081 18.76c2.32 2.204 4.642 2.204 6.95 0M17.081 25.671a5.75 5.75 0 0 1-5.72 5.154h-.007a5.75 5.75 0 0 1-5.75-5.751v-4.17c0-1.077 1.028-1.853 2.087-1.664a20.77 20.77 0 0 0 3.663.328M9.148 23.731h.934"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M9.73 27.117c1.022-.97 2.044-.97 3.061 0"></path></svg>
                <span>뮤지컬</span>
            </a>
            <a href="./searchPage?keyword=콘서트">
                <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="37" height="36" fill="none" viewBox="0 0 37 36"><path fill="#fff" d="M.75 0h36v36h-36z"></path><path fill="#B070F0" d="m21.123 12.375-3.45-3.45-.344 2.113-.065 1.876.776 2.026 2.35 1.876 3.126.927 1.746-.065.884-.28-.884-.884-4.14-4.139Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M30.305 12.665a6.685 6.685 0 1 0-2.172 3.597"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="m22.542 17.748.01.01-8.58 6.684a2.457 2.457 0 0 1-3.25-.204v0a2.457 2.457 0 0 1-.198-3.244l6.678-8.576.02.01"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="m10.651 24.688-.262.263a2.63 2.63 0 0 0 0 3.718v0a2.629 2.629 0 0 0 3.718 0l4.183-4.183a2.321 2.321 0 0 1 3.283 0v0a2.322 2.322 0 0 1 0 3.283l-2.136 2.136M17.576 17.384l-1.052 1.062M17.53 8.846l8.594 8.593"></path></svg>
                <span>콘서트</span></a
            >
            <a href="./searchPage?keyword=클래식/무용">
                <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="37" height="36" fill="none" viewBox="0 0 37 36"><path fill="#fff" d="M.25 0h36v36h-36z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M27.767 15.805a4.263 4.263 0 0 0-1.789-.39 4.268 4.268 0 0 1-4.194-3.433l-.077-.386a7.807 7.807 0 0 0-1.6-2.97c-2.43-2.805-6.722-3.721-10.212-1.475C7.56 8.646 6.25 11.297 6.25 14.065v13.633a2.41 2.41 0 0 0 2.412 2.41l19.178-.007a2.41 2.41 0 0 0 2.41-2.41v-8.005c0-.43-.063-.844-.18-1.234M6.25 21.239h24"></path><path fill="#FFA33F" stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M12.316 21.239h-.676a.964.964 0 0 0-.964.964v2.247c0 .532.432.964.964.964h.675a.964.964 0 0 0 .965-.964v-2.247a.964.964 0 0 0-.964-.964Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M11.988 25.414v4.696"></path><path fill="#FFA33F" stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M18.583 21.239h-.675a.964.964 0 0 0-.964.964v2.247c0 .532.431.964.964.964h.675a.964.964 0 0 0 .964-.964v-2.247a.964.964 0 0 0-.964-.964Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M18.255 25.414v4.696"></path><path fill="#FFA33F" stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M24.85 21.239h-.675a.964.964 0 0 0-.964.964v2.247c0 .532.432.964.964.964h.675a.964.964 0 0 0 .965-.964v-2.247a.964.964 0 0 0-.965-.964Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M24.523 25.414v4.696"></path></svg>
                <span>클래식/무용</span>
            </a>
            <a href="./searchPage?keyword=연극">
                <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="36" height="36" fill="none" viewBox="0 0 36 36"><path fill="#fff" d="M0 0h36v36H0z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M11.126 20.736V8.258c0-1.17.948-2.118 2.117-2.118h9.513c1.17 0 2.118.948 2.118 2.118v12.478M24.874 25.412v4.447H11.126v-4.447"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M11.126 25.412v4.447H9.618A2.118 2.118 0 0 1 7.5 27.742V17.05c0-1.17.948-2.118 2.118-2.118h1.508v5.803M24.874 20.736v-5.803h1.508c1.17 0 2.118.948 2.118 2.118v.576m-3.626 7.785v4.447h1.508c1.17 0 2.118-.948 2.118-2.117v-6.435"></path><path fill="#B070F0" stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M21.316 6.14h-6.632v4.515c0 1.17.948 2.118 2.117 2.118H19.2c1.17 0 2.117-.948 2.117-2.118V6.14Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M24.01 20.736H12.091c-1.17 0-2.117.948-2.117 2.118v.44c0 1.17.948 2.118 2.117 2.118h11.92c1.169 0 2.117-.948 2.117-2.118v-.44c0-1.17-.948-2.118-2.118-2.118Z"></path></svg>
                <span>연극</span>
            </a>
            <a href="./searchPage?keyword=아동/가족">
                <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="37" height="36" fill="none" viewBox="0 0 37 36"><path fill="#fff" d="M.75 0h36v36h-36z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M21.763 8.69a10.445 10.445 0 0 1 7.433 10.005c0 2.035-.583 3.935-1.59 5.54M15.737 8.69a10.434 10.434 0 0 0-7.432 10.006c0 5.768 4.682 10.44 10.45 10.44 2.414 0 4.636-.818 6.405-2.192"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="m24.024 27.711 1.866 1.097c1.318.775.769 2.793-.76 2.793H12.37c-1.528 0-2.078-2.018-.76-2.793l1.866-1.097M8.438 17.003h-.134a2.146 2.146 0 0 0-2.145 2.145 2.139 2.139 0 0 0 2.466 2.11M29.062 17.003h.134c1.184 0 2.145.961 2.145 2.145a2.139 2.139 0 0 1-2.466 2.11M15.91 17.172v1.611M21.59 17.172v1.611M16.106 22.015c1.763 1.673 3.525 1.673 5.279 0"></path><path fill="#FF7262" stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M18.755 12.374a3.035 3.035 0 1 0 0-6.07 3.035 3.035 0 0 0 0 6.07Z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M16.057 7.666a2.156 2.156 0 0 1-.347-1.157c0-1.158.944-2.11 2.11-2.11"></path></svg>
                <span>아동/가족</span>
            </a>
            <a href="./searchPage?keyword=전시/행사">
                <svg class="respnsive_block svg_icon" xmlns="http://www.w3.org/2000/svg" width="37" height="36" fill="none" viewBox="0 0 37 36"><path fill="#fff" d="M.5 0h36v36H.5z"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M28.4 20.194V7.698a2.37 2.37 0 0 0-2.37-2.37H10.97a2.37 2.37 0 0 0-2.37 2.37v20.604a2.37 2.37 0 0 0 2.37 2.37h15.06a2.37 2.37 0 0 0 2.37-2.37v-4.143"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M24.414 8.565h-11.82a.948.948 0 0 0-.948.948v16.983c0 .523.424.948.948.948h11.82a.948.948 0 0 0 .948-.948V9.512a.948.948 0 0 0-.948-.948ZM25.097 27.21l2.629 2.628M25.097 8.706l2.629-2.63M11.875 27.237l-2.601 2.601M11.875 8.678 9.274 6.077"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="m20.905 20.63.441-.441a2.37 2.37 0 0 1 3.352 0l.44.44"></path><path stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="m11.858 21.512 3.289-3.289a2.37 2.37 0 0 1 3.351 0l6.71 6.71"></path><path fill="#FFA33F" stroke="#333" stroke-linecap="round" stroke-miterlimit="10" stroke-width="1.5" d="M20.4 14.926a1.867 1.867 0 1 0 0-3.734 1.867 1.867 0 0 0 0 3.734Z"></path></svg>
                <span>전시/행사</span>
            </a>
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
    </nav>
    <section class="sec">
        <div class="sec_top">
            <span class="main_opt">
                ${param.keyword==""||param.keyword==null?"전체":param.keyword}
            </span>
            <div class="select_opt">
                <a href = searchPage?keyword=${param.keyword}&option=a_e_date> <span class="${param.option==null||param.option=="a_e_date"?"red":""}" >공연임박순 </span></a>
                <a href = searchPage?keyword=${param.keyword}&option=a_order_count><span class="${param.option=="a_order_count"?"red":""}">예매많은순 </span></a>
            </div>
        </div>
        <div class="sec_main" >
            <c:if test="${empty searchList}">
                <div class="zero">${param.keyword} (으)로 검색된 결과가 없습니다. </div>
            </c:if>
            <c:forEach var="list" items="${searchList}" varStatus="index">
                <div class="show_box" >
                    <div class="img_box" >
                        <a href="/detailPage?a_seqno=${list.getA_seqno()}">
                            <img src="<c:url value='/img/article/${list.getA_img()}'/>" alt="공연 포스터" class="poster_img" >
                        </a>
                    </div>
                    <div class="show_txt_box" >
                        <span class="show_title" >${list.getA_title()}</span>
                        <span class="show_area" >${list.getA_location()}</span>
                        <span class="show_date" >${startTime.get(index.count-1)}~${endTime.get(index.count-1)}</span>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="add_show_btn" id="addbtn">
            더 보기
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
<script src="<c:url value='/js/common.js'/>"></script>
<%--<script src="<c:url value='/js/search_page.js'/>"></script>--%>
<script>
    $(document).ready(function(){
        let searchCount = function (){

            console.log($(".show_box").length,${searchCount});

            if ($(".show_box").length >= ${searchCount}){
                $("#addbtn").css({display:"none"});
            }
        }
        searchCount();

        // 한자리 수면 앞에 0 붙이는 함수
        function zero(num) {
            if(num < 10) {
                return "0"+num;
            }
            return num;
        }
        let offset = 10
        let keyword = "${param.keyword}";
        let option ="${param.option}";
        console.log(keyword)
        console.log(option)

        $(document).on('click', '.add_show_btn' , function (){
            $.ajax({
                type:'GET',
                url: '/plusArticle?keyword='+keyword+"&option="+option+"&offset="+offset,
                success : function (result){
                    let tmp = "";
                    result.forEach(function (rowResult){
                        let dt = new Date(rowResult.a_s_date);
                        let syear = dt.getFullYear();
                        let smonth = dt.getMonth() + 1;
                        let sdate = dt.getDate();

                        let dt2 = new Date(rowResult.a_e_date);
                        let eyear = dt2.getFullYear();
                        let emonth = dt2.getMonth() + 1;
                        let edate = dt2.getDate();

                        tmp += `
                            <div class="show_box">
                                <div class="img_box">
                                    <a href="/detailPage?a_seqno=${'${rowResult.a_seqno}'}">
                                        <img src="<c:url value='/img/article/${"${rowResult.a_img}"}'/>" alt="공연 포스터" class="poster_img">
                                    </a>
                                </div>
                                <div class="show_txt_box">
                                    <span class="show_title">${'${rowResult.a_title}'}</span>
                                    <span class="show_area">${'${rowResult.a_location}'}</span>
                                    <span class="show_date">${'${syear}'}-${'${zero(smonth)}'}-${'${zero(sdate)}'} ~ ${'${eyear}'}-${'${zero(emonth)}'}-${'${zero(edate)}'}</span>
                                </div>
                            </div>`
                    })
                    $('.sec_main').append(tmp);
                    searchCount();
                },
                error : function (){
                    alert("잘못된 접근입니다.")
                }
            });

            offset += 10;
        })

    })
</script>

</body>
</html>
