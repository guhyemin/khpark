package com.bitstudy.app.domain;

import java.util.Date;

    public class AdateDto {

    private Integer ad_seqno = null;

    private Integer ad_a_seqno;

    private Date ad_date;


    public AdateDto() {
    }

    public AdateDto(Integer ad_a_seqno, Date ad_date) {
        this.ad_a_seqno = ad_a_seqno;
        this.ad_date = ad_date;
    }

    public Integer getAd_seqno() {
        return ad_seqno;
    }

    public void setAd_seqno(Integer ad_seqno) {
        this.ad_seqno = ad_seqno;
    }

    public Integer getAd_a_seqno() {
        return ad_a_seqno;
    }

    public void setAd_a_seqno(Integer ad_a_seqno) {
        this.ad_a_seqno = ad_a_seqno;
    }

    public Date getAd_date() {
        return ad_date;
    }

    public void setAd_date(Date ad_date) {
        this.ad_date = ad_date;
    }

    @Override
    public String toString() {
        return "AdateDto{" +
                "ad_seqno=" + ad_seqno +
                ", ad_a_seqno=" + ad_a_seqno +
                ", ad_date=" + ad_date +
                '}';
    }
}
