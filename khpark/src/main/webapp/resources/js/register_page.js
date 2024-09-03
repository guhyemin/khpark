let user_info_input = document.getElementsByClassName("user_info")
let error_message = document.getElementsByClassName("error_message")
let register_btn = document.getElementsByClassName("register_btn")[0]

console.log(user_info_input.length)
console.log(error_message.length)

register_btn.addEventListener("click",function(e){
    // 오류 메시지 초기화
    for(let i=0; i<error_message.length; i++){
        error_message[i].textContent =""
        console.log(111)
    }
    let condition = true;

    // 아이디 검사
    if(condition){
        // 길이 지정
        if(user_info_input[0].value.length < 6 || user_info_input[0].value.length > 16){
            error_message[0].textContent = "6자리 이상 16자리 이하로 입력하시오"
            user_info_input[0].focus()
            e.preventDefault()
            condition = false
        }
        // 영어  숫자만 사용
        else if(!/^[a-zA-Z0-9]*$/.test(user_info_input[0].value)){
            error_message[0].textContent = "영문자와 숫자만 사용 가능 합니다"
            user_info_input[0].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }

    // 비밀번호 검사
    if(condition){
        // 비번 규칙
        if(!/^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).+$/.test(user_info_input[1].value)){
            error_message[1].textContent = "숫자 문자 특수문자를 한번 이상 사용하시오"
            user_info_input[1].focus()
            e.preventDefault()
            condition = false
        }
        //  길이 지정
        else if(user_info_input[1].value.length < 6 || user_info_input[1].value.length > 16){
            error_message[1].textContent = "8 ~ 16자 까지만 입력 하시오"
            user_info_input[1].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
            var password_value = user_info_input[1].value
        }
    }
    // 비밀번호 확인
    if(condition){        
        if(user_info_input[2].value != password_value){
            error_message[2].textContent = "비밀번호가 다릅니다"
            user_info_input[2].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
        console.log(password_value)
        console.log(user_info_input[2].value)
        console.log(password_value == user_info_input[2].value)
    }

    // 이름 검사
    if(condition){
        // 공백 검사
        if(user_info_input[3].value == ""){
            error_message[3].textContent = "이름을 입력하시오"
            user_info_input[3].focus()
            e.preventDefault()
            condition = false
        }
        // 영어 한글만 사용
        else if(!/^[a-zA-Z가-힣]+$/.test(user_info_input[3].value)){
            error_message[3].textContent = "특수 문자 및 숫자는 사용할 수 없습니다"
            user_info_input[3].focus()
            e.preventDefault()
            condition = false
        }
        //  길이 지정
        else if(user_info_input[3].value.length < 2 || user_info_input[3].value.length > 20){
            error_message[3].textContent = "이름은 두 글자 이상입니다"
            user_info_input[3].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }

    // 생년월일 검사
    if(condition){
        // 공백 검사
        if(user_info_input[4].value == ""){
            error_message[4].textContent = "생년월일 입력하시오"
            user_info_input[4].focus()
            e.preventDefault()
            condition = false
        }
        // 숫자만 사용
        else if(!/^[0-9]+$/.test(user_info_input[4].value)){
            error_message[4].textContent = "숫자만 사용 가능합니다"
            user_info_input[4].focus()
            e.preventDefault()
            condition = false
        }
        //  길이 지정
        else if(user_info_input[4].value.length != 8){
            error_message[4].textContent = "생년월일을 8자리로 입력하시오"
            user_info_input[4].focus()
            e.preventDefault()
            condition = false
        }
        // 이상한 날짜 제외
        else if(!/^(19[0-9][0-9]|20\d{2})(0[0-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])/.test(user_info_input[4].value)){
            error_message[4].textContent = "유효하지 않은 생년월일 입니다"
            user_info_input[4].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        }
    }   

    //전화번호 검사
    if(condition){
        // 공백 검사
        if(user_info_input[5].value == ""){
            error_message[5].textContent = "전화번호를 입력하시오"
            user_info_input[5].focus()
            e.preventDefault()
            condition = false
        }
        else if(!/^[0-9]+$/.test(user_info_input[5].value)){
            error_message[5].textContent = "숫자만 사용 가능합니다"
            user_info_input[5].focus()
            e.preventDefault()
            condition = false
        }
        // 이상한 번호 제외
        else if(!/^[0-9]{2,3}[0-9]{3,4}[0-9]{4}/.test(user_info_input[5].value) || (user_info_input[5].value.length < 9 || user_info_input[5].value.length>11)){
            error_message[5].textContent = "유효하지 않은 번호입니다"
            user_info_input[5].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        } 
    }
    
    //문제 검사
    if(condition){
        // 공백 검사
        if(user_info_input[6].value == ""){
            error_message[6].textContent = "답을 입력하시오"
            user_info_input[6].focus()
            e.preventDefault()
            condition = false
        }
        // 한글만 사용
        else if(!/^[가-힣]+$/.test(user_info_input[6].value)){
            error_message[6].textContent = "유효하지 않는 답입니다"
            user_info_input[6].focus()
            e.preventDefault()
            condition = false
        }
        // 한글자 답 제외
        else if(user_info_input[6].value.length < 2){
            error_message[6].textContent = "두 글자 이상으로 입력하시오"
            user_info_input[6].focus()
            e.preventDefault()
            condition = false
        }
        else{
            condition = true
        } 
    }
})

for(let i=0; i<user_info_input.length; i++){
    user_info_input[i].addEventListener("change", function(){
        console.log(user_info_input[0].value)
    })
}
// if(user_info_input[0].value == ""){

//     return false
// }


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