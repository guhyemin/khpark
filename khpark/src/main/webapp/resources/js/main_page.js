// 메인배너 스와이퍼
let m_banner_arr = [
    ["banner1.jpeg","mini_banner1.png","responsive_banner1.png"],
    ["banner2.png","mini_banner2.png","responsive_banner2.png"],
    ["banner3.png","mini_banner3.png","responsive_banner3.png"],
    ["banner4.jpeg","mini_banner4.png","responsive_banner4.jpeg"],
    ["banner5.png","mini_banner5.jpg","responsive_banner5.png"],
    ["banner6.png","mini_banner6.png","responsive_banner6.png"],
    ["banner7.jpeg","mini_banner7.jpg","responsive_banner7.jpeg"],
    ["banner8.jpeg","mini_banner8.png","responsive_banner8.png"],
    ["banner9.png","mini_banner9.png","responsive_banner9.png"]
]


// 메인 배너
let swiper_main_banner = document.getElementsByClassName("swiper-wrapper")[0]

// 스와이퍼 페이지 네이션
let  swiper_bullet = document.getElementsByClassName("swiper-pagination-bullet")

for(let i=0; i<m_banner_arr.length; i++){
    swiper_main_banner.innerHTML +=
        `<div class="swiper-slide">
        <img src="../img/main_banner/${m_banner_arr[i][0]}" alt="메인배너_${i}" class="respnsive_none">
        <img src="../img/main_banner_respnsive/${m_banner_arr[i][2]}" alt="메인배너_${i}" class="respnsive_block">
    </div>`
}

var swiper = new Swiper(".mySwiper", {
    autoplay: {
        delay: 1000
    },
    speed: 1000,
    loop: true,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
});

// 미니 배너 넣어주기
for(let i=0; i<m_banner_arr.length; i++){
    swiper_bullet[i].innerHTML +=
        `<img src="../img/main_banner_mini/${m_banner_arr[i][1]}" alt="메인배너_미니_${i}">`

}

function bullet(){
    let w_width = window.innerWidth
    if(w_width >= 1024){
        for(let i=0; i<swiper_bullet.length; i++){
            swiper_bullet[i].style.display = "inline-block"
        }
    }
    else{
        for(let i=0; i<swiper_bullet.length; i++){
            swiper_bullet[i].style.display = "none"
        }
    }
    // swiper.autoplay.stop()
    // swiper.autoplay.start()
}

window.addEventListener("resize", bullet)
window.addEventListener("load", bullet)


// 임시 데이터
let data_arr = [
    ["musical_1.gif","<프랑켄슈타인>","블루스퀘어 신한카드홈","2024.07.28 ~ 10.25"],
    ["musical_2.gif","<하데스타운>","샤롯데씨어터","2024.08.06 ~ 08.25"],
    ["musical_3.gif","<영웅>","계명아트센터","2024.05.28 ~ 08.11"],
    ["musical_4.gif","<이블데드>","인터파크 유니플렉스 1관","2024.07.11 ~ 09.21"],
    ["musical_5.gif","<홍련>","대학로 자유극장","2024.06.20 ~ 09.13"],
    ["musical_6.gif","<스파이>","동국대학교 이해랑예술극장","2024.07.12 ~ 10.06"],
    ["musical_7.gif","<베르사유의 장미>","충무아트센터 대극장","2024.07.28 ~ 10.25"],
    ["musical_8.gif","<살리에르>","세종문화회관 대극장","2024.05.28 ~ 08.11"],
    ["musical_9.gif","<젠틀멘스가이드>","광림아트센터 BBCH홀","2024.06.20 ~ 09.13"],
    ["musical_10.gif","<4월은 너의 거짓말>","예술의 전당 토퀄극장","2024.08.06 ~ 08.25"]
]
// 랭킹 스와이퍼
var rank_swiper1 = new Swiper(".rank1", {
    navigation: {
        nextEl: ".rank_bth_next_1",
        prevEl: ".rank_bth_prev_1",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var rank_swiper2 = new Swiper(".rank2", {
    navigation: {
        nextEl: ".rank_bth_next_2",
        prevEl: ".rank_bth_prev_2",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var rank_swiper3 = new Swiper(".rank3", {
    navigation: {
        nextEl: ".rank_bth_next_3",
        prevEl: ".rank_bth_prev_3",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var rank_swiper4 = new Swiper(".rank4", {
    navigation: {
        nextEl: ".rank_bth_next_4",
        prevEl: ".rank_bth_prev_4",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var rank_swiper5 = new Swiper(".rank5", {
    navigation: {
        nextEl: ".rank_bth_next_5",
        prevEl: ".rank_bth_prev_5",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});


// 장르별 랭킹 스와이퍼 내용 넣어주기
let swiper_rank = document.getElementsByClassName("swiper_rank")
let genre_opt = document.getElementsByClassName("genre_opt")
let swiper_rank_box = document.getElementsByClassName("swiper_rank_box")
// 선택 장르마다 판 까지 넣어주기


for(let j=0; j<data_arr.length; j++){
    swiper_rank[0].innerHTML+=`
        <div class="swiper-slide rank_slide pos_box">
            <a href="./ticketing_page.html" class="pos_box">
                <img src="../img/musical/${data_arr[j][0]}" alt="공연정보${j}" class="slide_img">
                <span class="num_pos num_pos_${j}">${j+1}<span>
            </a>
            <div class="content_txt_box">
                <span>${data_arr[j][1]}</span>
                <span>${data_arr[j][2]}</span>  
                <span>${data_arr[j][3]}</span>
            </div>
        </div>`
}


for(let i=0; i<genre_opt.length; i++){
    genre_opt[i].addEventListener("click", function(){
        for(let j=0; j<genre_opt.length; j++){
            genre_opt[j].style.color= "black"
            genre_opt[j].style.background= "none"
            genre_opt[j].style.border ="1px solid gray"
        }
        this.style.color= "white"
        this.style.background= "#8e43e7"
        this.style.border= "1px solid #8e43e7"
    })
}


// 티켓 오픈
let open_arr=[
    ["musical_10.gif","7.16(화) 11:00","4월은 너의 거짓말","1차 티켓오픈"],
    ["musical_9.gif","7.17(수) 13:00","젠틀맨스 가이드","1차 티켓오픈"],
    ["musical_8.gif","7.14(일) 15:00","살리에르","1차 티켓오픈"],
    ["musical_7.gif","7.19(금) 16:00","베르사유 장미","1차 티켓오픈"],
    ["musical_6.gif","7.16(화) 12:00","스파이","1차 티켓오픈"],
    ["musical_5.gif","7.18(목) 08:00","홍련","1차 티켓오픈"],
]
let open_ticket = document.getElementsByClassName("open_ticket")[0]

for(let i=0; i<open_arr.length; i++){
    open_ticket.innerHTML+=`
    <div class="open_ticket_box">
        <a href="./ticketing_page.html">
            <img src="../img/musical/${open_arr[i][0]}" alt="티켓오픈${i}">
        </a>
        <div class="open_txt">
            <div>
                <span>단독판매</span>
            </div>
            <span>${open_arr[i][1]}</span>
            <span>${open_arr[i][2]}</span>
            <span>${open_arr[i][3]}</span>
        </div>
    </div>`
}




// KH파크 PLAY 스와이퍼
var kh_play_swiper1 = new Swiper(".kh_play1", {
    navigation: {
        nextEl: ".play_btn_next1",
        prevEl: ".play_btn_prev1",
    },
    breakpoints: {
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 3,
            spaceBetween: 15,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var kh_play_swiper2 = new Swiper(".kh_play2", {
    navigation: {
        nextEl: ".play_btn_next2",
        prevEl: ".play_btn_prev2",
    },
    breakpoints: {
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 3,
            spaceBetween: 15,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var kh_play_swiper3 = new Swiper(".kh_play3", {
    navigation: {
        nextEl: ".play_btn_next3",
        prevEl: ".play_btn_prev3",
    },
    breakpoints: {
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 3,
            spaceBetween: 15,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var kh_play_swiper4 = new Swiper(".kh_play4", {
    navigation: {
        nextEl: ".play_btn_next4",
        prevEl: ".play_btn_prev4",
    },
    breakpoints: {
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 3,
            spaceBetween: 15,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var kh_play_swiper5 = new Swiper(".kh_play5", {
    navigation: {
        nextEl: ".play_btn_next5",
        prevEl: ".play_btn_prev5",
    },
    breakpoints: {
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 3,
            spaceBetween: 15,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});


//   유튜브 영상
let play_arr =[
    ["https://www.youtube.com/embed/XaV9UVKLxTg?si=5L5fungfLEvseVBx"],
    ["https://www.youtube.com/embed/_6dHSzSZrts?si=piz9nre-3ctk57Uo"],
    ["https://www.youtube.com/embed/YdSXw-P0vQQ?si=ZiaFkWnuqjVWWddW"],
    ["https://www.youtube.com/embed/h8x1FYj-VbE?si=hZF6nu11d40XGt88"]
]
// KH파크 PLAY  스와이퍼 내용 넣어주기
let play_swiper = document.getElementsByClassName("play_swiper")
let play_opt = document.getElementsByClassName("play_opt")
let kh_play_box = document.getElementsByClassName("kh_play_box")
let play_slide = document.getElementsByClassName("play_slide")
let object_event = document.getElementsByTagName("object")



for(let j=0; j<play_arr.length; j++){
    play_swiper[0].innerHTML += `
            <div class="swiper-slide play_slide">
                <div class="object_box">
                    <object data=${play_arr[j]}></object>
                </div>
            </div>`
}

// 유튜브 스와이퍼 안되는거 고치기
// 기술의 한계
for(let i=0; i<play_slide.length; i++){

    play_slide[i].addEventListener("click",function(){
        console.log(111)
        object_event[i].style.pointerEvents ="all";
    })
}

for(let i=0; i<play_opt.length; i++){
    play_opt[i].addEventListener("click", function(){
        for(let j=0; j<kh_play_box.length; j++){
            kh_play_box[j].style.display = "none"
            play_opt[j].style.color= "black"
            play_opt[j].style.background= "none"
            play_opt[j].style.border ="1px solid gray"
        }
        kh_play_box[i].style.display = "block"
        play_opt[i].style.color= "white"
        play_opt[i].style.background= "#8e43e7"
        play_opt[i].style.border= "1px solid #8e43e7"
    })
}

// 추천 임시 데이터
let recommend_data_arr = [
    ["keyword_1.gif","<보헤미아의 숲과 들의>","블루스퀘어 신한카드홈","2024.07.28 ~ 10.25"],
    ["keyword_2.gif","<접변>","샤롯데씨어터","2024.08.06 ~ 08.25"],
    ["keyword_3.gif","<유진과 유진>","계명아트센터","2024.05.28 ~ 08.11"],
    ["keyword_4.gif","<시데레우스>","인터파크 유니플렉스 1관","2024.07.11 ~ 09.21"],
    ["keyword_5.gif","<해피맨>","대학로 자유극장","2024.06.20 ~ 09.13"],
    ["keyword_6.gif","<세상친구>","동국대학교 이해랑예술극장","2024.07.12 ~ 10.06"],
    ["keyword_7.gif","<미오 프라텔로>","충무아트센터 대극장","2024.07.28 ~ 10.25"],
    ["keyword_8.gif","<살리에르>","세종문화회관 대극장","2024.05.28 ~ 08.11"],
    ["keyword_9.gif","<젠틀멘스가이드>","광림아트센터 BBCH홀","2024.06.20 ~ 09.13"],
    ["keyword_10.gif","<4월은 너의 거짓말>","예술의 전당 토퀄극장","2024.08.06 ~ 08.25"]
]

//추천 키워드 스와이퍼
var recommend_swiper1 = new Swiper(".recommend_swiper1", {
    navigation: {
        nextEl: ".recommend_btn_next_1",
        prevEl: ".recommend_btn_prev_1",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var recommend_swiper2 = new Swiper(".recommend_swiper2", {
    navigation: {
        nextEl: ".recommend_btn_next_2",
        prevEl: ".recommend_btn_prev_2",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});
var recommend_swiper3 = new Swiper(".recommend_swiper3", {
    navigation: {
        nextEl: ".recommend_btn_next_3",
        prevEl: ".recommend_btn_prev_3",
    },
    breakpoints: {
        //브라우저가 1024보다 클 때
        1024: {
            slidesPerView: 5,
            spaceBetween: 20,
        },
        //브라우저가 768보다 클 때
        768: {
            slidesPerView: 4,
            spaceBetween: 15,
        },
        //브라우저가 480보다 클 때
        480: {
            slidesPerView: 3,
            spaceBetween: 10,
        },
        //브라우저가 0보다 클 때
        0: {
            slidesPerView: 2,
            spaceBetween: 10,
        },
    },
});

// 추천 키워드 스와이퍼 내용 넣어주기
let swiper_recommend = document.getElementsByClassName("swiper_recommend")
let keyword_opt = document.getElementsByClassName("keyword_opt")
let keyword_swiper_box = document.getElementsByClassName("keyword_swiper_box")


//
// for(let j=0; j<recommend_data_arr.length; j++){
//     swiper_recommend[0].innerHTML += `
//     <div class="swiper-slide recommend_slide">
//         <a href="./ticketing_page.html">
//             <img src="../img/recommend/${recommend_data_arr[j][0]}" alt="공연정보${i}" class="slide_img">
//         </a>
//         <div class="content_txt_box">
//             <span>${recommend_data_arr[j][1]}</span>
//             <span>${recommend_data_arr[j][2]}</span>
//             <span>${recommend_data_arr[j][3]}</span>
//         </div>
//     </div>`
// }


// for(let i=0; i<keyword_opt.length; i++){
//     keyword_opt[i].addEventListener("click", function(){
//         for(let j=0; j<keyword_opt.length; j++){
//             keyword_opt[j].style.color= "black"
//             keyword_opt[j].style.background= "none"
//             keyword_opt[j].style.border ="1px solid gray"
//         }
//         this.style.color= "white"
//         this.style.background= "#8e43e7"
//         this.style.border= "1px solid #8e43e7"
//     })
// }




// 리뷰 넣어주기
let reivew_arr =[
    ["keyword_3.gif","유진과 유진","마음 아프지만 모두가 꼭 알아야만 하는 것들에 대해",
        "극을 보는 내내 마음이 너무 불편했어요. 하지만 필요했던 불편함 같아요. 많이 울고 공감하고 생각할 수 있었던 극이었습니다. 이런 극이 정말 필요하다고 생각합니다. 두 유진이들을 도와주었던, 믿고 있던 사람의 그런 이중적인 모습을 보고 저도 제 이중성에 대해, 모순적인 모습에 대해 생각해보았어요. 많은 분들이 더욱 관심을 갖고 봐주셨으면 좋겠어요. 지금도 자신의 삶을 살아가고 있을 모든 유진이들에게 이 세상이 조금이라도 더 다정해지길 바랄 뿐입니다. 이 극이 세상에 나오게 되어 너무나도 다행이라고 생각합니다.\n",
        "딸기맛 딸기우유",
        "4.8"],

    ["keyword_4.gif","시데레우스","주변 사람들한테 내 돈주고라도 보여주고 싶은 극입니다ㅠㅠ",
        "대학로에서 감히 가장 좋아하는 극이라고 말할 수 있는 극! 시데레우스!\n" +
        "넘버가 하나하나 주옥같은 건 물론이고 별이 쏟아지는 무대가 정말 너무 아름다워요ㅠ\n" +
        "객석으로 뻗어나가는 별들과 무대 바닥에서 뻗어나가는 은하수!\n" +
        "듣는 즐거움과 보는 즐거움이 뭐 하나 빠질 거 없이 만족시켜주는 극입니다!\n" +
        "이창용 갈릴레오의 연기가 볼 때마다 저를 울리네요ㅠㅠ\n" +
        "창용 배우님 퍼스널 컬러가 갈릴레오 맞죠..?\n" +
        "두 남자의 꿈을 찾아나서는 반짝거림과, 끝을 단지 끝으로 생각하는 것이 아니라\n" +
        "그 속에서도 희망을 찾아나서며 끝을 시작하는 갈릴레오와 케플러의 여정을 만나보실 수 있습니다!\n" +
        "친구 연인 가족 누구와 봐도 마음이 따뜻해지고 뭉클한 감동이 전해지는 시데레우스!\n" +
        "제 주변 모든 사람들이 이거 이만큼 재밌는 거 알아줬으면 좋겠습니다ㅠ 내 돈 내줘서라도 보여주고 싶은 극 1위!\n",
        "바나나맛 바나나우유",
        "5.0"],

    ["keyword_7.gif","미오 프라텔로","온찬혁",
        "이대로 손 잡고 돌아와주길...ㅠㅠㅠㅠㅠ 바라지만 어렵겠죠? ㅠㅠ 마지막 공연 너무 좋았어요. 온찬혁 공연은 사실 언제든 다 좋았어요! 세 분 케미 최고!! 미오해주셔서 감사합니다. 행복했어요.",
        "초코맛 초코우유",
        "4.9"],

    ["keyword_2.gif","접변","아름다운 뮤지컬을 사랑한다면",
        "중국 분위기에 볼까말까를 고민하던 차에 먼저 보고 온 친구의 여배 좋아하면 무조건 보라는 말에 개큰 구매를 갈긴 내 자신을 칭찬합니다.. 다른 친구가 얘기해준 대로 무대도 그렇고 풀어나가는 방식도 그렇고 왈츠와 나비 브로치, 치파오까지 소소한 것 하나하나 아름다웠습니다. 볼까 말까 할때는 보고 판단하시길!",
        "우유맛 우유우유",
        "5.0"],
]

let review_box_outer = document.getElementsByClassName("review_box_outer")[0]

for(let i=0; i<reivew_arr.length; i++){
    review_box_outer.innerHTML +=`
        <div class="review_box" data-idx="${i}">
            <div class="review_inner">
                <div class="review_img_box">
                    <img src="../img/recommend/${reivew_arr[i][0]}" alt="리뷰포스터">
                </div>
                <div class="review_txt_box">
                    <div class="review_txt_inner">
                        <span>${reivew_arr[i][1]}</span>
                        <span>${reivew_arr[i][2]}</span>
                        <span>${reivew_arr[i][3]}</span>
                    </div>
                    <div class="user_info">
                        <div class="user_box">
                            <div class="user_img"></div>
                            <span>${reivew_arr[i][4]}</span>
                        </div>
                        <div class="star_box">
                            <div class="star"></div>
                            <span class="star_score">${reivew_arr[i][5]}</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>`
}

let review_box = document.getElementsByClassName("review_box")
let review_popup = document.getElementsByClassName("review_popup")[0]
let pop_close_btn = document.getElementsByClassName("pop_close_btn")[0]
let block_pan = document.getElementsByClassName("block_pan")[0]
let put_value = document.getElementsByClassName("put_value")
let pop_img_box = document.getElementsByClassName("pop_img_box")[0]

for(let i=0; i<review_box.length; i++){
    review_box[i].addEventListener("click",function(e){
        let num = e.currentTarget.dataset.idx
        review_popup.style.display="block"
        block_pan.style.display="block"

        for(let i=0; i<put_value.length - 1; i++){
            pop_img_box.style.background=`url(../img/recommend/${reivew_arr[num][0]}) no-repeat center center / cover`
            put_value[i+1].textContent=`${reivew_arr[num][i+1]}`
        }

        console.log(num)


    })
}

pop_close_btn.addEventListener("click", function(){
    review_popup.style.display="none"
    block_pan.style.display="none"
})

