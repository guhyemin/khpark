<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2024-08-01
  Time: 오후 4:44
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
    <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/my_page.css'/>">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css"/>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <title>내정보 페이지</title>
</head>
<body>

<header class="header">
    <div class="header_inner">
        <a href="<c:url value="/"></c:url>" class="h_logo">
            <span>KH-</span>
            <span>PARK</span>
        </a>
        <form class="h_search_box" action="#" method="post">
            <input type="text" class="h_search">
            <input type="submit" class="search_icon_box">
        </form>
        <div class="h_info_box">
            <a href="./index.html" class="respnsive_block dis_flex">
                <div class="header_icon h_icon1"></div>
                <span>홈</span>
            </a>
            <a href="./login_page.html" class="dis_flex">
                <div class="header_icon h_icon2"></div>
                <span>
                    ${sessionScope.u_id} 님
                </span>
            </a>
            <a href="<c:url value="${sessionScope.u_id == null?'/login':'/logout'}"></c:url>" class="respnsive_none">
                <span>
                    ${sessionScope.u_id == null?'로그인':'로그아웃'}
                </span>
            </a>
            <a href="#" class="respnsive_block dis_flex top_btn">
                <div class="header_icon h_icon4"></div>
                <span>TOP</span>
            </a>
        </div>

        <!-- 정보수정 -->
        <div class="popup popup_1">
            <a href="./index.html" class="popup_logo">
                <span>KH-</span>
                <span>PARK</span>
            </a>
            <p class="popup_title">정보 수정</p>
            <!--뭐 변경할지 선택 -->
            <div class="find_opt_box">
                <div class="find_opt">${sessionScope.u_id} 님</div>
                <div class="find_opt">비밀번호 변경</div>
                <div class="find_opt">전화번호 변경</div>
                <div class="find_opt">문제 정답 변경</div>
                <div class="popup_btn_box">
                    <button class="close_btn close_popup_update">닫기</button>
                </div>
            </div>
            <!-- 아이디 변경 -->
            <form class="update_box_outer" action="#" method="post">
                <div class="update_box">
                    <!-- 현재 아이디 입력 -->
                    <span>현재 아이디</span>
                    <input type="text" placeholder="현재 아이디를 입력" class="orign_input">
                    <span class="error_msg"></span>
                    <!-- 변경할 아이디 입력 -->
                    <span>변경할 아이디</span>
                    <input type="text" placeholder="변경할 아이디를 입력" class="update_input">
                    <span class="error_msg"></span>
                    <!-- 버튼 박스 -->
                    <div class="popup_btn_box">
                        <input type="submit" class="update_btn" value="변경하기">
                        <input type="reset" class="prev_btn_update" value="이전으로">
                        <input type="reset" class="off_close_btn" value="닫기">
                    </div>
                </div>
            </form>
            <!-- 비번 변경 -->
            <form class="update_box_outer" action="/pwUpdate" method="post">
                <div class="update_box">
                    <!-- 현재 비밀번호 입력 -->
                    <span>현재 비밀번호</span>
                    <input type="password" placeholder="현재 비밀번호를 입력" class="orign_input" name="nowPw">
                    <span class="error_msg"></span>
                    <!-- 변경할 비밀번호 입력 -->
                    <span>변경할 비밀번호</span>
                    <input type="password" placeholder="변경할 비밀번호를 입력" class="update_input" name="upPw">
                    <span class="error_msg"></span>
                    <!-- 비밀번호 확인 -->
                    <input type="password" placeholder="비밀번호를 한번 더 입력" class="update_input">
                    <span class="error_msg"></span>
                    <!-- 버튼 박스 -->
                    <div class="popup_btn_box">
                        <input type="submit" class="update_btn" value="변경하기">
                        <input type="reset" class="prev_btn_update" value="이전으로">
                        <input type="reset" class="off_close_btn" value="닫기">
                    </div>
                </div>
            </form>
            <!-- 전화번호 변경 -->
            <form class="update_box_outer" action="/numUpdate" method="post">
                <div class="update_box">
                    <!-- 전화번호 입력 -->
                    <span>전화번호</span>
                    <input type="text" placeholder="변경할 전화번호를 입력" class="update_input" name="upNum">
                    <span class="error_msg"></span>
                    <!-- 버튼박스 -->
                    <div class="popup_btn_box">
                        <input type="submit" class="update_btn" value="변경하기">
                        <input type="reset" class="prev_btn_update" value="이전으로">
                        <input type="reset" class="off_close_btn" value="닫기">
                    </div>
                </div>
            </form>
            <!-- 문제 답 변경 -->
            <form class="update_box_outer" action="/answerUpdate" method="post">
                <div class="update_box">
                    <!-- 질문 정답 입력 -->
                    <span>질문: 초등학생 때 장래희망은?</span>
                    <input type="text" placeholder="변경할 정답을 입력" class="update_input" name="upAnswer">

                    <span class="error_msg"></span>
                    <!-- 버튼박스 -->
                    <div class="popup_btn_box">
                        <input type="submit" class="update_btn" value="변경하기">
                        <input type="reset" class="prev_btn_update" value="이전으로">
                        <input type="reset" class="off_close_btn" value="닫기">
                    </div>
                </div>
            </form>
        </div>
        <!-- 포인트충전 -->
        <form class="popup popup_2" action="/point" method="post">
            <a href="./index.html" class="popup_logo">
                <span>KH-</span>
                <span>PARK</span>
            </a>
            <p class="popup_title">포인트 충전</p>
            <div class="point_input_box">
                <input type="text" class="point_input" readonly value="0" name="cash">
                <span class="point_input_txt">P</span>
            </div>
            <div class="point_increment_btn_box">
                <div class="add_btn">+ 1만원</div>
                <div class="add_btn">+ 3만원</div>
                <div class="add_btn">+ 5만원</div>
                <div class="add_btn">+ 10만원</div>
            </div>
            <div class="popup_btn_box">
                <input type="submit" class="submit_btn point_btn" value="충전하기">
                <input type="reset" class="close_btn" value="닫기">
            </div>
        </form>
        <!-- 예매내역 -->
        <div class="popup popup_3">
            <a href="./index.html" class="popup_logo">
                <span>KH-</span>
                <span>PARK</span>
            </a>
            <p class="popup_title">예매 내역</p>

            <div class="ticket_area">
                <c:forEach var="item" items="${orderListDto}" varStatus="index">
                    <div class="ticket_box">
                        <img src="../img/article/${item.a_img}" alt="예매 내역 이미지" class="ticket_img">
                        <div class="ticket_txt_box">
                            <div>
                                <span>예매 일자 </span>
                                <span class="ticket_date">${getTime.get(index.count-1)}</span>
                                <%--시간리스트 뽑아오는거
                                varStatus 변수 만들고 이용해서 index.count 로 숫자 순서대로 찍을수 있음 ex)1 2 3 4 5 6 7
                                1부터 나와서 -1해줬음 우리는 0번방부터 보고 싶기때문에
                                --%>
                            </div>
                            <span class="ticket_title">${item.a_title}</span>
                            <div>
                                <span>좌석 </span>
                                <div class="ticket_price_box">
                                    <span class="ticket_price">${item.ao_s_seat1}</span>
                                    <span class="ticket_price">${item.ao_s_seat2}</span>
                                </div>
                            </div>
                        </div>
                    </div>

                </c:forEach>
            </div>

            <div class="popup_btn_box">
                <input type="reset" class="close_btn" value="닫기">
            </div>
        </div>
        <!-- 후기작성 -->
        <form class="popup popup_4 asd" action="#" method="Get">
            <a href="./index.html" class="popup_logo">
                <span>KH-</span>
                <span>PARK</span>
            </a>
            <p class="popup_title">후기작성</p>
            <div class="review_box">
                <div class="swiper-pagination"></div>
                <div class="swiper mySwiper">
                    <div class="swiper-wrapper">
                        <c:forEach var="item" items="${reviewList}" varStatus="index">
                            <div class="swiper-slide swiper-slide-active" role="group" aria-label=" ${index}/ 10" style="width: 374px;">

                                <div class="poster_img_box">
                                    <img src="<c:url value="/img/article/${item.a_img}"></c:url>" alt="후기 포스터 사진">
                                </div>
                                <p class="img_title">${item.a_title}</p>
                                <div class="review_txt_box">
                                    <div class="review_box">
                                        <p class="box_title">별점 주기</p>
                                        <div class="score_box">
                                            <div class="star_box_outer">
                                                <div class="star_box">
                                                    <div class="full_star first_score" style="display: block;"></div>
                                                    <div class="zero_star"></div>
                                                </div>
                                                <div class="star_box">
                                                    <div class="full_star" style="display: none;"></div>
                                                    <div class="zero_star"></div>
                                                </div>
                                                <div class="star_box">
                                                    <div class="full_star" style="display: none;"></div>
                                                    <div class="zero_star"></div>
                                                </div>
                                                <div class="star_box">
                                                    <div class="full_star" style="display: none;"></div>
                                                    <div class="zero_star"></div>
                                                </div>
                                                <div class="star_box">
                                                    <div class="full_star" style="display: none;"></div>
                                                    <div class="zero_star"></div>
                                                </div>
                                            </div>
                                            <input type="range" min="1" max="5" step="1" value="1" class="star_scroll" data-num="0">
                                        </div>
                                    </div>

                                    <div class="review_box titlebox">
                                        <p class="box_title">리뷰제목</p>
                                        <input type="text" class="review_title" name="title">
                                        <span class="input_error_msg"></span>
                                    </div>
                                    <div class="review_box contentbox">
                                        <p class="box_title">리뷰쓰기</p>
                                        <textarea name="review_txt" class="review_content" ></textarea>
                                        <span class="textarea_error_msg"></span>
                                    </div>
                                </div>
                                <div style="display: none" >${item.a_seqno}</div>
                                <input type="submit" value="등록하기" class="review_submit_btn">
                                <input type="reset" class="none_reset" value="초기화">

                            </div>

                        </c:forEach>


                    </div>
                    <div class="swiper-button-next swiper_btn"></div>
                    <div class="swiper-button-prev swiper_btn"></div>
                </div>
                <div class="popup_btn_box">
                    <div class="close_btn review_close_btn">닫기</div>
                </div>
            </div>
        </form>
        <!-- 문의 팝업 -->
        <div class="popup popup_5">
            <h1>서비스 예정입니다 ♡</h1>
            <div class="popup_btn_box">
                <input type="reset" class="close_btn" value="닫기">
            </div>
        </div>
        <!-- 회원 탈퇴 -->
        <div class="popup popup_6">
            <a href="./index.html" class="popup_logo">
                <span>KH-</span>
                <span>PARK</span>
            </a>
            <p class="popup_title">회원탈퇴</p>
            <div class="confirm_txt_box">
                <span>회원탈퇴를 원하시면</span>
                <span>"회원탈퇴에 동의합니다"</span>
                <span>입력해주세요</span>
            </div>
            <div class="confirm_btn_box">
                <div class="confirm_input_box">
                    <input type="text" placeholder="회원 탈퇴에 동의합니다" class="delete_confirm_input">
                </div>
                <div class="popup_btn_box">
                    <div class="delete_btn">탈퇴하기</div>
                    <div class="close_btn">닫기</div>
                </div>
            </div>
        </div>
    </div>
    <div class="block_pan"></div>
</header>
<main class="main">
    <section class="sec">
        <p class="sec_title">프로필</p>
        <div class="info_box_outer">
            <div class="info_box_L">
                <div class="info_box_txt">
                    <div class="profile_box_inner">
                        <div class="profile_img_box">
                            <img src="../img/pro.png" alt="프로필 사진">
                        </div>
                        <div class="profile_txt_header">
                            <p>안녕하세요</p>
                            <div>
                                <span>${sessionScope.u_id}</span>
                                <span> 님</span>
                            </div>
                        </div>
                    </div>
                    <div class="profile_txt_main">
                        <div class="info_content_box">
                            <p class="info_title">이름</p>
                            <p class="info_content">${userDto.u_name}</p>
                        </div>
                        <div class="info_content_box">
                            <p class="info_title">생년월일</p>
                            <p class="info_content">${userDto.u_birth}</p>
                        </div>
                        <div class="info_content_box">
                            <p class="info_title">전화번호</p>
                            <p class="info_content">${userDto.u_num}</p>
                        </div>
                        <div class="info_content_box">
                            <p class="info_title">현재 포인트</p>
                            <p class="info_content aaa">${userDto.getC_cash()}</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="info_box_R">
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
<script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
<script src="<c:url value='/js/common.js'/>"></script>
<script src="<c:url value='/js/my_page.js'/>"></script>
<script>
    $(document).ready(function(){
        let ttt = ${userDto.c_cash}
            $('.aaa').text(ttt.toLocaleString("ko") + " 원")

        <c:if test="${not empty param.mode1}">
        let mode1 = ${param.mode1}
        if(mode1 == 0){
            alert("회원정보 변경에 성공하였습니다")
        }
        else if(mode1 == 1){
            alert("회원정보 변경에 실패하였습니다")
        }
        </c:if>

        $('.popup_4').on('submit', function(event) {
            event.preventDefault(); // 폼 제출을 막음
        });

        /*이건 뭐냐면 후기작성에서 에이젝스로 후기제목/내용 돌린 거야*/
        $(document).on('click','.review_submit_btn',function(){
            if (!condition){ //위에서 흐름이 false 면 ajax 안 돌릴 거다
                return false; // if문이나 for안에서 돌리면 바로 다 멈추겠다.
            }
            let r_title = $(this).prev().prev().children('.titlebox').children('.review_title').val();
            let r_content = $(this).prev().prev().children('.contentbox').children('.review_content').val();
            let r_article = $(this).prev().text();

            let r_title_v = $(this).prev().prev().children('.titlebox').children('.review_title');
            let r_content_v = $(this).prev().prev().children('.contentbox').children('.review_content');


            console.log(r_title);
            console.log(r_content);
            console.log(r_article);



            $.ajax({
                type:"POST",
                url: "/review",
                headers: {"content-type":"application/json"},
                data:JSON.stringify({r_title:r_title, r_content:r_content, r_article:r_article}),
                success:function(body) {
                    alert(body)
                    r_title_v.val("");
                    r_content_v.val("");
                },
                error:function(){
                    alert("등록에 실패했어요!")
                }
            });


        });


    })




    // 리뷰 유효성 검사
    let review_title = document.getElementsByClassName("review_title")
    let review_content = document.getElementsByClassName("review_content")
    let review_submit_btn =document.getElementsByClassName("review_submit_btn")
    let input_error_msg = document.getElementsByClassName("input_error_msg")
    let textarea_error_msg = document.getElementsByClassName("textarea_error_msg")
    let condition = true // like a 방향키 (흐름 설정하는 용도)
    for(let i=0; i<review_submit_btn.length; i++){
        review_submit_btn[i].addEventListener("click",function(e){
            input_error_msg[i].textContent=""
            textarea_error_msg[i].textContent=""
            if(review_title[i].value == ""){ //리뷰 제목이 비어있으면 흐름 false 주고 메세지 띄워주기
                input_error_msg[i].textContent="리뷰제목 입력"
                review_title[i].focus()
                condition = false
            }
            else if(review_title[i].value.length < 5){ //리뷰 제목이 5글자 미만이면 흐름 false 주고 메세지 띄워주기
                input_error_msg[i].textContent="5글자 이상 입력"
                review_title[i].focus()
                condition = false
            }
            else{ // 리뷰 제목 잘 작성하면 통과 시켜주기
                condition = true
            }
            if(condition){
                if(review_content[i].value == ""){ //리뷰 내용이 비어있으면 흐름 false 주고 메세지 띄워주기
                    textarea_error_msg[i].textContent="리뷰내용 입력"
                    review_content[i].focus()
                    condition= false
                }
                else if(review_content[i].value.length < 10){//리뷰 내용이 10글자 미만이면 흐름 false 주고 메세지 띄워주기
                    textarea_error_msg[i].textContent="10글자 이상 입력"
                    review_content[i].focus()
                    condition= false
                }
            }
        })
    }


</script>
</body>
</html>