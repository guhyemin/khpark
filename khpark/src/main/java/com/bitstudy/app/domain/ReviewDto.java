package com.bitstudy.app.domain;

public class ReviewDto {
    private Integer r_seqno = null;

    private String r_writer;

    private String r_title;

    private String r_content;

    private Integer r_article;

    public ReviewDto() {
    }

    public ReviewDto(String r_writer, String r_title, String r_content, Integer r_article) {
        this.r_writer = r_writer;
        this.r_title = r_title;
        this.r_content = r_content;
        this.r_article = r_article;
    }

    public Integer getR_seqno() {
        return r_seqno;
    }

    public void setR_seqno(Integer r_seqno) {
        this.r_seqno = r_seqno;
    }

    public String getR_writer() {
        return r_writer;
    }

    public void setR_writer(String r_writer) {
        this.r_writer = r_writer;
    }

    public String getR_title() {
        return r_title;
    }

    public void setR_title(String r_title) {
        this.r_title = r_title;
    }

    public String getR_content() {
        return r_content;
    }

    public void setR_content(String r_content) {
        this.r_content = r_content;
    }

    public Integer getR_article() {
        return r_article;
    }

    public void setR_article(Integer r_article) {
        this.r_article = r_article;
    }

    @Override
    public String toString() {
        return "ReviewDto{" +
                "r_seqno=" + r_seqno +
                ", r_writer='" + r_writer + '\'' +
                ", r_title='" + r_title + '\'' +
                ", r_content='" + r_content + '\'' +
                ", r_article=" + r_article +
                '}';
    }
}
