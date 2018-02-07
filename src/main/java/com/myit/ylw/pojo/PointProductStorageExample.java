package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class PointProductStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointProductStorageExample() {
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

        public Criteria andModelnameIsNull() {
            addCriterion("ModelName is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("ModelName is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("ModelName =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("ModelName <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("ModelName >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("ModelName >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("ModelName <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("ModelName <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("ModelName like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("ModelName not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("ModelName in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("ModelName not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("ModelName between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("ModelName not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("Point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("Point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("Point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("Point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("Point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("Point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("Point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("Point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("Point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("Point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("Point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("Point not between", value1, value2, "point");
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

        public Criteria andStorageIsNull() {
            addCriterion("Storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("Storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(Integer value) {
            addCriterion("Storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(Integer value) {
            addCriterion("Storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(Integer value) {
            addCriterion("Storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("Storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(Integer value) {
            addCriterion("Storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(Integer value) {
            addCriterion("Storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<Integer> values) {
            addCriterion("Storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<Integer> values) {
            addCriterion("Storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(Integer value1, Integer value2) {
            addCriterion("Storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("Storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andListidIsNull() {
            addCriterion("ListID is null");
            return (Criteria) this;
        }

        public Criteria andListidIsNotNull() {
            addCriterion("ListID is not null");
            return (Criteria) this;
        }

        public Criteria andListidEqualTo(Integer value) {
            addCriterion("ListID =", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotEqualTo(Integer value) {
            addCriterion("ListID <>", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidGreaterThan(Integer value) {
            addCriterion("ListID >", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ListID >=", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidLessThan(Integer value) {
            addCriterion("ListID <", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidLessThanOrEqualTo(Integer value) {
            addCriterion("ListID <=", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidIn(List<Integer> values) {
            addCriterion("ListID in", values, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotIn(List<Integer> values) {
            addCriterion("ListID not in", values, "listid");
            return (Criteria) this;
        }

        public Criteria andListidBetween(Integer value1, Integer value2) {
            addCriterion("ListID between", value1, value2, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotBetween(Integer value1, Integer value2) {
            addCriterion("ListID not between", value1, value2, "listid");
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