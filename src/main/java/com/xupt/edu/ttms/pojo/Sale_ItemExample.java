package com.xupt.edu.ttms.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sale_ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sale_ItemExample() {
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

        public Criteria andSale_item_idIsNull() {
            addCriterion("sale_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSale_item_idIsNotNull() {
            addCriterion("sale_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSale_item_idEqualTo(Long value) {
            addCriterion("sale_item_id =", value, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idNotEqualTo(Long value) {
            addCriterion("sale_item_id <>", value, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idGreaterThan(Long value) {
            addCriterion("sale_item_id >", value, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_item_id >=", value, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idLessThan(Long value) {
            addCriterion("sale_item_id <", value, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idLessThanOrEqualTo(Long value) {
            addCriterion("sale_item_id <=", value, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idIn(List<Long> values) {
            addCriterion("sale_item_id in", values, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idNotIn(List<Long> values) {
            addCriterion("sale_item_id not in", values, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idBetween(Long value1, Long value2) {
            addCriterion("sale_item_id between", value1, value2, "sale_item_id");
            return (Criteria) this;
        }

        public Criteria andSale_item_idNotBetween(Long value1, Long value2) {
            addCriterion("sale_item_id not between", value1, value2, "sale_item_id");
            return (Criteria) this;
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

        public Criteria andSale_item_priceIsNull() {
            addCriterion("sale_item_price is null");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceIsNotNull() {
            addCriterion("sale_item_price is not null");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceEqualTo(BigDecimal value) {
            addCriterion("sale_item_price =", value, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceNotEqualTo(BigDecimal value) {
            addCriterion("sale_item_price <>", value, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceGreaterThan(BigDecimal value) {
            addCriterion("sale_item_price >", value, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_item_price >=", value, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceLessThan(BigDecimal value) {
            addCriterion("sale_item_price <", value, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_item_price <=", value, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceIn(List<BigDecimal> values) {
            addCriterion("sale_item_price in", values, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceNotIn(List<BigDecimal> values) {
            addCriterion("sale_item_price not in", values, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_item_price between", value1, value2, "sale_item_price");
            return (Criteria) this;
        }

        public Criteria andSale_item_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_item_price not between", value1, value2, "sale_item_price");
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