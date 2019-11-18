package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChongzhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChongzhiExample() {
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

        public Criteria andCzidIsNull() {
            addCriterion("czid is null");
            return (Criteria) this;
        }

        public Criteria andCzidIsNotNull() {
            addCriterion("czid is not null");
            return (Criteria) this;
        }

        public Criteria andCzidEqualTo(Integer value) {
            addCriterion("czid =", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotEqualTo(Integer value) {
            addCriterion("czid <>", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidGreaterThan(Integer value) {
            addCriterion("czid >", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("czid >=", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLessThan(Integer value) {
            addCriterion("czid <", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLessThanOrEqualTo(Integer value) {
            addCriterion("czid <=", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidIn(List<Integer> values) {
            addCriterion("czid in", values, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotIn(List<Integer> values) {
            addCriterion("czid not in", values, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidBetween(Integer value1, Integer value2) {
            addCriterion("czid between", value1, value2, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotBetween(Integer value1, Integer value2) {
            addCriterion("czid not between", value1, value2, "czid");
            return (Criteria) this;
        }

        public Criteria andCzdateIsNull() {
            addCriterion("czdate is null");
            return (Criteria) this;
        }

        public Criteria andCzdateIsNotNull() {
            addCriterion("czdate is not null");
            return (Criteria) this;
        }

        public Criteria andCzdateEqualTo(Date value) {
            addCriterionForJDBCDate("czdate =", value, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("czdate <>", value, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateGreaterThan(Date value) {
            addCriterionForJDBCDate("czdate >", value, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("czdate >=", value, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateLessThan(Date value) {
            addCriterionForJDBCDate("czdate <", value, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("czdate <=", value, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateIn(List<Date> values) {
            addCriterionForJDBCDate("czdate in", values, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("czdate not in", values, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("czdate between", value1, value2, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("czdate not between", value1, value2, "czdate");
            return (Criteria) this;
        }

        public Criteria andCzweixinIsNull() {
            addCriterion("czweixin is null");
            return (Criteria) this;
        }

        public Criteria andCzweixinIsNotNull() {
            addCriterion("czweixin is not null");
            return (Criteria) this;
        }

        public Criteria andCzweixinEqualTo(String value) {
            addCriterion("czweixin =", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinNotEqualTo(String value) {
            addCriterion("czweixin <>", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinGreaterThan(String value) {
            addCriterion("czweixin >", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinGreaterThanOrEqualTo(String value) {
            addCriterion("czweixin >=", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinLessThan(String value) {
            addCriterion("czweixin <", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinLessThanOrEqualTo(String value) {
            addCriterion("czweixin <=", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinLike(String value) {
            addCriterion("czweixin like", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinNotLike(String value) {
            addCriterion("czweixin not like", value, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinIn(List<String> values) {
            addCriterion("czweixin in", values, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinNotIn(List<String> values) {
            addCriterion("czweixin not in", values, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinBetween(String value1, String value2) {
            addCriterion("czweixin between", value1, value2, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCzweixinNotBetween(String value1, String value2) {
            addCriterion("czweixin not between", value1, value2, "czweixin");
            return (Criteria) this;
        }

        public Criteria andCznameIsNull() {
            addCriterion("czname is null");
            return (Criteria) this;
        }

        public Criteria andCznameIsNotNull() {
            addCriterion("czname is not null");
            return (Criteria) this;
        }

        public Criteria andCznameEqualTo(String value) {
            addCriterion("czname =", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotEqualTo(String value) {
            addCriterion("czname <>", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameGreaterThan(String value) {
            addCriterion("czname >", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameGreaterThanOrEqualTo(String value) {
            addCriterion("czname >=", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameLessThan(String value) {
            addCriterion("czname <", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameLessThanOrEqualTo(String value) {
            addCriterion("czname <=", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameLike(String value) {
            addCriterion("czname like", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotLike(String value) {
            addCriterion("czname not like", value, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameIn(List<String> values) {
            addCriterion("czname in", values, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotIn(List<String> values) {
            addCriterion("czname not in", values, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameBetween(String value1, String value2) {
            addCriterion("czname between", value1, value2, "czname");
            return (Criteria) this;
        }

        public Criteria andCznameNotBetween(String value1, String value2) {
            addCriterion("czname not between", value1, value2, "czname");
            return (Criteria) this;
        }

        public Criteria andCzphoneIsNull() {
            addCriterion("czphone is null");
            return (Criteria) this;
        }

        public Criteria andCzphoneIsNotNull() {
            addCriterion("czphone is not null");
            return (Criteria) this;
        }

        public Criteria andCzphoneEqualTo(String value) {
            addCriterion("czphone =", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneNotEqualTo(String value) {
            addCriterion("czphone <>", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneGreaterThan(String value) {
            addCriterion("czphone >", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneGreaterThanOrEqualTo(String value) {
            addCriterion("czphone >=", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneLessThan(String value) {
            addCriterion("czphone <", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneLessThanOrEqualTo(String value) {
            addCriterion("czphone <=", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneLike(String value) {
            addCriterion("czphone like", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneNotLike(String value) {
            addCriterion("czphone not like", value, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneIn(List<String> values) {
            addCriterion("czphone in", values, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneNotIn(List<String> values) {
            addCriterion("czphone not in", values, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneBetween(String value1, String value2) {
            addCriterion("czphone between", value1, value2, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzphoneNotBetween(String value1, String value2) {
            addCriterion("czphone not between", value1, value2, "czphone");
            return (Criteria) this;
        }

        public Criteria andCzpriceIsNull() {
            addCriterion("czprice is null");
            return (Criteria) this;
        }

        public Criteria andCzpriceIsNotNull() {
            addCriterion("czprice is not null");
            return (Criteria) this;
        }

        public Criteria andCzpriceEqualTo(Float value) {
            addCriterion("czprice =", value, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceNotEqualTo(Float value) {
            addCriterion("czprice <>", value, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceGreaterThan(Float value) {
            addCriterion("czprice >", value, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("czprice >=", value, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceLessThan(Float value) {
            addCriterion("czprice <", value, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceLessThanOrEqualTo(Float value) {
            addCriterion("czprice <=", value, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceIn(List<Float> values) {
            addCriterion("czprice in", values, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceNotIn(List<Float> values) {
            addCriterion("czprice not in", values, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceBetween(Float value1, Float value2) {
            addCriterion("czprice between", value1, value2, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzpriceNotBetween(Float value1, Float value2) {
            addCriterion("czprice not between", value1, value2, "czprice");
            return (Criteria) this;
        }

        public Criteria andCzzengsongIsNull() {
            addCriterion("czzengsong is null");
            return (Criteria) this;
        }

        public Criteria andCzzengsongIsNotNull() {
            addCriterion("czzengsong is not null");
            return (Criteria) this;
        }

        public Criteria andCzzengsongEqualTo(Integer value) {
            addCriterion("czzengsong =", value, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongNotEqualTo(Integer value) {
            addCriterion("czzengsong <>", value, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongGreaterThan(Integer value) {
            addCriterion("czzengsong >", value, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongGreaterThanOrEqualTo(Integer value) {
            addCriterion("czzengsong >=", value, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongLessThan(Integer value) {
            addCriterion("czzengsong <", value, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongLessThanOrEqualTo(Integer value) {
            addCriterion("czzengsong <=", value, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongIn(List<Integer> values) {
            addCriterion("czzengsong in", values, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongNotIn(List<Integer> values) {
            addCriterion("czzengsong not in", values, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongBetween(Integer value1, Integer value2) {
            addCriterion("czzengsong between", value1, value2, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzzengsongNotBetween(Integer value1, Integer value2) {
            addCriterion("czzengsong not between", value1, value2, "czzengsong");
            return (Criteria) this;
        }

        public Criteria andCzbezhuIsNull() {
            addCriterion("czbezhu is null");
            return (Criteria) this;
        }

        public Criteria andCzbezhuIsNotNull() {
            addCriterion("czbezhu is not null");
            return (Criteria) this;
        }

        public Criteria andCzbezhuEqualTo(String value) {
            addCriterion("czbezhu =", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuNotEqualTo(String value) {
            addCriterion("czbezhu <>", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuGreaterThan(String value) {
            addCriterion("czbezhu >", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuGreaterThanOrEqualTo(String value) {
            addCriterion("czbezhu >=", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuLessThan(String value) {
            addCriterion("czbezhu <", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuLessThanOrEqualTo(String value) {
            addCriterion("czbezhu <=", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuLike(String value) {
            addCriterion("czbezhu like", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuNotLike(String value) {
            addCriterion("czbezhu not like", value, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuIn(List<String> values) {
            addCriterion("czbezhu in", values, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuNotIn(List<String> values) {
            addCriterion("czbezhu not in", values, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuBetween(String value1, String value2) {
            addCriterion("czbezhu between", value1, value2, "czbezhu");
            return (Criteria) this;
        }

        public Criteria andCzbezhuNotBetween(String value1, String value2) {
            addCriterion("czbezhu not between", value1, value2, "czbezhu");
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