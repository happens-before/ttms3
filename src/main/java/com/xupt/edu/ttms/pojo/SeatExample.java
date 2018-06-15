package com.xupt.edu.ttms.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andStudio_idIsNull() {
            addCriterion("studio_id is null");
            return (Criteria) this;
        }

        public Criteria andStudio_idIsNotNull() {
            addCriterion("studio_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudio_idEqualTo(Integer value) {
            addCriterion("studio_id =", value, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idNotEqualTo(Integer value) {
            addCriterion("studio_id <>", value, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idGreaterThan(Integer value) {
            addCriterion("studio_id >", value, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_id >=", value, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idLessThan(Integer value) {
            addCriterion("studio_id <", value, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idLessThanOrEqualTo(Integer value) {
            addCriterion("studio_id <=", value, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idIn(List<Integer> values) {
            addCriterion("studio_id in", values, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idNotIn(List<Integer> values) {
            addCriterion("studio_id not in", values, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idBetween(Integer value1, Integer value2) {
            addCriterion("studio_id between", value1, value2, "studio_id");
            return (Criteria) this;
        }

        public Criteria andStudio_idNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_id not between", value1, value2, "studio_id");
            return (Criteria) this;
        }

        public Criteria andSeat_rowIsNull() {
            addCriterion("seat_row is null");
            return (Criteria) this;
        }

        public Criteria andSeat_rowIsNotNull() {
            addCriterion("seat_row is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_rowEqualTo(Integer value) {
            addCriterion("seat_row =", value, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowNotEqualTo(Integer value) {
            addCriterion("seat_row <>", value, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowGreaterThan(Integer value) {
            addCriterion("seat_row >", value, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_row >=", value, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowLessThan(Integer value) {
            addCriterion("seat_row <", value, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowLessThanOrEqualTo(Integer value) {
            addCriterion("seat_row <=", value, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowIn(List<Integer> values) {
            addCriterion("seat_row in", values, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowNotIn(List<Integer> values) {
            addCriterion("seat_row not in", values, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowBetween(Integer value1, Integer value2) {
            addCriterion("seat_row between", value1, value2, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_rowNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_row not between", value1, value2, "seat_row");
            return (Criteria) this;
        }

        public Criteria andSeat_columnIsNull() {
            addCriterion("seat_column is null");
            return (Criteria) this;
        }

        public Criteria andSeat_columnIsNotNull() {
            addCriterion("seat_column is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_columnEqualTo(Integer value) {
            addCriterion("seat_column =", value, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnNotEqualTo(Integer value) {
            addCriterion("seat_column <>", value, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnGreaterThan(Integer value) {
            addCriterion("seat_column >", value, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_column >=", value, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnLessThan(Integer value) {
            addCriterion("seat_column <", value, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnLessThanOrEqualTo(Integer value) {
            addCriterion("seat_column <=", value, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnIn(List<Integer> values) {
            addCriterion("seat_column in", values, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnNotIn(List<Integer> values) {
            addCriterion("seat_column not in", values, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnBetween(Integer value1, Integer value2) {
            addCriterion("seat_column between", value1, value2, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_columnNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_column not between", value1, value2, "seat_column");
            return (Criteria) this;
        }

        public Criteria andSeat_statusIsNull() {
            addCriterion("seat_status is null");
            return (Criteria) this;
        }

        public Criteria andSeat_statusIsNotNull() {
            addCriterion("seat_status is not null");
            return (Criteria) this;
        }

        public Criteria andSeat_statusEqualTo(Short value) {
            addCriterion("seat_status =", value, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusNotEqualTo(Short value) {
            addCriterion("seat_status <>", value, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusGreaterThan(Short value) {
            addCriterion("seat_status >", value, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusGreaterThanOrEqualTo(Short value) {
            addCriterion("seat_status >=", value, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusLessThan(Short value) {
            addCriterion("seat_status <", value, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusLessThanOrEqualTo(Short value) {
            addCriterion("seat_status <=", value, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusIn(List<Short> values) {
            addCriterion("seat_status in", values, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusNotIn(List<Short> values) {
            addCriterion("seat_status not in", values, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusBetween(Short value1, Short value2) {
            addCriterion("seat_status between", value1, value2, "seat_status");
            return (Criteria) this;
        }

        public Criteria andSeat_statusNotBetween(Short value1, Short value2) {
            addCriterion("seat_status not between", value1, value2, "seat_status");
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