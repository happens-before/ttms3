package com.xupt.edu.ttms.pojo;

import java.math.BigDecimal;

public class Play {
    private Integer play_id;

    private Integer play_type_id;

    private Integer play_lang_id;

    private String play_name;

    private String play_introduction;

    private String play_image;

    private Integer play_length;

    private BigDecimal play_ticket_price;

    private Integer play_status;
    //非数据库字段
    private Data_Dict data_dict;

    public Data_Dict getData_dict() {
        return data_dict;
    }

    public void setData_dict(Data_Dict data_dict) {
        this.data_dict = data_dict;
    }


    public Integer getPlay_id() {
        return play_id;
    }

    public void setPlay_id(Integer play_id) {
        this.play_id = play_id;
    }

    public Integer getPlay_type_id() {
        return play_type_id;
    }

    public void setPlay_type_id(Integer play_type_id) {
        this.play_type_id = play_type_id;
    }

    public Integer getPlay_lang_id() {
        return play_lang_id;
    }

    public void setPlay_lang_id(Integer play_lang_id) {
        this.play_lang_id = play_lang_id;
    }

    public String getPlay_name() {
        return play_name;
    }

    public void setPlay_name(String play_name) {
        this.play_name = play_name == null ? null : play_name.trim();
    }

    public String getPlay_introduction() {
        return play_introduction;
    }

    public void setPlay_introduction(String play_introduction) {
        this.play_introduction = play_introduction == null ? null : play_introduction.trim();
    }

    public String getPlay_image() {
        return play_image;
    }

    public void setPlay_image(String play_image) {
        this.play_image = play_image == null ? null : play_image.trim();
    }

    public Integer getPlay_length() {
        return play_length;
    }

    public void setPlay_length(Integer play_length) {
        this.play_length = play_length;
    }

    public BigDecimal getPlay_ticket_price() {
        return play_ticket_price;
    }

    public void setPlay_ticket_price(BigDecimal play_ticket_price) {
        this.play_ticket_price = play_ticket_price;
    }

    public Integer getPlay_status() {
        return play_status;
    }

    public void setPlay_status(Integer play_status) {
        this.play_status = play_status;
    }
}