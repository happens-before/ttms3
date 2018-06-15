package com.xupt.edu.ttms.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicket_idIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicket_idIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicket_idEqualTo(Long value) {
            addCriterion("ticket_id =", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idNotEqualTo(Long value) {
            addCriterion("ticket_id <>", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idGreaterThan(Long value) {
            addCriterion("ticket_id >", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idGreaterThanOrEqualTo(Long value) {
            addCriterion("ticket_id >=", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idLessThan(Long value) {
            addCriterion("ticket_id <", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idLessThanOrEqualTo(Long value) {
            addCriterion("ticket_id <=", value, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idIn(List<Long> values) {
            addCriterion("ticket_id in", values, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idNotIn(List<Long> values) {
            addCriterion("ticket_id not in", values, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idBetween(Long value1, Long value2) {
            addCriterion("ticket_id between", value1, value2, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andTicket_idNotBetween(Long value1, Long value2) {
            addCriterion("ticket_id not between", value1, value2, "ticket_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeat_idIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_idEqualTo(Integer value) {
            addCriterion("seat_id =", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idNotEqualTo(Integer value) {
            addCriterion("seat_id <>", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idGreaterThan(Integer value) {
            addCriterion("seat_id >", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_id >=", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idLessThan(Integer value) {
            addCriterion("seat_id <", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idLessThanOrEqualTo(Integer value) {
            addCriterion("seat_id <=", value, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idIn(List<Integer> values) {
            addCriterion("seat_id in", values, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idNotIn(List<Integer> values) {
            addCriterion("seat_id not in", values, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idBetween(Integer value1, Integer value2) {
            addCriterion("seat_id between", value1, value2, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSeat_idNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_id not between", value1, value2, "seat_id");
            return (Criteria) this;
        }

        public Criteria andSched_idIsNull() {
            addCriterion("sched_id is null");
            return (Criteria) this;
        }

        public Criteria andSched_idIsNotNull() {
            addCriterion("sched_id is not null");
            return (Criteria) this;
        }

        public Criteria andSched_idEqualTo(Integer value) {
            addCriterion("sched_id =", value, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idNotEqualTo(Integer value) {
            addCriterion("sched_id <>", value, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idGreaterThan(Integer value) {
            addCriterion("sched_id >", value, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sched_id >=", value, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idLessThan(Integer value) {
            addCriterion("sched_id <", value, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idLessThanOrEqualTo(Integer value) {
            addCriterion("sched_id <=", value, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idIn(List<Integer> values) {
            addCriterion("sched_id in", values, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idNotIn(List<Integer> values) {
            addCriterion("sched_id not in", values, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idBetween(Integer value1, Integer value2) {
            addCriterion("sched_id between", value1, value2, "sched_id");
            return (Criteria) this;
        }

        public Criteria andSched_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sched_id not between", value1, value2, "sched_id");
            return (Criteria) this;
        }

        public Criteria andTicket_priceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicket_priceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicket_priceEqualTo(BigDecimal value) {
            addCriterion("ticket_price =", value, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceNotEqualTo(BigDecimal value) {
            addCriterion("ticket_price <>", value, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceGreaterThan(BigDecimal value) {
            addCriterion("ticket_price >", value, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_price >=", value, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceLessThan(BigDecimal value) {
            addCriterion("ticket_price <", value, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_price <=", value, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceIn(List<BigDecimal> values) {
            addCriterion("ticket_price in", values, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceNotIn(List<BigDecimal> values) {
            addCriterion("ticket_price not in", values, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_price between", value1, value2, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_price not between", value1, value2, "ticket_price");
            return (Criteria) this;
        }

        public Criteria andTicket_statusIsNull() {
            addCriterion("ticket_status is null");
            return (Criteria) this;
        }

        public Criteria andTicket_statusIsNotNull() {
            addCriterion("ticket_status is not null");
            return (Criteria) this;
        }

        public Criteria andTicket_statusEqualTo(Short value) {
            addCriterion("ticket_status =", value, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusNotEqualTo(Short value) {
            addCriterion("ticket_status <>", value, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusGreaterThan(Short value) {
            addCriterion("ticket_status >", value, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusGreaterThanOrEqualTo(Short value) {
            addCriterion("ticket_status >=", value, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusLessThan(Short value) {
            addCriterion("ticket_status <", value, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusLessThanOrEqualTo(Short value) {
            addCriterion("ticket_status <=", value, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusIn(List<Short> values) {
            addCriterion("ticket_status in", values, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusNotIn(List<Short> values) {
            addCriterion("ticket_status not in", values, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusBetween(Short value1, Short value2) {
            addCriterion("ticket_status between", value1, value2, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_statusNotBetween(Short value1, Short value2) {
            addCriterion("ticket_status not between", value1, value2, "ticket_status");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeIsNull() {
            addCriterion("ticket_locked_time is null");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeIsNotNull() {
            addCriterion("ticket_locked_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeEqualTo(Date value) {
            addCriterion("ticket_locked_time =", value, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeNotEqualTo(Date value) {
            addCriterion("ticket_locked_time <>", value, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeGreaterThan(Date value) {
            addCriterion("ticket_locked_time >", value, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_locked_time >=", value, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeLessThan(Date value) {
            addCriterion("ticket_locked_time <", value, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_locked_time <=", value, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeIn(List<Date> values) {
            addCriterion("ticket_locked_time in", values, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeNotIn(List<Date> values) {
            addCriterion("ticket_locked_time not in", values, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeBetween(Date value1, Date value2) {
            addCriterion("ticket_locked_time between", value1, value2, "ticket_locked_time");
            return (Criteria) this;
        }

        public Criteria andTicket_locked_timeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_locked_time not between", value1, value2, "ticket_locked_time");
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