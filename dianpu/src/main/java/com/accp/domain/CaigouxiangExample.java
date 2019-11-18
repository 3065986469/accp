package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CaigouxiangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaigouxiangExample() {
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

        public Criteria andCgxidIsNull() {
            addCriterion("cgxid is null");
            return (Criteria) this;
        }

        public Criteria andCgxidIsNotNull() {
            addCriterion("cgxid is not null");
            return (Criteria) this;
        }

        public Criteria andCgxidEqualTo(Integer value) {
            addCriterion("cgxid =", value, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidNotEqualTo(Integer value) {
            addCriterion("cgxid <>", value, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidGreaterThan(Integer value) {
            addCriterion("cgxid >", value, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgxid >=", value, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidLessThan(Integer value) {
            addCriterion("cgxid <", value, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidLessThanOrEqualTo(Integer value) {
            addCriterion("cgxid <=", value, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidIn(List<Integer> values) {
            addCriterion("cgxid in", values, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidNotIn(List<Integer> values) {
            addCriterion("cgxid not in", values, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidBetween(Integer value1, Integer value2) {
            addCriterion("cgxid between", value1, value2, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgxidNotBetween(Integer value1, Integer value2) {
            addCriterion("cgxid not between", value1, value2, "cgxid");
            return (Criteria) this;
        }

        public Criteria andCgidIsNull() {
            addCriterion("cgid is null");
            return (Criteria) this;
        }

        public Criteria andCgidIsNotNull() {
            addCriterion("cgid is not null");
            return (Criteria) this;
        }

        public Criteria andCgidEqualTo(Integer value) {
            addCriterion("cgid =", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotEqualTo(Integer value) {
            addCriterion("cgid <>", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidGreaterThan(Integer value) {
            addCriterion("cgid >", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgid >=", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLessThan(Integer value) {
            addCriterion("cgid <", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLessThanOrEqualTo(Integer value) {
            addCriterion("cgid <=", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidIn(List<Integer> values) {
            addCriterion("cgid in", values, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotIn(List<Integer> values) {
            addCriterion("cgid not in", values, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidBetween(Integer value1, Integer value2) {
            addCriterion("cgid between", value1, value2, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotBetween(Integer value1, Integer value2) {
            addCriterion("cgid not between", value1, value2, "cgid");
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

        public Criteria andSpidEqualTo(Integer value) {
            addCriterion("spid =", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotEqualTo(Integer value) {
            addCriterion("spid <>", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThan(Integer value) {
            addCriterion("spid >", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spid >=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThan(Integer value) {
            addCriterion("spid <", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThanOrEqualTo(Integer value) {
            addCriterion("spid <=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidIn(List<Integer> values) {
            addCriterion("spid in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotIn(List<Integer> values) {
            addCriterion("spid not in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidBetween(Integer value1, Integer value2) {
            addCriterion("spid between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotBetween(Integer value1, Integer value2) {
            addCriterion("spid not between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpnoIsNull() {
            addCriterion("spno is null");
            return (Criteria) this;
        }

        public Criteria andSpnoIsNotNull() {
            addCriterion("spno is not null");
            return (Criteria) this;
        }

        public Criteria andSpnoEqualTo(String value) {
            addCriterion("spno =", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoNotEqualTo(String value) {
            addCriterion("spno <>", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoGreaterThan(String value) {
            addCriterion("spno >", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoGreaterThanOrEqualTo(String value) {
            addCriterion("spno >=", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoLessThan(String value) {
            addCriterion("spno <", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoLessThanOrEqualTo(String value) {
            addCriterion("spno <=", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoLike(String value) {
            addCriterion("spno like", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoNotLike(String value) {
            addCriterion("spno not like", value, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoIn(List<String> values) {
            addCriterion("spno in", values, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoNotIn(List<String> values) {
            addCriterion("spno not in", values, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoBetween(String value1, String value2) {
            addCriterion("spno between", value1, value2, "spno");
            return (Criteria) this;
        }

        public Criteria andSpnoNotBetween(String value1, String value2) {
            addCriterion("spno not between", value1, value2, "spno");
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

        public Criteria andCcidIsNull() {
            addCriterion("ccid is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccid is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(Integer value) {
            addCriterion("ccid =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(Integer value) {
            addCriterion("ccid <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(Integer value) {
            addCriterion("ccid >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccid >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(Integer value) {
            addCriterion("ccid <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(Integer value) {
            addCriterion("ccid <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<Integer> values) {
            addCriterion("ccid in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<Integer> values) {
            addCriterion("ccid not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(Integer value1, Integer value2) {
            addCriterion("ccid between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(Integer value1, Integer value2) {
            addCriterion("ccid not between", value1, value2, "ccid");
            return (Criteria) this;
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

        public Criteria andCgxchengbenIsNull() {
            addCriterion("cgxchengben is null");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenIsNotNull() {
            addCriterion("cgxchengben is not null");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenEqualTo(Float value) {
            addCriterion("cgxchengben =", value, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenNotEqualTo(Float value) {
            addCriterion("cgxchengben <>", value, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenGreaterThan(Float value) {
            addCriterion("cgxchengben >", value, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenGreaterThanOrEqualTo(Float value) {
            addCriterion("cgxchengben >=", value, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenLessThan(Float value) {
            addCriterion("cgxchengben <", value, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenLessThanOrEqualTo(Float value) {
            addCriterion("cgxchengben <=", value, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenIn(List<Float> values) {
            addCriterion("cgxchengben in", values, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenNotIn(List<Float> values) {
            addCriterion("cgxchengben not in", values, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenBetween(Float value1, Float value2) {
            addCriterion("cgxchengben between", value1, value2, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxchengbenNotBetween(Float value1, Float value2) {
            addCriterion("cgxchengben not between", value1, value2, "cgxchengben");
            return (Criteria) this;
        }

        public Criteria andCgxcountIsNull() {
            addCriterion("cgxcount is null");
            return (Criteria) this;
        }

        public Criteria andCgxcountIsNotNull() {
            addCriterion("cgxcount is not null");
            return (Criteria) this;
        }

        public Criteria andCgxcountEqualTo(Integer value) {
            addCriterion("cgxcount =", value, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountNotEqualTo(Integer value) {
            addCriterion("cgxcount <>", value, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountGreaterThan(Integer value) {
            addCriterion("cgxcount >", value, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgxcount >=", value, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountLessThan(Integer value) {
            addCriterion("cgxcount <", value, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountLessThanOrEqualTo(Integer value) {
            addCriterion("cgxcount <=", value, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountIn(List<Integer> values) {
            addCriterion("cgxcount in", values, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountNotIn(List<Integer> values) {
            addCriterion("cgxcount not in", values, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountBetween(Integer value1, Integer value2) {
            addCriterion("cgxcount between", value1, value2, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxcountNotBetween(Integer value1, Integer value2) {
            addCriterion("cgxcount not between", value1, value2, "cgxcount");
            return (Criteria) this;
        }

        public Criteria andCgxpriceIsNull() {
            addCriterion("cgxprice is null");
            return (Criteria) this;
        }

        public Criteria andCgxpriceIsNotNull() {
            addCriterion("cgxprice is not null");
            return (Criteria) this;
        }

        public Criteria andCgxpriceEqualTo(Float value) {
            addCriterion("cgxprice =", value, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceNotEqualTo(Float value) {
            addCriterion("cgxprice <>", value, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceGreaterThan(Float value) {
            addCriterion("cgxprice >", value, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cgxprice >=", value, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceLessThan(Float value) {
            addCriterion("cgxprice <", value, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceLessThanOrEqualTo(Float value) {
            addCriterion("cgxprice <=", value, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceIn(List<Float> values) {
            addCriterion("cgxprice in", values, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceNotIn(List<Float> values) {
            addCriterion("cgxprice not in", values, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceBetween(Float value1, Float value2) {
            addCriterion("cgxprice between", value1, value2, "cgxprice");
            return (Criteria) this;
        }

        public Criteria andCgxpriceNotBetween(Float value1, Float value2) {
            addCriterion("cgxprice not between", value1, value2, "cgxprice");
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