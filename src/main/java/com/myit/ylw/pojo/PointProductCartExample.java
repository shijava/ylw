package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class PointProductCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointProductCartExample() {
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

        public Criteria andPpcartIsNull() {
            addCriterion("PPCart is null");
            return (Criteria) this;
        }

        public Criteria andPpcartIsNotNull() {
            addCriterion("PPCart is not null");
            return (Criteria) this;
        }

        public Criteria andPpcartEqualTo(Integer value) {
            addCriterion("PPCart =", value, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartNotEqualTo(Integer value) {
            addCriterion("PPCart <>", value, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartGreaterThan(Integer value) {
            addCriterion("PPCart >", value, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPCart >=", value, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartLessThan(Integer value) {
            addCriterion("PPCart <", value, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartLessThanOrEqualTo(Integer value) {
            addCriterion("PPCart <=", value, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartIn(List<Integer> values) {
            addCriterion("PPCart in", values, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartNotIn(List<Integer> values) {
            addCriterion("PPCart not in", values, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartBetween(Integer value1, Integer value2) {
            addCriterion("PPCart between", value1, value2, "ppcart");
            return (Criteria) this;
        }

        public Criteria andPpcartNotBetween(Integer value1, Integer value2) {
            addCriterion("PPCart not between", value1, value2, "ppcart");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPointproductidIsNull() {
            addCriterion("PointProductID is null");
            return (Criteria) this;
        }

        public Criteria andPointproductidIsNotNull() {
            addCriterion("PointProductID is not null");
            return (Criteria) this;
        }

        public Criteria andPointproductidEqualTo(Integer value) {
            addCriterion("PointProductID =", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidNotEqualTo(Integer value) {
            addCriterion("PointProductID <>", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidGreaterThan(Integer value) {
            addCriterion("PointProductID >", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PointProductID >=", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidLessThan(Integer value) {
            addCriterion("PointProductID <", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidLessThanOrEqualTo(Integer value) {
            addCriterion("PointProductID <=", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidIn(List<Integer> values) {
            addCriterion("PointProductID in", values, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidNotIn(List<Integer> values) {
            addCriterion("PointProductID not in", values, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidBetween(Integer value1, Integer value2) {
            addCriterion("PointProductID between", value1, value2, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("PointProductID not between", value1, value2, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidIsNull() {
            addCriterion("PPStorageID is null");
            return (Criteria) this;
        }

        public Criteria andPpstorageidIsNotNull() {
            addCriterion("PPStorageID is not null");
            return (Criteria) this;
        }

        public Criteria andPpstorageidEqualTo(Integer value) {
            addCriterion("PPStorageID =", value, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidNotEqualTo(Integer value) {
            addCriterion("PPStorageID <>", value, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidGreaterThan(Integer value) {
            addCriterion("PPStorageID >", value, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPStorageID >=", value, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidLessThan(Integer value) {
            addCriterion("PPStorageID <", value, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidLessThanOrEqualTo(Integer value) {
            addCriterion("PPStorageID <=", value, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidIn(List<Integer> values) {
            addCriterion("PPStorageID in", values, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidNotIn(List<Integer> values) {
            addCriterion("PPStorageID not in", values, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidBetween(Integer value1, Integer value2) {
            addCriterion("PPStorageID between", value1, value2, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andPpstorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("PPStorageID not between", value1, value2, "ppstorageid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andCarttypeIsNull() {
            addCriterion("CartType is null");
            return (Criteria) this;
        }

        public Criteria andCarttypeIsNotNull() {
            addCriterion("CartType is not null");
            return (Criteria) this;
        }

        public Criteria andCarttypeEqualTo(Integer value) {
            addCriterion("CartType =", value, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeNotEqualTo(Integer value) {
            addCriterion("CartType <>", value, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeGreaterThan(Integer value) {
            addCriterion("CartType >", value, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CartType >=", value, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeLessThan(Integer value) {
            addCriterion("CartType <", value, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeLessThanOrEqualTo(Integer value) {
            addCriterion("CartType <=", value, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeIn(List<Integer> values) {
            addCriterion("CartType in", values, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeNotIn(List<Integer> values) {
            addCriterion("CartType not in", values, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeBetween(Integer value1, Integer value2) {
            addCriterion("CartType between", value1, value2, "carttype");
            return (Criteria) this;
        }

        public Criteria andCarttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CartType not between", value1, value2, "carttype");
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