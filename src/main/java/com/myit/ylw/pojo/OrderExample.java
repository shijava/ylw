package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("OrderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderno");
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

        public Criteria andShopidIsNull() {
            addCriterion("ShopID is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("ShopID is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("ShopID =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("ShopID <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("ShopID >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShopID >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("ShopID <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("ShopID <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("ShopID in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("ShopID not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("ShopID between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShopID not between", value1, value2, "shopid");
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

        public Criteria andOrderdateedittimeIsNull() {
            addCriterion("OrderDateEditTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeIsNotNull() {
            addCriterion("OrderDateEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeEqualTo(Date value) {
            addCriterion("OrderDateEditTime =", value, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeNotEqualTo(Date value) {
            addCriterion("OrderDateEditTime <>", value, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeGreaterThan(Date value) {
            addCriterion("OrderDateEditTime >", value, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderDateEditTime >=", value, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeLessThan(Date value) {
            addCriterion("OrderDateEditTime <", value, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderDateEditTime <=", value, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeIn(List<Date> values) {
            addCriterion("OrderDateEditTime in", values, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeNotIn(List<Date> values) {
            addCriterion("OrderDateEditTime not in", values, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeBetween(Date value1, Date value2) {
            addCriterion("OrderDateEditTime between", value1, value2, "orderdateedittime");
            return (Criteria) this;
        }

        public Criteria andOrderdateedittimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderDateEditTime not between", value1, value2, "orderdateedittime");
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
            addCriterion("ShipNo is null");
            return (Criteria) this;
        }

        public Criteria andShipnoIsNotNull() {
            addCriterion("ShipNo is not null");
            return (Criteria) this;
        }

        public Criteria andShipnoEqualTo(String value) {
            addCriterion("ShipNo =", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotEqualTo(String value) {
            addCriterion("ShipNo <>", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThan(String value) {
            addCriterion("ShipNo >", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoGreaterThanOrEqualTo(String value) {
            addCriterion("ShipNo >=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThan(String value) {
            addCriterion("ShipNo <", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLessThanOrEqualTo(String value) {
            addCriterion("ShipNo <=", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoLike(String value) {
            addCriterion("ShipNo like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotLike(String value) {
            addCriterion("ShipNo not like", value, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoIn(List<String> values) {
            addCriterion("ShipNo in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotIn(List<String> values) {
            addCriterion("ShipNo not in", values, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoBetween(String value1, String value2) {
            addCriterion("ShipNo between", value1, value2, "shipno");
            return (Criteria) this;
        }

        public Criteria andShipnoNotBetween(String value1, String value2) {
            addCriterion("ShipNo not between", value1, value2, "shipno");
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

        public Criteria andShippriceIsNull() {
            addCriterion("ShipPrice is null");
            return (Criteria) this;
        }

        public Criteria andShippriceIsNotNull() {
            addCriterion("ShipPrice is not null");
            return (Criteria) this;
        }

        public Criteria andShippriceEqualTo(Double value) {
            addCriterion("ShipPrice =", value, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceNotEqualTo(Double value) {
            addCriterion("ShipPrice <>", value, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceGreaterThan(Double value) {
            addCriterion("ShipPrice >", value, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ShipPrice >=", value, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceLessThan(Double value) {
            addCriterion("ShipPrice <", value, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceLessThanOrEqualTo(Double value) {
            addCriterion("ShipPrice <=", value, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceIn(List<Double> values) {
            addCriterion("ShipPrice in", values, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceNotIn(List<Double> values) {
            addCriterion("ShipPrice not in", values, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceBetween(Double value1, Double value2) {
            addCriterion("ShipPrice between", value1, value2, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShippriceNotBetween(Double value1, Double value2) {
            addCriterion("ShipPrice not between", value1, value2, "shipprice");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeIsNull() {
            addCriterion("ShipDatetime is null");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeIsNotNull() {
            addCriterion("ShipDatetime is not null");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeEqualTo(Date value) {
            addCriterion("ShipDatetime =", value, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeNotEqualTo(Date value) {
            addCriterion("ShipDatetime <>", value, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeGreaterThan(Date value) {
            addCriterion("ShipDatetime >", value, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ShipDatetime >=", value, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeLessThan(Date value) {
            addCriterion("ShipDatetime <", value, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ShipDatetime <=", value, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeIn(List<Date> values) {
            addCriterion("ShipDatetime in", values, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeNotIn(List<Date> values) {
            addCriterion("ShipDatetime not in", values, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeBetween(Date value1, Date value2) {
            addCriterion("ShipDatetime between", value1, value2, "shipdatetime");
            return (Criteria) this;
        }

        public Criteria andShipdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ShipDatetime not between", value1, value2, "shipdatetime");
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

        public Criteria andPointsIsNull() {
            addCriterion("Points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("Points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("Points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("Points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("Points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("Points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("Points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("Points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("Points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("Points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("Points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andDonatepointsIsNull() {
            addCriterion("DonatePoints is null");
            return (Criteria) this;
        }

        public Criteria andDonatepointsIsNotNull() {
            addCriterion("DonatePoints is not null");
            return (Criteria) this;
        }

        public Criteria andDonatepointsEqualTo(Integer value) {
            addCriterion("DonatePoints =", value, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsNotEqualTo(Integer value) {
            addCriterion("DonatePoints <>", value, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsGreaterThan(Integer value) {
            addCriterion("DonatePoints >", value, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("DonatePoints >=", value, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsLessThan(Integer value) {
            addCriterion("DonatePoints <", value, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsLessThanOrEqualTo(Integer value) {
            addCriterion("DonatePoints <=", value, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsIn(List<Integer> values) {
            addCriterion("DonatePoints in", values, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsNotIn(List<Integer> values) {
            addCriterion("DonatePoints not in", values, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsBetween(Integer value1, Integer value2) {
            addCriterion("DonatePoints between", value1, value2, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andDonatepointsNotBetween(Integer value1, Integer value2) {
            addCriterion("DonatePoints not between", value1, value2, "donatepoints");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNull() {
            addCriterion("IsComment is null");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNotNull() {
            addCriterion("IsComment is not null");
            return (Criteria) this;
        }

        public Criteria andIscommentEqualTo(Integer value) {
            addCriterion("IsComment =", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotEqualTo(Integer value) {
            addCriterion("IsComment <>", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThan(Integer value) {
            addCriterion("IsComment >", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsComment >=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThan(Integer value) {
            addCriterion("IsComment <", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThanOrEqualTo(Integer value) {
            addCriterion("IsComment <=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentIn(List<Integer> values) {
            addCriterion("IsComment in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotIn(List<Integer> values) {
            addCriterion("IsComment not in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentBetween(Integer value1, Integer value2) {
            addCriterion("IsComment between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotBetween(Integer value1, Integer value2) {
            addCriterion("IsComment not between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
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