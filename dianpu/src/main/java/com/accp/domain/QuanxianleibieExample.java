package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class QuanxianleibieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuanxianleibieExample() {
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

        public Criteria andQxlbIsNull() {
            addCriterion("qxlb is null");
            return (Criteria) this;
        }

        public Criteria andQxlbIsNotNull() {
            addCriterion("qxlb is not null");
            return (Criteria) this;
        }

        public Criteria andQxlbEqualTo(Integer value) {
            addCriterion("qxlb =", value, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbNotEqualTo(Integer value) {
            addCriterion("qxlb <>", value, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbGreaterThan(Integer value) {
            addCriterion("qxlb >", value, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbGreaterThanOrEqualTo(Integer value) {
            addCriterion("qxlb >=", value, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbLessThan(Integer value) {
            addCriterion("qxlb <", value, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbLessThanOrEqualTo(Integer value) {
            addCriterion("qxlb <=", value, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbIn(List<Integer> values) {
            addCriterion("qxlb in", values, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbNotIn(List<Integer> values) {
            addCriterion("qxlb not in", values, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbBetween(Integer value1, Integer value2) {
            addCriterion("qxlb between", value1, value2, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxlbNotBetween(Integer value1, Integer value2) {
            addCriterion("qxlb not between", value1, value2, "qxlb");
            return (Criteria) this;
        }

        public Criteria andQxnameIsNull() {
            addCriterion("qxname is null");
            return (Criteria) this;
        }

        public Criteria andQxnameIsNotNull() {
            addCriterion("qxname is not null");
            return (Criteria) this;
        }

        public Criteria andQxnameEqualTo(String value) {
            addCriterion("qxname =", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotEqualTo(String value) {
            addCriterion("qxname <>", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameGreaterThan(String value) {
            addCriterion("qxname >", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameGreaterThanOrEqualTo(String value) {
            addCriterion("qxname >=", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameLessThan(String value) {
            addCriterion("qxname <", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameLessThanOrEqualTo(String value) {
            addCriterion("qxname <=", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameLike(String value) {
            addCriterion("qxname like", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotLike(String value) {
            addCriterion("qxname not like", value, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameIn(List<String> values) {
            addCriterion("qxname in", values, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotIn(List<String> values) {
            addCriterion("qxname not in", values, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameBetween(String value1, String value2) {
            addCriterion("qxname between", value1, value2, "qxname");
            return (Criteria) this;
        }

        public Criteria andQxnameNotBetween(String value1, String value2) {
            addCriterion("qxname not between", value1, value2, "qxname");
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