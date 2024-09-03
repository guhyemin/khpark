// 푸터 상세정보 칸
let drop = document.getElementsByClassName("drop")
let f_txt_outer = document.getElementsByClassName("f_txt_outer")
let f_txt_title = document.getElementsByClassName("f_txt_title")[0]

let f_txt_title_height = f_txt_title.clientHeight

for(let i=0; i<drop.length; i++){
    let count = 1
    drop[i].addEventListener("click", function(){
        count ++
        if((count % 2) == 0)
            f_txt_outer[i].style.height = `100px`
        else{
            f_txt_outer[i].style.height = `${f_txt_title_height}px`
        }
    })
}


// 팝업 나오고 사라지기

// 팝업 3개
let popup = document.getElementsByClassName("popup")

// 닫기 버튼 3개
let close_btn = document.getElementsByClassName("close_btn")
let open_btn = document.getElementsByClassName("open_btn")
let block_pan = document.getElementsByClassName("block_pan")[0]

for(let i=0; i<open_btn.length; i++){
    open_btn[i].addEventListener("click", function(){
        popup[i].style.display = "block"
        block_pan.style.display="block"
    })
    close_btn[i].addEventListener("click",function(){
        popup[i].style.display = "none"
        block_pan.style.display="none"
    })
}
// 결과 팝업 나오는 조건
// ????

// 아이디 비번 찾기 결과 팝업 닫기
// 팝업 나오는 버튼이 없어서 따로 
close_btn[2].addEventListener("click", function(){
    popup[2].style.display = "none"
    block_pan.style.display="none"
})

let error_message = document.getElementsByClassName("error_message")[0]
let user_info = document.getElementsByClassName("user_info")
let submit_btn = document.getElementsByClassName("submit_btn")[0]

submit_btn.addEventListener("click",function(e){
    error_message.textContent=""

    let condition = true
    if(condition){
        if(user_info[0].value == ""){
            error_message.textContent="아이디를 입력하시오"
            user_info[0].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }

    if(condition){
        if(user_info[1].value == ""){
            error_message.textContent="비밀번호를 입력하시오"
            user_info[1].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }
})
