package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class StorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageExample() {
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

        public Criteria andStorageidIsNull() {
            addCriterion("StorageID is null");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNotNull() {
            addCriterion("StorageID is not null");
            return (Criteria) this;
        }

        public Criteria andStorageidEqualTo(Integer value) {
            addCriterion("StorageID =", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotEqualTo(Integer value) {
            addCriterion("StorageID <>", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThan(Integer value) {
            addCriterion("StorageID >", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StorageID >=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThan(Integer value) {
            addCriterion("StorageID <", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThanOrEqualTo(Integer value) {
            addCriterion("StorageID <=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidIn(List<Integer> values) {
            addCriterion("StorageID in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotIn(List<Integer> values) {
            addCriterion("StorageID not in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidBetween(Integer value1, Integer value2) {
            addCriterion("StorageID between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("StorageID not between", value1, value2, "storageid");
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

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
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