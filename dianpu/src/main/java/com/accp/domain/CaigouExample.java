package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CaigouExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaigouExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCgdateIsNull() {
            addCriterion("cgdate is null");
            return (Criteria) this;
        }

        public Criteria andCgdateIsNotNull() {
            addCriterion("cgdate is not null");
            return (Criteria) this;
        }

        public Criteria andCgdateEqualTo(Date value) {
            addCriterionForJDBCDate("cgdate =", value, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cgdate <>", value, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateGreaterThan(Date value) {
            addCriterionForJDBCDate("cgdate >", value, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cgdate >=", value, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateLessThan(Date value) {
            addCriterionForJDBCDate("cgdate <", value, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cgdate <=", value, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateIn(List<Date> values) {
            addCriterionForJDBCDate("cgdate in", values, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cgdate not in", values, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cgdate between", value1, value2, "cgdate");
            return (Criteria) this;
        }

        public Criteria andCgdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cgdate not between", value1, value2, "cgdate");
            return (Criteria) this;
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

        public Criteria andCgcountIsNull() {
            addCriterion("cgcount is null");
            return (Criteria) this;
        }

        public Criteria andCgcountIsNotNull() {
            addCriterion("cgcount is not null");
            return (Criteria) this;
        }

        public Criteria andCgcountEqualTo(Integer value) {
            addCriterion("cgcount =", value, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountNotEqualTo(Integer value) {
            addCriterion("cgcount <>", value, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountGreaterThan(Integer value) {
            addCriterion("cgcount >", value, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgcount >=", value, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountLessThan(Integer value) {
            addCriterion("cgcount <", value, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountLessThanOrEqualTo(Integer value) {
            addCriterion("cgcount <=", value, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountIn(List<Integer> values) {
            addCriterion("cgcount in", values, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountNotIn(List<Integer> values) {
            addCriterion("cgcount not in", values, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountBetween(Integer value1, Integer value2) {
            addCriterion("cgcount between", value1, value2, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgcountNotBetween(Integer value1, Integer value2) {
            addCriterion("cgcount not between", value1, value2, "cgcount");
            return (Criteria) this;
        }

        public Criteria andCgpriceIsNull() {
            addCriterion("cgprice is null");
            return (Criteria) this;
        }

        public Criteria andCgpriceIsNotNull() {
            addCriterion("cgprice is not null");
            return (Criteria) this;
        }

        public Criteria andCgpriceEqualTo(Float value) {
            addCriterion("cgprice =", value, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceNotEqualTo(Float value) {
            addCriterion("cgprice <>", value, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceGreaterThan(Float value) {
            addCriterion("cgprice >", value, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cgprice >=", value, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceLessThan(Float value) {
            addCriterion("cgprice <", value, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceLessThanOrEqualTo(Float value) {
            addCriterion("cgprice <=", value, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceIn(List<Float> values) {
            addCriterion("cgprice in", values, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceNotIn(List<Float> values) {
            addCriterion("cgprice not in", values, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceBetween(Float value1, Float value2) {
            addCriterion("cgprice between", value1, value2, "cgprice");
            return (Criteria) this;
        }

        public Criteria andCgpriceNotBetween(Float value1, Float value2) {
            addCriterion("cgprice not between", value1, value2, "cgprice");
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