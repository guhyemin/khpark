package com.bitstudy.app.domain;

public class CateDto {

    private Integer ct_seqno = null;

    private String ct_name;

    public CateDto() {
    }

    public CateDto( String ct_name) {
        this.ct_name = ct_name;
    }

    public Integer getCt_seqno() {
        return ct_seqno;
    }

    public void setCt_seqno(Integer ct_seqno) {
        this.ct_seqno = ct_seqno;
    }

    public String getCt_name() {
        return ct_name;
    }

    public void setCt_name(String ct_name) {
        this.ct_name = ct_name;
    }

    @Override
    public String toString() {
        return "CateDto{" +
                "ct_seqno=" + ct_seqno +
                ", ct_name='" + ct_name + '\'' +
                '}';
    }
}
