package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedBackExample() {
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

        public Criteria andFeedbackidIsNull() {
            addCriterion("FeedbackID is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackidIsNotNull() {
            addCriterion("FeedbackID is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackidEqualTo(Integer value) {
            addCriterion("FeedbackID =", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotEqualTo(Integer value) {
            addCriterion("FeedbackID <>", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidGreaterThan(Integer value) {
            addCriterion("FeedbackID >", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FeedbackID >=", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLessThan(Integer value) {
            addCriterion("FeedbackID <", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLessThanOrEqualTo(Integer value) {
            addCriterion("FeedbackID <=", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidIn(List<Integer> values) {
            addCriterion("FeedbackID in", values, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotIn(List<Integer> values) {
            addCriterion("FeedbackID not in", values, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidBetween(Integer value1, Integer value2) {
            addCriterion("FeedbackID between", value1, value2, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotBetween(Integer value1, Integer value2) {
            addCriterion("FeedbackID not between", value1, value2, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("TypeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TypeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TypeID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TypeID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TypeID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TypeID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TypeID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TypeID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TypeID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TypeID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TypeID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TypeID not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentIsNull() {
            addCriterion("FeedbackContent is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentIsNotNull() {
            addCriterion("FeedbackContent is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentEqualTo(String value) {
            addCriterion("FeedbackContent =", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotEqualTo(String value) {
            addCriterion("FeedbackContent <>", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentGreaterThan(String value) {
            addCriterion("FeedbackContent >", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentGreaterThanOrEqualTo(String value) {
            addCriterion("FeedbackContent >=", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentLessThan(String value) {
            addCriterion("FeedbackContent <", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentLessThanOrEqualTo(String value) {
            addCriterion("FeedbackContent <=", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentLike(String value) {
            addCriterion("FeedbackContent like", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotLike(String value) {
            addCriterion("FeedbackContent not like", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentIn(List<String> values) {
            addCriterion("FeedbackContent in", values, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotIn(List<String> values) {
            addCriterion("FeedbackContent not in", values, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentBetween(String value1, String value2) {
            addCriterion("FeedbackContent between", value1, value2, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotBetween(String value1, String value2) {
            addCriterion("FeedbackContent not between", value1, value2, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("IpAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("IpAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("IpAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("IpAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("IpAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("IpAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("IpAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("IpAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("IpAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("IpAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("IpAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("IpAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("IpAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("IpAddress not between", value1, value2, "ipaddress");
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

        public Criteria andIsdealIsNull() {
            addCriterion("IsDeal is null");
            return (Criteria) this;
        }

        public Criteria andIsdealIsNotNull() {
            addCriterion("IsDeal is not null");
            return (Criteria) this;
        }

        public Criteria andIsdealEqualTo(Integer value) {
            addCriterion("IsDeal =", value, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealNotEqualTo(Integer value) {
            addCriterion("IsDeal <>", value, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealGreaterThan(Integer value) {
            addCriterion("IsDeal >", value, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDeal >=", value, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealLessThan(Integer value) {
            addCriterion("IsDeal <", value, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealLessThanOrEqualTo(Integer value) {
            addCriterion("IsDeal <=", value, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealIn(List<Integer> values) {
            addCriterion("IsDeal in", values, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealNotIn(List<Integer> values) {
            addCriterion("IsDeal not in", values, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealBetween(Integer value1, Integer value2) {
            addCriterion("IsDeal between", value1, value2, "isdeal");
            return (Criteria) this;
        }

        public Criteria andIsdealNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDeal not between", value1, value2, "isdeal");
            return (Criteria) this;
        }

        public Criteria andDealmenoIsNull() {
            addCriterion("DealMeno is null");
            return (Criteria) this;
        }

        public Criteria andDealmenoIsNotNull() {
            addCriterion("DealMeno is not null");
            return (Criteria) this;
        }

        public Criteria andDealmenoEqualTo(String value) {
            addCriterion("DealMeno =", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoNotEqualTo(String value) {
            addCriterion("DealMeno <>", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoGreaterThan(String value) {
            addCriterion("DealMeno >", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoGreaterThanOrEqualTo(String value) {
            addCriterion("DealMeno >=", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoLessThan(String value) {
            addCriterion("DealMeno <", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoLessThanOrEqualTo(String value) {
            addCriterion("DealMeno <=", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoLike(String value) {
            addCriterion("DealMeno like", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoNotLike(String value) {
            addCriterion("DealMeno not like", value, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoIn(List<String> values) {
            addCriterion("DealMeno in", values, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoNotIn(List<String> values) {
            addCriterion("DealMeno not in", values, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoBetween(String value1, String value2) {
            addCriterion("DealMeno between", value1, value2, "dealmeno");
            return (Criteria) this;
        }

        public Criteria andDealmenoNotBetween(String value1, String value2) {
            addCriterion("DealMeno not between", value1, value2, "dealmeno");
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