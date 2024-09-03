package com.bitstudy.app.domain;

public class CashDto {
    private Integer c_seqno = null;

    private String c_user;

    private Integer c_cash;


    public CashDto() {
    }


    public CashDto(String c_user, Integer c_cash) {
        this.c_user = c_user;
        this.c_cash = c_cash;
    }

    public Integer getC_seqno() {
        return c_seqno;
    }

    public void setC_seqno(Integer c_seqno) {
        this.c_seqno = c_seqno;
    }

    public String getC_user() {
        return c_user;
    }

    public void setC_user(String c_user) {
        this.c_user = c_user;
    }

    public Integer getC_cash() {
        return c_cash;
    }

    public void setC_cash(Integer c_cash) {
        this.c_cash = c_cash;
    }

    @Override
    public String toString() {
        return "CashDto{" +
                "c_seqno=" + c_seqno +
                ", c_user='" + c_user + '\'' +
                ", c_cash=" + c_cash +
                '}';
    }
}
