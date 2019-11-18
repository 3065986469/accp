package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GongyingshangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GongyingshangExample() {
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

        public Criteria andGysidIsNull() {
            addCriterion("gysid is null");
            return (Criteria) this;
        }

        public Criteria andGysidIsNotNull() {
            addCriterion("gysid is not null");
            return (Criteria) this;
        }

        public Criteria andGysidEqualTo(Integer value) {
            addCriterion("gysid =", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidNotEqualTo(Integer value) {
            addCriterion("gysid <>", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidGreaterThan(Integer value) {
            addCriterion("gysid >", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gysid >=", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidLessThan(Integer value) {
            addCriterion("gysid <", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidLessThanOrEqualTo(Integer value) {
            addCriterion("gysid <=", value, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidIn(List<Integer> values) {
            addCriterion("gysid in", values, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidNotIn(List<Integer> values) {
            addCriterion("gysid not in", values, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidBetween(Integer value1, Integer value2) {
            addCriterion("gysid between", value1, value2, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysidNotBetween(Integer value1, Integer value2) {
            addCriterion("gysid not between", value1, value2, "gysid");
            return (Criteria) this;
        }

        public Criteria andGysnameIsNull() {
            addCriterion("gysname is null");
            return (Criteria) this;
        }

        public Criteria andGysnameIsNotNull() {
            addCriterion("gysname is not null");
            return (Criteria) this;
        }

        public Criteria andGysnameEqualTo(String value) {
            addCriterion("gysname =", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotEqualTo(String value) {
            addCriterion("gysname <>", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameGreaterThan(String value) {
            addCriterion("gysname >", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameGreaterThanOrEqualTo(String value) {
            addCriterion("gysname >=", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameLessThan(String value) {
            addCriterion("gysname <", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameLessThanOrEqualTo(String value) {
            addCriterion("gysname <=", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameLike(String value) {
            addCriterion("gysname like", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotLike(String value) {
            addCriterion("gysname not like", value, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameIn(List<String> values) {
            addCriterion("gysname in", values, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotIn(List<String> values) {
            addCriterion("gysname not in", values, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameBetween(String value1, String value2) {
            addCriterion("gysname between", value1, value2, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysnameNotBetween(String value1, String value2) {
            addCriterion("gysname not between", value1, value2, "gysname");
            return (Criteria) this;
        }

        public Criteria andGysjianchenIsNull() {
            addCriterion("gysjianchen is null");
            return (Criteria) this;
        }

        public Criteria andGysjianchenIsNotNull() {
            addCriterion("gysjianchen is not null");
            return (Criteria) this;
        }

        public Criteria andGysjianchenEqualTo(String value) {
            addCriterion("gysjianchen =", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenNotEqualTo(String value) {
            addCriterion("gysjianchen <>", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenGreaterThan(String value) {
            addCriterion("gysjianchen >", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenGreaterThanOrEqualTo(String value) {
            addCriterion("gysjianchen >=", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenLessThan(String value) {
            addCriterion("gysjianchen <", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenLessThanOrEqualTo(String value) {
            addCriterion("gysjianchen <=", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenLike(String value) {
            addCriterion("gysjianchen like", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenNotLike(String value) {
            addCriterion("gysjianchen not like", value, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenIn(List<String> values) {
            addCriterion("gysjianchen in", values, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenNotIn(List<String> values) {
            addCriterion("gysjianchen not in", values, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenBetween(String value1, String value2) {
            addCriterion("gysjianchen between", value1, value2, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGysjianchenNotBetween(String value1, String value2) {
            addCriterion("gysjianchen not between", value1, value2, "gysjianchen");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenIsNull() {
            addCriterion("gyslianxiren is null");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenIsNotNull() {
            addCriterion("gyslianxiren is not null");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenEqualTo(String value) {
            addCriterion("gyslianxiren =", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenNotEqualTo(String value) {
            addCriterion("gyslianxiren <>", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenGreaterThan(String value) {
            addCriterion("gyslianxiren >", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenGreaterThanOrEqualTo(String value) {
            addCriterion("gyslianxiren >=", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenLessThan(String value) {
            addCriterion("gyslianxiren <", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenLessThanOrEqualTo(String value) {
            addCriterion("gyslianxiren <=", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenLike(String value) {
            addCriterion("gyslianxiren like", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenNotLike(String value) {
            addCriterion("gyslianxiren not like", value, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenIn(List<String> values) {
            addCriterion("gyslianxiren in", values, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenNotIn(List<String> values) {
            addCriterion("gyslianxiren not in", values, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenBetween(String value1, String value2) {
            addCriterion("gyslianxiren between", value1, value2, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGyslianxirenNotBetween(String value1, String value2) {
            addCriterion("gyslianxiren not between", value1, value2, "gyslianxiren");
            return (Criteria) this;
        }

        public Criteria andGysphoneIsNull() {
            addCriterion("gysphone is null");
            return (Criteria) this;
        }

        public Criteria andGysphoneIsNotNull() {
            addCriterion("gysphone is not null");
            return (Criteria) this;
        }

        public Criteria andGysphoneEqualTo(String value) {
            addCriterion("gysphone =", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneNotEqualTo(String value) {
            addCriterion("gysphone <>", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneGreaterThan(String value) {
            addCriterion("gysphone >", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneGreaterThanOrEqualTo(String value) {
            addCriterion("gysphone >=", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneLessThan(String value) {
            addCriterion("gysphone <", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneLessThanOrEqualTo(String value) {
            addCriterion("gysphone <=", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneLike(String value) {
            addCriterion("gysphone like", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneNotLike(String value) {
            addCriterion("gysphone not like", value, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneIn(List<String> values) {
            addCriterion("gysphone in", values, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneNotIn(List<String> values) {
            addCriterion("gysphone not in", values, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneBetween(String value1, String value2) {
            addCriterion("gysphone between", value1, value2, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysphoneNotBetween(String value1, String value2) {
            addCriterion("gysphone not between", value1, value2, "gysphone");
            return (Criteria) this;
        }

        public Criteria andGysemailIsNull() {
            addCriterion("gysemail is null");
            return (Criteria) this;
        }

        public Criteria andGysemailIsNotNull() {
            addCriterion("gysemail is not null");
            return (Criteria) this;
        }

        public Criteria andGysemailEqualTo(String value) {
            addCriterion("gysemail =", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailNotEqualTo(String value) {
            addCriterion("gysemail <>", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailGreaterThan(String value) {
            addCriterion("gysemail >", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailGreaterThanOrEqualTo(String value) {
            addCriterion("gysemail >=", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailLessThan(String value) {
            addCriterion("gysemail <", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailLessThanOrEqualTo(String value) {
            addCriterion("gysemail <=", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailLike(String value) {
            addCriterion("gysemail like", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailNotLike(String value) {
            addCriterion("gysemail not like", value, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailIn(List<String> values) {
            addCriterion("gysemail in", values, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailNotIn(List<String> values) {
            addCriterion("gysemail not in", values, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailBetween(String value1, String value2) {
            addCriterion("gysemail between", value1, value2, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysemailNotBetween(String value1, String value2) {
            addCriterion("gysemail not between", value1, value2, "gysemail");
            return (Criteria) this;
        }

        public Criteria andGysaddressIsNull() {
            addCriterion("gysaddress is null");
            return (Criteria) this;
        }

        public Criteria andGysaddressIsNotNull() {
            addCriterion("gysaddress is not null");
            return (Criteria) this;
        }

        public Criteria andGysaddressEqualTo(String value) {
            addCriterion("gysaddress =", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressNotEqualTo(String value) {
            addCriterion("gysaddress <>", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressGreaterThan(String value) {
            addCriterion("gysaddress >", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressGreaterThanOrEqualTo(String value) {
            addCriterion("gysaddress >=", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressLessThan(String value) {
            addCriterion("gysaddress <", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressLessThanOrEqualTo(String value) {
            addCriterion("gysaddress <=", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressLike(String value) {
            addCriterion("gysaddress like", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressNotLike(String value) {
            addCriterion("gysaddress not like", value, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressIn(List<String> values) {
            addCriterion("gysaddress in", values, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressNotIn(List<String> values) {
            addCriterion("gysaddress not in", values, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressBetween(String value1, String value2) {
            addCriterion("gysaddress between", value1, value2, "gysaddress");
            return (Criteria) this;
        }

        public Criteria andGysaddressNotBetween(String value1, String value2) {
            addCriterion("gysaddress not between", value1, value2, "gysaddress");
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