package com.bitstudy.app.domain;

import java.sql.Time;
import java.time.LocalTime;

public class AtimeDto {
    private Integer at_seqno = null ;

    private Integer at_d_seqno;

    private Time at_time;

    public AtimeDto() {
    }

    public AtimeDto(Integer at_d_seqno, Time at_time) {
        this.at_d_seqno = at_d_seqno;
        this.at_time = at_time;
    }

    public Integer getAt_seqno() {
        return at_seqno;
    }

    public void setAt_seqno(Integer at_seqno) {
        this.at_seqno = at_seqno;
    }

    public Integer getAt_d_seqno() {
        return at_d_seqno;
    }

    public void setAt_d_seqno(Integer at_d_seqno) {
        this.at_d_seqno = at_d_seqno;
    }

    public Time getAt_time() {
        return at_time;
    }

    public void setAt_time(Time at_time) {
        this.at_time = at_time;
    }

    @Override
    public String toString() {
        return "AtimeDto{" +
                "at_seqno=" + at_seqno +
                ", at_d_seqno=" + at_d_seqno +
                ", at_time=" + at_time +
                '}';
    }
}
