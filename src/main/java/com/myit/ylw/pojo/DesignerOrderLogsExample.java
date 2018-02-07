package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignerOrderLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignerOrderLogsExample() {
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

        public Criteria andDlogidIsNull() {
            addCriterion("DLogID is null");
            return (Criteria) this;
        }

        public Criteria andDlogidIsNotNull() {
            addCriterion("DLogID is not null");
            return (Criteria) this;
        }

        public Criteria andDlogidEqualTo(Integer value) {
            addCriterion("DLogID =", value, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidNotEqualTo(Integer value) {
            addCriterion("DLogID <>", value, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidGreaterThan(Integer value) {
            addCriterion("DLogID >", value, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DLogID >=", value, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidLessThan(Integer value) {
            addCriterion("DLogID <", value, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidLessThanOrEqualTo(Integer value) {
            addCriterion("DLogID <=", value, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidIn(List<Integer> values) {
            addCriterion("DLogID in", values, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidNotIn(List<Integer> values) {
            addCriterion("DLogID not in", values, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidBetween(Integer value1, Integer value2) {
            addCriterion("DLogID between", value1, value2, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("DLogID not between", value1, value2, "dlogid");
            return (Criteria) this;
        }

        public Criteria andDorderidIsNull() {
            addCriterion("DOrderID is null");
            return (Criteria) this;
        }

        public Criteria andDorderidIsNotNull() {
            addCriterion("DOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andDorderidEqualTo(Integer value) {
            addCriterion("DOrderID =", value, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidNotEqualTo(Integer value) {
            addCriterion("DOrderID <>", value, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidGreaterThan(Integer value) {
            addCriterion("DOrderID >", value, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOrderID >=", value, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidLessThan(Integer value) {
            addCriterion("DOrderID <", value, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidLessThanOrEqualTo(Integer value) {
            addCriterion("DOrderID <=", value, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidIn(List<Integer> values) {
            addCriterion("DOrderID in", values, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidNotIn(List<Integer> values) {
            addCriterion("DOrderID not in", values, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidBetween(Integer value1, Integer value2) {
            addCriterion("DOrderID between", value1, value2, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("DOrderID not between", value1, value2, "dorderid");
            return (Criteria) this;
        }

        public Criteria andDordernoIsNull() {
            addCriterion("DOrderNO is null");
            return (Criteria) this;
        }

        public Criteria andDordernoIsNotNull() {
            addCriterion("DOrderNO is not null");
            return (Criteria) this;
        }

        public Criteria andDordernoEqualTo(String value) {
            addCriterion("DOrderNO =", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotEqualTo(String value) {
            addCriterion("DOrderNO <>", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoGreaterThan(String value) {
            addCriterion("DOrderNO >", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoGreaterThanOrEqualTo(String value) {
            addCriterion("DOrderNO >=", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoLessThan(String value) {
            addCriterion("DOrderNO <", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoLessThanOrEqualTo(String value) {
            addCriterion("DOrderNO <=", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoLike(String value) {
            addCriterion("DOrderNO like", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotLike(String value) {
            addCriterion("DOrderNO not like", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoIn(List<String> values) {
            addCriterion("DOrderNO in", values, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotIn(List<String> values) {
            addCriterion("DOrderNO not in", values, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoBetween(String value1, String value2) {
            addCriterion("DOrderNO between", value1, value2, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotBetween(String value1, String value2) {
            addCriterion("DOrderNO not between", value1, value2, "dorderno");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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