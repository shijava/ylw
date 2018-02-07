package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurveyResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyResultExample() {
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

        public Criteria andSurveyresultidIsNull() {
            addCriterion("SurveyResultID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidIsNotNull() {
            addCriterion("SurveyResultID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidEqualTo(Integer value) {
            addCriterion("SurveyResultID =", value, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidNotEqualTo(Integer value) {
            addCriterion("SurveyResultID <>", value, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidGreaterThan(Integer value) {
            addCriterion("SurveyResultID >", value, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SurveyResultID >=", value, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidLessThan(Integer value) {
            addCriterion("SurveyResultID <", value, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidLessThanOrEqualTo(Integer value) {
            addCriterion("SurveyResultID <=", value, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidIn(List<Integer> values) {
            addCriterion("SurveyResultID in", values, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidNotIn(List<Integer> values) {
            addCriterion("SurveyResultID not in", values, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidBetween(Integer value1, Integer value2) {
            addCriterion("SurveyResultID between", value1, value2, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveyresultidNotBetween(Integer value1, Integer value2) {
            addCriterion("SurveyResultID not between", value1, value2, "surveyresultid");
            return (Criteria) this;
        }

        public Criteria andSurveycontentIsNull() {
            addCriterion("SurveyContent is null");
            return (Criteria) this;
        }

        public Criteria andSurveycontentIsNotNull() {
            addCriterion("SurveyContent is not null");
            return (Criteria) this;
        }

        public Criteria andSurveycontentEqualTo(String value) {
            addCriterion("SurveyContent =", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentNotEqualTo(String value) {
            addCriterion("SurveyContent <>", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentGreaterThan(String value) {
            addCriterion("SurveyContent >", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentGreaterThanOrEqualTo(String value) {
            addCriterion("SurveyContent >=", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentLessThan(String value) {
            addCriterion("SurveyContent <", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentLessThanOrEqualTo(String value) {
            addCriterion("SurveyContent <=", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentLike(String value) {
            addCriterion("SurveyContent like", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentNotLike(String value) {
            addCriterion("SurveyContent not like", value, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentIn(List<String> values) {
            addCriterion("SurveyContent in", values, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentNotIn(List<String> values) {
            addCriterion("SurveyContent not in", values, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentBetween(String value1, String value2) {
            addCriterion("SurveyContent between", value1, value2, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andSurveycontentNotBetween(String value1, String value2) {
            addCriterion("SurveyContent not between", value1, value2, "surveycontent");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andSurveyidIsNull() {
            addCriterion("SurveyID is null");
            return (Criteria) this;
        }

        public Criteria andSurveyidIsNotNull() {
            addCriterion("SurveyID is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyidEqualTo(Integer value) {
            addCriterion("SurveyID =", value, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidNotEqualTo(Integer value) {
            addCriterion("SurveyID <>", value, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidGreaterThan(Integer value) {
            addCriterion("SurveyID >", value, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SurveyID >=", value, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidLessThan(Integer value) {
            addCriterion("SurveyID <", value, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidLessThanOrEqualTo(Integer value) {
            addCriterion("SurveyID <=", value, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidIn(List<Integer> values) {
            addCriterion("SurveyID in", values, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidNotIn(List<Integer> values) {
            addCriterion("SurveyID not in", values, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidBetween(Integer value1, Integer value2) {
            addCriterion("SurveyID between", value1, value2, "surveyid");
            return (Criteria) this;
        }

        public Criteria andSurveyidNotBetween(Integer value1, Integer value2) {
            addCriterion("SurveyID not between", value1, value2, "surveyid");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
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