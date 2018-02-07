package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsExample() {
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

        public Criteria andOrdergoodsidIsNull() {
            addCriterion("OrderGoodsID is null");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidIsNotNull() {
            addCriterion("OrderGoodsID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidEqualTo(Integer value) {
            addCriterion("OrderGoodsID =", value, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidNotEqualTo(Integer value) {
            addCriterion("OrderGoodsID <>", value, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidGreaterThan(Integer value) {
            addCriterion("OrderGoodsID >", value, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderGoodsID >=", value, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidLessThan(Integer value) {
            addCriterion("OrderGoodsID <", value, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("OrderGoodsID <=", value, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidIn(List<Integer> values) {
            addCriterion("OrderGoodsID in", values, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidNotIn(List<Integer> values) {
            addCriterion("OrderGoodsID not in", values, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidBetween(Integer value1, Integer value2) {
            addCriterion("OrderGoodsID between", value1, value2, "ordergoodsid");
            return (Criteria) this;
        }

        public Criteria andOrdergoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderGoodsID not between", value1, value2, "ordergoodsid");
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

        public Criteria andProductidIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNull() {
            addCriterion("StorageID is null");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNotNull() {
            addCriterion("StorageID is not null");
            return (Criteria) this;
        }

        public Criteria andStorageidEqualTo(Integer value) {
            addCriterion("StorageID =", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotEqualTo(Integer value) {
            addCriterion("StorageID <>", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThan(Integer value) {
            addCriterion("StorageID >", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StorageID >=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThan(Integer value) {
            addCriterion("StorageID <", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThanOrEqualTo(Integer value) {
            addCriterion("StorageID <=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidIn(List<Integer> values) {
            addCriterion("StorageID in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotIn(List<Integer> values) {
            addCriterion("StorageID not in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidBetween(Integer value1, Integer value2) {
            addCriterion("StorageID between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("StorageID not between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
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

        public Criteria andRealpriceIsNull() {
            addCriterion("RealPrice is null");
            return (Criteria) this;
        }

        public Criteria andRealpriceIsNotNull() {
            addCriterion("RealPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRealpriceEqualTo(Double value) {
            addCriterion("RealPrice =", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotEqualTo(Double value) {
            addCriterion("RealPrice <>", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceGreaterThan(Double value) {
            addCriterion("RealPrice >", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("RealPrice >=", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceLessThan(Double value) {
            addCriterion("RealPrice <", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceLessThanOrEqualTo(Double value) {
            addCriterion("RealPrice <=", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceIn(List<Double> values) {
            addCriterion("RealPrice in", values, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotIn(List<Double> values) {
            addCriterion("RealPrice not in", values, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceBetween(Double value1, Double value2) {
            addCriterion("RealPrice between", value1, value2, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotBetween(Double value1, Double value2) {
            addCriterion("RealPrice not between", value1, value2, "realprice");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("Point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("Point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("Point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("Point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("Point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("Point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("Point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("Point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("Point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("Point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("Point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("Point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andDonatepointIsNull() {
            addCriterion("DonatePoint is null");
            return (Criteria) this;
        }

        public Criteria andDonatepointIsNotNull() {
            addCriterion("DonatePoint is not null");
            return (Criteria) this;
        }

        public Criteria andDonatepointEqualTo(Integer value) {
            addCriterion("DonatePoint =", value, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointNotEqualTo(Integer value) {
            addCriterion("DonatePoint <>", value, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointGreaterThan(Integer value) {
            addCriterion("DonatePoint >", value, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointGreaterThanOrEqualTo(Integer value) {
            addCriterion("DonatePoint >=", value, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointLessThan(Integer value) {
            addCriterion("DonatePoint <", value, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointLessThanOrEqualTo(Integer value) {
            addCriterion("DonatePoint <=", value, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointIn(List<Integer> values) {
            addCriterion("DonatePoint in", values, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointNotIn(List<Integer> values) {
            addCriterion("DonatePoint not in", values, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointBetween(Integer value1, Integer value2) {
            addCriterion("DonatePoint between", value1, value2, "donatepoint");
            return (Criteria) this;
        }

        public Criteria andDonatepointNotBetween(Integer value1, Integer value2) {
            addCriterion("DonatePoint not between", value1, value2, "donatepoint");
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

        public Criteria andCommentstateIsNull() {
            addCriterion("CommentState is null");
            return (Criteria) this;
        }

        public Criteria andCommentstateIsNotNull() {
            addCriterion("CommentState is not null");
            return (Criteria) this;
        }

        public Criteria andCommentstateEqualTo(Integer value) {
            addCriterion("CommentState =", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotEqualTo(Integer value) {
            addCriterion("CommentState <>", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateGreaterThan(Integer value) {
            addCriterion("CommentState >", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentState >=", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateLessThan(Integer value) {
            addCriterion("CommentState <", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateLessThanOrEqualTo(Integer value) {
            addCriterion("CommentState <=", value, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateIn(List<Integer> values) {
            addCriterion("CommentState in", values, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotIn(List<Integer> values) {
            addCriterion("CommentState not in", values, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateBetween(Integer value1, Integer value2) {
            addCriterion("CommentState between", value1, value2, "commentstate");
            return (Criteria) this;
        }

        public Criteria andCommentstateNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentState not between", value1, value2, "commentstate");
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

        public Criteria andPointpercentIsNull() {
            addCriterion("PointPercent is null");
            return (Criteria) this;
        }

        public Criteria andPointpercentIsNotNull() {
            addCriterion("PointPercent is not null");
            return (Criteria) this;
        }

        public Criteria andPointpercentEqualTo(Double value) {
            addCriterion("PointPercent =", value, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentNotEqualTo(Double value) {
            addCriterion("PointPercent <>", value, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentGreaterThan(Double value) {
            addCriterion("PointPercent >", value, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentGreaterThanOrEqualTo(Double value) {
            addCriterion("PointPercent >=", value, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentLessThan(Double value) {
            addCriterion("PointPercent <", value, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentLessThanOrEqualTo(Double value) {
            addCriterion("PointPercent <=", value, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentIn(List<Double> values) {
            addCriterion("PointPercent in", values, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentNotIn(List<Double> values) {
            addCriterion("PointPercent not in", values, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentBetween(Double value1, Double value2) {
            addCriterion("PointPercent between", value1, value2, "pointpercent");
            return (Criteria) this;
        }

        public Criteria andPointpercentNotBetween(Double value1, Double value2) {
            addCriterion("PointPercent not between", value1, value2, "pointpercent");
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