package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ChengjiaoxiangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChengjiaoxiangExample() {
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

        public Criteria andCjxidIsNull() {
            addCriterion("cjxid is null");
            return (Criteria) this;
        }

        public Criteria andCjxidIsNotNull() {
            addCriterion("cjxid is not null");
            return (Criteria) this;
        }

        public Criteria andCjxidEqualTo(Integer value) {
            addCriterion("cjxid =", value, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidNotEqualTo(Integer value) {
            addCriterion("cjxid <>", value, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidGreaterThan(Integer value) {
            addCriterion("cjxid >", value, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cjxid >=", value, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidLessThan(Integer value) {
            addCriterion("cjxid <", value, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidLessThanOrEqualTo(Integer value) {
            addCriterion("cjxid <=", value, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidIn(List<Integer> values) {
            addCriterion("cjxid in", values, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidNotIn(List<Integer> values) {
            addCriterion("cjxid not in", values, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidBetween(Integer value1, Integer value2) {
            addCriterion("cjxid between", value1, value2, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjxidNotBetween(Integer value1, Integer value2) {
            addCriterion("cjxid not between", value1, value2, "cjxid");
            return (Criteria) this;
        }

        public Criteria andCjnoIsNull() {
            addCriterion("cjno is null");
            return (Criteria) this;
        }

        public Criteria andCjnoIsNotNull() {
            addCriterion("cjno is not null");
            return (Criteria) this;
        }

        public Criteria andCjnoEqualTo(String value) {
            addCriterion("cjno =", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotEqualTo(String value) {
            addCriterion("cjno <>", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoGreaterThan(String value) {
            addCriterion("cjno >", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoGreaterThanOrEqualTo(String value) {
            addCriterion("cjno >=", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoLessThan(String value) {
            addCriterion("cjno <", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoLessThanOrEqualTo(String value) {
            addCriterion("cjno <=", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoLike(String value) {
            addCriterion("cjno like", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotLike(String value) {
            addCriterion("cjno not like", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoIn(List<String> values) {
            addCriterion("cjno in", values, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotIn(List<String> values) {
            addCriterion("cjno not in", values, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoBetween(String value1, String value2) {
            addCriterion("cjno between", value1, value2, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotBetween(String value1, String value2) {
            addCriterion("cjno not between", value1, value2, "cjno");
            return (Criteria) this;
        }

        public Criteria andSpnameIsNull() {
            addCriterion("spname is null");
            return (Criteria) this;
        }

        public Criteria andSpnameIsNotNull() {
            addCriterion("spname is not null");
            return (Criteria) this;
        }

        public Criteria andSpnameEqualTo(String value) {
            addCriterion("spname =", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotEqualTo(String value) {
            addCriterion("spname <>", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameGreaterThan(String value) {
            addCriterion("spname >", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameGreaterThanOrEqualTo(String value) {
            addCriterion("spname >=", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLessThan(String value) {
            addCriterion("spname <", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLessThanOrEqualTo(String value) {
            addCriterion("spname <=", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameLike(String value) {
            addCriterion("spname like", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotLike(String value) {
            addCriterion("spname not like", value, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameIn(List<String> values) {
            addCriterion("spname in", values, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotIn(List<String> values) {
            addCriterion("spname not in", values, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameBetween(String value1, String value2) {
            addCriterion("spname between", value1, value2, "spname");
            return (Criteria) this;
        }

        public Criteria andSpnameNotBetween(String value1, String value2) {
            addCriterion("spname not between", value1, value2, "spname");
            return (Criteria) this;
        }

        public Criteria andCjxnumIsNull() {
            addCriterion("cjxnum is null");
            return (Criteria) this;
        }

        public Criteria andCjxnumIsNotNull() {
            addCriterion("cjxnum is not null");
            return (Criteria) this;
        }

        public Criteria andCjxnumEqualTo(Integer value) {
            addCriterion("cjxnum =", value, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumNotEqualTo(Integer value) {
            addCriterion("cjxnum <>", value, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumGreaterThan(Integer value) {
            addCriterion("cjxnum >", value, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cjxnum >=", value, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumLessThan(Integer value) {
            addCriterion("cjxnum <", value, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumLessThanOrEqualTo(Integer value) {
            addCriterion("cjxnum <=", value, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumIn(List<Integer> values) {
            addCriterion("cjxnum in", values, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumNotIn(List<Integer> values) {
            addCriterion("cjxnum not in", values, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumBetween(Integer value1, Integer value2) {
            addCriterion("cjxnum between", value1, value2, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cjxnum not between", value1, value2, "cjxnum");
            return (Criteria) this;
        }

        public Criteria andCjxpriceIsNull() {
            addCriterion("cjxprice is null");
            return (Criteria) this;
        }

        public Criteria andCjxpriceIsNotNull() {
            addCriterion("cjxprice is not null");
            return (Criteria) this;
        }

        public Criteria andCjxpriceEqualTo(Float value) {
            addCriterion("cjxprice =", value, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceNotEqualTo(Float value) {
            addCriterion("cjxprice <>", value, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceGreaterThan(Float value) {
            addCriterion("cjxprice >", value, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cjxprice >=", value, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceLessThan(Float value) {
            addCriterion("cjxprice <", value, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceLessThanOrEqualTo(Float value) {
            addCriterion("cjxprice <=", value, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceIn(List<Float> values) {
            addCriterion("cjxprice in", values, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceNotIn(List<Float> values) {
            addCriterion("cjxprice not in", values, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceBetween(Float value1, Float value2) {
            addCriterion("cjxprice between", value1, value2, "cjxprice");
            return (Criteria) this;
        }

        public Criteria andCjxpriceNotBetween(Float value1, Float value2) {
            addCriterion("cjxprice not between", value1, value2, "cjxprice");
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