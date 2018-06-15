package com.xupt.edu.ttms.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class Sale {
    private BigInteger sale_ID;

    private Integer emp_id;

    private Timestamp sale_time;

    private BigDecimal sale_payment;

    private BigDecimal sale_change;

    private Integer sale_type;

    private Integer sale_status;

    public BigInteger getSale_ID() {
        return sale_ID;
    }

    public void setSale_ID(BigInteger sale_ID) {
        this.sale_ID = sale_ID;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public Timestamp getSale_time() {
        return sale_time;
    }

    public void setSale_time(Timestamp sale_time) {
        this.sale_time = sale_time;
    }

    public BigDecimal getSale_payment() {
        return sale_payment;
    }

    public void setSale_payment(BigDecimal sale_payment) {
        this.sale_payment = sale_payment;
    }

    public BigDecimal getSale_change() {
        return sale_change;
    }

    public void setSale_change(BigDecimal sale_change) {
        this.sale_change = sale_change;
    }

    public Integer getSale_type() {
        return sale_type;
    }

    public void setSale_type(Integer sale_type) {
        this.sale_type = sale_type;
    }

    public Integer getSale_status() {
        return sale_status;
    }

    public void setSale_status(Integer sale_status) {
        this.sale_status = sale_status;
    }
}