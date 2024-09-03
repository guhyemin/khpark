let sit_line = document.getElementsByClassName("sit_line")

for(let i=0; i<30; i++){
    sit_line[0].innerHTML +=`
        <div class="sit_box VIP_sit_box" data-price="170000">
            <input type="checkbox" class="VIP_sit sit" id="VIP${i+1}" name="VIP${i+1}">
            <div class="VIP_sit_label label">${i+1}</div>
        </div>
        `
    sit_line[1].innerHTML +=`
    <div class="sit_box R_sit_box" data-price="140000">
        <input type="checkbox" class="R_sit sit" id="R${i+1}" name="R${i+1}">
        <div class="R_sit_label label">${i+1}</div>
    </div>
    `
    sit_line[2].innerHTML +=`
    <div class="sit_box S_sit_box" data-price="110000">
        <input type="checkbox" class="S_sit sit" id="S${i+1}" name="S${i+1}">
        <div class="S_sit_label label">${i+1}</div>
    </div>
    `
    sit_line[3].innerHTML +=`
    <div class="sit_box A_sit_box" data-price="80000">
        <input type="checkbox" class="A_sit sit" id="A${i+1}" name="A${i+1}">
        <div class="A_sit_label label">${i+1}</div>
    </div>
    `
    sit_line[4].innerHTML +=`
    <div class="sit_box B_sit_box" data-price="50000">
        <input type="checkbox" class="B_sit sit" id="B${i+1}" name="B${i+1}">
        <div class="B_sit_label label">${i+1}</div>
    </div>
    `
}



// 좌석 고르기
let sit_box = document.getElementsByClassName("sit_box")
let sit = document.getElementsByClassName("sit")
// let total_price_span = document.getElementsByClassName("total_price_span")[0]
// let total_price = 0
let label = document.getElementsByClassName("label")



for(let i=0; i<label.length; i++){

    label[i].addEventListener("click", function(e){
        sit[i].checked = !sit[i].checked

        // total_price += Number(sit_box[i].dataset.price)
        // total_price_span.textContent=`${total_price.toLocaleString("ko")}`


    })


}






let VIP_sit_box = document.getElementsByClassName("VIP_sit_box")
let R_sit_box = document.getElementsByClassName("R_sit_box")
let S_sit_box = document.getElementsByClassName("S_sit_box")
let A_sit_box = document.getElementsByClassName("A_sit_box")
let B_sit_box = document.getElementsByClassName("B_sit_box")

let VIP_sit_label = document.getElementsByClassName("VIP_sit_label")
let R_sit_label = document.getElementsByClassName("R_sit_label")
let S_sit_label = document.getElementsByClassName("S_sit_label")
let A_sit_label = document.getElementsByClassName("A_sit_label")
let B_sit_label = document.getElementsByClassName("B_sit_label")


// for(let i=0; i<VIP_sit_box.length; i++){
//     VIP_sit_box[i].addEventListener("click",function(){
//          VIP_sit_label[i].classList.toggle("VIP_color")
//     })
//     R_sit_box[i].addEventListener("click",function(){
//          R_sit_label[i].classList.toggle("R_color")
//     })
//     S_sit_box[i].addEventListener("click",function(){
//          S_sit_label[i].classList.toggle("S_color")
//     })
//     A_sit_box[i].addEventListener("click",function(){
//          A_sit_label[i].classList.toggle("A_color")
//     })
//     B_sit_box[i].addEventListener("click",function(){
//         B_sit_label[i].classList.toggle("B_color")
//     })
// }





// 날짜 골랐을 때 좌석 초기화
// let date_input = document.getElementsByClassName("date_input")[0]
//
// date_input.addEventListener("change", function(){
//     // 총 금액 초기화
//     total_price_span.textContent="0"
//     total_price = 0
//
//     // 모든 좌석 해제
//     for(let i=0; i<sit.length; i++){
//         sit[i].checked = false
//     }
//
//     // 모든 좌석 색상 해제
//     for(let i=0; i<label.length; i++){
//         label[i].classList.remove("VIP_color")
//         label[i].classList.remove("R_color")
//         label[i].classList.remove("S_color")
//         label[i].classList.remove("A_color")
//         label[i].classList.remove("B_color")
//     }
//
//     // 날짜 선택 다 해제 하고
//     for(let i=0; i<show_time_input.length; i++){
//         show_time_input[i].checked = false
//     }
//     // 해당 날짜 첫 시간 자동 선택
//     show_time_input[0].checked = true
//
//     // 색상 초기화 그날 첫번째 색상 자동
//     for(let i=0; i<time_title.length; i++){
//         time_title[i].style.background="white"
//         time_title[i].style.color="black"
//         time_title[0].style.background="#8e43e7"
//         time_title[0].style.color="white"
//     }
//
// })

// 오늘 날짜 체크해두기 지난 날짜 선택X
// let today = new Date();
// let year = today.getFullYear();
// let month = today.getMonth() + 1;
// let day = today.getDate();
//
// if (month < 10) {
//     month = '0' + month;
// }
// if (day < 10) {
//     day = '0' + day;
// }
//
// // 날짜 값 넣기 && 제한 하기
// date_input.value = `${year}-${month}-${day+1}`
// date_input.min = `${year}-${month}-${day+1}`
//







// 시간 골랐을 떄 좌석 초기화
let show_time_input = document.getElementsByClassName("show_time_input")
let time_title = document.getElementsByClassName("time_title")
let time_box = document.getElementsByClassName("time_box")[0]

// 날짜 데이터
// let time_arr = [
//     "11:00","13:00","15:00","17:00","19:00"
// ]
//
// for(let i=0; i<time_arr.length; i++){
//     // 날짜 만큼 넣어주기
//     // time_box.innerHTML += `
//     //     <input type="radio" class="show_time_input" id="time_${i}" name="time">
//     //     <label for="time_${i}" class="time_title" data-num="${i}">${time_arr[i]}</label>
//     // `
//     // show_time_input[0].checked = true
//     // time_title[0].style.background="#8e43e7"
//     // time_title[0].style.color="white"
// }

for(let i=0; i<time_title.length; i++){
    time_title[i].addEventListener("click", function(){
        for(let j=0; j<time_title.length; j++){
            time_title[j].style.background = "white"
            time_title[j].style.color = "black"
        }

        event.target.style.background="#8e43e7"
        event.target.style.color="white"
    })
}

for(let i=0; i<show_time_input.length; i++){
    show_time_input[i].addEventListener("change" , function(){
        // 총 결제 금액 해제
        total_price_span.textContent="0"
        total_price = 0

        // 모든 좌석 해제
        for(let i=0; i<sit.length; i++){
            sit[i].checked = false
        }

        // 모든 좌석 색상 해제
        for(let i=0; i<label.length; i++){
            label[i].classList.remove("VIP_color")
            label[i].classList.remove("R_color")
            label[i].classList.remove("S_color")
            label[i].classList.remove("A_color")
            label[i].classList.remove("B_color")
        }
    })
}

// 결제하기
let payment_btn = document.getElementsByClassName("payment_btn")[0]

payment_btn.addEventListener("click", function(e){
    event.preventDefault();
    if(total_price == 0){
        alert("좌석을 선택해주세요")
        e.preventDefault() // ajax를 위해 form태그 제출 막음
    }
    else{
        // if (로그인했으면)
        //     alert("예매가 완료되었습니다")
            // 총 금액 초기화
            total_price_span.textContent="0"
            total_price = 0

            // 모든 좌석 해제
            for(let i=0; i<sit.length; i++){
                sit[i].checked = false
            }

            // 모든 좌석 색상 해제
            for(let i=0; i<label.length; i++){
                label[i].classList.remove("VIP_color")
                label[i].classList.remove("R_color")
                label[i].classList.remove("S_color")
                label[i].classList.remove("A_color")
                label[i].classList.remove("B_color")
            }

            // 날짜 선택 다 해제 하고
            for(let i=0; i<show_time_input.length; i++){
                show_time_input[i].checked = false
            }
            // 해당 날짜 첫 시간 자동 선택
            show_time_input[0].checked = true

            // 색상 초기화 그날 첫번째 색상 자동
            for(let i=0; i<time_title.length; i++){
                time_title[i].style.background="white"
                time_title[i].style.color="black"
                time_title[0].style.background="#8e43e7"
                time_title[0].style.color="white"
            }
        // else(로그인 안했으면 로그인 페이지로 보내기)
    }
})


// 공연 판
let manual_txt = document.getElementsByClassName("manual_txt")
let m_pan = document.getElementsByClassName("m_pan")
for(let i=0; i<manual_txt.length; i++){
    manual_txt[i].addEventListener("click", function(e){
        for(let j=0; j<m_pan.length; j++ ){
            m_pan[j].style.display="none"
            manual_txt[j].style.color="black"
            manual_txt[j].style.backgroundColor="white"

        }
        m_pan[i].style.display="block"
        manual_txt[i].style.color="white"
        manual_txt[i].style.backgroundColor="#8e43e7"

        sticky_height ();

        for(let i=0; i<notice_content.length; i++){
            notice_content[i].classList.remove("notice_block")
        }

    })
}




// float 높이 증발 하는거 구하기
let show_box= document.getElementsByClassName("show_box")[0]
let show_manual_box = document.getElementsByClassName("show_manual_box")[0]

let show_box_outer = document.getElementsByClassName("show_box_outer")[0]
let pos_box = document.getElementsByClassName("pos_box")[0]

sticky_height ();

window.addEventListener("resize", sticky_height)

function sticky_height () {
    if(window.innerWidth > 1024){
        let h1 = show_box.offsetHeight
        let h2 = show_manual_box.offsetHeight+20
        console.log(h1)
        console.log(h2)

        pos_box.style.height=`0px`;
        show_box_outer.style.height=`0px`;
    
        pos_box.style.height=`${h1 + h2}px`;
        show_box_outer.style.height=`${h1 + h2}px`;
    }
    else{
        pos_box.style.height=`auto`;
        show_box_outer.style.height=`auto`;
    }
}



// 캐스팅 정보
let casting_arr =[
["casting_1.gif","곽은태"],
["casting_2.jpg","육현욱"],
["casting_3.gif","진상현"],
["casting_4.gif","양준모"],
["casting_5.gif","정재은"],
["casting_6.gif","민우혁"],
["casting_7.gif","유리아"],
["casting_8.gif","솔지"],
["casting_9.gif","김진수"],
["casting_10.gif","최민철"],
["casting_11.gif","서영주"],
["casting_12.gif","임정모"],
["casting_13.gif","조휘"],
["casting_14.gif","유동하"],
["casting_15.gif","장기용"],
["casting_16.gif","방보용"],
["casting_17.jpg","이정열"],
["casting_18.gif","최유정"],
["casting_19.jpg","김상현"],
["casting_20.jpg","임선애"],
["casting_21.gif","왕하성"],
["casting_22.jpg","박정자"],
["casting_23.gif","이강"],
["casting_24.gif","김고운"],
["casting_25.gif","오윤서"],
["casting_26.jpg","김도형"],
["casting_27.gif","김도현"],
["casting_28.jpg","정성화"],
["casting_29.gif","조영태"]
]
let casting_pan_inner = document.getElementsByClassName("casting_pan_inner")[0]

for(let i=0; i<casting_arr.length; i++){
    casting_pan_inner.innerHTML +=`
        <div class="casting_box">
            <div class="casting_img_box">
                <img src="../img/casting/${casting_arr[i][0]}" alt="${casting_arr[i][1]}사진">
            </div>
            <span class="people_name">${casting_arr[i][1]}</span>
        </div>`
}

// 공지사항
let notice_arr = [
["취소 안내","운영자","2024-07-28","My티켓 > 예매/취소내역에서 직접 취소 또는 고객센터 (0000-0000)를 통해서 예매를 취소할 수 있습니다.<br>티켓이 배송된 이후에는 인터넷 취소가 안되며, 취소마감 시간 이전에 고객센터로 반송되어야 취소 가능합니다.<br>취소수수료는 도착일자 기준으로 부과되며, 배송료는 환불되지 않습니다."],
["모바일 티켓안내","운영자","2024-07-28","티켓수령방법을 모바일티켓으로 선택 시 인터파크 앱, 인터파크 티켓 앱에서 즉시 이용 가능합니다.<br>모바일티켓으로 예매하실 경우 종이 티켓으로 입장권 수령방법 변경 불가합니다.<br>결제완료(입금완료)후 모바일티켓을 확인할 수 있습니다.<br>안드로이드 버전 4.0이상만 사용 가능, iOS 7 이상만 사용 가능합니다.<br>스포츠 시즌권 구매고객이거나 인터파크 외 예매처에서 예매한 모바일티켓은 별도의 모바일티켓 앱을 통해서만 이용 가능합니다."],
["배송티켓 안내","운영자","2024-07-28","티켓 배송 (배송상태 : 배송 준비중 이후) 후에는 주소 변경이 불가합니다.<br>부득이하게 주소 변경이 필요하신 경우 각 배송사에 수취 거절 요청 후,<br>고객센터로 재배송 신청할 수 있습니다.(배송비 3,200원 추가 부과)"],
["예매 유의사항","운영자","2024-07-28","다른 이용자의 원활한 예매 및 취소에 지장을 초래할 정도로 반복적인 행위를 지속하는 경우 회원의 서비스 이용을 제한할 수 있습니다.<br>일부 상품의 판매 오픈 시 원활한 서비스 제공을 위하여 인터파크페이, I-point, NOL 포인트, 문화예매권 등의 특정 결제수단 이용이 제한될 수 있습니다."],
["예매 취소 유의사항","운영자","2024-07-28","~관람일 10일전까지 : 뮤지컬/콘서트/클래식 장당 4,000원, 연극/전시 등 장당 2,000원 (단, 최대 티켓금액의 10% 한도)<br>관람일 9일전~관람일 7일전까지 : 티켓금액의 10%<br>관람일 6일전~관람일 3일전까지 : 티켓금액의 20%<br>관람일 2일전~관람일 1일전까지 : 티켓금액의 30%"],
["환불안내-신용카드","운영자","2024-07-28","일반적으로 당사의 취소 처리가 완료되고 4~5일 후 카드사의 취소가 확인됩니다. (체크카드 동일)<br>예매 취소 시점과 해당 카드사의 환불 처리기준에 따라 취소금액의 환급방법과 환급일은 다소 차이가 있을 수 있으며,<br>예매 취소시 기존에 결제하였던 내역을 취소하며 최초 결제하셨던 동일카드로 취소 시점에 따라 취소수수료와 배송료를 재승인 합니다."],
["환불안내-무통장입금","운영자","2024-07-28","예매 취소 시에 환불 계좌번호를 남기고, 그 계좌를 통해 취소수수료를 제외한 금액을 환불 받습니다.<br>취소 후 고객님의 계좌로 입금까지 대략 5~7일 정도가 소요됩니다. (주말 제외)<br>환불은 반드시 예매자 본인 명의의 계좌로만 받으실 수 있습니다.<br>단, 예매자 본인 명의의 계좌가 없을 경우에는 직계 가족 명의의 계좌에 한하여 가능하며,<br>이 경우 관계를 증명할 수 있는 증빙서류를 예매자 본인이 팩스나 우편 등으로 인터파크 티켓 본사로 보내주셔야 합니다.<br>(예매자 본인 외 가족이 증빙서류를 보내주셨을 경우, 이로 인해 문제 발생 시 환불 접수한 가족 본인에게 모든 책임이 있습니다.)"],
["환불안내-휴대폰결제","운영자","2024-07-28","취소 신청 후 바로 취소 처리가 되며 취소 수수료를 제외한 티켓 금액 및 예매수수료/핸드폰결제이용료가 취소 가능합니다.<br>예매 취소 시 기존에 결제하셨던 내역을 취소하며 결제하셨던 동일 정보로 취소 시점에 따라 취소수수료가 재승인 합니다.<br>(티켓이 배송된 경우는 배송료 포함하여 재승인 합니다.)"],
["무통장입금 주의사항","운영자","2024-07-28","입금 시 총 결제금액을 정확히 입금하여야 합니다.<br>입금금액이 다를 경우 예매내역은 자동취소 되며, 입금된 금액은 추후 환불 처리됩니다.<br>2건 이상 예매시에도, 각 예매 건 별로 입금을 하셔야 합니다.<br>입금 시, 입금자명으로 주문자명과 동일하게 입금해주시기 바랍니다.<br>수표는 정상적으로 입금되지 않고 입금 오류가 발생하오니, 현금으로 입금을 해주시기 바랍니다.<br>예매일 익일 오후 23시 59분까지 입금하지 않으시면 자동으로 예매취소 되며, 상품에 따라 입금 기한이 상이 할 수 있으니 My 티켓에서 입금 마감시간을 확인해주시기 바랍니다. (단, 오후 17시 이후에는 무통장입금 문의 대응이 어려울 수 있으니, 이전시간 입금을 권장합니다.)<br>주말/공휴일은 은행 영업일이 아니고, ATM기기 중 가상계좌입금이 안 되는 경우가 있으니 인터넷뱅킹, 폰뱅킹이 어려우신 고객님은 결제방법을 다른 결제수단을 선택하시기 바랍니다.<br>은행에 무통장 입금 시에는 입금증에 반드시 전화번호를 기입하시기 바랍니다.<br>입금 후에는 반드시 입금확인 메일이나 예매확인/취소에서 입금확인내역을 확인 후 공연장으로 가시기 바랍니다.<br>무통장입금 시 입급확인까지 일정시간이 소요될 수 있습니다."]
]
let notice_pan = document.getElementsByClassName("notice_pan")[0]
for(let i=0; i<notice_arr.length; i++){
    notice_pan.innerHTML += `
    <div class="notice_list">
        <div class="notice_list_inner">
            <span class="notice_title">${notice_arr[i][0]}</span>
            <div>
                <span class="notice_people">${notice_arr[i][1]}</span>
                <span class="notice_date">${notice_arr[i][2]}</span>
            </div>
        </div>
        <div class="notice_content">
            <p>${notice_arr[i][3]}</p>
        </div>
    </div>`
}

let notice_content = document.getElementsByClassName("notice_content")
let notice_list = document.getElementsByClassName("notice_list")
for(let i=0; i<notice_list.length; i++){
    notice_list[i].addEventListener("click", function(){
        notice_content[i].classList.toggle("notice_block")

        sticky_height ();
    })
}

let total_num = document.getElementsByClassName("total_num")[0]
total_num.textContent=`${notice_list.length+1}`

