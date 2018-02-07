package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignerOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignerOrderExample() {
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
            addCriterion("DorderNO is null");
            return (Criteria) this;
        }

        public Criteria andDordernoIsNotNull() {
            addCriterion("DorderNO is not null");
            return (Criteria) this;
        }

        public Criteria andDordernoEqualTo(String value) {
            addCriterion("DorderNO =", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotEqualTo(String value) {
            addCriterion("DorderNO <>", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoGreaterThan(String value) {
            addCriterion("DorderNO >", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoGreaterThanOrEqualTo(String value) {
            addCriterion("DorderNO >=", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoLessThan(String value) {
            addCriterion("DorderNO <", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoLessThanOrEqualTo(String value) {
            addCriterion("DorderNO <=", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoLike(String value) {
            addCriterion("DorderNO like", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotLike(String value) {
            addCriterion("DorderNO not like", value, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoIn(List<String> values) {
            addCriterion("DorderNO in", values, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotIn(List<String> values) {
            addCriterion("DorderNO not in", values, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoBetween(String value1, String value2) {
            addCriterion("DorderNO between", value1, value2, "dorderno");
            return (Criteria) this;
        }

        public Criteria andDordernoNotBetween(String value1, String value2) {
            addCriterion("DorderNO not between", value1, value2, "dorderno");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeIsNull() {
            addCriterion("OrderDatetime is null");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeIsNotNull() {
            addCriterion("OrderDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeEqualTo(Date value) {
            addCriterion("OrderDatetime =", value, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeNotEqualTo(Date value) {
            addCriterion("OrderDatetime <>", value, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeGreaterThan(Date value) {
            addCriterion("OrderDatetime >", value, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderDatetime >=", value, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeLessThan(Date value) {
            addCriterion("OrderDatetime <", value, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderDatetime <=", value, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeIn(List<Date> values) {
            addCriterion("OrderDatetime in", values, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeNotIn(List<Date> values) {
            addCriterion("OrderDatetime not in", values, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeBetween(Date value1, Date value2) {
            addCriterion("OrderDatetime between", value1, value2, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andOrderdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderDatetime not between", value1, value2, "orderdatetime");
            return (Criteria) this;
        }

        public Criteria andDesignworksidIsNull() {
            addCriterion("DesignWorksID is null");
            return (Criteria) this;
        }

        public Criteria andDesignworksidIsNotNull() {
            addCriterion("DesignWorksID is not null");
            return (Criteria) this;
        }

        public Criteria andDesignworksidEqualTo(Integer value) {
            addCriterion("DesignWorksID =", value, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidNotEqualTo(Integer value) {
            addCriterion("DesignWorksID <>", value, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidGreaterThan(Integer value) {
            addCriterion("DesignWorksID >", value, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DesignWorksID >=", value, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidLessThan(Integer value) {
            addCriterion("DesignWorksID <", value, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidLessThanOrEqualTo(Integer value) {
            addCriterion("DesignWorksID <=", value, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidIn(List<Integer> values) {
            addCriterion("DesignWorksID in", values, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidNotIn(List<Integer> values) {
            addCriterion("DesignWorksID not in", values, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidBetween(Integer value1, Integer value2) {
            addCriterion("DesignWorksID between", value1, value2, "designworksid");
            return (Criteria) this;
        }

        public Criteria andDesignworksidNotBetween(Integer value1, Integer value2) {
            addCriterion("DesignWorksID not between", value1, value2, "designworksid");
            return (Criteria) this;
        }

        public Criteria andOrderpricesIsNull() {
            addCriterion("OrderPrices is null");
            return (Criteria) this;
        }

        public Criteria andOrderpricesIsNotNull() {
            addCriterion("OrderPrices is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpricesEqualTo(Double value) {
            addCriterion("OrderPrices =", value, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesNotEqualTo(Double value) {
            addCriterion("OrderPrices <>", value, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesGreaterThan(Double value) {
            addCriterion("OrderPrices >", value, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesGreaterThanOrEqualTo(Double value) {
            addCriterion("OrderPrices >=", value, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesLessThan(Double value) {
            addCriterion("OrderPrices <", value, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesLessThanOrEqualTo(Double value) {
            addCriterion("OrderPrices <=", value, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesIn(List<Double> values) {
            addCriterion("OrderPrices in", values, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesNotIn(List<Double> values) {
            addCriterion("OrderPrices not in", values, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesBetween(Double value1, Double value2) {
            addCriterion("OrderPrices between", value1, value2, "orderprices");
            return (Criteria) this;
        }

        public Criteria andOrderpricesNotBetween(Double value1, Double value2) {
            addCriterion("OrderPrices not between", value1, value2, "orderprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesIsNull() {
            addCriterion("RealPayPrices is null");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesIsNotNull() {
            addCriterion("RealPayPrices is not null");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesEqualTo(Double value) {
            addCriterion("RealPayPrices =", value, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesNotEqualTo(Double value) {
            addCriterion("RealPayPrices <>", value, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesGreaterThan(Double value) {
            addCriterion("RealPayPrices >", value, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesGreaterThanOrEqualTo(Double value) {
            addCriterion("RealPayPrices >=", value, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesLessThan(Double value) {
            addCriterion("RealPayPrices <", value, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesLessThanOrEqualTo(Double value) {
            addCriterion("RealPayPrices <=", value, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesIn(List<Double> values) {
            addCriterion("RealPayPrices in", values, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesNotIn(List<Double> values) {
            addCriterion("RealPayPrices not in", values, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesBetween(Double value1, Double value2) {
            addCriterion("RealPayPrices between", value1, value2, "realpayprices");
            return (Criteria) this;
        }

        public Criteria andRealpaypricesNotBetween(Double value1, Double value2) {
            addCriterion("RealPayPrices not between", value1, value2, "realpayprices");
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

        public Criteria andAppealstateIsNull() {
            addCriterion("AppealState is null");
            return (Criteria) this;
        }

        public Criteria andAppealstateIsNotNull() {
            addCriterion("AppealState is not null");
            return (Criteria) this;
        }

        public Criteria andAppealstateEqualTo(Integer value) {
            addCriterion("AppealState =", value, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateNotEqualTo(Integer value) {
            addCriterion("AppealState <>", value, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateGreaterThan(Integer value) {
            addCriterion("AppealState >", value, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppealState >=", value, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateLessThan(Integer value) {
            addCriterion("AppealState <", value, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateLessThanOrEqualTo(Integer value) {
            addCriterion("AppealState <=", value, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateIn(List<Integer> values) {
            addCriterion("AppealState in", values, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateNotIn(List<Integer> values) {
            addCriterion("AppealState not in", values, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateBetween(Integer value1, Integer value2) {
            addCriterion("AppealState between", value1, value2, "appealstate");
            return (Criteria) this;
        }

        public Criteria andAppealstateNotBetween(Integer value1, Integer value2) {
            addCriterion("AppealState not between", value1, value2, "appealstate");
            return (Criteria) this;
        }

        public Criteria andIsappealIsNull() {
            addCriterion("IsAppeal is null");
            return (Criteria) this;
        }

        public Criteria andIsappealIsNotNull() {
            addCriterion("IsAppeal is not null");
            return (Criteria) this;
        }

        public Criteria andIsappealEqualTo(Integer value) {
            addCriterion("IsAppeal =", value, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealNotEqualTo(Integer value) {
            addCriterion("IsAppeal <>", value, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealGreaterThan(Integer value) {
            addCriterion("IsAppeal >", value, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAppeal >=", value, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealLessThan(Integer value) {
            addCriterion("IsAppeal <", value, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealLessThanOrEqualTo(Integer value) {
            addCriterion("IsAppeal <=", value, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealIn(List<Integer> values) {
            addCriterion("IsAppeal in", values, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealNotIn(List<Integer> values) {
            addCriterion("IsAppeal not in", values, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealBetween(Integer value1, Integer value2) {
            addCriterion("IsAppeal between", value1, value2, "isappeal");
            return (Criteria) this;
        }

        public Criteria andIsappealNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAppeal not between", value1, value2, "isappeal");
            return (Criteria) this;
        }

        public Criteria andBulleruseridIsNull() {
            addCriterion("BullerUserID is null");
            return (Criteria) this;
        }

        public Criteria andBulleruseridIsNotNull() {
            addCriterion("BullerUserID is not null");
            return (Criteria) this;
        }

        public Criteria andBulleruseridEqualTo(Integer value) {
            addCriterion("BullerUserID =", value, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridNotEqualTo(Integer value) {
            addCriterion("BullerUserID <>", value, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridGreaterThan(Integer value) {
            addCriterion("BullerUserID >", value, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("BullerUserID >=", value, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridLessThan(Integer value) {
            addCriterion("BullerUserID <", value, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridLessThanOrEqualTo(Integer value) {
            addCriterion("BullerUserID <=", value, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridIn(List<Integer> values) {
            addCriterion("BullerUserID in", values, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridNotIn(List<Integer> values) {
            addCriterion("BullerUserID not in", values, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridBetween(Integer value1, Integer value2) {
            addCriterion("BullerUserID between", value1, value2, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andBulleruseridNotBetween(Integer value1, Integer value2) {
            addCriterion("BullerUserID not between", value1, value2, "bulleruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridIsNull() {
            addCriterion("DesignerUserID is null");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridIsNotNull() {
            addCriterion("DesignerUserID is not null");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridEqualTo(Integer value) {
            addCriterion("DesignerUserID =", value, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridNotEqualTo(Integer value) {
            addCriterion("DesignerUserID <>", value, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridGreaterThan(Integer value) {
            addCriterion("DesignerUserID >", value, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DesignerUserID >=", value, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridLessThan(Integer value) {
            addCriterion("DesignerUserID <", value, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridLessThanOrEqualTo(Integer value) {
            addCriterion("DesignerUserID <=", value, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridIn(List<Integer> values) {
            addCriterion("DesignerUserID in", values, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridNotIn(List<Integer> values) {
            addCriterion("DesignerUserID not in", values, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridBetween(Integer value1, Integer value2) {
            addCriterion("DesignerUserID between", value1, value2, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andDesigneruseridNotBetween(Integer value1, Integer value2) {
            addCriterion("DesignerUserID not between", value1, value2, "designeruserid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidIsNull() {
            addCriterion("PayMethodsID is null");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidIsNotNull() {
            addCriterion("PayMethodsID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidEqualTo(Integer value) {
            addCriterion("PayMethodsID =", value, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidNotEqualTo(Integer value) {
            addCriterion("PayMethodsID <>", value, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidGreaterThan(Integer value) {
            addCriterion("PayMethodsID >", value, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayMethodsID >=", value, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidLessThan(Integer value) {
            addCriterion("PayMethodsID <", value, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidLessThanOrEqualTo(Integer value) {
            addCriterion("PayMethodsID <=", value, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidIn(List<Integer> values) {
            addCriterion("PayMethodsID in", values, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidNotIn(List<Integer> values) {
            addCriterion("PayMethodsID not in", values, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidBetween(Integer value1, Integer value2) {
            addCriterion("PayMethodsID between", value1, value2, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andPaymethodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayMethodsID not between", value1, value2, "paymethodsid");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceIsNull() {
            addCriterion("YlWPayPrice is null");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceIsNotNull() {
            addCriterion("YlWPayPrice is not null");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceEqualTo(Double value) {
            addCriterion("YlWPayPrice =", value, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceNotEqualTo(Double value) {
            addCriterion("YlWPayPrice <>", value, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceGreaterThan(Double value) {
            addCriterion("YlWPayPrice >", value, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceGreaterThanOrEqualTo(Double value) {
            addCriterion("YlWPayPrice >=", value, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceLessThan(Double value) {
            addCriterion("YlWPayPrice <", value, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceLessThanOrEqualTo(Double value) {
            addCriterion("YlWPayPrice <=", value, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceIn(List<Double> values) {
            addCriterion("YlWPayPrice in", values, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceNotIn(List<Double> values) {
            addCriterion("YlWPayPrice not in", values, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceBetween(Double value1, Double value2) {
            addCriterion("YlWPayPrice between", value1, value2, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andYlwpaypriceNotBetween(Double value1, Double value2) {
            addCriterion("YlWPayPrice not between", value1, value2, "ylwpayprice");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteIsNull() {
            addCriterion("CancelOrderNote is null");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteIsNotNull() {
            addCriterion("CancelOrderNote is not null");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteEqualTo(String value) {
            addCriterion("CancelOrderNote =", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteNotEqualTo(String value) {
            addCriterion("CancelOrderNote <>", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteGreaterThan(String value) {
            addCriterion("CancelOrderNote >", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteGreaterThanOrEqualTo(String value) {
            addCriterion("CancelOrderNote >=", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteLessThan(String value) {
            addCriterion("CancelOrderNote <", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteLessThanOrEqualTo(String value) {
            addCriterion("CancelOrderNote <=", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteLike(String value) {
            addCriterion("CancelOrderNote like", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteNotLike(String value) {
            addCriterion("CancelOrderNote not like", value, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteIn(List<String> values) {
            addCriterion("CancelOrderNote in", values, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteNotIn(List<String> values) {
            addCriterion("CancelOrderNote not in", values, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteBetween(String value1, String value2) {
            addCriterion("CancelOrderNote between", value1, value2, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andCancelordernoteNotBetween(String value1, String value2) {
            addCriterion("CancelOrderNote not between", value1, value2, "cancelordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteIsNull() {
            addCriterion("GiveUpOrderNote is null");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteIsNotNull() {
            addCriterion("GiveUpOrderNote is not null");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteEqualTo(String value) {
            addCriterion("GiveUpOrderNote =", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteNotEqualTo(String value) {
            addCriterion("GiveUpOrderNote <>", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteGreaterThan(String value) {
            addCriterion("GiveUpOrderNote >", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteGreaterThanOrEqualTo(String value) {
            addCriterion("GiveUpOrderNote >=", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteLessThan(String value) {
            addCriterion("GiveUpOrderNote <", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteLessThanOrEqualTo(String value) {
            addCriterion("GiveUpOrderNote <=", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteLike(String value) {
            addCriterion("GiveUpOrderNote like", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteNotLike(String value) {
            addCriterion("GiveUpOrderNote not like", value, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteIn(List<String> values) {
            addCriterion("GiveUpOrderNote in", values, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteNotIn(List<String> values) {
            addCriterion("GiveUpOrderNote not in", values, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteBetween(String value1, String value2) {
            addCriterion("GiveUpOrderNote between", value1, value2, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andGiveupordernoteNotBetween(String value1, String value2) {
            addCriterion("GiveUpOrderNote not between", value1, value2, "giveupordernote");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoIsNull() {
            addCriterion("DZ_PayOrderRecordNo is null");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoIsNotNull() {
            addCriterion("DZ_PayOrderRecordNo is not null");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoEqualTo(String value) {
            addCriterion("DZ_PayOrderRecordNo =", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoNotEqualTo(String value) {
            addCriterion("DZ_PayOrderRecordNo <>", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoGreaterThan(String value) {
            addCriterion("DZ_PayOrderRecordNo >", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoGreaterThanOrEqualTo(String value) {
            addCriterion("DZ_PayOrderRecordNo >=", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoLessThan(String value) {
            addCriterion("DZ_PayOrderRecordNo <", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoLessThanOrEqualTo(String value) {
            addCriterion("DZ_PayOrderRecordNo <=", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoLike(String value) {
            addCriterion("DZ_PayOrderRecordNo like", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoNotLike(String value) {
            addCriterion("DZ_PayOrderRecordNo not like", value, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoIn(List<String> values) {
            addCriterion("DZ_PayOrderRecordNo in", values, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoNotIn(List<String> values) {
            addCriterion("DZ_PayOrderRecordNo not in", values, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoBetween(String value1, String value2) {
            addCriterion("DZ_PayOrderRecordNo between", value1, value2, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPayorderrecordnoNotBetween(String value1, String value2) {
            addCriterion("DZ_PayOrderRecordNo not between", value1, value2, "dzPayorderrecordno");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalIsNull() {
            addCriterion("DZ_PointPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalIsNotNull() {
            addCriterion("DZ_PointPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalEqualTo(Double value) {
            addCriterion("DZ_PointPriceTotal =", value, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalNotEqualTo(Double value) {
            addCriterion("DZ_PointPriceTotal <>", value, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalGreaterThan(Double value) {
            addCriterion("DZ_PointPriceTotal >", value, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("DZ_PointPriceTotal >=", value, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalLessThan(Double value) {
            addCriterion("DZ_PointPriceTotal <", value, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalLessThanOrEqualTo(Double value) {
            addCriterion("DZ_PointPriceTotal <=", value, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalIn(List<Double> values) {
            addCriterion("DZ_PointPriceTotal in", values, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalNotIn(List<Double> values) {
            addCriterion("DZ_PointPriceTotal not in", values, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalBetween(Double value1, Double value2) {
            addCriterion("DZ_PointPriceTotal between", value1, value2, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzPointpricetotalNotBetween(Double value1, Double value2) {
            addCriterion("DZ_PointPriceTotal not between", value1, value2, "dzPointpricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalIsNull() {
            addCriterion("DZ_RealPayPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalIsNotNull() {
            addCriterion("DZ_RealPayPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalEqualTo(Double value) {
            addCriterion("DZ_RealPayPriceTotal =", value, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalNotEqualTo(Double value) {
            addCriterion("DZ_RealPayPriceTotal <>", value, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalGreaterThan(Double value) {
            addCriterion("DZ_RealPayPriceTotal >", value, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("DZ_RealPayPriceTotal >=", value, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalLessThan(Double value) {
            addCriterion("DZ_RealPayPriceTotal <", value, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalLessThanOrEqualTo(Double value) {
            addCriterion("DZ_RealPayPriceTotal <=", value, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalIn(List<Double> values) {
            addCriterion("DZ_RealPayPriceTotal in", values, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalNotIn(List<Double> values) {
            addCriterion("DZ_RealPayPriceTotal not in", values, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalBetween(Double value1, Double value2) {
            addCriterion("DZ_RealPayPriceTotal between", value1, value2, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaypricetotalNotBetween(Double value1, Double value2) {
            addCriterion("DZ_RealPayPriceTotal not between", value1, value2, "dzRealpaypricetotal");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeIsNull() {
            addCriterion("DZ_RealPayTime is null");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeIsNotNull() {
            addCriterion("DZ_RealPayTime is not null");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeEqualTo(Date value) {
            addCriterion("DZ_RealPayTime =", value, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeNotEqualTo(Date value) {
            addCriterion("DZ_RealPayTime <>", value, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeGreaterThan(Date value) {
            addCriterion("DZ_RealPayTime >", value, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DZ_RealPayTime >=", value, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeLessThan(Date value) {
            addCriterion("DZ_RealPayTime <", value, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeLessThanOrEqualTo(Date value) {
            addCriterion("DZ_RealPayTime <=", value, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeIn(List<Date> values) {
            addCriterion("DZ_RealPayTime in", values, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeNotIn(List<Date> values) {
            addCriterion("DZ_RealPayTime not in", values, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeBetween(Date value1, Date value2) {
            addCriterion("DZ_RealPayTime between", value1, value2, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andDzRealpaytimeNotBetween(Date value1, Date value2) {
            addCriterion("DZ_RealPayTime not between", value1, value2, "dzRealpaytime");
            return (Criteria) this;
        }

        public Criteria andIsdzIsNull() {
            addCriterion("isDZ is null");
            return (Criteria) this;
        }

        public Criteria andIsdzIsNotNull() {
            addCriterion("isDZ is not null");
            return (Criteria) this;
        }

        public Criteria andIsdzEqualTo(Integer value) {
            addCriterion("isDZ =", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzNotEqualTo(Integer value) {
            addCriterion("isDZ <>", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzGreaterThan(Integer value) {
            addCriterion("isDZ >", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDZ >=", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzLessThan(Integer value) {
            addCriterion("isDZ <", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzLessThanOrEqualTo(Integer value) {
            addCriterion("isDZ <=", value, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzIn(List<Integer> values) {
            addCriterion("isDZ in", values, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzNotIn(List<Integer> values) {
            addCriterion("isDZ not in", values, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzBetween(Integer value1, Integer value2) {
            addCriterion("isDZ between", value1, value2, "isdz");
            return (Criteria) this;
        }

        public Criteria andIsdzNotBetween(Integer value1, Integer value2) {
            addCriterion("isDZ not between", value1, value2, "isdz");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeIsNull() {
            addCriterion("OrderCompleteTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeIsNotNull() {
            addCriterion("OrderCompleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeEqualTo(Date value) {
            addCriterion("OrderCompleteTime =", value, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeNotEqualTo(Date value) {
            addCriterion("OrderCompleteTime <>", value, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeGreaterThan(Date value) {
            addCriterion("OrderCompleteTime >", value, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderCompleteTime >=", value, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeLessThan(Date value) {
            addCriterion("OrderCompleteTime <", value, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderCompleteTime <=", value, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeIn(List<Date> values) {
            addCriterion("OrderCompleteTime in", values, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeNotIn(List<Date> values) {
            addCriterion("OrderCompleteTime not in", values, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeBetween(Date value1, Date value2) {
            addCriterion("OrderCompleteTime between", value1, value2, "ordercompletetime");
            return (Criteria) this;
        }

        public Criteria andOrdercompletetimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderCompleteTime not between", value1, value2, "ordercompletetime");
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