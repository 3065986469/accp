package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class YuangongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YuangongExample() {
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

        public Criteria andYgidIsNull() {
            addCriterion("ygid is null");
            return (Criteria) this;
        }

        public Criteria andYgidIsNotNull() {
            addCriterion("ygid is not null");
            return (Criteria) this;
        }

        public Criteria andYgidEqualTo(Integer value) {
            addCriterion("ygid =", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotEqualTo(Integer value) {
            addCriterion("ygid <>", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidGreaterThan(Integer value) {
            addCriterion("ygid >", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ygid >=", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLessThan(Integer value) {
            addCriterion("ygid <", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLessThanOrEqualTo(Integer value) {
            addCriterion("ygid <=", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidIn(List<Integer> values) {
            addCriterion("ygid in", values, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotIn(List<Integer> values) {
            addCriterion("ygid not in", values, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidBetween(Integer value1, Integer value2) {
            addCriterion("ygid between", value1, value2, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotBetween(Integer value1, Integer value2) {
            addCriterion("ygid not between", value1, value2, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgnameIsNull() {
            addCriterion("ygname is null");
            return (Criteria) this;
        }

        public Criteria andYgnameIsNotNull() {
            addCriterion("ygname is not null");
            return (Criteria) this;
        }

        public Criteria andYgnameEqualTo(String value) {
            addCriterion("ygname =", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameNotEqualTo(String value) {
            addCriterion("ygname <>", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameGreaterThan(String value) {
            addCriterion("ygname >", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ygname >=", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameLessThan(String value) {
            addCriterion("ygname <", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameLessThanOrEqualTo(String value) {
            addCriterion("ygname <=", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameLike(String value) {
            addCriterion("ygname like", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameNotLike(String value) {
            addCriterion("ygname not like", value, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameIn(List<String> values) {
            addCriterion("ygname in", values, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameNotIn(List<String> values) {
            addCriterion("ygname not in", values, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameBetween(String value1, String value2) {
            addCriterion("ygname between", value1, value2, "ygname");
            return (Criteria) this;
        }

        public Criteria andYgnameNotBetween(String value1, String value2) {
            addCriterion("ygname not between", value1, value2, "ygname");
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

        public Criteria andYgpwdIsNull() {
            addCriterion("ygpwd is null");
            return (Criteria) this;
        }

        public Criteria andYgpwdIsNotNull() {
            addCriterion("ygpwd is not null");
            return (Criteria) this;
        }

        public Criteria andYgpwdEqualTo(String value) {
            addCriterion("ygpwd =", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdNotEqualTo(String value) {
            addCriterion("ygpwd <>", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdGreaterThan(String value) {
            addCriterion("ygpwd >", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdGreaterThanOrEqualTo(String value) {
            addCriterion("ygpwd >=", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdLessThan(String value) {
            addCriterion("ygpwd <", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdLessThanOrEqualTo(String value) {
            addCriterion("ygpwd <=", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdLike(String value) {
            addCriterion("ygpwd like", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdNotLike(String value) {
            addCriterion("ygpwd not like", value, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdIn(List<String> values) {
            addCriterion("ygpwd in", values, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdNotIn(List<String> values) {
            addCriterion("ygpwd not in", values, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdBetween(String value1, String value2) {
            addCriterion("ygpwd between", value1, value2, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYgpwdNotBetween(String value1, String value2) {
            addCriterion("ygpwd not between", value1, value2, "ygpwd");
            return (Criteria) this;
        }

        public Criteria andYghangyeIsNull() {
            addCriterion("yghangye is null");
            return (Criteria) this;
        }

        public Criteria andYghangyeIsNotNull() {
            addCriterion("yghangye is not null");
            return (Criteria) this;
        }

        public Criteria andYghangyeEqualTo(String value) {
            addCriterion("yghangye =", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeNotEqualTo(String value) {
            addCriterion("yghangye <>", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeGreaterThan(String value) {
            addCriterion("yghangye >", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeGreaterThanOrEqualTo(String value) {
            addCriterion("yghangye >=", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeLessThan(String value) {
            addCriterion("yghangye <", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeLessThanOrEqualTo(String value) {
            addCriterion("yghangye <=", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeLike(String value) {
            addCriterion("yghangye like", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeNotLike(String value) {
            addCriterion("yghangye not like", value, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeIn(List<String> values) {
            addCriterion("yghangye in", values, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeNotIn(List<String> values) {
            addCriterion("yghangye not in", values, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeBetween(String value1, String value2) {
            addCriterion("yghangye between", value1, value2, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYghangyeNotBetween(String value1, String value2) {
            addCriterion("yghangye not between", value1, value2, "yghangye");
            return (Criteria) this;
        }

        public Criteria andYgimgIsNull() {
            addCriterion("ygimg is null");
            return (Criteria) this;
        }

        public Criteria andYgimgIsNotNull() {
            addCriterion("ygimg is not null");
            return (Criteria) this;
        }

        public Criteria andYgimgEqualTo(String value) {
            addCriterion("ygimg =", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgNotEqualTo(String value) {
            addCriterion("ygimg <>", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgGreaterThan(String value) {
            addCriterion("ygimg >", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgGreaterThanOrEqualTo(String value) {
            addCriterion("ygimg >=", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgLessThan(String value) {
            addCriterion("ygimg <", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgLessThanOrEqualTo(String value) {
            addCriterion("ygimg <=", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgLike(String value) {
            addCriterion("ygimg like", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgNotLike(String value) {
            addCriterion("ygimg not like", value, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgIn(List<String> values) {
            addCriterion("ygimg in", values, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgNotIn(List<String> values) {
            addCriterion("ygimg not in", values, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgBetween(String value1, String value2) {
            addCriterion("ygimg between", value1, value2, "ygimg");
            return (Criteria) this;
        }

        public Criteria andYgimgNotBetween(String value1, String value2) {
            addCriterion("ygimg not between", value1, value2, "ygimg");
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