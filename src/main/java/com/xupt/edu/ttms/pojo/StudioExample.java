package com.xupt.edu.ttms.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudioExample() {
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

        public Criteria andStudio_nameIsNull() {
            addCriterion("studio_name is null");
            return (Criteria) this;
        }

        public Criteria andStudio_nameIsNotNull() {
            addCriterion("studio_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudio_nameEqualTo(String value) {
            addCriterion("studio_name =", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameNotEqualTo(String value) {
            addCriterion("studio_name <>", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameGreaterThan(String value) {
            addCriterion("studio_name >", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameGreaterThanOrEqualTo(String value) {
            addCriterion("studio_name >=", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameLessThan(String value) {
            addCriterion("studio_name <", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameLessThanOrEqualTo(String value) {
            addCriterion("studio_name <=", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameLike(String value) {
            addCriterion("studio_name like", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameNotLike(String value) {
            addCriterion("studio_name not like", value, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameIn(List<String> values) {
            addCriterion("studio_name in", values, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameNotIn(List<String> values) {
            addCriterion("studio_name not in", values, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameBetween(String value1, String value2) {
            addCriterion("studio_name between", value1, value2, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_nameNotBetween(String value1, String value2) {
            addCriterion("studio_name not between", value1, value2, "studio_name");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countIsNull() {
            addCriterion("studio_row_count is null");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countIsNotNull() {
            addCriterion("studio_row_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countEqualTo(Integer value) {
            addCriterion("studio_row_count =", value, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countNotEqualTo(Integer value) {
            addCriterion("studio_row_count <>", value, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countGreaterThan(Integer value) {
            addCriterion("studio_row_count >", value, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_row_count >=", value, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countLessThan(Integer value) {
            addCriterion("studio_row_count <", value, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countLessThanOrEqualTo(Integer value) {
            addCriterion("studio_row_count <=", value, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countIn(List<Integer> values) {
            addCriterion("studio_row_count in", values, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countNotIn(List<Integer> values) {
            addCriterion("studio_row_count not in", values, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countBetween(Integer value1, Integer value2) {
            addCriterion("studio_row_count between", value1, value2, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_row_countNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_row_count not between", value1, value2, "studio_row_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countIsNull() {
            addCriterion("studio_col_count is null");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countIsNotNull() {
            addCriterion("studio_col_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countEqualTo(Integer value) {
            addCriterion("studio_col_count =", value, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countNotEqualTo(Integer value) {
            addCriterion("studio_col_count <>", value, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countGreaterThan(Integer value) {
            addCriterion("studio_col_count >", value, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("studio_col_count >=", value, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countLessThan(Integer value) {
            addCriterion("studio_col_count <", value, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countLessThanOrEqualTo(Integer value) {
            addCriterion("studio_col_count <=", value, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countIn(List<Integer> values) {
            addCriterion("studio_col_count in", values, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countNotIn(List<Integer> values) {
            addCriterion("studio_col_count not in", values, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countBetween(Integer value1, Integer value2) {
            addCriterion("studio_col_count between", value1, value2, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_col_countNotBetween(Integer value1, Integer value2) {
            addCriterion("studio_col_count not between", value1, value2, "studio_col_count");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionIsNull() {
            addCriterion("studio_introduction is null");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionIsNotNull() {
            addCriterion("studio_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionEqualTo(String value) {
            addCriterion("studio_introduction =", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionNotEqualTo(String value) {
            addCriterion("studio_introduction <>", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionGreaterThan(String value) {
            addCriterion("studio_introduction >", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionGreaterThanOrEqualTo(String value) {
            addCriterion("studio_introduction >=", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionLessThan(String value) {
            addCriterion("studio_introduction <", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionLessThanOrEqualTo(String value) {
            addCriterion("studio_introduction <=", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionLike(String value) {
            addCriterion("studio_introduction like", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionNotLike(String value) {
            addCriterion("studio_introduction not like", value, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionIn(List<String> values) {
            addCriterion("studio_introduction in", values, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionNotIn(List<String> values) {
            addCriterion("studio_introduction not in", values, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionBetween(String value1, String value2) {
            addCriterion("studio_introduction between", value1, value2, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_introductionNotBetween(String value1, String value2) {
            addCriterion("studio_introduction not between", value1, value2, "studio_introduction");
            return (Criteria) this;
        }

        public Criteria andStudio_flagIsNull() {
            addCriterion("studio_flag is null");
            return (Criteria) this;
        }

        public Criteria andStudio_flagIsNotNull() {
            addCriterion("studio_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStudio_flagEqualTo(Short value) {
            addCriterion("studio_flag =", value, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagNotEqualTo(Short value) {
            addCriterion("studio_flag <>", value, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagGreaterThan(Short value) {
            addCriterion("studio_flag >", value, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagGreaterThanOrEqualTo(Short value) {
            addCriterion("studio_flag >=", value, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagLessThan(Short value) {
            addCriterion("studio_flag <", value, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagLessThanOrEqualTo(Short value) {
            addCriterion("studio_flag <=", value, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagIn(List<Short> values) {
            addCriterion("studio_flag in", values, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagNotIn(List<Short> values) {
            addCriterion("studio_flag not in", values, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagBetween(Short value1, Short value2) {
            addCriterion("studio_flag between", value1, value2, "studio_flag");
            return (Criteria) this;
        }

        public Criteria andStudio_flagNotBetween(Short value1, Short value2) {
            addCriterion("studio_flag not between", value1, value2, "studio_flag");
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