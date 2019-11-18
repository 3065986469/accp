package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DianpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DianpuExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andDpidEqualTo(String value) {
            addCriterion("dpid =", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotEqualTo(String value) {
            addCriterion("dpid <>", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidGreaterThan(String value) {
            addCriterion("dpid >", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidGreaterThanOrEqualTo(String value) {
            addCriterion("dpid >=", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidLessThan(String value) {
            addCriterion("dpid <", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidLessThanOrEqualTo(String value) {
            addCriterion("dpid <=", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidLike(String value) {
            addCriterion("dpid like", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotLike(String value) {
            addCriterion("dpid not like", value, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidIn(List<String> values) {
            addCriterion("dpid in", values, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotIn(List<String> values) {
            addCriterion("dpid not in", values, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidBetween(String value1, String value2) {
            addCriterion("dpid between", value1, value2, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpidNotBetween(String value1, String value2) {
            addCriterion("dpid not between", value1, value2, "dpid");
            return (Criteria) this;
        }

        public Criteria andDpnameIsNull() {
            addCriterion("dpname is null");
            return (Criteria) this;
        }

        public Criteria andDpnameIsNotNull() {
            addCriterion("dpname is not null");
            return (Criteria) this;
        }

        public Criteria andDpnameEqualTo(String value) {
            addCriterion("dpname =", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotEqualTo(String value) {
            addCriterion("dpname <>", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameGreaterThan(String value) {
            addCriterion("dpname >", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameGreaterThanOrEqualTo(String value) {
            addCriterion("dpname >=", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameLessThan(String value) {
            addCriterion("dpname <", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameLessThanOrEqualTo(String value) {
            addCriterion("dpname <=", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameLike(String value) {
            addCriterion("dpname like", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotLike(String value) {
            addCriterion("dpname not like", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameIn(List<String> values) {
            addCriterion("dpname in", values, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotIn(List<String> values) {
            addCriterion("dpname not in", values, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameBetween(String value1, String value2) {
            addCriterion("dpname between", value1, value2, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotBetween(String value1, String value2) {
            addCriterion("dpname not between", value1, value2, "dpname");
            return (Criteria) this;
        }

        public Criteria andDplianxirenIsNull() {
            addCriterion("dplianxiren is null");
            return (Criteria) this;
        }

        public Criteria andDplianxirenIsNotNull() {
            addCriterion("dplianxiren is not null");
            return (Criteria) this;
        }

        public Criteria andDplianxirenEqualTo(String value) {
            addCriterion("dplianxiren =", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenNotEqualTo(String value) {
            addCriterion("dplianxiren <>", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenGreaterThan(String value) {
            addCriterion("dplianxiren >", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenGreaterThanOrEqualTo(String value) {
            addCriterion("dplianxiren >=", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenLessThan(String value) {
            addCriterion("dplianxiren <", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenLessThanOrEqualTo(String value) {
            addCriterion("dplianxiren <=", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenLike(String value) {
            addCriterion("dplianxiren like", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenNotLike(String value) {
            addCriterion("dplianxiren not like", value, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenIn(List<String> values) {
            addCriterion("dplianxiren in", values, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenNotIn(List<String> values) {
            addCriterion("dplianxiren not in", values, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenBetween(String value1, String value2) {
            addCriterion("dplianxiren between", value1, value2, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDplianxirenNotBetween(String value1, String value2) {
            addCriterion("dplianxiren not between", value1, value2, "dplianxiren");
            return (Criteria) this;
        }

        public Criteria andDpphoneIsNull() {
            addCriterion("dpphone is null");
            return (Criteria) this;
        }

        public Criteria andDpphoneIsNotNull() {
            addCriterion("dpphone is not null");
            return (Criteria) this;
        }

        public Criteria andDpphoneEqualTo(String value) {
            addCriterion("dpphone =", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneNotEqualTo(String value) {
            addCriterion("dpphone <>", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneGreaterThan(String value) {
            addCriterion("dpphone >", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneGreaterThanOrEqualTo(String value) {
            addCriterion("dpphone >=", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneLessThan(String value) {
            addCriterion("dpphone <", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneLessThanOrEqualTo(String value) {
            addCriterion("dpphone <=", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneLike(String value) {
            addCriterion("dpphone like", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneNotLike(String value) {
            addCriterion("dpphone not like", value, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneIn(List<String> values) {
            addCriterion("dpphone in", values, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneNotIn(List<String> values) {
            addCriterion("dpphone not in", values, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneBetween(String value1, String value2) {
            addCriterion("dpphone between", value1, value2, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpphoneNotBetween(String value1, String value2) {
            addCriterion("dpphone not between", value1, value2, "dpphone");
            return (Criteria) this;
        }

        public Criteria andDpaddressIsNull() {
            addCriterion("dpaddress is null");
            return (Criteria) this;
        }

        public Criteria andDpaddressIsNotNull() {
            addCriterion("dpaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDpaddressEqualTo(String value) {
            addCriterion("dpaddress =", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressNotEqualTo(String value) {
            addCriterion("dpaddress <>", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressGreaterThan(String value) {
            addCriterion("dpaddress >", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("dpaddress >=", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressLessThan(String value) {
            addCriterion("dpaddress <", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressLessThanOrEqualTo(String value) {
            addCriterion("dpaddress <=", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressLike(String value) {
            addCriterion("dpaddress like", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressNotLike(String value) {
            addCriterion("dpaddress not like", value, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressIn(List<String> values) {
            addCriterion("dpaddress in", values, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressNotIn(List<String> values) {
            addCriterion("dpaddress not in", values, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressBetween(String value1, String value2) {
            addCriterion("dpaddress between", value1, value2, "dpaddress");
            return (Criteria) this;
        }

        public Criteria andDpaddressNotBetween(String value1, String value2) {
            addCriterion("dpaddress not between", value1, value2, "dpaddress");
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