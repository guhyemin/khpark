package com.bitstudy.app.domain;

public class SeatListDto {
    private Integer ao_a_seqno;

    private String ao_s_seat1;

    private String ao_s_seat2;

    private String ao_user;

    public SeatListDto() {
    }

    public SeatListDto(Integer ao_a_seqno, String ao_s_seat1, String ao_s_seat2, String ao_user) {
        this.ao_a_seqno = ao_a_seqno;
        this.ao_s_seat1 = ao_s_seat1;
        this.ao_s_seat2 = ao_s_seat2;
        this.ao_user = ao_user;
    }

    public Integer getAo_a_seqno() {
        return ao_a_seqno;
    }

    public void setAo_a_seqno(Integer ao_a_seqno) {
        this.ao_a_seqno = ao_a_seqno;
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
        return "SeatListDto{" +
                "ao_a_seqno=" + ao_a_seqno +
                ", ao_s_seat1='" + ao_s_seat1 + '\'' +
                ", ao_s_seat2='" + ao_s_seat2 + '\'' +
                ", ao_user='" + ao_user + '\'' +
                '}';
    }
}
