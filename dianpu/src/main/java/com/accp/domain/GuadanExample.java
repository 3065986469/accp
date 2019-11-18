package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GuadanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuadanExample() {
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

        public Criteria andGdidIsNull() {
            addCriterion("gdid is null");
            return (Criteria) this;
        }

        public Criteria andGdidIsNotNull() {
            addCriterion("gdid is not null");
            return (Criteria) this;
        }

        public Criteria andGdidEqualTo(Integer value) {
            addCriterion("gdid =", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotEqualTo(Integer value) {
            addCriterion("gdid <>", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThan(Integer value) {
            addCriterion("gdid >", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdid >=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThan(Integer value) {
            addCriterion("gdid <", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidLessThanOrEqualTo(Integer value) {
            addCriterion("gdid <=", value, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidIn(List<Integer> values) {
            addCriterion("gdid in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotIn(List<Integer> values) {
            addCriterion("gdid not in", values, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidBetween(Integer value1, Integer value2) {
            addCriterion("gdid between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andGdidNotBetween(Integer value1, Integer value2) {
            addCriterion("gdid not between", value1, value2, "gdid");
            return (Criteria) this;
        }

        public Criteria andDdnoIsNull() {
            addCriterion("ddno is null");
            return (Criteria) this;
        }

        public Criteria andDdnoIsNotNull() {
            addCriterion("ddno is not null");
            return (Criteria) this;
        }

        public Criteria andDdnoEqualTo(String value) {
            addCriterion("ddno =", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotEqualTo(String value) {
            addCriterion("ddno <>", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoGreaterThan(String value) {
            addCriterion("ddno >", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoGreaterThanOrEqualTo(String value) {
            addCriterion("ddno >=", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoLessThan(String value) {
            addCriterion("ddno <", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoLessThanOrEqualTo(String value) {
            addCriterion("ddno <=", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoLike(String value) {
            addCriterion("ddno like", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotLike(String value) {
            addCriterion("ddno not like", value, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoIn(List<String> values) {
            addCriterion("ddno in", values, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotIn(List<String> values) {
            addCriterion("ddno not in", values, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoBetween(String value1, String value2) {
            addCriterion("ddno between", value1, value2, "ddno");
            return (Criteria) this;
        }

        public Criteria andDdnoNotBetween(String value1, String value2) {
            addCriterion("ddno not between", value1, value2, "ddno");
            return (Criteria) this;
        }

        public Criteria andSpidIsNull() {
            addCriterion("spid is null");
            return (Criteria) this;
        }

        public Criteria andSpidIsNotNull() {
            addCriterion("spid is not null");
            return (Criteria) this;
        }

        public Criteria andSpidEqualTo(String value) {
            addCriterion("spid =", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotEqualTo(String value) {
            addCriterion("spid <>", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThan(String value) {
            addCriterion("spid >", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThanOrEqualTo(String value) {
            addCriterion("spid >=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThan(String value) {
            addCriterion("spid <", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThanOrEqualTo(String value) {
            addCriterion("spid <=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLike(String value) {
            addCriterion("spid like", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotLike(String value) {
            addCriterion("spid not like", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidIn(List<String> values) {
            addCriterion("spid in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotIn(List<String> values) {
            addCriterion("spid not in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidBetween(String value1, String value2) {
            addCriterion("spid between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotBetween(String value1, String value2) {
            addCriterion("spid not between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpnumIsNull() {
            addCriterion("spnum is null");
            return (Criteria) this;
        }

        public Criteria andSpnumIsNotNull() {
            addCriterion("spnum is not null");
            return (Criteria) this;
        }

        public Criteria andSpnumEqualTo(Integer value) {
            addCriterion("spnum =", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumNotEqualTo(Integer value) {
            addCriterion("spnum <>", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumGreaterThan(Integer value) {
            addCriterion("spnum >", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("spnum >=", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumLessThan(Integer value) {
            addCriterion("spnum <", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumLessThanOrEqualTo(Integer value) {
            addCriterion("spnum <=", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumIn(List<Integer> values) {
            addCriterion("spnum in", values, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumNotIn(List<Integer> values) {
            addCriterion("spnum not in", values, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumBetween(Integer value1, Integer value2) {
            addCriterion("spnum between", value1, value2, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumNotBetween(Integer value1, Integer value2) {
            addCriterion("spnum not between", value1, value2, "spnum");
            return (Criteria) this;
        }

        public Criteria andSppriceIsNull() {
            addCriterion("spprice is null");
            return (Criteria) this;
        }

        public Criteria andSppriceIsNotNull() {
            addCriterion("spprice is not null");
            return (Criteria) this;
        }

        public Criteria andSppriceEqualTo(Float value) {
            addCriterion("spprice =", value, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceNotEqualTo(Float value) {
            addCriterion("spprice <>", value, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceGreaterThan(Float value) {
            addCriterion("spprice >", value, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceGreaterThanOrEqualTo(Float value) {
            addCriterion("spprice >=", value, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceLessThan(Float value) {
            addCriterion("spprice <", value, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceLessThanOrEqualTo(Float value) {
            addCriterion("spprice <=", value, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceIn(List<Float> values) {
            addCriterion("spprice in", values, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceNotIn(List<Float> values) {
            addCriterion("spprice not in", values, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceBetween(Float value1, Float value2) {
            addCriterion("spprice between", value1, value2, "spprice");
            return (Criteria) this;
        }

        public Criteria andSppriceNotBetween(Float value1, Float value2) {
            addCriterion("spprice not between", value1, value2, "spprice");
            return (Criteria) this;
        }

        public Criteria andDpidIsNull() {
            addCriterion("dpid is null");
            return (Criteria) this;
        }

        public Criteria andDpidIsNotNull() {
            addCriterion("dpid is not null");
            return (Criteria) this;
        }

        public Criteria andDpidEqualTo(Integer value) {
            addCriterion("dpid =", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotEqualTo(Integer value) {
            addCriterion("dpid <>", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidGreaterThan(Integer value) {
            addCriterion("dpid >", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dpid >=", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidLessThan(Integer value) {
            addCriterion("dpid <", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidLessThanOrEqualTo(Integer value) {
            addCriterion("dpid <=", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidIn(List<Integer> values) {
            addCriterion("dpid in", values, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotIn(List<Integer> values) {
            addCriterion("dpid not in", values, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidBetween(Integer value1, Integer value2) {
            addCriterion("dpid between", value1, value2, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotBetween(Integer value1, Integer value2) {
            addCriterion("dpid not between", value1, value2, "dpid");
            return (Criteria) this;
        }

        public Criteria andHyidIsNull() {
            addCriterion("hyid is null");
            return (Criteria) this;
        }

        public Criteria andHyidIsNotNull() {
            addCriterion("hyid is not null");
            return (Criteria) this;
        }

        public Criteria andHyidEqualTo(Integer value) {
            addCriterion("hyid =", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidNotEqualTo(Integer value) {
            addCriterion("hyid <>", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidGreaterThan(Integer value) {
            addCriterion("hyid >", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hyid >=", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidLessThan(Integer value) {
            addCriterion("hyid <", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidLessThanOrEqualTo(Integer value) {
            addCriterion("hyid <=", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidIn(List<Integer> values) {
            addCriterion("hyid in", values, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidNotIn(List<Integer> values) {
            addCriterion("hyid not in", values, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidBetween(Integer value1, Integer value2) {
            addCriterion("hyid between", value1, value2, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidNotBetween(Integer value1, Integer value2) {
            addCriterion("hyid not between", value1, value2, "hyid");
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