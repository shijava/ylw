package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayMarginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayMarginExample() {
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

        public Criteria andPaymarginidIsNull() {
            addCriterion("PayMarginID is null");
            return (Criteria) this;
        }

        public Criteria andPaymarginidIsNotNull() {
            addCriterion("PayMarginID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymarginidEqualTo(Integer value) {
            addCriterion("PayMarginID =", value, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidNotEqualTo(Integer value) {
            addCriterion("PayMarginID <>", value, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidGreaterThan(Integer value) {
            addCriterion("PayMarginID >", value, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayMarginID >=", value, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidLessThan(Integer value) {
            addCriterion("PayMarginID <", value, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidLessThanOrEqualTo(Integer value) {
            addCriterion("PayMarginID <=", value, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidIn(List<Integer> values) {
            addCriterion("PayMarginID in", values, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidNotIn(List<Integer> values) {
            addCriterion("PayMarginID not in", values, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidBetween(Integer value1, Integer value2) {
            addCriterion("PayMarginID between", value1, value2, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayMarginID not between", value1, value2, "paymarginid");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoIsNull() {
            addCriterion("PayMarginNo is null");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoIsNotNull() {
            addCriterion("PayMarginNo is not null");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoEqualTo(String value) {
            addCriterion("PayMarginNo =", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoNotEqualTo(String value) {
            addCriterion("PayMarginNo <>", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoGreaterThan(String value) {
            addCriterion("PayMarginNo >", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoGreaterThanOrEqualTo(String value) {
            addCriterion("PayMarginNo >=", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoLessThan(String value) {
            addCriterion("PayMarginNo <", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoLessThanOrEqualTo(String value) {
            addCriterion("PayMarginNo <=", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoLike(String value) {
            addCriterion("PayMarginNo like", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoNotLike(String value) {
            addCriterion("PayMarginNo not like", value, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoIn(List<String> values) {
            addCriterion("PayMarginNo in", values, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoNotIn(List<String> values) {
            addCriterion("PayMarginNo not in", values, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoBetween(String value1, String value2) {
            addCriterion("PayMarginNo between", value1, value2, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andPaymarginnoNotBetween(String value1, String value2) {
            addCriterion("PayMarginNo not between", value1, value2, "paymarginno");
            return (Criteria) this;
        }

        public Criteria andMargintypeIsNull() {
            addCriterion("MarginType is null");
            return (Criteria) this;
        }

        public Criteria andMargintypeIsNotNull() {
            addCriterion("MarginType is not null");
            return (Criteria) this;
        }

        public Criteria andMargintypeEqualTo(Integer value) {
            addCriterion("MarginType =", value, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeNotEqualTo(Integer value) {
            addCriterion("MarginType <>", value, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeGreaterThan(Integer value) {
            addCriterion("MarginType >", value, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MarginType >=", value, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeLessThan(Integer value) {
            addCriterion("MarginType <", value, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeLessThanOrEqualTo(Integer value) {
            addCriterion("MarginType <=", value, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeIn(List<Integer> values) {
            addCriterion("MarginType in", values, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeNotIn(List<Integer> values) {
            addCriterion("MarginType not in", values, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeBetween(Integer value1, Integer value2) {
            addCriterion("MarginType between", value1, value2, "margintype");
            return (Criteria) this;
        }

        public Criteria andMargintypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MarginType not between", value1, value2, "margintype");
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

        public Criteria andPaymethodidIsNull() {
            addCriterion("PayMethodID is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodidIsNotNull() {
            addCriterion("PayMethodID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodidEqualTo(Integer value) {
            addCriterion("PayMethodID =", value, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidNotEqualTo(Integer value) {
            addCriterion("PayMethodID <>", value, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidGreaterThan(Integer value) {
            addCriterion("PayMethodID >", value, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayMethodID >=", value, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidLessThan(Integer value) {
            addCriterion("PayMethodID <", value, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidLessThanOrEqualTo(Integer value) {
            addCriterion("PayMethodID <=", value, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidIn(List<Integer> values) {
            addCriterion("PayMethodID in", values, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidNotIn(List<Integer> values) {
            addCriterion("PayMethodID not in", values, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidBetween(Integer value1, Integer value2) {
            addCriterion("PayMethodID between", value1, value2, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andPaymethodidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayMethodID not between", value1, value2, "paymethodid");
            return (Criteria) this;
        }

        public Criteria andIsauditIsNull() {
            addCriterion("IsAudit is null");
            return (Criteria) this;
        }

        public Criteria andIsauditIsNotNull() {
            addCriterion("IsAudit is not null");
            return (Criteria) this;
        }

        public Criteria andIsauditEqualTo(Integer value) {
            addCriterion("IsAudit =", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditNotEqualTo(Integer value) {
            addCriterion("IsAudit <>", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditGreaterThan(Integer value) {
            addCriterion("IsAudit >", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAudit >=", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditLessThan(Integer value) {
            addCriterion("IsAudit <", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditLessThanOrEqualTo(Integer value) {
            addCriterion("IsAudit <=", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditIn(List<Integer> values) {
            addCriterion("IsAudit in", values, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditNotIn(List<Integer> values) {
            addCriterion("IsAudit not in", values, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditBetween(Integer value1, Integer value2) {
            addCriterion("IsAudit between", value1, value2, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAudit not between", value1, value2, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIscloseIsNull() {
            addCriterion("IsClose is null");
            return (Criteria) this;
        }

        public Criteria andIscloseIsNotNull() {
            addCriterion("IsClose is not null");
            return (Criteria) this;
        }

        public Criteria andIscloseEqualTo(Integer value) {
            addCriterion("IsClose =", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotEqualTo(Integer value) {
            addCriterion("IsClose <>", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseGreaterThan(Integer value) {
            addCriterion("IsClose >", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsClose >=", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseLessThan(Integer value) {
            addCriterion("IsClose <", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseLessThanOrEqualTo(Integer value) {
            addCriterion("IsClose <=", value, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseIn(List<Integer> values) {
            addCriterion("IsClose in", values, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotIn(List<Integer> values) {
            addCriterion("IsClose not in", values, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseBetween(Integer value1, Integer value2) {
            addCriterion("IsClose between", value1, value2, "isclose");
            return (Criteria) this;
        }

        public Criteria andIscloseNotBetween(Integer value1, Integer value2) {
            addCriterion("IsClose not between", value1, value2, "isclose");
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

        public Criteria andEdittimeIsNull() {
            addCriterion("EditTime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("EditTime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("EditTime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("EditTime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("EditTime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EditTime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("EditTime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("EditTime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("EditTime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("EditTime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("EditTime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("EditTime not between", value1, value2, "edittime");
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

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("AdminID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("AdminID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("AdminID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("AdminID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("AdminID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("AdminID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("AdminID like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("AdminID not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("AdminID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("AdminID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("AdminID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("AdminID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andIsdzIsNull() {
            addCriterion("IsDZ is null");
            return (Criteria) this;
        }

        public Criteria andIsdzIsNotNull() {
            addCriterion("IsDZ is not null");
            return (Criteria) this;
        }

        public Criteria andIsdzEqualTo(Integer value) {
            addCriterion("IsDZ =", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzNotEqualTo(Integer value) {
            addCriterion("IsDZ <>", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzGreaterThan(Integer value) {
            addCriterion("IsDZ >", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDZ >=", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzLessThan(Integer value) {
            addCriterion("IsDZ <", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzLessThanOrEqualTo(Integer value) {
            addCriterion("IsDZ <=", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzIn(List<Integer> values) {
            addCriterion("IsDZ in", values, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzNotIn(List<Integer> values) {
            addCriterion("IsDZ not in", values, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzBetween(Integer value1, Integer value2) {
            addCriterion("IsDZ between", value1, value2, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDZ not between", value1, value2, "isdz");
            return (Criteria) this;
        }

        public Criteria andDztimeIsNull() {
            addCriterion("DZTime is null");
            return (Criteria) this;
        }

        public Criteria andDztimeIsNotNull() {
            addCriterion("DZTime is not null");
            return (Criteria) this;
        }

        public Criteria andDztimeEqualTo(Date value) {
            addCriterion("DZTime =", value, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeNotEqualTo(Date value) {
            addCriterion("DZTime <>", value, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeGreaterThan(Date value) {
            addCriterion("DZTime >", value, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DZTime >=", value, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeLessThan(Date value) {
            addCriterion("DZTime <", value, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeLessThanOrEqualTo(Date value) {
            addCriterion("DZTime <=", value, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeIn(List<Date> values) {
            addCriterion("DZTime in", values, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeNotIn(List<Date> values) {
            addCriterion("DZTime not in", values, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeBetween(Date value1, Date value2) {
            addCriterion("DZTime between", value1, value2, "dztime");
            return (Criteria) this;
        }

        public Criteria andDztimeNotBetween(Date value1, Date value2) {
            addCriterion("DZTime not between", value1, value2, "dztime");
            return (Criteria) this;
        }

        public Criteria andDzadminidIsNull() {
            addCriterion("DZAdminID is null");
            return (Criteria) this;
        }

        public Criteria andDzadminidIsNotNull() {
            addCriterion("DZAdminID is not null");
            return (Criteria) this;
        }

        public Criteria andDzadminidEqualTo(Integer value) {
            addCriterion("DZAdminID =", value, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidNotEqualTo(Integer value) {
            addCriterion("DZAdminID <>", value, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidGreaterThan(Integer value) {
            addCriterion("DZAdminID >", value, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DZAdminID >=", value, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidLessThan(Integer value) {
            addCriterion("DZAdminID <", value, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidLessThanOrEqualTo(Integer value) {
            addCriterion("DZAdminID <=", value, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidIn(List<Integer> values) {
            addCriterion("DZAdminID in", values, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidNotIn(List<Integer> values) {
            addCriterion("DZAdminID not in", values, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidBetween(Integer value1, Integer value2) {
            addCriterion("DZAdminID between", value1, value2, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminidNotBetween(Integer value1, Integer value2) {
            addCriterion("DZAdminID not between", value1, value2, "dzadminid");
            return (Criteria) this;
        }

        public Criteria andDzadminnameIsNull() {
            addCriterion("DZAdminName is null");
            return (Criteria) this;
        }

        public Criteria andDzadminnameIsNotNull() {
            addCriterion("DZAdminName is not null");
            return (Criteria) this;
        }

        public Criteria andDzadminnameEqualTo(String value) {
            addCriterion("DZAdminName =", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameNotEqualTo(String value) {
            addCriterion("DZAdminName <>", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameGreaterThan(String value) {
            addCriterion("DZAdminName >", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameGreaterThanOrEqualTo(String value) {
            addCriterion("DZAdminName >=", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameLessThan(String value) {
            addCriterion("DZAdminName <", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameLessThanOrEqualTo(String value) {
            addCriterion("DZAdminName <=", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameLike(String value) {
            addCriterion("DZAdminName like", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameNotLike(String value) {
            addCriterion("DZAdminName not like", value, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameIn(List<String> values) {
            addCriterion("DZAdminName in", values, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameNotIn(List<String> values) {
            addCriterion("DZAdminName not in", values, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameBetween(String value1, String value2) {
            addCriterion("DZAdminName between", value1, value2, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andDzadminnameNotBetween(String value1, String value2) {
            addCriterion("DZAdminName not between", value1, value2, "dzadminname");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjIsNull() {
            addCriterion("IsBackBZJ is null");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjIsNotNull() {
            addCriterion("IsBackBZJ is not null");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjEqualTo(Integer value) {
            addCriterion("IsBackBZJ =", value, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjNotEqualTo(Integer value) {
            addCriterion("IsBackBZJ <>", value, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjGreaterThan(Integer value) {
            addCriterion("IsBackBZJ >", value, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBackBZJ >=", value, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjLessThan(Integer value) {
            addCriterion("IsBackBZJ <", value, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjLessThanOrEqualTo(Integer value) {
            addCriterion("IsBackBZJ <=", value, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjIn(List<Integer> values) {
            addCriterion("IsBackBZJ in", values, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjNotIn(List<Integer> values) {
            addCriterion("IsBackBZJ not in", values, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjBetween(Integer value1, Integer value2) {
            addCriterion("IsBackBZJ between", value1, value2, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andIsbackbzjNotBetween(Integer value1, Integer value2) {
            addCriterion("IsBackBZJ not between", value1, value2, "isbackbzj");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNull() {
            addCriterion("BackTime is null");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNotNull() {
            addCriterion("BackTime is not null");
            return (Criteria) this;
        }

        public Criteria andBacktimeEqualTo(Date value) {
            addCriterion("BackTime =", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotEqualTo(Date value) {
            addCriterion("BackTime <>", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThan(Date value) {
            addCriterion("BackTime >", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BackTime >=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThan(Date value) {
            addCriterion("BackTime <", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThanOrEqualTo(Date value) {
            addCriterion("BackTime <=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeIn(List<Date> values) {
            addCriterion("BackTime in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotIn(List<Date> values) {
            addCriterion("BackTime not in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeBetween(Date value1, Date value2) {
            addCriterion("BackTime between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotBetween(Date value1, Date value2) {
            addCriterion("BackTime not between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andBackadminidIsNull() {
            addCriterion("BackAdminID is null");
            return (Criteria) this;
        }

        public Criteria andBackadminidIsNotNull() {
            addCriterion("BackAdminID is not null");
            return (Criteria) this;
        }

        public Criteria andBackadminidEqualTo(Integer value) {
            addCriterion("BackAdminID =", value, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidNotEqualTo(Integer value) {
            addCriterion("BackAdminID <>", value, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidGreaterThan(Integer value) {
            addCriterion("BackAdminID >", value, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackAdminID >=", value, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidLessThan(Integer value) {
            addCriterion("BackAdminID <", value, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidLessThanOrEqualTo(Integer value) {
            addCriterion("BackAdminID <=", value, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidIn(List<Integer> values) {
            addCriterion("BackAdminID in", values, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidNotIn(List<Integer> values) {
            addCriterion("BackAdminID not in", values, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidBetween(Integer value1, Integer value2) {
            addCriterion("BackAdminID between", value1, value2, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminidNotBetween(Integer value1, Integer value2) {
            addCriterion("BackAdminID not between", value1, value2, "backadminid");
            return (Criteria) this;
        }

        public Criteria andBackadminnameIsNull() {
            addCriterion("BackAdminName is null");
            return (Criteria) this;
        }

        public Criteria andBackadminnameIsNotNull() {
            addCriterion("BackAdminName is not null");
            return (Criteria) this;
        }

        public Criteria andBackadminnameEqualTo(String value) {
            addCriterion("BackAdminName =", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameNotEqualTo(String value) {
            addCriterion("BackAdminName <>", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameGreaterThan(String value) {
            addCriterion("BackAdminName >", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameGreaterThanOrEqualTo(String value) {
            addCriterion("BackAdminName >=", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameLessThan(String value) {
            addCriterion("BackAdminName <", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameLessThanOrEqualTo(String value) {
            addCriterion("BackAdminName <=", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameLike(String value) {
            addCriterion("BackAdminName like", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameNotLike(String value) {
            addCriterion("BackAdminName not like", value, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameIn(List<String> values) {
            addCriterion("BackAdminName in", values, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameNotIn(List<String> values) {
            addCriterion("BackAdminName not in", values, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameBetween(String value1, String value2) {
            addCriterion("BackAdminName between", value1, value2, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackadminnameNotBetween(String value1, String value2) {
            addCriterion("BackAdminName not between", value1, value2, "backadminname");
            return (Criteria) this;
        }

        public Criteria andBackpriceIsNull() {
            addCriterion("BackPrice is null");
            return (Criteria) this;
        }

        public Criteria andBackpriceIsNotNull() {
            addCriterion("BackPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBackpriceEqualTo(Double value) {
            addCriterion("BackPrice =", value, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceNotEqualTo(Double value) {
            addCriterion("BackPrice <>", value, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceGreaterThan(Double value) {
            addCriterion("BackPrice >", value, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("BackPrice >=", value, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceLessThan(Double value) {
            addCriterion("BackPrice <", value, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceLessThanOrEqualTo(Double value) {
            addCriterion("BackPrice <=", value, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceIn(List<Double> values) {
            addCriterion("BackPrice in", values, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceNotIn(List<Double> values) {
            addCriterion("BackPrice not in", values, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceBetween(Double value1, Double value2) {
            addCriterion("BackPrice between", value1, value2, "backprice");
            return (Criteria) this;
        }

        public Criteria andBackpriceNotBetween(Double value1, Double value2) {
            addCriterion("BackPrice not between", value1, value2, "backprice");
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