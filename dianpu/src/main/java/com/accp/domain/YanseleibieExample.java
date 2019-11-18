package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class YanseleibieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YanseleibieExample() {
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

        public Criteria andYslbidIsNull() {
            addCriterion("yslbid is null");
            return (Criteria) this;
        }

        public Criteria andYslbidIsNotNull() {
            addCriterion("yslbid is not null");
            return (Criteria) this;
        }

        public Criteria andYslbidEqualTo(Integer value) {
            addCriterion("yslbid =", value, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidNotEqualTo(Integer value) {
            addCriterion("yslbid <>", value, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidGreaterThan(Integer value) {
            addCriterion("yslbid >", value, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yslbid >=", value, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidLessThan(Integer value) {
            addCriterion("yslbid <", value, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidLessThanOrEqualTo(Integer value) {
            addCriterion("yslbid <=", value, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidIn(List<Integer> values) {
            addCriterion("yslbid in", values, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidNotIn(List<Integer> values) {
            addCriterion("yslbid not in", values, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidBetween(Integer value1, Integer value2) {
            addCriterion("yslbid between", value1, value2, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbidNotBetween(Integer value1, Integer value2) {
            addCriterion("yslbid not between", value1, value2, "yslbid");
            return (Criteria) this;
        }

        public Criteria andYslbtypeIsNull() {
            addCriterion("yslbtype is null");
            return (Criteria) this;
        }

        public Criteria andYslbtypeIsNotNull() {
            addCriterion("yslbtype is not null");
            return (Criteria) this;
        }

        public Criteria andYslbtypeEqualTo(String value) {
            addCriterion("yslbtype =", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeNotEqualTo(String value) {
            addCriterion("yslbtype <>", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeGreaterThan(String value) {
            addCriterion("yslbtype >", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("yslbtype >=", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeLessThan(String value) {
            addCriterion("yslbtype <", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeLessThanOrEqualTo(String value) {
            addCriterion("yslbtype <=", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeLike(String value) {
            addCriterion("yslbtype like", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeNotLike(String value) {
            addCriterion("yslbtype not like", value, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeIn(List<String> values) {
            addCriterion("yslbtype in", values, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeNotIn(List<String> values) {
            addCriterion("yslbtype not in", values, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeBetween(String value1, String value2) {
            addCriterion("yslbtype between", value1, value2, "yslbtype");
            return (Criteria) this;
        }

        public Criteria andYslbtypeNotBetween(String value1, String value2) {
            addCriterion("yslbtype not between", value1, value2, "yslbtype");
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