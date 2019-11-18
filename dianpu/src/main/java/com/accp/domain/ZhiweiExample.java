package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ZhiweiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhiweiExample() {
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

        public Criteria andZwidIsNull() {
            addCriterion("zwid is null");
            return (Criteria) this;
        }

        public Criteria andZwidIsNotNull() {
            addCriterion("zwid is not null");
            return (Criteria) this;
        }

        public Criteria andZwidEqualTo(Integer value) {
            addCriterion("zwid =", value, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidNotEqualTo(Integer value) {
            addCriterion("zwid <>", value, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidGreaterThan(Integer value) {
            addCriterion("zwid >", value, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zwid >=", value, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidLessThan(Integer value) {
            addCriterion("zwid <", value, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidLessThanOrEqualTo(Integer value) {
            addCriterion("zwid <=", value, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidIn(List<Integer> values) {
            addCriterion("zwid in", values, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidNotIn(List<Integer> values) {
            addCriterion("zwid not in", values, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidBetween(Integer value1, Integer value2) {
            addCriterion("zwid between", value1, value2, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwidNotBetween(Integer value1, Integer value2) {
            addCriterion("zwid not between", value1, value2, "zwid");
            return (Criteria) this;
        }

        public Criteria andZwnameIsNull() {
            addCriterion("zwname is null");
            return (Criteria) this;
        }

        public Criteria andZwnameIsNotNull() {
            addCriterion("zwname is not null");
            return (Criteria) this;
        }

        public Criteria andZwnameEqualTo(String value) {
            addCriterion("zwname =", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameNotEqualTo(String value) {
            addCriterion("zwname <>", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameGreaterThan(String value) {
            addCriterion("zwname >", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameGreaterThanOrEqualTo(String value) {
            addCriterion("zwname >=", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameLessThan(String value) {
            addCriterion("zwname <", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameLessThanOrEqualTo(String value) {
            addCriterion("zwname <=", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameLike(String value) {
            addCriterion("zwname like", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameNotLike(String value) {
            addCriterion("zwname not like", value, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameIn(List<String> values) {
            addCriterion("zwname in", values, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameNotIn(List<String> values) {
            addCriterion("zwname not in", values, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameBetween(String value1, String value2) {
            addCriterion("zwname between", value1, value2, "zwname");
            return (Criteria) this;
        }

        public Criteria andZwnameNotBetween(String value1, String value2) {
            addCriterion("zwname not between", value1, value2, "zwname");
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

        public Criteria andQxidIsNull() {
            addCriterion("qxid is null");
            return (Criteria) this;
        }

        public Criteria andQxidIsNotNull() {
            addCriterion("qxid is not null");
            return (Criteria) this;
        }

        public Criteria andQxidEqualTo(String value) {
            addCriterion("qxid =", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotEqualTo(String value) {
            addCriterion("qxid <>", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidGreaterThan(String value) {
            addCriterion("qxid >", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidGreaterThanOrEqualTo(String value) {
            addCriterion("qxid >=", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidLessThan(String value) {
            addCriterion("qxid <", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidLessThanOrEqualTo(String value) {
            addCriterion("qxid <=", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidLike(String value) {
            addCriterion("qxid like", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotLike(String value) {
            addCriterion("qxid not like", value, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidIn(List<String> values) {
            addCriterion("qxid in", values, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotIn(List<String> values) {
            addCriterion("qxid not in", values, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidBetween(String value1, String value2) {
            addCriterion("qxid between", value1, value2, "qxid");
            return (Criteria) this;
        }

        public Criteria andQxidNotBetween(String value1, String value2) {
            addCriterion("qxid not between", value1, value2, "qxid");
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