package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class VipdengjiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipdengjiExample() {
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

        public Criteria andDjnameIsNull() {
            addCriterion("djname is null");
            return (Criteria) this;
        }

        public Criteria andDjnameIsNotNull() {
            addCriterion("djname is not null");
            return (Criteria) this;
        }

        public Criteria andDjnameEqualTo(String value) {
            addCriterion("djname =", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameNotEqualTo(String value) {
            addCriterion("djname <>", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameGreaterThan(String value) {
            addCriterion("djname >", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameGreaterThanOrEqualTo(String value) {
            addCriterion("djname >=", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameLessThan(String value) {
            addCriterion("djname <", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameLessThanOrEqualTo(String value) {
            addCriterion("djname <=", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameLike(String value) {
            addCriterion("djname like", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameNotLike(String value) {
            addCriterion("djname not like", value, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameIn(List<String> values) {
            addCriterion("djname in", values, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameNotIn(List<String> values) {
            addCriterion("djname not in", values, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameBetween(String value1, String value2) {
            addCriterion("djname between", value1, value2, "djname");
            return (Criteria) this;
        }

        public Criteria andDjnameNotBetween(String value1, String value2) {
            addCriterion("djname not between", value1, value2, "djname");
            return (Criteria) this;
        }

        public Criteria andDjzhekouIsNull() {
            addCriterion("djzhekou is null");
            return (Criteria) this;
        }

        public Criteria andDjzhekouIsNotNull() {
            addCriterion("djzhekou is not null");
            return (Criteria) this;
        }

        public Criteria andDjzhekouEqualTo(Float value) {
            addCriterion("djzhekou =", value, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouNotEqualTo(Float value) {
            addCriterion("djzhekou <>", value, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouGreaterThan(Float value) {
            addCriterion("djzhekou >", value, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouGreaterThanOrEqualTo(Float value) {
            addCriterion("djzhekou >=", value, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouLessThan(Float value) {
            addCriterion("djzhekou <", value, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouLessThanOrEqualTo(Float value) {
            addCriterion("djzhekou <=", value, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouIn(List<Float> values) {
            addCriterion("djzhekou in", values, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouNotIn(List<Float> values) {
            addCriterion("djzhekou not in", values, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouBetween(Float value1, Float value2) {
            addCriterion("djzhekou between", value1, value2, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjzhekouNotBetween(Float value1, Float value2) {
            addCriterion("djzhekou not between", value1, value2, "djzhekou");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiIsNull() {
            addCriterion("djxiaofei is null");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiIsNotNull() {
            addCriterion("djxiaofei is not null");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiEqualTo(Integer value) {
            addCriterion("djxiaofei =", value, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiNotEqualTo(Integer value) {
            addCriterion("djxiaofei <>", value, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiGreaterThan(Integer value) {
            addCriterion("djxiaofei >", value, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiGreaterThanOrEqualTo(Integer value) {
            addCriterion("djxiaofei >=", value, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiLessThan(Integer value) {
            addCriterion("djxiaofei <", value, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiLessThanOrEqualTo(Integer value) {
            addCriterion("djxiaofei <=", value, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiIn(List<Integer> values) {
            addCriterion("djxiaofei in", values, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiNotIn(List<Integer> values) {
            addCriterion("djxiaofei not in", values, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiBetween(Integer value1, Integer value2) {
            addCriterion("djxiaofei between", value1, value2, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDjxiaofeiNotBetween(Integer value1, Integer value2) {
            addCriterion("djxiaofei not between", value1, value2, "djxiaofei");
            return (Criteria) this;
        }

        public Criteria andDxzidongIsNull() {
            addCriterion("dxzidong is null");
            return (Criteria) this;
        }

        public Criteria andDxzidongIsNotNull() {
            addCriterion("dxzidong is not null");
            return (Criteria) this;
        }

        public Criteria andDxzidongEqualTo(Integer value) {
            addCriterion("dxzidong =", value, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongNotEqualTo(Integer value) {
            addCriterion("dxzidong <>", value, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongGreaterThan(Integer value) {
            addCriterion("dxzidong >", value, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongGreaterThanOrEqualTo(Integer value) {
            addCriterion("dxzidong >=", value, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongLessThan(Integer value) {
            addCriterion("dxzidong <", value, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongLessThanOrEqualTo(Integer value) {
            addCriterion("dxzidong <=", value, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongIn(List<Integer> values) {
            addCriterion("dxzidong in", values, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongNotIn(List<Integer> values) {
            addCriterion("dxzidong not in", values, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongBetween(Integer value1, Integer value2) {
            addCriterion("dxzidong between", value1, value2, "dxzidong");
            return (Criteria) this;
        }

        public Criteria andDxzidongNotBetween(Integer value1, Integer value2) {
            addCriterion("dxzidong not between", value1, value2, "dxzidong");
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