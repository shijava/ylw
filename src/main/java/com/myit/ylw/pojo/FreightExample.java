package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class FreightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreightExample() {
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

        public Criteria andFreightidIsNull() {
            addCriterion("FreightID is null");
            return (Criteria) this;
        }

        public Criteria andFreightidIsNotNull() {
            addCriterion("FreightID is not null");
            return (Criteria) this;
        }

        public Criteria andFreightidEqualTo(Integer value) {
            addCriterion("FreightID =", value, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidNotEqualTo(Integer value) {
            addCriterion("FreightID <>", value, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidGreaterThan(Integer value) {
            addCriterion("FreightID >", value, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FreightID >=", value, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidLessThan(Integer value) {
            addCriterion("FreightID <", value, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidLessThanOrEqualTo(Integer value) {
            addCriterion("FreightID <=", value, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidIn(List<Integer> values) {
            addCriterion("FreightID in", values, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidNotIn(List<Integer> values) {
            addCriterion("FreightID not in", values, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidBetween(Integer value1, Integer value2) {
            addCriterion("FreightID between", value1, value2, "freightid");
            return (Criteria) this;
        }

        public Criteria andFreightidNotBetween(Integer value1, Integer value2) {
            addCriterion("FreightID not between", value1, value2, "freightid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andBeginnumIsNull() {
            addCriterion("BeginNum is null");
            return (Criteria) this;
        }

        public Criteria andBeginnumIsNotNull() {
            addCriterion("BeginNum is not null");
            return (Criteria) this;
        }

        public Criteria andBeginnumEqualTo(Integer value) {
            addCriterion("BeginNum =", value, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumNotEqualTo(Integer value) {
            addCriterion("BeginNum <>", value, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumGreaterThan(Integer value) {
            addCriterion("BeginNum >", value, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BeginNum >=", value, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumLessThan(Integer value) {
            addCriterion("BeginNum <", value, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumLessThanOrEqualTo(Integer value) {
            addCriterion("BeginNum <=", value, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumIn(List<Integer> values) {
            addCriterion("BeginNum in", values, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumNotIn(List<Integer> values) {
            addCriterion("BeginNum not in", values, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumBetween(Integer value1, Integer value2) {
            addCriterion("BeginNum between", value1, value2, "beginnum");
            return (Criteria) this;
        }

        public Criteria andBeginnumNotBetween(Integer value1, Integer value2) {
            addCriterion("BeginNum not between", value1, value2, "beginnum");
            return (Criteria) this;
        }

        public Criteria andEndnumIsNull() {
            addCriterion("EndNum is null");
            return (Criteria) this;
        }

        public Criteria andEndnumIsNotNull() {
            addCriterion("EndNum is not null");
            return (Criteria) this;
        }

        public Criteria andEndnumEqualTo(Integer value) {
            addCriterion("EndNum =", value, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumNotEqualTo(Integer value) {
            addCriterion("EndNum <>", value, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumGreaterThan(Integer value) {
            addCriterion("EndNum >", value, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EndNum >=", value, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumLessThan(Integer value) {
            addCriterion("EndNum <", value, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumLessThanOrEqualTo(Integer value) {
            addCriterion("EndNum <=", value, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumIn(List<Integer> values) {
            addCriterion("EndNum in", values, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumNotIn(List<Integer> values) {
            addCriterion("EndNum not in", values, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumBetween(Integer value1, Integer value2) {
            addCriterion("EndNum between", value1, value2, "endnum");
            return (Criteria) this;
        }

        public Criteria andEndnumNotBetween(Integer value1, Integer value2) {
            addCriterion("EndNum not between", value1, value2, "endnum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
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