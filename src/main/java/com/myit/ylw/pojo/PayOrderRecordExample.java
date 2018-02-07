package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayOrderRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayOrderRecordExample() {
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

        public Criteria andOrderpricetotalIsNull() {
            addCriterion("OrderPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalIsNotNull() {
            addCriterion("OrderPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalEqualTo(Double value) {
            addCriterion("OrderPriceTotal =", value, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalNotEqualTo(Double value) {
            addCriterion("OrderPriceTotal <>", value, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalGreaterThan(Double value) {
            addCriterion("OrderPriceTotal >", value, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("OrderPriceTotal >=", value, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalLessThan(Double value) {
            addCriterion("OrderPriceTotal <", value, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalLessThanOrEqualTo(Double value) {
            addCriterion("OrderPriceTotal <=", value, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalIn(List<Double> values) {
            addCriterion("OrderPriceTotal in", values, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalNotIn(List<Double> values) {
            addCriterion("OrderPriceTotal not in", values, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalBetween(Double value1, Double value2) {
            addCriterion("OrderPriceTotal between", value1, value2, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andOrderpricetotalNotBetween(Double value1, Double value2) {
            addCriterion("OrderPriceTotal not between", value1, value2, "orderpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalIsNull() {
            addCriterion("PointPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalIsNotNull() {
            addCriterion("PointPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalEqualTo(Double value) {
            addCriterion("PointPriceTotal =", value, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalNotEqualTo(Double value) {
            addCriterion("PointPriceTotal <>", value, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalGreaterThan(Double value) {
            addCriterion("PointPriceTotal >", value, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("PointPriceTotal >=", value, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalLessThan(Double value) {
            addCriterion("PointPriceTotal <", value, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalLessThanOrEqualTo(Double value) {
            addCriterion("PointPriceTotal <=", value, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalIn(List<Double> values) {
            addCriterion("PointPriceTotal in", values, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalNotIn(List<Double> values) {
            addCriterion("PointPriceTotal not in", values, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalBetween(Double value1, Double value2) {
            addCriterion("PointPriceTotal between", value1, value2, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andPointpricetotalNotBetween(Double value1, Double value2) {
            addCriterion("PointPriceTotal not between", value1, value2, "pointpricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalIsNull() {
            addCriterion("RealPayPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalIsNotNull() {
            addCriterion("RealPayPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalEqualTo(Double value) {
            addCriterion("RealPayPriceTotal =", value, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalNotEqualTo(Double value) {
            addCriterion("RealPayPriceTotal <>", value, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalGreaterThan(Double value) {
            addCriterion("RealPayPriceTotal >", value, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("RealPayPriceTotal >=", value, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalLessThan(Double value) {
            addCriterion("RealPayPriceTotal <", value, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalLessThanOrEqualTo(Double value) {
            addCriterion("RealPayPriceTotal <=", value, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalIn(List<Double> values) {
            addCriterion("RealPayPriceTotal in", values, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalNotIn(List<Double> values) {
            addCriterion("RealPayPriceTotal not in", values, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalBetween(Double value1, Double value2) {
            addCriterion("RealPayPriceTotal between", value1, value2, "realpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andRealpaypricetotalNotBetween(Double value1, Double value2) {
            addCriterion("RealPayPriceTotal not between", value1, value2, "realpaypricetotal");
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

        public Criteria andOrdertypeIsNull() {
            addCriterion("OrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("OrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(Integer value) {
            addCriterion("OrderType =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(Integer value) {
            addCriterion("OrderType <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(Integer value) {
            addCriterion("OrderType >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderType >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(Integer value) {
            addCriterion("OrderType <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(Integer value) {
            addCriterion("OrderType <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<Integer> values) {
            addCriterion("OrderType in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<Integer> values) {
            addCriterion("OrderType not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(Integer value1, Integer value2) {
            addCriterion("OrderType between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderType not between", value1, value2, "ordertype");
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

        public Criteria andPaystateIsNull() {
            addCriterion("PayState is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("PayState is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(Integer value) {
            addCriterion("PayState =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(Integer value) {
            addCriterion("PayState <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(Integer value) {
            addCriterion("PayState >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayState >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(Integer value) {
            addCriterion("PayState <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(Integer value) {
            addCriterion("PayState <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<Integer> values) {
            addCriterion("PayState in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<Integer> values) {
            addCriterion("PayState not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(Integer value1, Integer value2) {
            addCriterion("PayState between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(Integer value1, Integer value2) {
            addCriterion("PayState not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeIsNull() {
            addCriterion("RealPayTime is null");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeIsNotNull() {
            addCriterion("RealPayTime is not null");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeEqualTo(Date value) {
            addCriterion("RealPayTime =", value, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeNotEqualTo(Date value) {
            addCriterion("RealPayTime <>", value, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeGreaterThan(Date value) {
            addCriterion("RealPayTime >", value, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RealPayTime >=", value, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeLessThan(Date value) {
            addCriterion("RealPayTime <", value, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeLessThanOrEqualTo(Date value) {
            addCriterion("RealPayTime <=", value, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeIn(List<Date> values) {
            addCriterion("RealPayTime in", values, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeNotIn(List<Date> values) {
            addCriterion("RealPayTime not in", values, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeBetween(Date value1, Date value2) {
            addCriterion("RealPayTime between", value1, value2, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andRealpaytimeNotBetween(Date value1, Date value2) {
            addCriterion("RealPayTime not between", value1, value2, "realpaytime");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalIsNull() {
            addCriterion("UsablePointPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalIsNotNull() {
            addCriterion("UsablePointPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalEqualTo(Double value) {
            addCriterion("UsablePointPriceTotal =", value, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalNotEqualTo(Double value) {
            addCriterion("UsablePointPriceTotal <>", value, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalGreaterThan(Double value) {
            addCriterion("UsablePointPriceTotal >", value, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("UsablePointPriceTotal >=", value, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalLessThan(Double value) {
            addCriterion("UsablePointPriceTotal <", value, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalLessThanOrEqualTo(Double value) {
            addCriterion("UsablePointPriceTotal <=", value, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalIn(List<Double> values) {
            addCriterion("UsablePointPriceTotal in", values, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalNotIn(List<Double> values) {
            addCriterion("UsablePointPriceTotal not in", values, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalBetween(Double value1, Double value2) {
            addCriterion("UsablePointPriceTotal between", value1, value2, "usablepointpricetotal");
            return (Criteria) this;
        }

        public Criteria andUsablepointpricetotalNotBetween(Double value1, Double value2) {
            addCriterion("UsablePointPriceTotal not between", value1, value2, "usablepointpricetotal");
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