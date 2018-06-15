package com.xupt.edu.ttms.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmp_nameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmp_nameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_nameEqualTo(String value) {
            addCriterion("emp_name =", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameGreaterThan(String value) {
            addCriterion("emp_name >", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameLessThan(String value) {
            addCriterion("emp_name <", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameLike(String value) {
            addCriterion("emp_name like", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotLike(String value) {
            addCriterion("emp_name not like", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameIn(List<String> values) {
            addCriterion("emp_name in", values, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numIsNull() {
            addCriterion("emp_tel_num is null");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numIsNotNull() {
            addCriterion("emp_tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numEqualTo(String value) {
            addCriterion("emp_tel_num =", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numNotEqualTo(String value) {
            addCriterion("emp_tel_num <>", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numGreaterThan(String value) {
            addCriterion("emp_tel_num >", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numGreaterThanOrEqualTo(String value) {
            addCriterion("emp_tel_num >=", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numLessThan(String value) {
            addCriterion("emp_tel_num <", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numLessThanOrEqualTo(String value) {
            addCriterion("emp_tel_num <=", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numLike(String value) {
            addCriterion("emp_tel_num like", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numNotLike(String value) {
            addCriterion("emp_tel_num not like", value, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numIn(List<String> values) {
            addCriterion("emp_tel_num in", values, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numNotIn(List<String> values) {
            addCriterion("emp_tel_num not in", values, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numBetween(String value1, String value2) {
            addCriterion("emp_tel_num between", value1, value2, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_tel_numNotBetween(String value1, String value2) {
            addCriterion("emp_tel_num not between", value1, value2, "emp_tel_num");
            return (Criteria) this;
        }

        public Criteria andEmp_addrIsNull() {
            addCriterion("emp_addr is null");
            return (Criteria) this;
        }

        public Criteria andEmp_addrIsNotNull() {
            addCriterion("emp_addr is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_addrEqualTo(String value) {
            addCriterion("emp_addr =", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrNotEqualTo(String value) {
            addCriterion("emp_addr <>", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrGreaterThan(String value) {
            addCriterion("emp_addr >", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrGreaterThanOrEqualTo(String value) {
            addCriterion("emp_addr >=", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrLessThan(String value) {
            addCriterion("emp_addr <", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrLessThanOrEqualTo(String value) {
            addCriterion("emp_addr <=", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrLike(String value) {
            addCriterion("emp_addr like", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrNotLike(String value) {
            addCriterion("emp_addr not like", value, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrIn(List<String> values) {
            addCriterion("emp_addr in", values, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrNotIn(List<String> values) {
            addCriterion("emp_addr not in", values, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrBetween(String value1, String value2) {
            addCriterion("emp_addr between", value1, value2, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_addrNotBetween(String value1, String value2) {
            addCriterion("emp_addr not between", value1, value2, "emp_addr");
            return (Criteria) this;
        }

        public Criteria andEmp_emailIsNull() {
            addCriterion("emp_email is null");
            return (Criteria) this;
        }

        public Criteria andEmp_emailIsNotNull() {
            addCriterion("emp_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_emailEqualTo(String value) {
            addCriterion("emp_email =", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailNotEqualTo(String value) {
            addCriterion("emp_email <>", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailGreaterThan(String value) {
            addCriterion("emp_email >", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailGreaterThanOrEqualTo(String value) {
            addCriterion("emp_email >=", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailLessThan(String value) {
            addCriterion("emp_email <", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailLessThanOrEqualTo(String value) {
            addCriterion("emp_email <=", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailLike(String value) {
            addCriterion("emp_email like", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailNotLike(String value) {
            addCriterion("emp_email not like", value, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailIn(List<String> values) {
            addCriterion("emp_email in", values, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailNotIn(List<String> values) {
            addCriterion("emp_email not in", values, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailBetween(String value1, String value2) {
            addCriterion("emp_email between", value1, value2, "emp_email");
            return (Criteria) this;
        }

        public Criteria andEmp_emailNotBetween(String value1, String value2) {
            addCriterion("emp_email not between", value1, value2, "emp_email");
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