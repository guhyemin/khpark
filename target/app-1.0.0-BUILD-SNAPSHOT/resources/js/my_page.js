// 마이페이지 우측 버튼들 넣어주기
let info_box_R = document.getElementsByClassName("info_box_R")[0]
let fn_icon = document.getElementsByClassName("fn_icon")

let info_fn_arr =[
    ["정보 수정","my_info.png","정보를 수정합니다."],
    ["포인트 충전","cash.png","포인트를 충전합니다."],
    ["예매 내역","tickting.png","예매 내역을 확인합니다."],
    ["후기작성","review.png","후기를 작성합니다."],
    ["1:1문의","review.png","문의를 합니다"],
    ["회원탈퇴", "delete.png","회원을 탈퇴합니다"]
]

for(let i=0; i<info_fn_arr.length; i++){
    info_box_R.innerHTML += `
    <div class="info_function">
        <div class="fn_icon"></div>
        <p>${info_fn_arr[i][0]}</p>
        <p class="sub_txt">${info_fn_arr[i][2]}</p>
    </div>`
}
console.log(fn_icon.length)
for(let i=0; i<info_fn_arr.length; i++){
    fn_icon[i].style.background= `url(../img/my_page/${info_fn_arr[i][1]}) no-repeat center center / cover`
}

// 정보수정 팝업
let update_input = document.getElementsByClassName("update_input")
let error_msg = document.getElementsByClassName("error_msg")
let submit_btn_update = document.getElementsByClassName("submit_btn")[0]
// 정보수정 버튼
let find_opt = document.getElementsByClassName("find_opt")
let find_opt_box = document.getElementsByClassName("find_opt_box")[0]

// 업데이트 버튼 유효성 검사
let update_btn = document.getElementsByClassName("update_btn")
let orign_input = document.getElementsByClassName("orign_input")
let update_box_outer = document.getElementsByClassName("update_box_outer")
let prev_btn_update = document.getElementsByClassName("prev_btn_update")


// 백에서 현재 값과 변경할 값 다른지 검사
// 현재 아이디 비번 값 맞는지 검사

// 아이디 변경
update_btn[0].addEventListener("click", function(e){
    for(let i=0; i<error_msg.length; i++){
        error_msg[i].textContent =""
        console.log("초기화")
    }
    let condition = true

    if(condition){
        console.log("1번 확인")
        if(orign_input[0].value == ""){
            error_msg[0].textContent = "현재 아이디를 입력하시오"
            orign_input[0].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }

    if(condition){
        console.log("2번 확인")
        if(update_input[0].value.length < 6 || update_input[0].value.length > 16){
            error_msg[1].textContent = "6자리 이상 16자리 이하로 입력하시오"
            update_input[0].focus()
            e.preventDefault()
        }
        // 영어  숫자만 사용
        else if(!/^[a-zA-Z0-9]*$/.test(update_input[0].value)){
            error_msg[1].textContent = "영문자와 숫자만 사용 가능 합니다"
            update_input[0].focus()
            e.preventDefault()
        }
        else{
            alert("아이디 변경이 완료되었습니다")
        }
    }
})

// 비밀번호 변경
update_btn[1].addEventListener("click", function(e){
    for(let i=0; i<error_msg.length; i++){
        error_msg[i].textContent =""
        console.log("초기화")
    }
    let condition = true

    if(condition){
        if(orign_input[1].value == ""){
            error_msg[2].textContent = "현재 비밀번호를 입력하시오"
            orign_input[1].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }

    if(condition){
        if(!/^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).+$/.test(update_input[1].value)){
            error_msg[3].textContent = "숫자 문자 특수문자를 한번 이상 사용"
            update_input[1].focus()
            e.preventDefault()
            condition = false
        }
        //  길이 지정
        else if(update_input[1].value.length < 6 || update_input[1].value.length > 16){
            error_msg[3].textContent = "8 ~ 16자 까지만 입력"
            update_input[1].focus()
            e.preventDefault()
            condition = false
        }
        else{
            var password_value = update_input[1].value
            // e.preventDefault() -- 이벤트멈추는거 여기있으면 안되는데 들어있어서 지워줌
            condition = true
        }
    }

    if(condition){
        if(update_input[2].value != password_value){
            error_msg[4].textContent = "비밀번호가 다릅니다"
            update_input[2].focus()
            e.preventDefault()
        }
    }
})

// 전화번호 변경
update_btn[2].addEventListener("click", function(e){
    for(let i=0; i<error_msg.length; i++){
        error_msg[i].textContent =""
        console.log("초기화")
    }

    if(update_input[3].value == ""){
        error_msg[5].textContent = "전화번호를 입력하시오"
        update_input[3].focus()
        e.preventDefault()
    }
    else if(!/^[0-9]+$/.test(update_input[3].value)){
        error_msg[5].textContent = "숫자만 사용 가능합니다"
        update_input[3].focus()
        e.preventDefault()
    }
    // 이상한 번호 제외
    else if(!/^[0-9]{2,3}[0-9]{3,4}[0-9]{4}/.test(update_input[3].value) || (update_input[3].value.length < 9 || update_input[3].value.length>11)){
        error_msg[5].textContent = "유효하지 않은 번호입니다"
        update_input[3].focus()
        e.preventDefault()
    }
    else{
        alert("전화번호 변경이 완료되었습니다")
    }
})

// 문제 정답 변경
update_btn[3].addEventListener("click", function(e){
    for(let i=0; i<error_msg.length; i++){
        error_msg[i].textContent =""
        console.log("초기화")
    }
    // 공백 검사
    if(update_input[4].value == ""){
        error_msg[6].textContent = "답을 입력하시오"
        update_input[4].focus()
        e.preventDefault()
    }
    // 한글만 사용
    else if(!/^[가-힣]+$/.test(update_input[4].value)){
        error_msg[6].textContent = "유효하지 않는 답"
        update_input[4].focus()
        e.preventDefault()
    }
    // 한글자 답 제외
    else if(update_input[4].value.length < 2){
        error_msg[6].textContent = "두 글자 이상으로 입력"
        update_input[4].focus()
        e.preventDefault()
    }
    else{
        alert("정답이 변경되었습니다")
    }
})


for(let i=0; i<find_opt.length; i++){
    prev_btn_update[i].addEventListener("click", function(){
        find_opt_box.style.display="block"
        update_box_outer[i].style.display="none"
    })

    console.log("길이는: "+find_opt.length)
    find_opt[i].addEventListener("click",function(){

        if(i == 0){
            // update_box_outer[0].style.display="block"
            console.log("000")
        }
        else if(i == 1){
            find_opt_box.style.display="none"
            update_box_outer[1].style.display="block"
            console.log(111)
        }
        else if(i == 2){
            find_opt_box.style.display="none"
            update_box_outer[2].style.display="block"
            console.log(222)
        }
        else{
            find_opt_box.style.display="none"
            update_box_outer[3].style.display="block"
            console.log(333)
        }
    })
}





// 포인트 충전 팝업
let point_input = document.getElementsByClassName("point_input")[0]
let add_btn = document.getElementsByClassName("add_btn")
let point_btn = document.getElementsByClassName("point_btn")[0]
let total_point = 0;


for(let i=0; i<add_btn.length; i++){
    add_btn[i].addEventListener("click",function(){
        if(i == 0){
            total_point += 10000
        }
        else if(i == 1){
            total_point += 30000
        }
        else if(i == 2){
            total_point += 50000
        }
        else{
            total_point += 100000
        }
        point_input.value = total_point.toLocaleString("ko")
    })
}

point_btn.addEventListener("click", function(e){
    if(total_point == 0){
        alert("충전할 금액을 입력해주세요.")
        e.preventDefault()
    }
    else{
        alert(total_point.toLocaleString("ko")+"P 충전되었습니다.")
        // point_input.value = 0
        total_point = 0
    }
})


// 예매 내역 팝업
// 임시 데이터
let data_arr = [
    ["musical_1.gif","<프랑켄슈타인>","블루스퀘어 신한카드홈","2024.07.28 ~ 10.25","2024-07-30","99000"],
    ["musical_2.gif","<하데스타운>","샤롯데씨어터","2024.08.06 ~ 08.25","2024-07-23","170000"],
    ["musical_3.gif","<영웅>","계명아트센터","2024.05.28 ~ 08.11","2024-07-16","89000"],
    ["musical_4.gif","<이블데드>","인터파크 유니플렉스 1관","2024.07.11 ~ 09.21","2024-07-11","180000",],
    ["musical_5.gif","<홍련>","대학로 자유극장","2024.06.20 ~ 09.13","2024-07-07","110000",],
    ["musical_6.gif","<스파이>","동국대학교 이해랑예술극장","2024.07.12 ~ 10.06","2024-07-01","160000",],
    ["musical_7.gif","<베르사유의 장미>","충무아트센터 대극장","2024.07.28 ~ 10.25","2024-06-29","270000",],
    ["musical_8.gif","<살리에르>","세종문화회관 대극장","2024.05.28 ~ 08.11","2024-06-21","190000",],
    ["musical_9.gif","<젠틀멘스가이드>","광림아트센터 BBCH홀","2024.06.20 ~ 09.13","2024-05-29","240000",],
    ["musical_10.gif","<4월은 너의 거짓말>","예술의 전당 토퀄극장","2024.08.06 ~ 08.25","2024-04-17","130000",]
]
let ticket_area = document.getElementsByClassName("ticket_area")[0]

/*for(let i=0; i<data_arr.length; i++){
    ticket_area.innerHTML += `
        <div class="ticket_box">
            <img src="../img/musical/${data_arr[i][0]}" alt="예매 내역 이미지" class="ticket_img">
            <div class="ticket_txt_box">
                <div>
                    <span>예매 일자 </span>
                    <span class="ticket_date">${data_arr[i][4]}</span>
                </div>
                <span class="ticket_title">${data_arr[i][1]}</span>
                <div>
                    <span>가격: </span>
                    <div class="ticket_price_box">
                        <span class="ticket_price">${Number(data_arr[i][5]).toLocaleString("ko")}</span>
                        <span class="ticket_price">원</span>
                    </div>
                </div>
            </div>
        </div>
    `
}*/

// 후기 작성 팝업
var swiper = new Swiper(".mySwiper", {
    pagination: {
        el: ".swiper-pagination",
        type: "fraction",
    },
    navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
    },
});

let swiper_wrapper = document.getElementsByClassName("swiper-wrapper")[0]
//
// for(let i=0; i<data_arr.length; i++){
//     swiper_wrapper.innerHTML+=`
//     <div class="swiper-slide">
//         <form action="#" method="post">
//             <div class="poster_img_box">
//                 <img src="../img/musical/${data_arr[i][0]}" alt="후기 포스터 사진">
//             </div>
//             <p class="img_title">${data_arr[i][1]}</p>
//             <div class="review_txt_box">
//                 <div class="review_box">
//                     <p class="box_title">별점 주기</p>
//                     <div class="score_box">
//                         <div class="star_box_outer">
//                             <div class="star_box">
//                                 <div class="full_star first_score"></div>
//                                 <div class="zero_star"></div>
//                             </div>
//                             <div class="star_box">
//                                 <div class="full_star"></div>
//                                 <div class="zero_star"></div>
//                             </div>
//                             <div class="star_box">
//                                 <div class="full_star"></div>
//                                 <div class="zero_star"></div>
//                             </div>
//                             <div class="star_box">
//                                 <div class="full_star"></div>
//                                 <div class="zero_star"></div>
//                             </div>
//                             <div class="star_box">
//                                 <div class="full_star"></div>
//                                 <div class="zero_star"></div>
//                             </div>
//                         </div>
//                         <input type="range"  min="1" max="5" step="1" value="1" class="star_scroll" data-num="${i}">
//                     </div>
//                 </div>
//                 <div class="review_box">
//                     <p class="box_title">리뷰제목</p>
//                     <input type="text" class="review_title">
//                      <span class="input_error_msg"></span>
//                 </div>
//                 <div class="review_box">
//                     <p class="box_title">리뷰쓰기</p>
//                     <textarea name="review_txt" class="review_content"></textarea>
//                      <span class="textarea_error_msg"></span>
//                 </div>
//             </div>
//             <input type="submit" value="등록하기" class="review_submit_btn">
//             <input type="reset" class="none_reset" value="초기화">
//         </form>
//     </div>
//     `
// }



// 총 스크롤 갯수
let star_scroll = document.getElementsByClassName("star_scroll")


let full_star = document.getElementsByClassName("full_star")
let zero_star = document.getElementsByClassName("zero_star")


let swiper_slide = document.getElementsByClassName("swiper-slide")
for(let i=0; i<swiper_slide.length; i++){
    star_scroll[i].addEventListener("change", function(e){
        let current_num = Number(e.target.dataset.num)
        // console.log("현재 데이터 값: "+current_num)
        // console.log("현재 input 값 : "+e.target.value)
        // console.log("")

        for(let j=(current_num * 5); j<((current_num * 5) + 5); j++){
            full_star[j].style.display = "none";
        }
        //
        // 0번째 일때 (let k=0; k<0+5; k++)
        // 1번째 일때 (let k=5; k<5+5; k++)
        // 2번째 일때 (let k=10; k<10+5; k++)
        for(let k=(current_num * 5); k<((current_num * 5 ) + Number(e.target.value)) ; k++){
            full_star[k].style.display = "block";


        }
        console.log("현재 데이터 값: "+current_num)
        console.log("현재 ㅏ 값: "+ (current_num * 5))
        console.log("마지막 K 값 : "+((current_num * 5 )+ Number(e.target.value)))
        console.log("")
    })
}


/*// 리뷰 유효성 검사
let review_title = document.getElementsByClassName("review_title")
let review_content = document.getElementsByClassName("review_content")
let review_submit_btn =document.getElementsByClassName("review_submit_btn")
let input_error_msg = document.getElementsByClassName("input_error_msg")
let textarea_error_msg = document.getElementsByClassName("textarea_error_msg")

for(let i=0; i<review_submit_btn.length; i++){
    review_submit_btn[i].addEventListener("click",function(e){
        input_error_msg[i].textContent=""
        textarea_error_msg[i].textContent=""
        let condition = true
        if(review_title[i].value == ""){
            input_error_msg[i].textContent="리뷰제목 입력"
            review_title[i].focus()
            condition = false
        }
        else if(review_title[i].value.length < 5){
            input_error_msg[i].textContent="5글자 이상 입력"
            review_title[i].focus()
            condition = false
        }
        else{
            condition = true
        }
        if(condition){
            if(review_content[i].value == ""){
                textarea_error_msg[i].textContent="리뷰내용 입력"
                review_content[i].focus()
                e.preventDefault()
            }
            else if(review_content[i].value.length < 10){
                textarea_error_msg[i].textContent="10글자 이상 입력"
                review_content[i].focus()
                e.preventDefault()
            }
        }
    })
}*/

// 닫았을때 range 초기화,별점 1점 시작
let review_close_btn = document.getElementsByClassName("review_close_btn")[0]
let none_reset = document.getElementsByClassName("none_reset")
review_close_btn.addEventListener("click",function(){
    for(let i=0; i<none_reset.length; i++){
        none_reset[i].click();
    }

    for(let i=0; i< full_star.length; i++){
        full_star[i].style.display="none"
    }

    for(let i=0; i<swiper_slide.length; i++){
        full_star[i*5].style.display="block"
    }
})


// 회원 탈퇴 팝업
let delete_confirm_input = document.getElementsByClassName("delete_confirm_input")[0]
let delete_btn = document.getElementsByClassName("delete_btn")[0]
let delete_cofirm = false

delete_confirm_input.addEventListener("keyup", function(){
    let delete_txt_value = delete_confirm_input.value

    console.log(delete_txt_value.trim())
    if(delete_txt_value.trim() == "회원탈퇴에 동의합니다"){
        delete_btn.style.backgroundColor ="red"
        delete_cofirm = true
    }
    else{
        delete_cofirm = false
    }
})
delete_btn.addEventListener("click", function(e){
    if(delete_cofirm == false){
        e.preventDefault()
    }
    else{
        if(!confirm("정말로 탈퇴 하시겠습니까?")) return;
        location.href = "/deleteUser"
    }

})



// 팝업 공통 
let info_function = document.getElementsByClassName("info_function")
let popup = document.getElementsByClassName("popup")
let block_pan = document.getElementsByClassName("block_pan")[0]

// 팝업닫기
let close_btn = document.getElementsByClassName("close_btn")

// 정보수정 안에있는 닫기
let off_close_btn = document.getElementsByClassName("off_close_btn")

for(let i=0; i<info_function.length; i++){
    info_function[i].addEventListener("click", function(){
        popup[i].style.display="block"
        block_pan.style.display="block"
    })
}
// 팝업 닫기
for(let i=0; i<close_btn.length; i++){
    close_btn[i].addEventListener("click", function(){
        popup[i].style.display="none"
        block_pan.style.display="none"
        for(let i=0; i<error_msg.length; i++){
            error_msg[i].textContent=""
        }
        for(let i=0; i<input_error_msg.length; i++){
            input_error_msg[i].textContent=""
        }
    })
}
// 이전 버튼 누르면 에러메시지 초기화
for(let i=0; i<prev_btn_update.length; i++){
    prev_btn_update[i].addEventListener("click",function(){
        console.log(error_msg.length)
        for(let i=0; i<error_msg.length; i++){
            error_msg[i].textContent=""
        }
    })
}
for(let i=0; i<off_close_btn.length; i++){
    off_close_btn[i].addEventListener("click", function(){
        // 정보수정 닫았다가 다시 열때 초기화
        find_opt_box.style.display="block"
        update_box_outer[i].style.display="none"
        popup[0].style.display="none"
        block_pan.style.display="none"
    })
}
console.log("info_function" + info_function.length)
