package com.bitstudy.app.domain;

public class SeatDto {
    private Integer s_seqno = null;

    private Integer s_t_seqno;

    private String s_seat;

    private Integer s_value;


    public SeatDto() {
    }

    public SeatDto(Integer s_t_seqno, String s_seat) {
        this.s_t_seqno = s_t_seqno;
        this.s_seat = s_seat;
    }


    public Integer getS_seano() {
        return s_seqno;
    }

    public void setS_seano(Integer s_seqno) {
        this.s_seqno = s_seqno;
    }

    public Integer getS_t_seqno() {
        return s_t_seqno;
    }

    public void setS_t_seqno(Integer s_t_seqno) {
        this.s_t_seqno = s_t_seqno;
    }

    public String getS_seat() {
        return s_seat;
    }

    public void setS_seat(String s_seat) {
        this.s_seat = s_seat;
    }

    public Integer getS_value() {
        return s_value;
    }

    public void setS_value(Integer s_value) {
        this.s_value = s_value;
    }


    @Override
    public String toString() {
        return "SeatDto{" +
                "s_seqno=" + s_seqno +
                ", s_t_seqno=" + s_t_seqno +
                ", s_seat='" + s_seat + '\'' +
                ", s_value=" + s_value +
                '}';
    }
}
