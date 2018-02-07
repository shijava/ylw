package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayOrderRecordInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayOrderRecordInvoiceExample() {
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

        public Criteria andInvoiceidIsNull() {
            addCriterion("InvoiceID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNotNull() {
            addCriterion("InvoiceID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidEqualTo(Integer value) {
            addCriterion("InvoiceID =", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotEqualTo(Integer value) {
            addCriterion("InvoiceID <>", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThan(Integer value) {
            addCriterion("InvoiceID >", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("InvoiceID >=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThan(Integer value) {
            addCriterion("InvoiceID <", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThanOrEqualTo(Integer value) {
            addCriterion("InvoiceID <=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIn(List<Integer> values) {
            addCriterion("InvoiceID in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotIn(List<Integer> values) {
            addCriterion("InvoiceID not in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidBetween(Integer value1, Integer value2) {
            addCriterion("InvoiceID between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("InvoiceID not between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidIsNull() {
            addCriterion("PayOrderRecordID is null");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidIsNotNull() {
            addCriterion("PayOrderRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidEqualTo(Integer value) {
            addCriterion("PayOrderRecordID =", value, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidNotEqualTo(Integer value) {
            addCriterion("PayOrderRecordID <>", value, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidGreaterThan(Integer value) {
            addCriterion("PayOrderRecordID >", value, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayOrderRecordID >=", value, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidLessThan(Integer value) {
            addCriterion("PayOrderRecordID <", value, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("PayOrderRecordID <=", value, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidIn(List<Integer> values) {
            addCriterion("PayOrderRecordID in", values, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidNotIn(List<Integer> values) {
            addCriterion("PayOrderRecordID not in", values, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidBetween(Integer value1, Integer value2) {
            addCriterion("PayOrderRecordID between", value1, value2, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayOrderRecordID not between", value1, value2, "payorderrecordid");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoIsNull() {
            addCriterion("PayOrderRecordNo is null");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoIsNotNull() {
            addCriterion("PayOrderRecordNo is not null");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoEqualTo(String value) {
            addCriterion("PayOrderRecordNo =", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoNotEqualTo(String value) {
            addCriterion("PayOrderRecordNo <>", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoGreaterThan(String value) {
            addCriterion("PayOrderRecordNo >", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoGreaterThanOrEqualTo(String value) {
            addCriterion("PayOrderRecordNo >=", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoLessThan(String value) {
            addCriterion("PayOrderRecordNo <", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoLessThanOrEqualTo(String value) {
            addCriterion("PayOrderRecordNo <=", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoLike(String value) {
            addCriterion("PayOrderRecordNo like", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoNotLike(String value) {
            addCriterion("PayOrderRecordNo not like", value, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoIn(List<String> values) {
            addCriterion("PayOrderRecordNo in", values, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoNotIn(List<String> values) {
            addCriterion("PayOrderRecordNo not in", values, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoBetween(String value1, String value2) {
            addCriterion("PayOrderRecordNo between", value1, value2, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andPayorderrecordnoNotBetween(String value1, String value2) {
            addCriterion("PayOrderRecordNo not between", value1, value2, "payorderrecordno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNull() {
            addCriterion("InvoiceNO is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("InvoiceNO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("InvoiceNO =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("InvoiceNO <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("InvoiceNO >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceNO >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("InvoiceNO <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("InvoiceNO <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("InvoiceNO like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("InvoiceNO not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("InvoiceNO in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("InvoiceNO not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("InvoiceNO between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("InvoiceNO not between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceIsNull() {
            addCriterion("InvoicePrice is null");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceIsNotNull() {
            addCriterion("InvoicePrice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceEqualTo(Double value) {
            addCriterion("InvoicePrice =", value, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceNotEqualTo(Double value) {
            addCriterion("InvoicePrice <>", value, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceGreaterThan(Double value) {
            addCriterion("InvoicePrice >", value, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("InvoicePrice >=", value, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceLessThan(Double value) {
            addCriterion("InvoicePrice <", value, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceLessThanOrEqualTo(Double value) {
            addCriterion("InvoicePrice <=", value, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceIn(List<Double> values) {
            addCriterion("InvoicePrice in", values, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceNotIn(List<Double> values) {
            addCriterion("InvoicePrice not in", values, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceBetween(Double value1, Double value2) {
            addCriterion("InvoicePrice between", value1, value2, "invoiceprice");
            return (Criteria) this;
        }

        public Criteria andInvoicepriceNotBetween(Double value1, Double value2) {
            addCriterion("InvoicePrice not between", value1, value2, "invoiceprice");
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