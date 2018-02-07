package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("ServiceID is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("ServiceID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Integer value) {
            addCriterion("ServiceID =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Integer value) {
            addCriterion("ServiceID <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Integer value) {
            addCriterion("ServiceID >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ServiceID >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Integer value) {
            addCriterion("ServiceID <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Integer value) {
            addCriterion("ServiceID <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Integer> values) {
            addCriterion("ServiceID in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Integer> values) {
            addCriterion("ServiceID not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Integer value1, Integer value2) {
            addCriterion("ServiceID between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ServiceID not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServicenoIsNull() {
            addCriterion("ServiceNO is null");
            return (Criteria) this;
        }

        public Criteria andServicenoIsNotNull() {
            addCriterion("ServiceNO is not null");
            return (Criteria) this;
        }

        public Criteria andServicenoEqualTo(String value) {
            addCriterion("ServiceNO =", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotEqualTo(String value) {
            addCriterion("ServiceNO <>", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoGreaterThan(String value) {
            addCriterion("ServiceNO >", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceNO >=", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLessThan(String value) {
            addCriterion("ServiceNO <", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLessThanOrEqualTo(String value) {
            addCriterion("ServiceNO <=", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLike(String value) {
            addCriterion("ServiceNO like", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotLike(String value) {
            addCriterion("ServiceNO not like", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoIn(List<String> values) {
            addCriterion("ServiceNO in", values, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotIn(List<String> values) {
            addCriterion("ServiceNO not in", values, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoBetween(String value1, String value2) {
            addCriterion("ServiceNO between", value1, value2, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotBetween(String value1, String value2) {
            addCriterion("ServiceNO not between", value1, value2, "serviceno");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("OrderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("OrderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("OrderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("OrderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("OrderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("OrderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("OrderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("OrderNO is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("OrderNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("OrderNO =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("OrderNO <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("OrderNO >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNO >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("OrderNO <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("OrderNO <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("OrderNO like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("OrderNO not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("OrderNO in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("OrderNO not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("OrderNO between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("OrderNO not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andSelleruseridIsNull() {
            addCriterion("SellerUserID is null");
            return (Criteria) this;
        }

        public Criteria andSelleruseridIsNotNull() {
            addCriterion("SellerUserID is not null");
            return (Criteria) this;
        }

        public Criteria andSelleruseridEqualTo(Integer value) {
            addCriterion("SellerUserID =", value, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridNotEqualTo(Integer value) {
            addCriterion("SellerUserID <>", value, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridGreaterThan(Integer value) {
            addCriterion("SellerUserID >", value, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellerUserID >=", value, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridLessThan(Integer value) {
            addCriterion("SellerUserID <", value, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridLessThanOrEqualTo(Integer value) {
            addCriterion("SellerUserID <=", value, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridIn(List<Integer> values) {
            addCriterion("SellerUserID in", values, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridNotIn(List<Integer> values) {
            addCriterion("SellerUserID not in", values, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridBetween(Integer value1, Integer value2) {
            addCriterion("SellerUserID between", value1, value2, "selleruserid");
            return (Criteria) this;
        }

        public Criteria andSelleruseridNotBetween(Integer value1, Integer value2) {
            addCriterion("SellerUserID not between", value1, value2, "selleruserid");
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

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
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

        public Criteria andServicestateIsNull() {
            addCriterion("ServiceState is null");
            return (Criteria) this;
        }

        public Criteria andServicestateIsNotNull() {
            addCriterion("ServiceState is not null");
            return (Criteria) this;
        }

        public Criteria andServicestateEqualTo(Integer value) {
            addCriterion("ServiceState =", value, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateNotEqualTo(Integer value) {
            addCriterion("ServiceState <>", value, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateGreaterThan(Integer value) {
            addCriterion("ServiceState >", value, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ServiceState >=", value, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateLessThan(Integer value) {
            addCriterion("ServiceState <", value, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateLessThanOrEqualTo(Integer value) {
            addCriterion("ServiceState <=", value, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateIn(List<Integer> values) {
            addCriterion("ServiceState in", values, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateNotIn(List<Integer> values) {
            addCriterion("ServiceState not in", values, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateBetween(Integer value1, Integer value2) {
            addCriterion("ServiceState between", value1, value2, "servicestate");
            return (Criteria) this;
        }

        public Criteria andServicestateNotBetween(Integer value1, Integer value2) {
            addCriterion("ServiceState not between", value1, value2, "servicestate");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("ShipName is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("ShipName is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("ShipName =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("ShipName <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("ShipName >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShipName >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("ShipName <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("ShipName <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("ShipName like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("ShipName not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("ShipName in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("ShipName not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("ShipName between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("ShipName not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNull() {
            addCriterion("ShipNO is null");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNotNull() {
            addCriterion("ShipNO is not null");
            return (Criteria) this;
        }

        public Criteria andShipnoEqualTo(String value) {
            addCriterion("ShipNO =", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotEqualTo(String value) {
            addCriterion("ShipNO <>", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThan(String value) {
            addCriterion("ShipNO >", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThanOrEqualTo(String value) {
            addCriterion("ShipNO >=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThan(String value) {
            addCriterion("ShipNO <", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThanOrEqualTo(String value) {
            addCriterion("ShipNO <=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLike(String value) {
            addCriterion("ShipNO like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotLike(String value) {
            addCriterion("ShipNO not like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoIn(List<String> values) {
            addCriterion("ShipNO in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotIn(List<String> values) {
            addCriterion("ShipNO not in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoBetween(String value1, String value2) {
            addCriterion("ShipNO between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotBetween(String value1, String value2) {
            addCriterion("ShipNO not between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("Consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("Consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("Consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("Consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("Consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("Consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("Consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("Consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("Consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("Consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("Consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("Consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("Consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("Consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneIsNull() {
            addCriterion("ConsigneeMobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneIsNotNull() {
            addCriterion("ConsigneeMobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneEqualTo(String value) {
            addCriterion("ConsigneeMobilePhone =", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneNotEqualTo(String value) {
            addCriterion("ConsigneeMobilePhone <>", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneGreaterThan(String value) {
            addCriterion("ConsigneeMobilePhone >", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ConsigneeMobilePhone >=", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneLessThan(String value) {
            addCriterion("ConsigneeMobilePhone <", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneLessThanOrEqualTo(String value) {
            addCriterion("ConsigneeMobilePhone <=", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneLike(String value) {
            addCriterion("ConsigneeMobilePhone like", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneNotLike(String value) {
            addCriterion("ConsigneeMobilePhone not like", value, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneIn(List<String> values) {
            addCriterion("ConsigneeMobilePhone in", values, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneNotIn(List<String> values) {
            addCriterion("ConsigneeMobilePhone not in", values, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneBetween(String value1, String value2) {
            addCriterion("ConsigneeMobilePhone between", value1, value2, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsigneemobilephoneNotBetween(String value1, String value2) {
            addCriterion("ConsigneeMobilePhone not between", value1, value2, "consigneemobilephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneIsNull() {
            addCriterion("ConsigneTelephone is null");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneIsNotNull() {
            addCriterion("ConsigneTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneEqualTo(String value) {
            addCriterion("ConsigneTelephone =", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneNotEqualTo(String value) {
            addCriterion("ConsigneTelephone <>", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneGreaterThan(String value) {
            addCriterion("ConsigneTelephone >", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ConsigneTelephone >=", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneLessThan(String value) {
            addCriterion("ConsigneTelephone <", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneLessThanOrEqualTo(String value) {
            addCriterion("ConsigneTelephone <=", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneLike(String value) {
            addCriterion("ConsigneTelephone like", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneNotLike(String value) {
            addCriterion("ConsigneTelephone not like", value, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneIn(List<String> values) {
            addCriterion("ConsigneTelephone in", values, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneNotIn(List<String> values) {
            addCriterion("ConsigneTelephone not in", values, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneBetween(String value1, String value2) {
            addCriterion("ConsigneTelephone between", value1, value2, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignetelephoneNotBetween(String value1, String value2) {
            addCriterion("ConsigneTelephone not between", value1, value2, "consignetelephone");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeIsNull() {
            addCriterion("ConsignePostcode is null");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeIsNotNull() {
            addCriterion("ConsignePostcode is not null");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeEqualTo(String value) {
            addCriterion("ConsignePostcode =", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeNotEqualTo(String value) {
            addCriterion("ConsignePostcode <>", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeGreaterThan(String value) {
            addCriterion("ConsignePostcode >", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ConsignePostcode >=", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeLessThan(String value) {
            addCriterion("ConsignePostcode <", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeLessThanOrEqualTo(String value) {
            addCriterion("ConsignePostcode <=", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeLike(String value) {
            addCriterion("ConsignePostcode like", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeNotLike(String value) {
            addCriterion("ConsignePostcode not like", value, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeIn(List<String> values) {
            addCriterion("ConsignePostcode in", values, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeNotIn(List<String> values) {
            addCriterion("ConsignePostcode not in", values, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeBetween(String value1, String value2) {
            addCriterion("ConsignePostcode between", value1, value2, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andConsignepostcodeNotBetween(String value1, String value2) {
            addCriterion("ConsignePostcode not between", value1, value2, "consignepostcode");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("ProvinceID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("ProvinceID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("ProvinceID =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("ProvinceID <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("ProvinceID >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProvinceID >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("ProvinceID <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("ProvinceID <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("ProvinceID in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("ProvinceID not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("ProvinceID between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProvinceID not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("CityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("CityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("CityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("CityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("CityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("CityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("CityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("CityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("CityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("District is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("District is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Integer value) {
            addCriterion("District =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Integer value) {
            addCriterion("District <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Integer value) {
            addCriterion("District >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("District >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Integer value) {
            addCriterion("District <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("District <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Integer> values) {
            addCriterion("District in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Integer> values) {
            addCriterion("District not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Integer value1, Integer value2) {
            addCriterion("District between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("District not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressIsNull() {
            addCriterion("ConsigneeAdress is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressIsNotNull() {
            addCriterion("ConsigneeAdress is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressEqualTo(String value) {
            addCriterion("ConsigneeAdress =", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressNotEqualTo(String value) {
            addCriterion("ConsigneeAdress <>", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressGreaterThan(String value) {
            addCriterion("ConsigneeAdress >", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressGreaterThanOrEqualTo(String value) {
            addCriterion("ConsigneeAdress >=", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressLessThan(String value) {
            addCriterion("ConsigneeAdress <", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressLessThanOrEqualTo(String value) {
            addCriterion("ConsigneeAdress <=", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressLike(String value) {
            addCriterion("ConsigneeAdress like", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressNotLike(String value) {
            addCriterion("ConsigneeAdress not like", value, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressIn(List<String> values) {
            addCriterion("ConsigneeAdress in", values, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressNotIn(List<String> values) {
            addCriterion("ConsigneeAdress not in", values, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressBetween(String value1, String value2) {
            addCriterion("ConsigneeAdress between", value1, value2, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andConsigneeadressNotBetween(String value1, String value2) {
            addCriterion("ConsigneeAdress not between", value1, value2, "consigneeadress");
            return (Criteria) this;
        }

        public Criteria andShipcertificateIsNull() {
            addCriterion("ShipCertificate is null");
            return (Criteria) this;
        }

        public Criteria andShipcertificateIsNotNull() {
            addCriterion("ShipCertificate is not null");
            return (Criteria) this;
        }

        public Criteria andShipcertificateEqualTo(String value) {
            addCriterion("ShipCertificate =", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateNotEqualTo(String value) {
            addCriterion("ShipCertificate <>", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateGreaterThan(String value) {
            addCriterion("ShipCertificate >", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateGreaterThanOrEqualTo(String value) {
            addCriterion("ShipCertificate >=", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateLessThan(String value) {
            addCriterion("ShipCertificate <", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateLessThanOrEqualTo(String value) {
            addCriterion("ShipCertificate <=", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateLike(String value) {
            addCriterion("ShipCertificate like", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateNotLike(String value) {
            addCriterion("ShipCertificate not like", value, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateIn(List<String> values) {
            addCriterion("ShipCertificate in", values, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateNotIn(List<String> values) {
            addCriterion("ShipCertificate not in", values, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateBetween(String value1, String value2) {
            addCriterion("ShipCertificate between", value1, value2, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificateNotBetween(String value1, String value2) {
            addCriterion("ShipCertificate not between", value1, value2, "shipcertificate");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2IsNull() {
            addCriterion("ShipCertificate2 is null");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2IsNotNull() {
            addCriterion("ShipCertificate2 is not null");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2EqualTo(String value) {
            addCriterion("ShipCertificate2 =", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2NotEqualTo(String value) {
            addCriterion("ShipCertificate2 <>", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2GreaterThan(String value) {
            addCriterion("ShipCertificate2 >", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2GreaterThanOrEqualTo(String value) {
            addCriterion("ShipCertificate2 >=", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2LessThan(String value) {
            addCriterion("ShipCertificate2 <", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2LessThanOrEqualTo(String value) {
            addCriterion("ShipCertificate2 <=", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2Like(String value) {
            addCriterion("ShipCertificate2 like", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2NotLike(String value) {
            addCriterion("ShipCertificate2 not like", value, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2In(List<String> values) {
            addCriterion("ShipCertificate2 in", values, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2NotIn(List<String> values) {
            addCriterion("ShipCertificate2 not in", values, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2Between(String value1, String value2) {
            addCriterion("ShipCertificate2 between", value1, value2, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andShipcertificate2NotBetween(String value1, String value2) {
            addCriterion("ShipCertificate2 not between", value1, value2, "shipcertificate2");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNull() {
            addCriterion("ServiceType is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNotNull() {
            addCriterion("ServiceType is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeEqualTo(Integer value) {
            addCriterion("ServiceType =", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotEqualTo(Integer value) {
            addCriterion("ServiceType <>", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThan(Integer value) {
            addCriterion("ServiceType >", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ServiceType >=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThan(Integer value) {
            addCriterion("ServiceType <", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("ServiceType <=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeIn(List<Integer> values) {
            addCriterion("ServiceType in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotIn(List<Integer> values) {
            addCriterion("ServiceType not in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeBetween(Integer value1, Integer value2) {
            addCriterion("ServiceType between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ServiceType not between", value1, value2, "servicetype");
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