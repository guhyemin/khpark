package com.bitstudy.app.domain;

import java.sql.Time;
import java.util.Date;

public class OrderListDto {
    private Integer ao_seqno;

    private Integer ao_a_seqno;

    private Integer ao_d_seqno;

    private Integer ao_t_seqno;

    private String ao_s_seat1;

    private String ao_s_seat2;

    private String ao_user;

    private String a_img;

    private String a_title;

    private String a_content;

    private String a_location;

    private Integer a_price;

    private Date a_s_date;

    private Date a_e_date;

    private Date ad_date;

    private Time ad_time;

    private String seat1;

    private String seat2;


    public Integer getAo_seqno() {
        return ao_seqno;
    }

    public void setAo_seqno(Integer ao_seqno) {
        this.ao_seqno = ao_seqno;
    }

    public Integer getAo_a_seqno() {
        return ao_a_seqno;
    }

    public void setAo_a_seqno(Integer ao_a_seqno) {
        this.ao_a_seqno = ao_a_seqno;
    }

    public Integer getAo_d_seqno() {
        return ao_d_seqno;
    }

    public void setAo_d_seqno(Integer ao_d_seqno) {
        this.ao_d_seqno = ao_d_seqno;
    }

    public Integer getAo_t_seqno() {
        return ao_t_seqno;
    }

    public void setAo_t_seqno(Integer ao_t_seqno) {
        this.ao_t_seqno = ao_t_seqno;
    }

    public String getAo_s_seat1() {
        return ao_s_seat1;
    }

    public void setAo_s_seat1(String ao_s_seat1) {
        this.ao_s_seat1 = ao_s_seat1;
    }

    public String getAo_s_seat2() {
        return ao_s_seat2;
    }

    public void setAo_s_seat2(String ao_s_seat2) {
        this.ao_s_seat2 = ao_s_seat2;
    }

    public String getAo_user() {
        return ao_user;
    }

    public void setAo_user(String ao_user) {
        this.ao_user = ao_user;
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

    public Date getAd_date() {
        return ad_date;
    }

    public void setAd_date(Date ad_date) {
        this.ad_date = ad_date;
    }

    public Time getAd_time() {
        return ad_time;
    }

    public void setAd_time(Time ad_time) {
        this.ad_time = ad_time;
    }

    public String getSeat1() {
        return seat1;
    }

    public void setSeat1(String seat1) {
        this.seat1 = seat1;
    }

    public String getSeat2() {
        return seat2;
    }

    public void setSeat2(String seat2) {
        this.seat2 = seat2;
    }


    @Override
    public String toString() {
        return "OrderListDto{" +
                "ao_seqno=" + ao_seqno +
                ", ao_a_seqno=" + ao_a_seqno +
                ", ao_d_seqno=" + ao_d_seqno +
                ", ao_t_seqno=" + ao_t_seqno +
                ", ao_s_seat1='" + ao_s_seat1 + '\'' +
                ", ao_s_seat2='" + ao_s_seat2 + '\'' +
                ", ao_user='" + ao_user + '\'' +
                ", a_img='" + a_img + '\'' +
                ", a_title='" + a_title + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_location='" + a_location + '\'' +
                ", a_price=" + a_price +
                ", a_s_date=" + a_s_date +
                ", a_e_date=" + a_e_date +
                ", ad_date=" + ad_date +
                ", ad_time=" + ad_time +
                ", seat1='" + seat1 + '\'' +
                ", seat2='" + seat2 + '\'' +
                '}';
    }
}
