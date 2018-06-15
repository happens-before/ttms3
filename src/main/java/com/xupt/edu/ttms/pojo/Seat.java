package com.xupt.edu.ttms.pojo;

public class Seat {
    private Integer seat_id;

    private Integer studio_id;

    private Integer seat_row;

    private Integer seat_column;

    private Short seat_status;
    //非数据库字段
    private Studio studio;


    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public Integer getStudio_id() {
        return studio_id;
    }

    public void setStudio_id(Integer studio_id) {
        this.studio_id = studio_id;
    }

    public Integer getSeat_row() {
        return seat_row;
    }

    public void setSeat_row(Integer seat_row) {
        this.seat_row = seat_row;
    }

    public Integer getSeat_column() {
        return seat_column;
    }

    public void setSeat_column(Integer seat_column) {
        this.seat_column = seat_column;
    }

    public Short getSeat_status() {
        return seat_status;
    }

    public void setSeat_status(Short seat_status) {
        this.seat_status = seat_status;
    }
}