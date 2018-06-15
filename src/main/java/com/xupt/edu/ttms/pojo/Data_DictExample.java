package com.xupt.edu.ttms.pojo;

import java.util.ArrayList;
import java.util.List;

public class Data_DictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Data_DictExample() {
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

        public Criteria andDict_idIsNull() {
            addCriterion("dict_id is null");
            return (Criteria) this;
        }

        public Criteria andDict_idIsNotNull() {
            addCriterion("dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andDict_idEqualTo(Integer value) {
            addCriterion("dict_id =", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotEqualTo(Integer value) {
            addCriterion("dict_id <>", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idGreaterThan(Integer value) {
            addCriterion("dict_id >", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_id >=", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idLessThan(Integer value) {
            addCriterion("dict_id <", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idLessThanOrEqualTo(Integer value) {
            addCriterion("dict_id <=", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idIn(List<Integer> values) {
            addCriterion("dict_id in", values, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotIn(List<Integer> values) {
            addCriterion("dict_id not in", values, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idBetween(Integer value1, Integer value2) {
            addCriterion("dict_id between", value1, value2, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_id not between", value1, value2, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idIsNull() {
            addCriterion("dict_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idIsNotNull() {
            addCriterion("dict_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idEqualTo(Integer value) {
            addCriterion("dict_parent_id =", value, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idNotEqualTo(Integer value) {
            addCriterion("dict_parent_id <>", value, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idGreaterThan(Integer value) {
            addCriterion("dict_parent_id >", value, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_parent_id >=", value, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idLessThan(Integer value) {
            addCriterion("dict_parent_id <", value, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idLessThanOrEqualTo(Integer value) {
            addCriterion("dict_parent_id <=", value, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idIn(List<Integer> values) {
            addCriterion("dict_parent_id in", values, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idNotIn(List<Integer> values) {
            addCriterion("dict_parent_id not in", values, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idBetween(Integer value1, Integer value2) {
            addCriterion("dict_parent_id between", value1, value2, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_parent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_parent_id not between", value1, value2, "dict_parent_id");
            return (Criteria) this;
        }

        public Criteria andDict_indexIsNull() {
            addCriterion("dict_index is null");
            return (Criteria) this;
        }

        public Criteria andDict_indexIsNotNull() {
            addCriterion("dict_index is not null");
            return (Criteria) this;
        }

        public Criteria andDict_indexEqualTo(Integer value) {
            addCriterion("dict_index =", value, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexNotEqualTo(Integer value) {
            addCriterion("dict_index <>", value, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexGreaterThan(Integer value) {
            addCriterion("dict_index >", value, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_index >=", value, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexLessThan(Integer value) {
            addCriterion("dict_index <", value, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexLessThanOrEqualTo(Integer value) {
            addCriterion("dict_index <=", value, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexIn(List<Integer> values) {
            addCriterion("dict_index in", values, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexNotIn(List<Integer> values) {
            addCriterion("dict_index not in", values, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexBetween(Integer value1, Integer value2) {
            addCriterion("dict_index between", value1, value2, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_indexNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_index not between", value1, value2, "dict_index");
            return (Criteria) this;
        }

        public Criteria andDict_nameIsNull() {
            addCriterion("dict_name is null");
            return (Criteria) this;
        }

        public Criteria andDict_nameIsNotNull() {
            addCriterion("dict_name is not null");
            return (Criteria) this;
        }

        public Criteria andDict_nameEqualTo(String value) {
            addCriterion("dict_name =", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameNotEqualTo(String value) {
            addCriterion("dict_name <>", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameGreaterThan(String value) {
            addCriterion("dict_name >", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_name >=", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameLessThan(String value) {
            addCriterion("dict_name <", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameLessThanOrEqualTo(String value) {
            addCriterion("dict_name <=", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameLike(String value) {
            addCriterion("dict_name like", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameNotLike(String value) {
            addCriterion("dict_name not like", value, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameIn(List<String> values) {
            addCriterion("dict_name in", values, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameNotIn(List<String> values) {
            addCriterion("dict_name not in", values, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameBetween(String value1, String value2) {
            addCriterion("dict_name between", value1, value2, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_nameNotBetween(String value1, String value2) {
            addCriterion("dict_name not between", value1, value2, "dict_name");
            return (Criteria) this;
        }

        public Criteria andDict_valueIsNull() {
            addCriterion("dict_value is null");
            return (Criteria) this;
        }

        public Criteria andDict_valueIsNotNull() {
            addCriterion("dict_value is not null");
            return (Criteria) this;
        }

        public Criteria andDict_valueEqualTo(String value) {
            addCriterion("dict_value =", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueNotEqualTo(String value) {
            addCriterion("dict_value <>", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueGreaterThan(String value) {
            addCriterion("dict_value >", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueGreaterThanOrEqualTo(String value) {
            addCriterion("dict_value >=", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueLessThan(String value) {
            addCriterion("dict_value <", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueLessThanOrEqualTo(String value) {
            addCriterion("dict_value <=", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueLike(String value) {
            addCriterion("dict_value like", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueNotLike(String value) {
            addCriterion("dict_value not like", value, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueIn(List<String> values) {
            addCriterion("dict_value in", values, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueNotIn(List<String> values) {
            addCriterion("dict_value not in", values, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueBetween(String value1, String value2) {
            addCriterion("dict_value between", value1, value2, "dict_value");
            return (Criteria) this;
        }

        public Criteria andDict_valueNotBetween(String value1, String value2) {
            addCriterion("dict_value not between", value1, value2, "dict_value");
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