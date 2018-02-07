package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class PointProductOrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointProductOrderGoodsExample() {
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

        public Criteria andPpordergoodsidIsNull() {
            addCriterion("PPOrderGoodsID is null");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidIsNotNull() {
            addCriterion("PPOrderGoodsID is not null");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidEqualTo(Integer value) {
            addCriterion("PPOrderGoodsID =", value, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidNotEqualTo(Integer value) {
            addCriterion("PPOrderGoodsID <>", value, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidGreaterThan(Integer value) {
            addCriterion("PPOrderGoodsID >", value, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPOrderGoodsID >=", value, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidLessThan(Integer value) {
            addCriterion("PPOrderGoodsID <", value, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("PPOrderGoodsID <=", value, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidIn(List<Integer> values) {
            addCriterion("PPOrderGoodsID in", values, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidNotIn(List<Integer> values) {
            addCriterion("PPOrderGoodsID not in", values, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidBetween(Integer value1, Integer value2) {
            addCriterion("PPOrderGoodsID between", value1, value2, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPpordergoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("PPOrderGoodsID not between", value1, value2, "ppordergoodsid");
            return (Criteria) this;
        }

        public Criteria andPporderidIsNull() {
            addCriterion("PPOrderID is null");
            return (Criteria) this;
        }

        public Criteria andPporderidIsNotNull() {
            addCriterion("PPOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andPporderidEqualTo(Integer value) {
            addCriterion("PPOrderID =", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidNotEqualTo(Integer value) {
            addCriterion("PPOrderID <>", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidGreaterThan(Integer value) {
            addCriterion("PPOrderID >", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPOrderID >=", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidLessThan(Integer value) {
            addCriterion("PPOrderID <", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidLessThanOrEqualTo(Integer value) {
            addCriterion("PPOrderID <=", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidIn(List<Integer> values) {
            addCriterion("PPOrderID in", values, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidNotIn(List<Integer> values) {
            addCriterion("PPOrderID not in", values, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidBetween(Integer value1, Integer value2) {
            addCriterion("PPOrderID between", value1, value2, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidNotBetween(Integer value1, Integer value2) {
            addCriterion("PPOrderID not between", value1, value2, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPpordernoIsNull() {
            addCriterion("PPOrderNO is null");
            return (Criteria) this;
        }

        public Criteria andPpordernoIsNotNull() {
            addCriterion("PPOrderNO is not null");
            return (Criteria) this;
        }

        public Criteria andPpordernoEqualTo(String value) {
            addCriterion("PPOrderNO =", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotEqualTo(String value) {
            addCriterion("PPOrderNO <>", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoGreaterThan(String value) {
            addCriterion("PPOrderNO >", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoGreaterThanOrEqualTo(String value) {
            addCriterion("PPOrderNO >=", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoLessThan(String value) {
            addCriterion("PPOrderNO <", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoLessThanOrEqualTo(String value) {
            addCriterion("PPOrderNO <=", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoLike(String value) {
            addCriterion("PPOrderNO like", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotLike(String value) {
            addCriterion("PPOrderNO not like", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoIn(List<String> values) {
            addCriterion("PPOrderNO in", values, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotIn(List<String> values) {
            addCriterion("PPOrderNO not in", values, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoBetween(String value1, String value2) {
            addCriterion("PPOrderNO between", value1, value2, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotBetween(String value1, String value2) {
            addCriterion("PPOrderNO not between", value1, value2, "pporderno");
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

        public Criteria andPnameIsNull() {
            addCriterion("PName is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("PName is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("PName =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("PName <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("PName >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("PName >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("PName <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("PName <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("PName like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("PName not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("PName in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("PName not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("PName between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("PName not between", value1, value2, "pname");
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