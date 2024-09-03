<%--
  Created by IntelliJ IDEA.
  User: 나상민
  Date: 2024-07-27
  Time: 오후 2:12
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
    <link rel="stylesheet" href="<c:url value='/css/login_page.css'/>">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>

    <title>로그인 페이지</title>
</head>
<body>
<main class="main">
    <div class="main_inner">
        <div class="block_pan"></div>
        <div class="find_id_popup popup">
            <p class="popup_title">아이디 찾기</p>
            <form class="find_box" method="get" action="#">
                <div class="ajax_id"></div>
                <div class="popup_input_box ajax">
                    <span>이름</span>
                    <input type="text" class="id_name" required placeholder="이름 입력">
                </div>
                <div class="popup_input_box ajax">
                    <span>생년월일</span>
                    <input type="text" class="id_birth"  required placeholder="생년월일 입력">
                </div>
                <div class="popup_input_box ajax">
                    <span>전화번호</span>
                    <input type="text"  required placeholder="전화번호 입력" class="id_num">
                </div>
                <div class="popup_input_box ajax question_box">
                    <p class="question">Q. 초등학생 때 장래희망은?</p>
                </div>
                <div class="popup_input_box ajax answer_box">
                    <span>A.</span>
                    <input type="text" class="id_answer" required placeholder="정답 입력">
                </div>
                <input type="submit" value="제출하기" class="submit_btn_id ajax">
                <input type="reset" class="close_btn" value="닫기">
            </form>
        </div>
        <div class="find_pw_popup popup">
            <p class="popup_title">비밀번호 찾기</p>
            <form class="find_box" method="get" action="#">
                <div class="ajax_pw"></div>
                <div class="popup_input_box ajax2">
                    <span>아이디</span>
                    <input type="text" required placeholder="아이디 입력" class="pw_id">
                </div>
                <div class="popup_input_box ajax2">
                    <span>이름</span>
                    <input type="text" required placeholder="이름 입력" class="pw_name">
                </div>
                <div class="popup_input_box ajax2">
                    <span>생년월일</span>
                    <input type="text" required placeholder="생년월일 입력" class="pw_birth">
                </div>
                <div class="popup_input_box ajax2">
                    <span>전화번호</span>
                    <input type="text" required placeholder="전화번호 입력" class="pw_num">
                </div>
                <input type="submit" value="제출하기" class="submit_btn_pw ajax2">
                <input type="reset" class="close_btn" value="닫기">
            </form>
        </div>
        <!-- 아이디 비번찾기 결과 팝업 -->
        <div class="find_info_popup popup">
            <p class="popup_title">요청하신 정보는</p>
            <div class="find_info_box">
                <div class="find_answer">
                    <span>아이디: </span>
                    <span>aaaaaa</span>
                </div>
                <div class="find_answer">
                    <span>비밀번호: </span>
                    <span>aaaaaaaaa</span>
                </div>
                <button class="close_btn">닫기</button>
            </div>
        </div>
        <div class="form_outer">
            <form action="/loginChk" name="login_info" method="post" class="login_box">
                <div class="form_logo">
                    <a href="<c:url value="/"/>" class="form_logo">
                        <span>KH-</span>
                        <span>PARK</span>
                    </a>
                </div>
                <span class="error_message">${param.msg}</span>
                <div class="login_input_box_outer">
                    <div class="login_input_box">
                        <input type="text" placeholder="ID" class="user_info" name="u_id">
                    </div>
                    <div class="login_input_box">
                        <input type="password" placeholder="PW" class="user_info" name="u_pw">
                    </div>
                    <div class="auto_login_box">
                        <input type="checkbox" id="auto_login" name="chk">
                        <label for="auto_login">로그인 상태 유지</label>
                    </div>
                </div>
                <div class="login_input_box">
                    <input type="submit" value="로그인" class="submit_btn">
                </div>
                <div class="help_box">
                    <div class="open_btn">아이디 찾기</div>
                    <div class="open_btn">비밀번호 찾기</div>
                    <div>
                        <a href="<c:url value="register"/>">
                            회원가입
                        </a>
                    </div>
                </div>
                <div class="login_icon_box">

                    <div class="login_other">
                        <div class="other_icon other_icon_1"></div>
                        <span>카카오톡 로그인</span>
                    </div>
                    <div class="login_other">
                        <div class="other_icon other_icon_2"></div>
                        <span>네이버 로그인</span>
                    </div>
                    <div class="login_other">
                        <div class="other_icon other_icon_3"></div>
                        <span>구글메일 로그인</span>
                    </div>
                </div>
            </form>
        </div>
    </div>
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
<script src="<c:url value='/js/login_page.js'/>"></script>
<script>
    $(document).ready(function(){
        // $('.submit_btn_id').on('submit', function(event) {
        //     event.preventDefault(); // 폼 제출을 막음
        // });
        // $('.submit_btn_pw').on('submit', function(event) {
        //     event.preventDefault(); // 폼 제출을 막음
        // });


        $(document).on('click', '.submit_btn_id' , function (){
            event.preventDefault();
            let u_name = $('.id_name').val();
            let u_birth = $('.id_birth').val();
            let u_num = $('.id_num').val();
            let u_question = $('.id_answer').val();
            let ajax_id = $('.ajax_id');

            $.ajax({
                type:'POST',
                url: '/findId',
                headers: {"content-type":"application/json"},
                data:JSON.stringify({u_name:u_name, u_birth:u_birth, u_num:u_num, u_question:u_question}),
                success : function (result){
                    ajax_id.text(`회원님의 id는: ${'${result}'} 입니다.`);
                    $('.ajax').css({
                        display: "none"
                    })
                },
                error : function (){
                    alert("정보와 일치하는 id가 없습니다.")
                }
            });
        })


        $(document).on('click', '.submit_btn_pw' , function (){
            event.preventDefault()
            let u_name = $('.pw_name').val();
            let u_birth = $('.pw_birth').val();
            let u_num = $('.pw_num').val();
            let u_id = $('.pw_id').val();
            let ajax_pw = $('.ajax_pw');

            $.ajax({
                type:'POST',
                url: '/findPW',
                headers: {"content-type":"application/json"},
                data:JSON.stringify({u_name:u_name, u_birth:u_birth, u_num:u_num, u_id:u_id}),
                success : function (result){
                    ajax_pw.text(`회원님의 pw는: ${'${result}'} 입니다.`)
                    $('.ajax2').css({
                        display: "none"
                    })
                },
                error : function (){
                    alert("정보와 일치하는 pw가 없습니다.")
                }
            });
        })

    })

</script>
</body>
</html>