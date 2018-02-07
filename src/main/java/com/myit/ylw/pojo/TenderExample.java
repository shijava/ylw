package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenderExample() {
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

        public Criteria andIscustommadeIsNull() {
            addCriterion("ISCustomMade is null");
            return (Criteria) this;
        }

        public Criteria andIscustommadeIsNotNull() {
            addCriterion("ISCustomMade is not null");
            return (Criteria) this;
        }

        public Criteria andIscustommadeEqualTo(Integer value) {
            addCriterion("ISCustomMade =", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeNotEqualTo(Integer value) {
            addCriterion("ISCustomMade <>", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeGreaterThan(Integer value) {
            addCriterion("ISCustomMade >", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISCustomMade >=", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeLessThan(Integer value) {
            addCriterion("ISCustomMade <", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeLessThanOrEqualTo(Integer value) {
            addCriterion("ISCustomMade <=", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeIn(List<Integer> values) {
            addCriterion("ISCustomMade in", values, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeNotIn(List<Integer> values) {
            addCriterion("ISCustomMade not in", values, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeBetween(Integer value1, Integer value2) {
            addCriterion("ISCustomMade between", value1, value2, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeNotBetween(Integer value1, Integer value2) {
            addCriterion("ISCustomMade not between", value1, value2, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysIsNull() {
            addCriterion("DeliveryDays is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysIsNotNull() {
            addCriterion("DeliveryDays is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysEqualTo(Integer value) {
            addCriterion("DeliveryDays =", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysNotEqualTo(Integer value) {
            addCriterion("DeliveryDays <>", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysGreaterThan(Integer value) {
            addCriterion("DeliveryDays >", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeliveryDays >=", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysLessThan(Integer value) {
            addCriterion("DeliveryDays <", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysLessThanOrEqualTo(Integer value) {
            addCriterion("DeliveryDays <=", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysIn(List<Integer> values) {
            addCriterion("DeliveryDays in", values, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysNotIn(List<Integer> values) {
            addCriterion("DeliveryDays not in", values, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryDays between", value1, value2, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysNotBetween(Integer value1, Integer value2) {
            addCriterion("DeliveryDays not between", value1, value2, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("InvoiceType is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("InvoiceType is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(Integer value) {
            addCriterion("InvoiceType =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(Integer value) {
            addCriterion("InvoiceType <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(Integer value) {
            addCriterion("InvoiceType >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("InvoiceType >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(Integer value) {
            addCriterion("InvoiceType <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("InvoiceType <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<Integer> values) {
            addCriterion("InvoiceType in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<Integer> values) {
            addCriterion("InvoiceType not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(Integer value1, Integer value2) {
            addCriterion("InvoiceType between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("InvoiceType not between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("City not between", value1, value2, "city");
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

        public Criteria andBegintimeIsNull() {
            addCriterion("BeginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("BeginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("BeginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("BeginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BeginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("BeginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("BeginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("BeginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("BeginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("BeginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("BeginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MobilePhone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MobilePhone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MobilePhone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MobilePhone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MobilePhone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MobilePhone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MobilePhone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MobilePhone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MobilePhone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MobilePhone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MobilePhone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andTenderstatusIsNull() {
            addCriterion("TenderStatus is null");
            return (Criteria) this;
        }

        public Criteria andTenderstatusIsNotNull() {
            addCriterion("TenderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTenderstatusEqualTo(Integer value) {
            addCriterion("TenderStatus =", value, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusNotEqualTo(Integer value) {
            addCriterion("TenderStatus <>", value, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusGreaterThan(Integer value) {
            addCriterion("TenderStatus >", value, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenderStatus >=", value, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusLessThan(Integer value) {
            addCriterion("TenderStatus <", value, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("TenderStatus <=", value, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusIn(List<Integer> values) {
            addCriterion("TenderStatus in", values, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusNotIn(List<Integer> values) {
            addCriterion("TenderStatus not in", values, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusBetween(Integer value1, Integer value2) {
            addCriterion("TenderStatus between", value1, value2, "tenderstatus");
            return (Criteria) this;
        }

        public Criteria andTenderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TenderStatus not between", value1, value2, "tenderstatus");
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

        public Criteria andListidIsNull() {
            addCriterion("ListID is null");
            return (Criteria) this;
        }

        public Criteria andListidIsNotNull() {
            addCriterion("ListID is not null");
            return (Criteria) this;
        }

        public Criteria andListidEqualTo(Integer value) {
            addCriterion("ListID =", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotEqualTo(Integer value) {
            addCriterion("ListID <>", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidGreaterThan(Integer value) {
            addCriterion("ListID >", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ListID >=", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidLessThan(Integer value) {
            addCriterion("ListID <", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidLessThanOrEqualTo(Integer value) {
            addCriterion("ListID <=", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidIn(List<Integer> values) {
            addCriterion("ListID in", values, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotIn(List<Integer> values) {
            addCriterion("ListID not in", values, "listid");
            return (Criteria) this;
        }

        public Criteria andListidBetween(Integer value1, Integer value2) {
            addCriterion("ListID between", value1, value2, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotBetween(Integer value1, Integer value2) {
            addCriterion("ListID not between", value1, value2, "listid");
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