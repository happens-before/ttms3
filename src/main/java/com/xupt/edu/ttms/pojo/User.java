package com.xupt.edu.ttms.pojo;

public class User {
    private String emp_no;

    private String emp_pass;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int type;

    private String head_path;

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no == null ? null : emp_no.trim();
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass == null ? null : emp_pass.trim();
    }



    public String getHead_path() {
        return head_path;
    }

    public void setHead_path(String head_path) {
        this.head_path = head_path == null ? null : head_path.trim();
    }
}