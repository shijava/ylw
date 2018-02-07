package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class SurveyItemOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyItemOptionExample() {
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

        public Criteria andSurveyitemoptionidIsNull() {
            addCriterion("SurveyItemOptionID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidIsNotNull() {
            addCriterion("SurveyItemOptionID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidEqualTo(Integer value) {
            addCriterion("SurveyItemOptionID =", value, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidNotEqualTo(Integer value) {
            addCriterion("SurveyItemOptionID <>", value, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidGreaterThan(Integer value) {
            addCriterion("SurveyItemOptionID >", value, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SurveyItemOptionID >=", value, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidLessThan(Integer value) {
            addCriterion("SurveyItemOptionID <", value, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidLessThanOrEqualTo(Integer value) {
            addCriterion("SurveyItemOptionID <=", value, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidIn(List<Integer> values) {
            addCriterion("SurveyItemOptionID in", values, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidNotIn(List<Integer> values) {
            addCriterion("SurveyItemOptionID not in", values, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidBetween(Integer value1, Integer value2) {
            addCriterion("SurveyItemOptionID between", value1, value2, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemoptionidNotBetween(Integer value1, Integer value2) {
            addCriterion("SurveyItemOptionID not between", value1, value2, "surveyitemoptionid");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameIsNull() {
            addCriterion("ItemOptionName is null");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameIsNotNull() {
            addCriterion("ItemOptionName is not null");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameEqualTo(String value) {
            addCriterion("ItemOptionName =", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameNotEqualTo(String value) {
            addCriterion("ItemOptionName <>", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameGreaterThan(String value) {
            addCriterion("ItemOptionName >", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameGreaterThanOrEqualTo(String value) {
            addCriterion("ItemOptionName >=", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameLessThan(String value) {
            addCriterion("ItemOptionName <", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameLessThanOrEqualTo(String value) {
            addCriterion("ItemOptionName <=", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameLike(String value) {
            addCriterion("ItemOptionName like", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameNotLike(String value) {
            addCriterion("ItemOptionName not like", value, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameIn(List<String> values) {
            addCriterion("ItemOptionName in", values, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameNotIn(List<String> values) {
            addCriterion("ItemOptionName not in", values, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameBetween(String value1, String value2) {
            addCriterion("ItemOptionName between", value1, value2, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andItemoptionnameNotBetween(String value1, String value2) {
            addCriterion("ItemOptionName not between", value1, value2, "itemoptionname");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidIsNull() {
            addCriterion("SurveyItemID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidIsNotNull() {
            addCriterion("SurveyItemID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidEqualTo(Integer value) {
            addCriterion("SurveyItemID =", value, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidNotEqualTo(Integer value) {
            addCriterion("SurveyItemID <>", value, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidGreaterThan(Integer value) {
            addCriterion("SurveyItemID >", value, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SurveyItemID >=", value, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidLessThan(Integer value) {
            addCriterion("SurveyItemID <", value, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidLessThanOrEqualTo(Integer value) {
            addCriterion("SurveyItemID <=", value, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidIn(List<Integer> values) {
            addCriterion("SurveyItemID in", values, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidNotIn(List<Integer> values) {
            addCriterion("SurveyItemID not in", values, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidBetween(Integer value1, Integer value2) {
            addCriterion("SurveyItemID between", value1, value2, "surveyitemid");
            return (Criteria) this;
        }

        public Criteria andSurveyitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("SurveyItemID not between", value1, value2, "surveyitemid");
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

        public Criteria andAdminidIsNull() {
            addCriterion("AdminID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("AdminID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("AdminID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("AdminID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("AdminID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("AdminID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("AdminID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("AdminID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("AdminID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminID not between", value1, value2, "adminid");
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