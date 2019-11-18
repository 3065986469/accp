package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class YanseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YanseExample() {
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

        public Criteria andYsidIsNull() {
            addCriterion("ysid is null");
            return (Criteria) this;
        }

        public Criteria andYsidIsNotNull() {
            addCriterion("ysid is not null");
            return (Criteria) this;
        }

        public Criteria andYsidEqualTo(Integer value) {
            addCriterion("ysid =", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidNotEqualTo(Integer value) {
            addCriterion("ysid <>", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidGreaterThan(Integer value) {
            addCriterion("ysid >", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ysid >=", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidLessThan(Integer value) {
            addCriterion("ysid <", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidLessThanOrEqualTo(Integer value) {
            addCriterion("ysid <=", value, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidIn(List<Integer> values) {
            addCriterion("ysid in", values, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidNotIn(List<Integer> values) {
            addCriterion("ysid not in", values, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidBetween(Integer value1, Integer value2) {
            addCriterion("ysid between", value1, value2, "ysid");
            return (Criteria) this;
        }

        public Criteria andYsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ysid not between", value1, value2, "ysid");
            return (Criteria) this;
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

        public Criteria andYsnameIsNull() {
            addCriterion("ysname is null");
            return (Criteria) this;
        }

        public Criteria andYsnameIsNotNull() {
            addCriterion("ysname is not null");
            return (Criteria) this;
        }

        public Criteria andYsnameEqualTo(String value) {
            addCriterion("ysname =", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameNotEqualTo(String value) {
            addCriterion("ysname <>", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameGreaterThan(String value) {
            addCriterion("ysname >", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameGreaterThanOrEqualTo(String value) {
            addCriterion("ysname >=", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameLessThan(String value) {
            addCriterion("ysname <", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameLessThanOrEqualTo(String value) {
            addCriterion("ysname <=", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameLike(String value) {
            addCriterion("ysname like", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameNotLike(String value) {
            addCriterion("ysname not like", value, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameIn(List<String> values) {
            addCriterion("ysname in", values, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameNotIn(List<String> values) {
            addCriterion("ysname not in", values, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameBetween(String value1, String value2) {
            addCriterion("ysname between", value1, value2, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsnameNotBetween(String value1, String value2) {
            addCriterion("ysname not between", value1, value2, "ysname");
            return (Criteria) this;
        }

        public Criteria andYsimgIsNull() {
            addCriterion("ysimg is null");
            return (Criteria) this;
        }

        public Criteria andYsimgIsNotNull() {
            addCriterion("ysimg is not null");
            return (Criteria) this;
        }

        public Criteria andYsimgEqualTo(String value) {
            addCriterion("ysimg =", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgNotEqualTo(String value) {
            addCriterion("ysimg <>", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgGreaterThan(String value) {
            addCriterion("ysimg >", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgGreaterThanOrEqualTo(String value) {
            addCriterion("ysimg >=", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgLessThan(String value) {
            addCriterion("ysimg <", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgLessThanOrEqualTo(String value) {
            addCriterion("ysimg <=", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgLike(String value) {
            addCriterion("ysimg like", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgNotLike(String value) {
            addCriterion("ysimg not like", value, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgIn(List<String> values) {
            addCriterion("ysimg in", values, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgNotIn(List<String> values) {
            addCriterion("ysimg not in", values, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgBetween(String value1, String value2) {
            addCriterion("ysimg between", value1, value2, "ysimg");
            return (Criteria) this;
        }

        public Criteria andYsimgNotBetween(String value1, String value2) {
            addCriterion("ysimg not between", value1, value2, "ysimg");
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