package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenderCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenderCartExample() {
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

        public Criteria andTendercartidIsNull() {
            addCriterion("TenderCartID is null");
            return (Criteria) this;
        }

        public Criteria andTendercartidIsNotNull() {
            addCriterion("TenderCartID is not null");
            return (Criteria) this;
        }

        public Criteria andTendercartidEqualTo(Integer value) {
            addCriterion("TenderCartID =", value, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidNotEqualTo(Integer value) {
            addCriterion("TenderCartID <>", value, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidGreaterThan(Integer value) {
            addCriterion("TenderCartID >", value, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenderCartID >=", value, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidLessThan(Integer value) {
            addCriterion("TenderCartID <", value, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidLessThanOrEqualTo(Integer value) {
            addCriterion("TenderCartID <=", value, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidIn(List<Integer> values) {
            addCriterion("TenderCartID in", values, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidNotIn(List<Integer> values) {
            addCriterion("TenderCartID not in", values, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidBetween(Integer value1, Integer value2) {
            addCriterion("TenderCartID between", value1, value2, "tendercartid");
            return (Criteria) this;
        }

        public Criteria andTendercartidNotBetween(Integer value1, Integer value2) {
            addCriterion("TenderCartID not between", value1, value2, "tendercartid");
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

        public Criteria andTenderidIsNull() {
            addCriterion("TenderID is null");
            return (Criteria) this;
        }

        public Criteria andTenderidIsNotNull() {
            addCriterion("TenderID is not null");
            return (Criteria) this;
        }

        public Criteria andTenderidEqualTo(Integer value) {
            addCriterion("TenderID =", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotEqualTo(Integer value) {
            addCriterion("TenderID <>", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidGreaterThan(Integer value) {
            addCriterion("TenderID >", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenderID >=", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidLessThan(Integer value) {
            addCriterion("TenderID <", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidLessThanOrEqualTo(Integer value) {
            addCriterion("TenderID <=", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidIn(List<Integer> values) {
            addCriterion("TenderID in", values, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotIn(List<Integer> values) {
            addCriterion("TenderID not in", values, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidBetween(Integer value1, Integer value2) {
            addCriterion("TenderID between", value1, value2, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotBetween(Integer value1, Integer value2) {
            addCriterion("TenderID not between", value1, value2, "tenderid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidIsNull() {
            addCriterion("BiddingProductID is null");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidIsNotNull() {
            addCriterion("BiddingProductID is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidEqualTo(Integer value) {
            addCriterion("BiddingProductID =", value, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidNotEqualTo(Integer value) {
            addCriterion("BiddingProductID <>", value, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidGreaterThan(Integer value) {
            addCriterion("BiddingProductID >", value, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BiddingProductID >=", value, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidLessThan(Integer value) {
            addCriterion("BiddingProductID <", value, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidLessThanOrEqualTo(Integer value) {
            addCriterion("BiddingProductID <=", value, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidIn(List<Integer> values) {
            addCriterion("BiddingProductID in", values, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidNotIn(List<Integer> values) {
            addCriterion("BiddingProductID not in", values, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidBetween(Integer value1, Integer value2) {
            addCriterion("BiddingProductID between", value1, value2, "biddingproductid");
            return (Criteria) this;
        }

        public Criteria andBiddingproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("BiddingProductID not between", value1, value2, "biddingproductid");
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