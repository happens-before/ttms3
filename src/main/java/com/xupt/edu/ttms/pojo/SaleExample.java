package com.xupt.edu.ttms.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSale_IDIsNull() {
            addCriterion("sale_ID is null");
            return (Criteria) this;
        }

        public Criteria andSale_IDIsNotNull() {
            addCriterion("sale_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSale_IDEqualTo(Long value) {
            addCriterion("sale_ID =", value, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDNotEqualTo(Long value) {
            addCriterion("sale_ID <>", value, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDGreaterThan(Long value) {
            addCriterion("sale_ID >", value, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_ID >=", value, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDLessThan(Long value) {
            addCriterion("sale_ID <", value, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDLessThanOrEqualTo(Long value) {
            addCriterion("sale_ID <=", value, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDIn(List<Long> values) {
            addCriterion("sale_ID in", values, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDNotIn(List<Long> values) {
            addCriterion("sale_ID not in", values, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDBetween(Long value1, Long value2) {
            addCriterion("sale_ID between", value1, value2, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andSale_IDNotBetween(Long value1, Long value2) {
            addCriterion("sale_ID not between", value1, value2, "sale_ID");
            return (Criteria) this;
        }

        public Criteria andEmp_idIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmp_idIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_idEqualTo(Integer value) {
            addCriterion("emp_id =", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idLessThan(Integer value) {
            addCriterion("emp_id <", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idIn(List<Integer> values) {
            addCriterion("emp_id in", values, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "emp_id");
            return (Criteria) this;
        }

        public Criteria andSale_timeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSale_timeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSale_timeEqualTo(Date value) {
            addCriterion("sale_time =", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeNotEqualTo(Date value) {
            addCriterion("sale_time <>", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeGreaterThan(Date value) {
            addCriterion("sale_time >", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_time >=", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeLessThan(Date value) {
            addCriterion("sale_time <", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeLessThanOrEqualTo(Date value) {
            addCriterion("sale_time <=", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeIn(List<Date> values) {
            addCriterion("sale_time in", values, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeNotIn(List<Date> values) {
            addCriterion("sale_time not in", values, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeBetween(Date value1, Date value2) {
            addCriterion("sale_time between", value1, value2, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeNotBetween(Date value1, Date value2) {
            addCriterion("sale_time not between", value1, value2, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_paymentIsNull() {
            addCriterion("sale_payment is null");
            return (Criteria) this;
        }

        public Criteria andSale_paymentIsNotNull() {
            addCriterion("sale_payment is not null");
            return (Criteria) this;
        }

        public Criteria andSale_paymentEqualTo(BigDecimal value) {
            addCriterion("sale_payment =", value, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentNotEqualTo(BigDecimal value) {
            addCriterion("sale_payment <>", value, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentGreaterThan(BigDecimal value) {
            addCriterion("sale_payment >", value, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_payment >=", value, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentLessThan(BigDecimal value) {
            addCriterion("sale_payment <", value, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_payment <=", value, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentIn(List<BigDecimal> values) {
            addCriterion("sale_payment in", values, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentNotIn(List<BigDecimal> values) {
            addCriterion("sale_payment not in", values, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_payment between", value1, value2, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_paymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_payment not between", value1, value2, "sale_payment");
            return (Criteria) this;
        }

        public Criteria andSale_changeIsNull() {
            addCriterion("sale_change is null");
            return (Criteria) this;
        }

        public Criteria andSale_changeIsNotNull() {
            addCriterion("sale_change is not null");
            return (Criteria) this;
        }

        public Criteria andSale_changeEqualTo(BigDecimal value) {
            addCriterion("sale_change =", value, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeNotEqualTo(BigDecimal value) {
            addCriterion("sale_change <>", value, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeGreaterThan(BigDecimal value) {
            addCriterion("sale_change >", value, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_change >=", value, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeLessThan(BigDecimal value) {
            addCriterion("sale_change <", value, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_change <=", value, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeIn(List<BigDecimal> values) {
            addCriterion("sale_change in", values, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeNotIn(List<BigDecimal> values) {
            addCriterion("sale_change not in", values, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_change between", value1, value2, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_changeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_change not between", value1, value2, "sale_change");
            return (Criteria) this;
        }

        public Criteria andSale_typeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSale_typeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSale_typeEqualTo(Short value) {
            addCriterion("sale_type =", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotEqualTo(Short value) {
            addCriterion("sale_type <>", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeGreaterThan(Short value) {
            addCriterion("sale_type >", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeGreaterThanOrEqualTo(Short value) {
            addCriterion("sale_type >=", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeLessThan(Short value) {
            addCriterion("sale_type <", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeLessThanOrEqualTo(Short value) {
            addCriterion("sale_type <=", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeIn(List<Short> values) {
            addCriterion("sale_type in", values, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotIn(List<Short> values) {
            addCriterion("sale_type not in", values, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeBetween(Short value1, Short value2) {
            addCriterion("sale_type between", value1, value2, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotBetween(Short value1, Short value2) {
            addCriterion("sale_type not between", value1, value2, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_statusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSale_statusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSale_statusEqualTo(Short value) {
            addCriterion("sale_status =", value, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusNotEqualTo(Short value) {
            addCriterion("sale_status <>", value, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusGreaterThan(Short value) {
            addCriterion("sale_status >", value, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusGreaterThanOrEqualTo(Short value) {
            addCriterion("sale_status >=", value, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusLessThan(Short value) {
            addCriterion("sale_status <", value, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusLessThanOrEqualTo(Short value) {
            addCriterion("sale_status <=", value, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusIn(List<Short> values) {
            addCriterion("sale_status in", values, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusNotIn(List<Short> values) {
            addCriterion("sale_status not in", values, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusBetween(Short value1, Short value2) {
            addCriterion("sale_status between", value1, value2, "sale_status");
            return (Criteria) this;
        }

        public Criteria andSale_statusNotBetween(Short value1, Short value2) {
            addCriterion("sale_status not between", value1, value2, "sale_status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}