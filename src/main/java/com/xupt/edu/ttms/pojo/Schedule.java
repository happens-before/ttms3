package com.xupt.edu.ttms.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Schedule {
    private Integer sched_id;

    private Integer studio_id;

    private Integer play_id;
    private Timestamp sched_time;

    private BigDecimal sched_ticket_price;
    //非数据库字段
    private Studio studio;
    private Play play;
    public Timestamp getSched_time() {
        return sched_time;
    }

    public void setSched_time(Timestamp sched_time) {
        this.sched_time = sched_time;
    }
    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Integer getSched_id() {
        return sched_id;
    }

    public void setSched_id(Integer sched_id) {
        this.sched_id = sched_id;
    }

    public Integer getStudio_id() {
        return studio_id;
    }

    public void setStudio_id(Integer studio_id) {
        this.studio_id = studio_id;
    }

    public Integer getPlay_id() {
        return play_id;
    }

    public void setPlay_id(Integer play_id) {
        this.play_id = play_id;
    }

    public BigDecimal getSched_ticket_price() {
        return sched_ticket_price;
    }

    public void setSched_ticket_price(BigDecimal sched_ticket_price) {
        this.sched_ticket_price = sched_ticket_price;
    }
}