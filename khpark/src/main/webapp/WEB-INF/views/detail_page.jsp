<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2024-07-31
  Time: 오후 7:41
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
    <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/ticketing_page.css'/>">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <title>예매 페이지</title>
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
        <div class="show_box_outer">
            <div class="show_box">
                <!-- 공연 포스터 -->
                <div class="show_img">
                    <img src="<c:url value='/img/article/${selectArticle.getA_img()}'/>" alt="공연 포스터" class="poster_img" >
                </div>
                <!-- 공연 정보 텍스트 -->
                <div class="show_txt_box">
                    <p class="show_title">${selectArticle.getA_title()}</p>
                    <div class="show_txt">
                        <span class="txt_title">장소</span>
                        <span class="txt_sub">${selectArticle.getA_location()}</span>
                    </div>
                    <div class="show_txt">
                        <span class="txt_title">공연기간</span>
                        <span class="txt_sub">${startDate} ~ ${endDate}</span>
                    </div>
                    <div class="show_txt">
                        <span class="txt_title">공연시간</span>
                        <span class="txt_sub">${selectArticle.getA_time()}분</span>
                    </div>
                    <div class="show_txt">
                        <span class="txt_title">관람연령</span>
                        <span class="txt_sub">14세 이상 관람가</span>
                    </div>
                    <div class="show_txt show_price_box">
                        <span class="txt_title">가격</span>
                        <div class="price_box_inner">
                            <div class="info_pirce">
                                <span>VIP석</span>
                                <span class="price_num">170,000원</span>
                            </div>
                            <div class="info_pirce">
                                <span>R석</span>
                                <span class="price_num">140,000원</span>
                            </div>
                            <div class="info_pirce">
                                <span>S석</span>
                                <span class="price_num">110,000원</span>
                            </div>
                            <div class="info_pirce">
                                <span>A석</span>
                                <span class="price_num">80,000원</span>
                            </div>
                        </div>
                    </div>
                    <div class="show_txt">
                        <span class="txt_title">혜택</span>
                        <span class="txt_sub">무이자 할부</span>
                    </div>
                </div>
            </div>
            <div class="pos_box">
                <form action="<c:url value='/ticket/save'/>" method="post" class="form_box">
                    <div class="form_inner">
                        <!-- 날짜 -->
                        <div class="date_box">
                            <p class="box_title">관람일</p>
                            <input type="date"  class="date_input" value="${startDate}" name="date">
                        </div>
                        <!-- 시간 -->
                        <div class="time_box">
                            <p class="box_title">관람시간</p>
                        </div>
                        <!-- 좌석 -->
                        <p class="box_title">좌석 선택</p>
                        <div class="sit_box_outer">
                            <div class="VIP_line sit_line">
                                <p class="sit_class">VIP</p>
                            </div>
                            <div class="R_line sit_line">
                                <p class="sit_class">R </p>
                            </div>
                            <div class="S_line sit_line">
                                <p class="sit_class">S</p>
                            </div>
                            <div class="A_line sit_line">
                                <p class="sit_class">A</p>
                            </div>
                            <div class="B_line sit_line">
                                <p class="sit_class">B</p>
                            </div>
                        </div>
                    </div>
                    <div class="price_box">
                        <span>총 결제금액: </span>
                        <span class="total_price_span">0</span>
                        <span>원</span>
                    </div>
                    <input type="submit" value="예매하기" class="payment_btn">
                </form>
            </div>
            <div id="paymentPopup" style="display:none;">
                <h2>결제 정보</h2>
                <p>현재 보유중인 포인트: <span id="currentCash"></span></p>
                <p>총 결제 금액: <span id="paymentTotal"></span></p>
                <p>결제 후 예상 잔여 포인트: <span id="updateCash"></span></p>

                <button id="paymentBtn">결제하기</button>
                <button id="paymentCancle">취소</button>
            </div>
            <div class="show_manual_box">
                <div class="manual_opt_box">
                    <p class="manual_txt">공연정보</p>
                    <p class="manual_txt">캐스팅정보</p>
                    <p class="manual_txt">공지사항</p>
                </div>
                <div class="manual_pan_box">
                    <div class="show_info_pan m_pan">
                        <div class="m_img_box">
                            <img src="<c:url value='/img/article/${selectArticle.getA_content()}'/>" alt="공연 포스터" class="poster_img" >
                        </div>
<%--                        <div class="m_img_box"></div>--%>
                    </div>
                    <div class="casting_pan m_pan">
                        <div class="casting_txt_box">
                            <p>※ 예매 취소 및 변경 안내</p>
                            <p>캐스팅 변경으로 인한 예매 취소 및 환불의 경우</p>
                            <p>공연 시작 2시간 전까지 예매하신 각 예매처 </p>
                            <p>고객센터로 전화 주시면 수수료 없이 처리 가능합니다.</p>
                        </div>
                        <div class="casting_pan_inner">
                        </div>
                    </div>
                    <div class="notice_pan m_pan">
                        <div class="total_list">
                            <span>총</span>
                            <span class="total_num">0</span>
                            <span>개의 공지사항이 있습니다</span>
                        </div>
                    </div>
                </div>
            </div>
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
<script src="<c:url value='/js/ticketing_page.js'/>"></script>

<script>
    let total_price = 0;
    let seatCount = 0;

    $(document).ready(function (){
        <c:if test="${not empty param.msg}">
        alert(${param.msg})
        </c:if>

        $('.date_input').trigger('change') //예매화면 들어오면 해당 아티클 첫 번째 날짜 자동 선택 (위에 html단에 value값 설정(시작값 넣어줌(startDate))



        //좌석 선택 매수 제한(최대2), 각 등급의 좌석 클릭시 좌석 색 변경, 선택한 좌석에 따른 금액 변경
        $(document).on("click",".label",function (){
            if (seatCount < 3){ // 기존 선택한 두 자리 취소되게 하기위해 3으로 설정
                if($(this).prev().is(':checked')){ //누른거 위에 있는 input checkbox 값이 체크되어있으면 true
                    if (seatCount>=2){ //좌석 선택 매수 제한(최대2)
                        $(this).prev().prop("checked", false);
                        alert("최대2개까지 선택 가능합니다.")
                    }
                    else { // 2개 이하면 선택 가능(색 변경, 금액 추가)
                        total_price += Number($(this).parent().data('price'))
                        if ($(this).hasClass("VIP_sit_label")){
                            $(this).toggleClass("VIP_color")
                        }
                        else if($(this).hasClass("R_sit_label")){
                            $(this).toggleClass("R_color")
                        }
                        else if($(this).hasClass("S_sit_label")){
                            $(this).toggleClass("S_color")
                        }
                        else if($(this).hasClass("A_sit_label")){
                            $(this).toggleClass("A_color")
                        }
                        else if($(this).hasClass("B_sit_label")){
                            $(this).toggleClass("B_color")
                        }
                        seatCount ++; //선택했으니 선택한 좌석 수 증가
                    }
                }
                else { //누른거 위에 있는 input checkbox 값이 체크를 풀면 돌아가는 곳(금액 빼기, 색 빼기, seatCount --)
                    total_price -= Number($(this).parent().data('price'))
                    if ($(this).hasClass("VIP_sit_label")){
                        $(this).toggleClass("VIP_color")
                    }
                    else if($(this).hasClass("R_sit_label")){
                        $(this).toggleClass("R_color")
                    }
                    else if($(this).hasClass("S_sit_label")){
                        $(this).toggleClass("S_color")
                    }
                    else if($(this).hasClass("A_sit_label")){
                        $(this).toggleClass("A_color")
                    }
                    else if($(this).hasClass("B_sit_label")){
                        $(this).toggleClass("B_color")
                    }
                    seatCount--;
                }
                $('.total_price_span').text(total_price.toLocaleString("ko")) //금액 찍어주기 (원으로 표시)
            }
        })
    });



    //date_input 날짜선택에 제한주기(각 article에 속해있는 날짜만 선택 가능하게)
    let adateListJson = '${adateList}';


    // 문자열에서 불필요한 '" 등 제거
    adateListJson = adateListJson.replace(/&quot;/g, '"').replace(/\\'/g, "'").replace(/\\"/g, '"');

    try {
        // JSON 파싱 시 오류를 잡기
        let allowedDates = JSON.parse(adateListJson);

        // 날짜 입력 필드를 설정하는 함수
        function setupDateInput() {
            const dateInput = $('.date_input');

            // 해당 아티클에 맞는 날짜 넣기
            dateInput.attr('list', 'allowed-dates');

            // 허용된 날짜 설정
            allowedDates.forEach(date => {
                $('<option>').val(date).text(date).appendTo('#allowed-dates');
            });

            // 날짜 변경 이벤트 추가
            dateInput.on('change', function() {


                $('.label').css({ //밑에서 선택된 좌석 display:none 해놨으니 새로운 날짜 선택시 다시 살려주기 위한 것
                    display: "block",
                })
                $('.sit_box ').css({ //밑에서 선택된 좌석 backgroundcolor:#~(짙은회색처리) 해놨으니 새로운 날짜 선택시 "
                    background: "#fff",
                })


                const selectedDate = $(this).val(); //sesectedDate = 선택한 날짜 값 가져옴
                if (!allowedDates.includes(selectedDate)) { // 해당 아티클에 해당되는 날짜중에 이게 있지 않으면!
                    $('.time_box').html('<p class="box_title">관람시간</p>') //시간 띄워줬던거(아티클 누르면 자동으로 첫 번째 날짜, 시간, 좌석 가져오고 있음) 없애주고 관람시간 글자만 남겨두기
                    $('.sit_box_outer').css({ // 위와 같은 이유로 띄워줬던 좌석 없애주기
                        display: "none",
                    })
                    alert('해당 날짜에는 공연이 없습니다.');
                    $(this).val(''); // 입력값 초기화
                }
                else { // 해당 아티클에 해당되는 날짜중에 지금 값이 있으면!
                    let a_seqno = ${param.a_seqno}; //현재 들어온 아티클의 고유번호 들고오기 + ajax~
                        $.ajax({
                            type:'GET', // 요청 메서드
                            url: '/getTIme/?a_seqno='+a_seqno+"&a_date="+selectedDate,

                            success : function(result){
                                let tmp = `<p class="box_title">관람시간</p>`
                                let count = 0;
                                console.log(result); //해당 날짜에 맞는 시간 목록 담겨있음
                                result.forEach(function(rowResult){
                                    let ccc =  rowResult.at_time;
                                        ccc = ccc.substring(0,5);  /* 이거 16:00:00 이면 16:00 으로 짤라준거임*/


                                    tmp +=`
                                    <input type="radio" class="show_time_input" id="time_${'${count}'}" name="time"/>
                                    <label htmlFor="time_${'${count}'}" class="time_title" data-num="${'${count}'}"
                                    style="background: white; color: black;">${'${ccc}'}</label>
                                    <div style="display: none">${'${rowResult.at_seqno}'}</div>
                                    `


                                    count++ //위에 count 쓴거 다르게 주려고 (id값 time_())
                                })
                                $('.time_box').html(tmp) //시간 넣어주기(append 안돼 옆으로 추가됨)
                                $(".time_title").eq(0).trigger("click"); //날짜 고르면 시간 목록 중 첫 번째꺼 자동선택
                            },
                            error: function () {
                                alert("오류가 발생하였습니다.")
                            } // 에러가 발생했을 때, 호출될 함수
                        });
                }
            });
        }

        $(document).on("click",".time_title",function (){ //시간 고르면
            $(this).prev().prop("checked",true);
            $('.label').removeClass("VIP_color R_color S_color A_color B_color");
            $('.sit').prop("checked", false);
            seatCount = 0;
            total_price = 0;
            $('.total_price_span').text(total_price.toLocaleString("ko"));
                // $('.label').removeClass("VIP_color")
                // $('.label').removeClass("R_color")
                // $('.label').removeClass("S_color")
                // $('.label').removeClass("A_color")
                // $('.label').removeClass("B_color")
                // $(".sit").prop("checked", false);
                // $('.total_price_span').text(0);
                // total_price=0;
                // seatCount=0;


            $('.label').css({ //밑에 rowResult의 next에 display:none 해놓은거 다시 살려주기 => 선택된 좌석 none해줬던건데 그거 다시 초기화 해주는거
                display: "block",
            })
            $('.sit_box ').css({ // 위와 같음
                background: "#fff",
            })
            $('.sit').removeProp('disabled') //이미 판매된 좌석 못고르게 막았던거(밑에 있음) 풀기

            $('.sit_box_outer').css({ //날짜 고르면 시트 보여주기
                display: "block"
            })
            $('.time_title').css({ //날짜 css 다시 살리기
                background : "white",
                color : "black"
            })
            $(this).css({ // 클릭한 날짜 색 변경
                background : "#8e43e7",
                color : "white"
            })

            let t_seqno = $(this).next().text(); //시간 고유번호 가져오기
            $.ajax({
                type:'GET', // 요청 메서드
                url: '/getSeat/?t_seqno='+t_seqno,

                success : function(result){
                    console.log(result); //구매된 좌석의 id값 담아옴([VIP1, VIP2, VIP25, R8, R16, R26, S18, A8, A30, B1])
                    result.forEach(function(rowResult){
                        $(`#${'${rowResult}'}`).prop("disabled", true); //구매된 좌석 선택 막아주기

                        $(`#${'${rowResult}'}`).next().css({ //선택 막기(input위의 div 지우기)
                            display: "none"
                        });

                        $(`#${'${rowResult}'}`).parent().css({ //선택된 좌석 짙은 회색으로 색 주기, 마우스 cursor:pointer 풀어주기
                            backgroundColor: "#494646",
                            cursor: "default"
                        });

                    })
                },
                error: function () {
                    alert("오류가 발생하였습니다.")
                } // 에러가 발생했을 때, 호출될 함수
            });
        })
        // 페이지 로드 후 초기화
        setupDateInput();
    } catch (e) {
        console.error("Error parsing JSON:", e);
    }


    // 날짜 선택 막아두기(오늘날짜 이후 선택 불가)
    //날짜 가져오기
    let aaa = new Date('${startDate}');
    var sdd = aaa.getDate();
    var smm = aaa.getMonth() + 1;
    var syyyy = aaa.getFullYear();
    // console.log(sdd, smm, syyyy)

    let bbb = new Date('${endDate}');
    var edd = bbb.getDate();
    var emm = bbb.getMonth() + 1;
    var eyyyy = bbb.getFullYear();

    if (sdd < 10) {
        sdd = '0' + sdd
    }
    if (smm < 10) {
        smm = '0' + smm
    }
    aaa = syyyy + '-' + smm + '-' + sdd;

    if (edd < 10) {
        edd = '0' + edd
    }
    if (emm < 10) {
        emm = '0' + emm
    }
    bbb = eyyyy + '-' + emm + '-' + edd;
    // console.log(aaa, bbb)

    $(".date_input").attr("min", aaa);
    $(".date_input").attr("max", bbb);




    //예매하기 버튼 누르면 시작
    $(document).on('click','.payment_btn', function (){
<c:if test="${sessionScope.u_id == null}">
    alert("로그인 후 이용해주세요.");
    location.href="/login";
    return false;
</c:if>

    <c:if test="${sessionScope.u_id != null}">
    let a_seqno = ${param.a_seqno}; //게시글 번호

    let a_date = $(this).prev().prev().children().children().next().val(); // 유저가 선택한 날짜

    let a_time = $('.show_time_input:checked').next().text(); //유저가 선택한 시간

    let a_seat = $('.sit:checked').map(function() { //유저가 선택한 좌석 배열로 받아오기(최대 2개)
    return $(this).attr('name');
    }).get();

    let pay_price = $('.total_price_span').text(); // 결제할 총 금액 (선택한 좌석의 총 금액)


    // 결제 팝업에 들어갈 정보들

    let current_cash_num = ${currentCash}; // 로그인 유저가 보유하고 있는 cash 모델에서 가져옴
    let current_cash = current_cash_num.toLocaleString("ko"); // "200000" 으로나오는 숫자형 "200,000"으로 바꿔주기
    let pay_priceNum = +pay_price.replaceAll(",","")
    let update_cash = current_cash_num - pay_priceNum ;



    $('#currentCash').text(current_cash); //로그인한 아이디의 현재 보유중인 cash 넣어주기
    $('#paymentTotal').text(pay_price);
    $('#updateCash').text(update_cash); // (현재 보유중인 cash) - (결제할 금액(pay_price))
    $('#paymentPopup').show(); //결제 팝업창 띄우기


    // 팝업 내의 결제하기 버튼 누르면 시작
    $('#paymentBtn').on('click', function (){
        if ($('#updateCash').text() < 0){
            alert("현재 보유 포인트가 부족합니다. 충전 후 이용해주세요");
            location.href="/myPage";
            return false;
        }
        $(this).css({ //결제하기 버튼 막기
            pointerEvents : "none"
        })
        setTimeout(function(){
            $(this).css({ //결제하기 버튼 다시 살리기 1초뒤에
                pointerEvents : "auto"
            })
        }, 1000)


    $.ajax({
    type: 'POST', // 요청 메서드
    url: '/ticket/save/?a_seqno=' + a_seqno + "&a_date=" + a_date + "&a_time=" + a_time + "&a_seat=" + a_seat + "&update_cash=" + update_cash,
    success : function (result){
    console.log("result="+result);

    //주문 처리 후 팝업 숨기기
    $('#paymentPopup').hide();
    alert("예매가 성공적으로 완료되었습니다.")
    location.reload();

    },
    error : function (){
    alert("한 공연당 최대 2 좌석 구매 가능합니다.")
        location.reload();
    }
    });
    });
    // orderList(a_seqno, a_date, a_time, a_seat, pay_price)

    //취소 버튼 클릭 시
    $('#paymentCancle').on('click', function (){
    $('#paymentPopup').hide();
    })
        </c:if>

    });


    </script>
    </body>
    </html>
