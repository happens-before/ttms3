package com.xupt.edu.ttms.pojo;

public class Studio {
    private Integer studio_id;

    private String studio_name;

    private Integer studio_row_count;

    private Integer studio_col_count;

    private String studio_introduction;

    private Short studio_flag;

    public Integer getStudio_id() {
        return studio_id;
    }

    public void setStudio_id(Integer studio_id) {
        this.studio_id = studio_id;
    }

    public String getStudio_name() {
        return studio_name;
    }

    public void setStudio_name(String studio_name) {
        this.studio_name = studio_name == null ? null : studio_name.trim();
    }

    public Integer getStudio_row_count() {
        return studio_row_count;
    }

    public void setStudio_row_count(Integer studio_row_count) {
        this.studio_row_count = studio_row_count;
    }

    public Integer getStudio_col_count() {
        return studio_col_count;
    }

    public void setStudio_col_count(Integer studio_col_count) {
        this.studio_col_count = studio_col_count;
    }

    public String getStudio_introduction() {
        return studio_introduction;
    }

    public void setStudio_introduction(String studio_introduction) {
        this.studio_introduction = studio_introduction == null ? null : studio_introduction.trim();
    }

    public Short getStudio_flag() {
        return studio_flag;
    }

    public void setStudio_flag(Short studio_flag) {
        this.studio_flag = studio_flag;
    }
}