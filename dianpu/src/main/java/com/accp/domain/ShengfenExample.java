package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShengfenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShengfenExample() {
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

        public Criteria andSfidIsNull() {
            addCriterion("sfid is null");
            return (Criteria) this;
        }

        public Criteria andSfidIsNotNull() {
            addCriterion("sfid is not null");
            return (Criteria) this;
        }

        public Criteria andSfidEqualTo(Integer value) {
            addCriterion("sfid =", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotEqualTo(Integer value) {
            addCriterion("sfid <>", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThan(Integer value) {
            addCriterion("sfid >", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sfid >=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThan(Integer value) {
            addCriterion("sfid <", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidLessThanOrEqualTo(Integer value) {
            addCriterion("sfid <=", value, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidIn(List<Integer> values) {
            addCriterion("sfid in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotIn(List<Integer> values) {
            addCriterion("sfid not in", values, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidBetween(Integer value1, Integer value2) {
            addCriterion("sfid between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfidNotBetween(Integer value1, Integer value2) {
            addCriterion("sfid not between", value1, value2, "sfid");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNull() {
            addCriterion("sfNAME is null");
            return (Criteria) this;
        }

        public Criteria andSfnameIsNotNull() {
            addCriterion("sfNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSfnameEqualTo(String value) {
            addCriterion("sfNAME =", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotEqualTo(String value) {
            addCriterion("sfNAME <>", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThan(String value) {
            addCriterion("sfNAME >", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameGreaterThanOrEqualTo(String value) {
            addCriterion("sfNAME >=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThan(String value) {
            addCriterion("sfNAME <", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLessThanOrEqualTo(String value) {
            addCriterion("sfNAME <=", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameLike(String value) {
            addCriterion("sfNAME like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotLike(String value) {
            addCriterion("sfNAME not like", value, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameIn(List<String> values) {
            addCriterion("sfNAME in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotIn(List<String> values) {
            addCriterion("sfNAME not in", values, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameBetween(String value1, String value2) {
            addCriterion("sfNAME between", value1, value2, "sfname");
            return (Criteria) this;
        }

        public Criteria andSfnameNotBetween(String value1, String value2) {
            addCriterion("sfNAME not between", value1, value2, "sfname");
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