package com.xupt.edu.ttms.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayExample() {
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

        public Criteria andPlay_idIsNull() {
            addCriterion("play_id is null");
            return (Criteria) this;
        }

        public Criteria andPlay_idIsNotNull() {
            addCriterion("play_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_idEqualTo(Integer value) {
            addCriterion("play_id =", value, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idNotEqualTo(Integer value) {
            addCriterion("play_id <>", value, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idGreaterThan(Integer value) {
            addCriterion("play_id >", value, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_id >=", value, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idLessThan(Integer value) {
            addCriterion("play_id <", value, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idLessThanOrEqualTo(Integer value) {
            addCriterion("play_id <=", value, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idIn(List<Integer> values) {
            addCriterion("play_id in", values, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idNotIn(List<Integer> values) {
            addCriterion("play_id not in", values, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idBetween(Integer value1, Integer value2) {
            addCriterion("play_id between", value1, value2, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_idNotBetween(Integer value1, Integer value2) {
            addCriterion("play_id not between", value1, value2, "play_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idIsNull() {
            addCriterion("play_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idIsNotNull() {
            addCriterion("play_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idEqualTo(Integer value) {
            addCriterion("play_type_id =", value, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idNotEqualTo(Integer value) {
            addCriterion("play_type_id <>", value, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idGreaterThan(Integer value) {
            addCriterion("play_type_id >", value, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_type_id >=", value, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idLessThan(Integer value) {
            addCriterion("play_type_id <", value, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("play_type_id <=", value, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idIn(List<Integer> values) {
            addCriterion("play_type_id in", values, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idNotIn(List<Integer> values) {
            addCriterion("play_type_id not in", values, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idBetween(Integer value1, Integer value2) {
            addCriterion("play_type_id between", value1, value2, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("play_type_id not between", value1, value2, "play_type_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idIsNull() {
            addCriterion("play_lang_id is null");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idIsNotNull() {
            addCriterion("play_lang_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idEqualTo(Integer value) {
            addCriterion("play_lang_id =", value, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idNotEqualTo(Integer value) {
            addCriterion("play_lang_id <>", value, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idGreaterThan(Integer value) {
            addCriterion("play_lang_id >", value, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_lang_id >=", value, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idLessThan(Integer value) {
            addCriterion("play_lang_id <", value, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idLessThanOrEqualTo(Integer value) {
            addCriterion("play_lang_id <=", value, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idIn(List<Integer> values) {
            addCriterion("play_lang_id in", values, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idNotIn(List<Integer> values) {
            addCriterion("play_lang_id not in", values, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idBetween(Integer value1, Integer value2) {
            addCriterion("play_lang_id between", value1, value2, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_lang_idNotBetween(Integer value1, Integer value2) {
            addCriterion("play_lang_id not between", value1, value2, "play_lang_id");
            return (Criteria) this;
        }

        public Criteria andPlay_nameIsNull() {
            addCriterion("play_name is null");
            return (Criteria) this;
        }

        public Criteria andPlay_nameIsNotNull() {
            addCriterion("play_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_nameEqualTo(String value) {
            addCriterion("play_name =", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameNotEqualTo(String value) {
            addCriterion("play_name <>", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameGreaterThan(String value) {
            addCriterion("play_name >", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameGreaterThanOrEqualTo(String value) {
            addCriterion("play_name >=", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameLessThan(String value) {
            addCriterion("play_name <", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameLessThanOrEqualTo(String value) {
            addCriterion("play_name <=", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameLike(String value) {
            addCriterion("play_name like", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameNotLike(String value) {
            addCriterion("play_name not like", value, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameIn(List<String> values) {
            addCriterion("play_name in", values, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameNotIn(List<String> values) {
            addCriterion("play_name not in", values, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameBetween(String value1, String value2) {
            addCriterion("play_name between", value1, value2, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_nameNotBetween(String value1, String value2) {
            addCriterion("play_name not between", value1, value2, "play_name");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionIsNull() {
            addCriterion("play_introduction is null");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionIsNotNull() {
            addCriterion("play_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionEqualTo(String value) {
            addCriterion("play_introduction =", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionNotEqualTo(String value) {
            addCriterion("play_introduction <>", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionGreaterThan(String value) {
            addCriterion("play_introduction >", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionGreaterThanOrEqualTo(String value) {
            addCriterion("play_introduction >=", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionLessThan(String value) {
            addCriterion("play_introduction <", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionLessThanOrEqualTo(String value) {
            addCriterion("play_introduction <=", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionLike(String value) {
            addCriterion("play_introduction like", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionNotLike(String value) {
            addCriterion("play_introduction not like", value, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionIn(List<String> values) {
            addCriterion("play_introduction in", values, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionNotIn(List<String> values) {
            addCriterion("play_introduction not in", values, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionBetween(String value1, String value2) {
            addCriterion("play_introduction between", value1, value2, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_introductionNotBetween(String value1, String value2) {
            addCriterion("play_introduction not between", value1, value2, "play_introduction");
            return (Criteria) this;
        }

        public Criteria andPlay_imageIsNull() {
            addCriterion("play_image is null");
            return (Criteria) this;
        }

        public Criteria andPlay_imageIsNotNull() {
            addCriterion("play_image is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_imageEqualTo(String value) {
            addCriterion("play_image =", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageNotEqualTo(String value) {
            addCriterion("play_image <>", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageGreaterThan(String value) {
            addCriterion("play_image >", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageGreaterThanOrEqualTo(String value) {
            addCriterion("play_image >=", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageLessThan(String value) {
            addCriterion("play_image <", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageLessThanOrEqualTo(String value) {
            addCriterion("play_image <=", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageLike(String value) {
            addCriterion("play_image like", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageNotLike(String value) {
            addCriterion("play_image not like", value, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageIn(List<String> values) {
            addCriterion("play_image in", values, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageNotIn(List<String> values) {
            addCriterion("play_image not in", values, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageBetween(String value1, String value2) {
            addCriterion("play_image between", value1, value2, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_imageNotBetween(String value1, String value2) {
            addCriterion("play_image not between", value1, value2, "play_image");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthIsNull() {
            addCriterion("play_length is null");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthIsNotNull() {
            addCriterion("play_length is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthEqualTo(Integer value) {
            addCriterion("play_length =", value, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthNotEqualTo(Integer value) {
            addCriterion("play_length <>", value, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthGreaterThan(Integer value) {
            addCriterion("play_length >", value, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_length >=", value, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthLessThan(Integer value) {
            addCriterion("play_length <", value, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthLessThanOrEqualTo(Integer value) {
            addCriterion("play_length <=", value, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthIn(List<Integer> values) {
            addCriterion("play_length in", values, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthNotIn(List<Integer> values) {
            addCriterion("play_length not in", values, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthBetween(Integer value1, Integer value2) {
            addCriterion("play_length between", value1, value2, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_lengthNotBetween(Integer value1, Integer value2) {
            addCriterion("play_length not between", value1, value2, "play_length");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceIsNull() {
            addCriterion("play_ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceIsNotNull() {
            addCriterion("play_ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price =", value, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceNotEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price <>", value, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceGreaterThan(BigDecimal value) {
            addCriterion("play_ticket_price >", value, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price >=", value, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceLessThan(BigDecimal value) {
            addCriterion("play_ticket_price <", value, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("play_ticket_price <=", value, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceIn(List<BigDecimal> values) {
            addCriterion("play_ticket_price in", values, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceNotIn(List<BigDecimal> values) {
            addCriterion("play_ticket_price not in", values, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("play_ticket_price between", value1, value2, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_ticket_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("play_ticket_price not between", value1, value2, "play_ticket_price");
            return (Criteria) this;
        }

        public Criteria andPlay_statusIsNull() {
            addCriterion("play_status is null");
            return (Criteria) this;
        }

        public Criteria andPlay_statusIsNotNull() {
            addCriterion("play_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_statusEqualTo(Short value) {
            addCriterion("play_status =", value, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusNotEqualTo(Short value) {
            addCriterion("play_status <>", value, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusGreaterThan(Short value) {
            addCriterion("play_status >", value, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusGreaterThanOrEqualTo(Short value) {
            addCriterion("play_status >=", value, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusLessThan(Short value) {
            addCriterion("play_status <", value, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusLessThanOrEqualTo(Short value) {
            addCriterion("play_status <=", value, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusIn(List<Short> values) {
            addCriterion("play_status in", values, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusNotIn(List<Short> values) {
            addCriterion("play_status not in", values, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusBetween(Short value1, Short value2) {
            addCriterion("play_status between", value1, value2, "play_status");
            return (Criteria) this;
        }

        public Criteria andPlay_statusNotBetween(Short value1, Short value2) {
            addCriterion("play_status not between", value1, value2, "play_status");
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