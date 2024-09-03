package com.bitstudy.app.domain;

import java.util.Date;

public class ArticleDto {
    private Integer a_seqno = null;

    private String a_img;

    private String a_title;

    private String a_content;

    private String a_location;

    private Integer a_price;

    private Integer a_order_count;

    private Integer a_k_seqno;

    private Integer a_ct_seqno;

    private Date a_s_date;

    private Date a_e_date;

    private String a_time;



    public ArticleDto() {
    }

    public ArticleDto( String a_img, String a_title, String a_content, String a_location, Integer a_price, Integer a_k_seqno, Integer a_ct_seqno, Date a_s_date, Date a_e_date, String a_time ) {
        this.a_img = a_img;
        this.a_title = a_title;
        this.a_content = a_content;
        this.a_location = a_location;
        this.a_price = a_price;
        this.a_k_seqno = a_k_seqno;
        this.a_ct_seqno = a_ct_seqno;
        this.a_s_date = a_s_date;
        this.a_e_date = a_e_date;
        this.a_time = a_time;
    }

    public String getA_time() {
        return a_time;
    }

    public void setA_time(String a_time) {
        this.a_time = a_time;
    }

    public Integer getA_seqno() {
        return a_seqno;
    }

    public void setA_seqno(Integer a_seqno) {
        this.a_seqno = a_seqno;
    }

    public String getA_img() {
        return a_img;
    }

    public void setA_img(String a_img) {
        this.a_img = a_img;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public String getA_location() {
        return a_location;
    }

    public void setA_location(String a_location) {
        this.a_location = a_location;
    }

    public Integer getA_price() {
        return a_price;
    }

    public void setA_price(Integer a_price) {
        this.a_price = a_price;
    }

    public Integer getA_order_count() {
        return a_order_count;
    }

    public void setA_order_count(Integer a_order_count) {
        this.a_order_count = a_order_count;
    }

    public Integer getA_k_seqno() {
        return a_k_seqno;
    }

    public void setA_k_seqno(Integer a_k_seqno) {
        this.a_k_seqno = a_k_seqno;
    }

    public Integer getA_ct_seqno() {
        return a_ct_seqno;
    }

    public void setA_ct_seqno(Integer a_ct_seqno) {
        this.a_ct_seqno = a_ct_seqno;
    }

    public Date getA_s_date() {
        return a_s_date;
    }

    public void setA_s_date(Date a_s_date) {
        this.a_s_date = a_s_date;
    }

    public Date getA_e_date() {
        return a_e_date;
    }

    public void setA_e_date(Date a_e_date) {
        this.a_e_date = a_e_date;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "a_seqno=" + a_seqno +
                ", a_img='" + a_img + '\'' +
                ", a_title='" + a_title + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_location='" + a_location + '\'' +
                ", a_price=" + a_price +
                ", a_order_count=" + a_order_count +
                ", a_k_seqno=" + a_k_seqno +
                ", a_ct_seqno=" + a_ct_seqno +
                ", a_s_date=" + a_s_date +
                ", a_e_date=" + a_e_date +
                ", a_time=" + a_time +
                '}';
    }
}
