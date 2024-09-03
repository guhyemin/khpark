package com.bitstudy.app.domain;

public class UserDto {

    private String u_id;

    private String u_pw;

    private String u_name;

    private String u_num;

    private String u_question;

    private String u_birth;

    private Integer c_cash;

    //  조인해서 받아야하는 정보들 받을수 있게 변수 만들어 두기!! ex) 캐쉬

    public UserDto() {
    }

    public UserDto(String u_id,String u_pw, String u_name, String u_num, String u_question, String u_birth) {
        this.u_id = u_id;
        this.u_pw = u_pw;
        this.u_name = u_name;
        this.u_num = u_num;
        this.u_question = u_question;
        this.u_birth = u_birth;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_pw() {
        return u_pw;
    }

    public void setU_pw(String u_pw) {
        this.u_pw = u_pw;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_num() {
        return u_num;
    }

    public void setU_num(String u_num) {
        this.u_num = u_num;
    }

    public String getU_question() {
        return u_question;
    }

    public void setU_question(String u_question) {
        this.u_question = u_question;
    }

    public String getU_birth() {
        return u_birth;
    }

    public void setU_birth(String u_birth) {
        this.u_birth = u_birth;
    }

    public Integer getC_cash() {
        return c_cash;
    }

    public void setC_cash(Integer c_cash) {
        this.c_cash = c_cash;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "u_id='" + u_id + '\'' +
                ", u_pw='" + u_pw + '\'' +
                ", u_name='" + u_name + '\'' +
                ", u_num='" + u_num + '\'' +
                ", u_question='" + u_question + '\'' +
                ", u_birth='" + u_birth + '\'' +
                '}';
    }
}
