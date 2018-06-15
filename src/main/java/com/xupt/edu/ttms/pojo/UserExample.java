package com.xupt.edu.ttms.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andEmp_noIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmp_noIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_noEqualTo(String value) {
            addCriterion("emp_no =", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noGreaterThan(String value) {
            addCriterion("emp_no >", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noLessThan(String value) {
            addCriterion("emp_no <", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noLike(String value) {
            addCriterion("emp_no like", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noNotLike(String value) {
            addCriterion("emp_no not like", value, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noIn(List<String> values) {
            addCriterion("emp_no in", values, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_noNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "emp_no");
            return (Criteria) this;
        }

        public Criteria andEmp_passIsNull() {
            addCriterion("emp_pass is null");
            return (Criteria) this;
        }

        public Criteria andEmp_passIsNotNull() {
            addCriterion("emp_pass is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_passEqualTo(String value) {
            addCriterion("emp_pass =", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passNotEqualTo(String value) {
            addCriterion("emp_pass <>", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passGreaterThan(String value) {
            addCriterion("emp_pass >", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passGreaterThanOrEqualTo(String value) {
            addCriterion("emp_pass >=", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passLessThan(String value) {
            addCriterion("emp_pass <", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passLessThanOrEqualTo(String value) {
            addCriterion("emp_pass <=", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passLike(String value) {
            addCriterion("emp_pass like", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passNotLike(String value) {
            addCriterion("emp_pass not like", value, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passIn(List<String> values) {
            addCriterion("emp_pass in", values, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passNotIn(List<String> values) {
            addCriterion("emp_pass not in", values, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passBetween(String value1, String value2) {
            addCriterion("emp_pass between", value1, value2, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andEmp_passNotBetween(String value1, String value2) {
            addCriterion("emp_pass not between", value1, value2, "emp_pass");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andHead_pathIsNull() {
            addCriterion("head_path is null");
            return (Criteria) this;
        }

        public Criteria andHead_pathIsNotNull() {
            addCriterion("head_path is not null");
            return (Criteria) this;
        }

        public Criteria andHead_pathEqualTo(String value) {
            addCriterion("head_path =", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathNotEqualTo(String value) {
            addCriterion("head_path <>", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathGreaterThan(String value) {
            addCriterion("head_path >", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathGreaterThanOrEqualTo(String value) {
            addCriterion("head_path >=", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathLessThan(String value) {
            addCriterion("head_path <", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathLessThanOrEqualTo(String value) {
            addCriterion("head_path <=", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathLike(String value) {
            addCriterion("head_path like", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathNotLike(String value) {
            addCriterion("head_path not like", value, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathIn(List<String> values) {
            addCriterion("head_path in", values, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathNotIn(List<String> values) {
            addCriterion("head_path not in", values, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathBetween(String value1, String value2) {
            addCriterion("head_path between", value1, value2, "head_path");
            return (Criteria) this;
        }

        public Criteria andHead_pathNotBetween(String value1, String value2) {
            addCriterion("head_path not between", value1, value2, "head_path");
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