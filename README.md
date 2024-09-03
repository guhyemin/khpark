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
+ Tomcat 9.088 version
+ Framework : Spring
+ Database : MySql(8.0.36)
+ ORM : Mybatis
---
## 📌 주요기능
+ 회원가입 페이지 : 아이디, 비밀번호, 이름, 성별 값 받기 및 유효성 검사
+ 로그인 페이지 : 로그인기능
+ pw찾기 페이지 : pw 변경 기능
+ 메인 페이지 : 현재 로그인한 사용자가 팔로워 하는 사용자 게시글 노출
+ 서치 페이지 : 사용자가 검색하고 싶은 다른 사용자 검색
+ 상세 페이지 : 사용자 프로필 사진 등 팔로우 및 게시글 관련 정보 노출
+ 게시물 만들기 페이지 : 게시글 작성 기능
+ 마이 페이지 : 현재 로그인한 사용자 정보 변경 가능
  

## 📎이미지

로그인 페이지

![1](https://github.com/99nsm/instagram/assets/166674058/98e0cde3-c3fd-4b20-a5fe-405b6f83bc0d)

회원가입 페이지

![2](https://github.com/99nsm/instagram/assets/166674058/5d95786c-d59e-4a2d-9c42-2afb0d9d0c2a)

비밀번호 찾기 페이지

![4](https://github.com/99nsm/instagram/assets/166674058/c08350a1-8ada-45aa-8dc3-1d2e238ec96e)

메인 페이지

![5](https://github.com/99nsm/instagram/assets/166674058/002a2bae-67fa-4185-b719-bc4581cdd1f4)

햄버거 버튼

![6](https://github.com/99nsm/instagram/assets/166674058/b4fd805e-5f3b-4aea-91ff-7f488411900f)

검색 페이지

![7](https://github.com/99nsm/instagram/assets/166674058/c93aec4a-233e-4d57-9056-10570326c848)

상세 페이지

![8](https://github.com/99nsm/instagram/assets/166674058/eee1edc3-1a52-4f68-80c7-cd6bb2737c48)

만들기 페이지

![9](https://github.com/99nsm/instagram/assets/166674058/9aa98f90-dab5-49d0-abe2-f6c885fd9e7b)

회원정보 수정 페이지

![10](https://github.com/99nsm/instagram/assets/166674058/a2eccdb5-c9aa-4c14-988b-db6be55b71a5)

댓글 및 답글

![11](https://github.com/99nsm/instagram/assets/166674058/a40d1a6e-8781-4622-8417-55d7a328caca)

## 📎기타 자료 
[instagram_ppt.pdf](https://github.com/user-attachments/files/16159074/instagram_ppt.pdf)



데이터 베이스 생성 및 테이블 생성 쿼리문

create database instagram;

use instagram;

create table user_info (
                           U_seqno int auto_increment,
                           user_id varchar(50) not null unique,
                           user_pw varchar(50) not null,
                           user_name varchar(50) not null,
                           ph_num varchar(50) not null,
                           gender int(10) not null,
                           user_desc varchar(255),
                           user_photo varchar(255),
                           primary key(U_seqno)
);

create table follow (
                        F_seqno int auto_increment,
                        follower_id varchar(255) not null,
                        following_id varchar(255) not null,
                        primary key(F_seqno)
);

create table article (
                         A_seqno int auto_increment,
                         A_writer varchar(255) not null,
                         A_contents varchar(255) not null,
                         A_img varchar(255),
                         A_reg_date datetime default now(),
                         A_userPhoto varchar(255),
                         A_Heart int default 0,
                         A_comment int default 0,
                         primary key(A_seqno)
);

create table heart (
                       H_seqno int auto_increment,
                       FK_A_seqno int not null,
                       H_writer varchar(255) not null,
                       primary key(H_seqno)
);

create table comment (
                         C_seqno int auto_increment,
                         FK_A_seqno int not null,
                         C_writer varchar(255) not null,
                         C_txt varchar(255) not null,
                         C_reg_date datetime default now(),
                         C_class int(10) not null,
                         C_group_num int(10) not null,
                         C_order int(10) not null,
                         primary key(C_seqno)
);

직접 수정해야 할 코드
MypageController, ArticleController 에 있는 이미지 업로드하고 다운받는 경로 수정해야합니다

ex) private static final String F_PATH = "C:/Users/user1/OneDrive/바탕 화면/tp_instagram/instagram/src/main/webapp/resources/img/";
