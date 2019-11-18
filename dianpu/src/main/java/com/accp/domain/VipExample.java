package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andDjidIsNull() {
            addCriterion("djid is null");
            return (Criteria) this;
        }

        public Criteria andDjidIsNotNull() {
            addCriterion("djid is not null");
            return (Criteria) this;
        }

        public Criteria andDjidEqualTo(Integer value) {
            addCriterion("djid =", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotEqualTo(Integer value) {
            addCriterion("djid <>", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidGreaterThan(Integer value) {
            addCriterion("djid >", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("djid >=", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidLessThan(Integer value) {
            addCriterion("djid <", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidLessThanOrEqualTo(Integer value) {
            addCriterion("djid <=", value, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidIn(List<Integer> values) {
            addCriterion("djid in", values, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotIn(List<Integer> values) {
            addCriterion("djid not in", values, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidBetween(Integer value1, Integer value2) {
            addCriterion("djid between", value1, value2, "djid");
            return (Criteria) this;
        }

        public Criteria andDjidNotBetween(Integer value1, Integer value2) {
            addCriterion("djid not between", value1, value2, "djid");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vname is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vname is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vname =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vname <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vname >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vname >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vname <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vname <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vname like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vname not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vname in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vname not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vname between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vname not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVphoneIsNull() {
            addCriterion("vphone is null");
            return (Criteria) this;
        }

        public Criteria andVphoneIsNotNull() {
            addCriterion("vphone is not null");
            return (Criteria) this;
        }

        public Criteria andVphoneEqualTo(String value) {
            addCriterion("vphone =", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotEqualTo(String value) {
            addCriterion("vphone <>", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneGreaterThan(String value) {
            addCriterion("vphone >", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneGreaterThanOrEqualTo(String value) {
            addCriterion("vphone >=", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneLessThan(String value) {
            addCriterion("vphone <", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneLessThanOrEqualTo(String value) {
            addCriterion("vphone <=", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneLike(String value) {
            addCriterion("vphone like", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotLike(String value) {
            addCriterion("vphone not like", value, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneIn(List<String> values) {
            addCriterion("vphone in", values, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotIn(List<String> values) {
            addCriterion("vphone not in", values, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneBetween(String value1, String value2) {
            addCriterion("vphone between", value1, value2, "vphone");
            return (Criteria) this;
        }

        public Criteria andVphoneNotBetween(String value1, String value2) {
            addCriterion("vphone not between", value1, value2, "vphone");
            return (Criteria) this;
        }

        public Criteria andVyueIsNull() {
            addCriterion("vyue is null");
            return (Criteria) this;
        }

        public Criteria andVyueIsNotNull() {
            addCriterion("vyue is not null");
            return (Criteria) this;
        }

        public Criteria andVyueEqualTo(Float value) {
            addCriterion("vyue =", value, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueNotEqualTo(Float value) {
            addCriterion("vyue <>", value, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueGreaterThan(Float value) {
            addCriterion("vyue >", value, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueGreaterThanOrEqualTo(Float value) {
            addCriterion("vyue >=", value, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueLessThan(Float value) {
            addCriterion("vyue <", value, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueLessThanOrEqualTo(Float value) {
            addCriterion("vyue <=", value, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueIn(List<Float> values) {
            addCriterion("vyue in", values, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueNotIn(List<Float> values) {
            addCriterion("vyue not in", values, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueBetween(Float value1, Float value2) {
            addCriterion("vyue between", value1, value2, "vyue");
            return (Criteria) this;
        }

        public Criteria andVyueNotBetween(Float value1, Float value2) {
            addCriterion("vyue not between", value1, value2, "vyue");
            return (Criteria) this;
        }

        public Criteria andVjifenIsNull() {
            addCriterion("vjifen is null");
            return (Criteria) this;
        }

        public Criteria andVjifenIsNotNull() {
            addCriterion("vjifen is not null");
            return (Criteria) this;
        }

        public Criteria andVjifenEqualTo(Integer value) {
            addCriterion("vjifen =", value, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenNotEqualTo(Integer value) {
            addCriterion("vjifen <>", value, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenGreaterThan(Integer value) {
            addCriterion("vjifen >", value, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("vjifen >=", value, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenLessThan(Integer value) {
            addCriterion("vjifen <", value, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenLessThanOrEqualTo(Integer value) {
            addCriterion("vjifen <=", value, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenIn(List<Integer> values) {
            addCriterion("vjifen in", values, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenNotIn(List<Integer> values) {
            addCriterion("vjifen not in", values, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenBetween(Integer value1, Integer value2) {
            addCriterion("vjifen between", value1, value2, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVjifenNotBetween(Integer value1, Integer value2) {
            addCriterion("vjifen not between", value1, value2, "vjifen");
            return (Criteria) this;
        }

        public Criteria andVpwdIsNull() {
            addCriterion("vpwd is null");
            return (Criteria) this;
        }

        public Criteria andVpwdIsNotNull() {
            addCriterion("vpwd is not null");
            return (Criteria) this;
        }

        public Criteria andVpwdEqualTo(String value) {
            addCriterion("vpwd =", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotEqualTo(String value) {
            addCriterion("vpwd <>", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdGreaterThan(String value) {
            addCriterion("vpwd >", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdGreaterThanOrEqualTo(String value) {
            addCriterion("vpwd >=", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdLessThan(String value) {
            addCriterion("vpwd <", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdLessThanOrEqualTo(String value) {
            addCriterion("vpwd <=", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdLike(String value) {
            addCriterion("vpwd like", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotLike(String value) {
            addCriterion("vpwd not like", value, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdIn(List<String> values) {
            addCriterion("vpwd in", values, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotIn(List<String> values) {
            addCriterion("vpwd not in", values, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdBetween(String value1, String value2) {
            addCriterion("vpwd between", value1, value2, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVpwdNotBetween(String value1, String value2) {
            addCriterion("vpwd not between", value1, value2, "vpwd");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNull() {
            addCriterion("vaddress is null");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNotNull() {
            addCriterion("vaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVaddressEqualTo(String value) {
            addCriterion("vaddress =", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotEqualTo(String value) {
            addCriterion("vaddress <>", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThan(String value) {
            addCriterion("vaddress >", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vaddress >=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThan(String value) {
            addCriterion("vaddress <", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThanOrEqualTo(String value) {
            addCriterion("vaddress <=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLike(String value) {
            addCriterion("vaddress like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotLike(String value) {
            addCriterion("vaddress not like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressIn(List<String> values) {
            addCriterion("vaddress in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotIn(List<String> values) {
            addCriterion("vaddress not in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressBetween(String value1, String value2) {
            addCriterion("vaddress between", value1, value2, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotBetween(String value1, String value2) {
            addCriterion("vaddress not between", value1, value2, "vaddress");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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