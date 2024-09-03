let sec_main = document.getElementsByClassName("sec_main")[0]


let recommend_data_arr = [
    
]
// 임시 데이터
// let data_arr = [
//     ["musical_1.gif","<프랑켄슈타인>","블루스퀘어 신한카드홈","2024.07.28 ~ 10.25"],
//     ["musical_2.gif","<하데스타운>","샤롯데씨어터","2024.08.06 ~ 08.25"],
//     ["musical_3.gif","<영웅>","계명아트센터","2024.05.28 ~ 08.11"],
//     ["musical_4.gif","<이블데드>","인터파크 유니플렉스 1관","2024.07.11 ~ 09.21"],
//     ["musical_5.gif","<홍련>","대학로 자유극장","2024.06.20 ~ 09.13"],
//     ["musical_6.gif","<스파이>","동국대학교 이해랑예술극장","2024.07.12 ~ 10.06"],
//     ["musical_7.gif","<베르사유의 장미>","충무아트센터 대극장","2024.07.28 ~ 10.25"],
//     ["musical_8.gif","<살리에르>","세종문화회관 대극장","2024.05.28 ~ 08.11"],
//     ["musical_9.gif","<젠틀멘스가이드>","광림아트센터 BBCH홀","2024.06.20 ~ 09.13"],
//     ["musical_10.gif","<4월은 너의 거짓말>","예술의 전당 토퀄극장","2024.08.06 ~ 08.25"],
//     ["keyword_1.gif","<보헤미아의 숲과 들의>","블루스퀘어 신한카드홈","2024.07.28 ~ 10.25"],
//     ["keyword_2.gif","<접변>","샤롯데씨어터","2024.08.06 ~ 08.25"],
//     ["keyword_3.gif","<유진과 유진>","계명아트센터","2024.05.28 ~ 08.11"],
//     ["keyword_4.gif","<시데레우스>","인터파크 유니플렉스 1관","2024.07.11 ~ 09.21"],
//     ["keyword_5.gif","<해피맨>","대학로 자유극장","2024.06.20 ~ 09.13"],
//     ["keyword_6.gif","<세상친구>","동국대학교 이해랑예술극장","2024.07.12 ~ 10.06"],
//     ["keyword_7.gif","<미오 프라텔로>","충무아트센터 대극장","2024.07.28 ~ 10.25"],
//     ["keyword_8.gif","<살리에르>","세종문화회관 대극장","2024.05.28 ~ 08.11"],
//     ["keyword_9.gif","<젠틀멘스가이드>","광림아트센터 BBCH홀","2024.06.20 ~ 09.13"],
//     ["keyword_10.gif","<4월은 너의 거짓말>","예술의 전당 토퀄극장","2024.08.06 ~ 08.25"]
// ]

for(let i=0; i<20; i++){
    sec_main.innerHTML +=`
        <div class="show_box">
            <div class="img_box">
                <a href="./ticketing_page.html">
                    <img src="../img/all_poster/${data_arr[i][0]}" alt="공연 포스터" class="poster_img">
                </a>
            </div>
            <div class="show_txt_box">
                <span class="show_title">${data_arr[i][1]}</span>
                <span class="show_area">${data_arr[i][2]}</span>
                <span class="show_date">${data_arr[i][3]}</span>
            </div>
        </div>`
}

let add_show_btn = document.getElementsByClassName("add_show_btn")[0]
let count = 0
add_show_btn.addEventListener("click",function(){
    count
    for(let i=(5 * count); i<((5 * count) +5); i++){
        
        sec_main.innerHTML +=`
        <div class="show_box">
            <div class="img_box">
                <a href="#">
                    <img src="../img/all_poster/${data_arr[i][0]}" alt="공연 포스터" class="poster_img">
                </a>
            </div>
            <div class="show_txt_box">
                <span class="show_title">${data_arr[i][1]}</span>
                <span class="show_area">${data_arr[i][2]}</span>
                <span class="show_date">${data_arr[i][3]}</span>
            </div>
        </div>
        `
        if( i == (data_arr.length - 1)){
            add_show_btn.style.display="none"
        }
    }
    count ++

})
