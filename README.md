![header](https://capsule-render.vercel.app/api?type=wave&color=auto&height=300&section=header&text=Hello&fontSize=90&animation=fadeIn&fontAlignY=38&desc=Hyemin's%20GitHub%20Profile&descAlignY=51&descAlign=62)

#  Team_project : Khpark
---
## 💻 프로젝트 소개
인터파크 기반의 공연 예매 사이트
---
## 📆 개발기간
+ 2024.07.29 ~ 08.04(7일) 

## 👫 맡은 역활
+ 구혜민(백엔드) : 예매 페이지, 서치 페이지 기능 구현


## 📝 개발언어
<div style="display:flex; flex-direction:column; align-items:flex-start;">
    <!-- Backend -->
    <p><strong>Backend</strong></p>
    <div>
        <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white"> 
        <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
    </div>
    <!-- Database -->
    <p><strong>Database</strong></p>
    <div>
        <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> 
    </div>
    <!-- Server -->
    <p><strong>Server</strong></p>
    <div>
        <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black">
    </div>
    <!-- Frontend -->
    <p><strong>Frontend</strong></p>
    <div>
        <img src="https://img.shields.io/badge/html5-E34F26?style=flat-square&logo=html5&logoColor=white"> 
        <img src="https://img.shields.io/badge/css-1572B6?style=flat-square&logo=css3&logoColor=white"> 
        <img src="https://img.shields.io/badge/javascript-F7DF1E?style=flat-square&logo=javascript&logoColor=black"> 
    </div>
</div>

## ⚙ 개발환경
+ Java 11 version
+ JDK 11.0.22 version
+ Tomcat 9.089 version
+ Framework : Spring
+ Database : MySql(8.0.36)
+ ORM : Mybatis
---
## 📌 주요기능
+ 회원가입 페이지 : 아이디, 비밀번호, 이름, 생년월일, 전화번호, 질문 값 받기 및 유효성 검사
+ 로그인 페이지 : 로그인 기능
+ ID찾기 페이지 : 이름, 생년월일, 전화번호, 질문 답변을 통한 ID 나타냄
+ PW찾기 페이지 : ID, 이름, 생년월일, 전화번호 답변을 통한 PW 나타냄
+ 메인 페이지 : 진행중인 공연 장르별, 추천 키워드별로 나타냄, 관람후기 노출
+ <b>서치 페이지 : 사용자가 검색한 내용이 포함된 공연 나타냄, 공연임박순/예매많은순으로 정렬, 장르 카테고리별 공연 띄우기</b>
+ <b>예매 페이지 : 선택한 공연에 맞는 관람일/시간/좌석 선택하여 예매하는 기능, 충전한 포인트를 사용하여 결제</b>
+ 마이 페이지 : 정보 수정(비밀번호 변경/전화번호 변경/문제 정답 변경), 포인트 충전, 예매 내역 조회, 관람한 공연 후기 작성, 회원 탈퇴
  

## 📎이미지





데이터 베이스 생성 및 테이블 생성 쿼리문

create database khpark;

use khpark;

create table user (
    u_id varchar(45),
    u_pw varchar(45) not null ,
    u_name varchar(45) not null ,
    u_num varchar(45) not null ,
    u_question varchar(100) not null ,
    u_birth varchar(45) not null ,
    primary key (u_id)
);


create table cash (
    c_seqno int auto_increment,
    c_user varchar(45) unique not null ,
    c_cash int default 0,
    primary key(c_seqno)
);

create table cate (
    ct_seqno int auto_increment,
    ct_name varchar(45) not null,
    primary key(ct_seqno)
);

create table keyword (
    k_seqno int auto_increment,
    k_title varchar(45),
    primary key(k_seqno)
);

create table article (
    a_seqno int auto_increment,
    a_img varchar(255) not null ,
    a_title varchar(255) not null ,
    a_content text not null ,
    a_location varchar(255) not null ,
    a_price int not null ,
    a_order_count int default 0,
    a_k_seqno int not null ,
    a_ct_seqno int not null,
    a_s_date date not null ,
    a_e_date date,
    a_time varchar(30) not null,
    primary key (a_seqno)
);

create table a_date (
    ad_seqno int auto_increment,
    ad_a_seqno int,
    ad_date date not null ,
    primary key (ad_seqno)
);

create table a_time(
    at_seqno int auto_increment,
    at_d_seqno int,
    at_time time not null ,
    primary key (at_seqno)
);


create table seat (
    s_seqno int auto_increment,
    s_t_seqno int,
    s_seat varchar(45) not null,
    s_value int default 0,
    primary key (s_seqno)
);

create table review (
    r_seqno int auto_increment,
    r_writer varchar(45) not null,
    r_title varchar(100) not null ,
    r_content text,
    r_article int not null,
    primary key (r_seqno)
);

create table a_order (
    ao_seqno int auto_increment,
    ao_a_seqno int  not null,
    ao_d_seqno int not null,
    ao_t_seqno int not null,
    ao_s_seat1 varchar(45) not null,
    ao_s_seat2 varchar(45),
    ao_user varchar(45) not null,
    primary key (ao_seqno)
);
