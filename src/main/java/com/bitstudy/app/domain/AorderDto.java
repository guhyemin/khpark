package com.bitstudy.app.domain;

public class AorderDto {
    private Integer ao_seqno =null;

    private Integer ao_a_seqno;

    private Integer ao_d_seqno;

    private Integer ao_t_seqno;

    private String ao_s_seat1;

    private String ao_s_seat2;

    private String ao_user;

    public AorderDto() {
    }

    public AorderDto(Integer ao_a_seqno, Integer ao_d_seqno, Integer ao_t_seqno, String ao_s_seat1, String ao_s_seat2, String ao_user) {
        this.ao_a_seqno = ao_a_seqno;
        this.ao_d_seqno = ao_d_seqno;
        this.ao_t_seqno = ao_t_seqno;
        this.ao_s_seat1 = ao_s_seat1;
        this.ao_s_seat2 = ao_s_seat2;
        this.ao_user = ao_user;
    }

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

    @Override
    public String toString() {
        return "AorderDto{" +
                "ao_seqno=" + ao_seqno +
                ", ao_a_seqno=" + ao_a_seqno +
                ", ao_d_seqno=" + ao_d_seqno +
                ", ao_t_seqno=" + ao_t_seqno +
                ", ao_s_seat1='" + ao_s_seat1 + '\'' +
                ", ao_s_seat2='" + ao_s_seat2 + '\'' +
                ", ao_user='" + ao_user + '\'' +
                '}';
    }
}
