package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShangpinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShangpinExample() {
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

        public Criteria andSpcountIsNull() {
            addCriterion("spcount is null");
            return (Criteria) this;
        }

        public Criteria andSpcountIsNotNull() {
            addCriterion("spcount is not null");
            return (Criteria) this;
        }

        public Criteria andSpcountEqualTo(Integer value) {
            addCriterion("spcount =", value, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountNotEqualTo(Integer value) {
            addCriterion("spcount <>", value, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountGreaterThan(Integer value) {
            addCriterion("spcount >", value, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("spcount >=", value, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountLessThan(Integer value) {
            addCriterion("spcount <", value, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountLessThanOrEqualTo(Integer value) {
            addCriterion("spcount <=", value, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountIn(List<Integer> values) {
            addCriterion("spcount in", values, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountNotIn(List<Integer> values) {
            addCriterion("spcount not in", values, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountBetween(Integer value1, Integer value2) {
            addCriterion("spcount between", value1, value2, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpcountNotBetween(Integer value1, Integer value2) {
            addCriterion("spcount not between", value1, value2, "spcount");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouIsNull() {
            addCriterion("spxiaoshou is null");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouIsNotNull() {
            addCriterion("spxiaoshou is not null");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouEqualTo(Float value) {
            addCriterion("spxiaoshou =", value, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouNotEqualTo(Float value) {
            addCriterion("spxiaoshou <>", value, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouGreaterThan(Float value) {
            addCriterion("spxiaoshou >", value, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouGreaterThanOrEqualTo(Float value) {
            addCriterion("spxiaoshou >=", value, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouLessThan(Float value) {
            addCriterion("spxiaoshou <", value, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouLessThanOrEqualTo(Float value) {
            addCriterion("spxiaoshou <=", value, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouIn(List<Float> values) {
            addCriterion("spxiaoshou in", values, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouNotIn(List<Float> values) {
            addCriterion("spxiaoshou not in", values, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouBetween(Float value1, Float value2) {
            addCriterion("spxiaoshou between", value1, value2, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpxiaoshouNotBetween(Float value1, Float value2) {
            addCriterion("spxiaoshou not between", value1, value2, "spxiaoshou");
            return (Criteria) this;
        }

        public Criteria andSpchengbenIsNull() {
            addCriterion("spchengben is null");
            return (Criteria) this;
        }

        public Criteria andSpchengbenIsNotNull() {
            addCriterion("spchengben is not null");
            return (Criteria) this;
        }

        public Criteria andSpchengbenEqualTo(Float value) {
            addCriterion("spchengben =", value, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenNotEqualTo(Float value) {
            addCriterion("spchengben <>", value, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenGreaterThan(Float value) {
            addCriterion("spchengben >", value, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenGreaterThanOrEqualTo(Float value) {
            addCriterion("spchengben >=", value, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenLessThan(Float value) {
            addCriterion("spchengben <", value, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenLessThanOrEqualTo(Float value) {
            addCriterion("spchengben <=", value, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenIn(List<Float> values) {
            addCriterion("spchengben in", values, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenNotIn(List<Float> values) {
            addCriterion("spchengben not in", values, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenBetween(Float value1, Float value2) {
            addCriterion("spchengben between", value1, value2, "spchengben");
            return (Criteria) this;
        }

        public Criteria andSpchengbenNotBetween(Float value1, Float value2) {
            addCriterion("spchengben not between", value1, value2, "spchengben");
            return (Criteria) this;
        }

        public Criteria andLbidIsNull() {
            addCriterion("lbid is null");
            return (Criteria) this;
        }

        public Criteria andLbidIsNotNull() {
            addCriterion("lbid is not null");
            return (Criteria) this;
        }

        public Criteria andLbidEqualTo(Integer value) {
            addCriterion("lbid =", value, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidNotEqualTo(Integer value) {
            addCriterion("lbid <>", value, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidGreaterThan(Integer value) {
            addCriterion("lbid >", value, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lbid >=", value, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidLessThan(Integer value) {
            addCriterion("lbid <", value, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidLessThanOrEqualTo(Integer value) {
            addCriterion("lbid <=", value, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidIn(List<Integer> values) {
            addCriterion("lbid in", values, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidNotIn(List<Integer> values) {
            addCriterion("lbid not in", values, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidBetween(Integer value1, Integer value2) {
            addCriterion("lbid between", value1, value2, "lbid");
            return (Criteria) this;
        }

        public Criteria andLbidNotBetween(Integer value1, Integer value2) {
            addCriterion("lbid not between", value1, value2, "lbid");
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

        public Criteria andSpimgIsNull() {
            addCriterion("spimg is null");
            return (Criteria) this;
        }

        public Criteria andSpimgIsNotNull() {
            addCriterion("spimg is not null");
            return (Criteria) this;
        }

        public Criteria andSpimgEqualTo(String value) {
            addCriterion("spimg =", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgNotEqualTo(String value) {
            addCriterion("spimg <>", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgGreaterThan(String value) {
            addCriterion("spimg >", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgGreaterThanOrEqualTo(String value) {
            addCriterion("spimg >=", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgLessThan(String value) {
            addCriterion("spimg <", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgLessThanOrEqualTo(String value) {
            addCriterion("spimg <=", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgLike(String value) {
            addCriterion("spimg like", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgNotLike(String value) {
            addCriterion("spimg not like", value, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgIn(List<String> values) {
            addCriterion("spimg in", values, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgNotIn(List<String> values) {
            addCriterion("spimg not in", values, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgBetween(String value1, String value2) {
            addCriterion("spimg between", value1, value2, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpimgNotBetween(String value1, String value2) {
            addCriterion("spimg not between", value1, value2, "spimg");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuIsNull() {
            addCriterion("spmiaoshu is null");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuIsNotNull() {
            addCriterion("spmiaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuEqualTo(String value) {
            addCriterion("spmiaoshu =", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuNotEqualTo(String value) {
            addCriterion("spmiaoshu <>", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuGreaterThan(String value) {
            addCriterion("spmiaoshu >", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("spmiaoshu >=", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuLessThan(String value) {
            addCriterion("spmiaoshu <", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuLessThanOrEqualTo(String value) {
            addCriterion("spmiaoshu <=", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuLike(String value) {
            addCriterion("spmiaoshu like", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuNotLike(String value) {
            addCriterion("spmiaoshu not like", value, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuIn(List<String> values) {
            addCriterion("spmiaoshu in", values, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuNotIn(List<String> values) {
            addCriterion("spmiaoshu not in", values, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuBetween(String value1, String value2) {
            addCriterion("spmiaoshu between", value1, value2, "spmiaoshu");
            return (Criteria) this;
        }

        public Criteria andSpmiaoshuNotBetween(String value1, String value2) {
            addCriterion("spmiaoshu not between", value1, value2, "spmiaoshu");
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