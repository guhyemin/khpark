package com.bitstudy.app.domain;

public class KeywordDto {
    private Integer k_seqno = null;

    private String k_title;

    public KeywordDto() {
    }

    public KeywordDto(String k_title) {
        this.k_title = k_title;
    }

    public Integer getK_seqno() {
        return k_seqno;
    }

    public void setK_seqno(Integer k_seqno) {
        this.k_seqno = k_seqno;
    }

    public String getK_title() {
        return k_title;
    }

    public void setK_title(String k_title) {
        this.k_title = k_title;
    }

    @Override
    public String toString() {
        return "KeywordDto{" +
                "k_seqno=" + k_seqno +
                ", k_title='" + k_title + '\'' +
                '}';
    }
}
