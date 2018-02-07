package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointProductOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointProductOrderExample() {
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

        public Criteria andPporderidIsNull() {
            addCriterion("PPOrderID is null");
            return (Criteria) this;
        }

        public Criteria andPporderidIsNotNull() {
            addCriterion("PPOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andPporderidEqualTo(Integer value) {
            addCriterion("PPOrderID =", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidNotEqualTo(Integer value) {
            addCriterion("PPOrderID <>", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidGreaterThan(Integer value) {
            addCriterion("PPOrderID >", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPOrderID >=", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidLessThan(Integer value) {
            addCriterion("PPOrderID <", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidLessThanOrEqualTo(Integer value) {
            addCriterion("PPOrderID <=", value, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidIn(List<Integer> values) {
            addCriterion("PPOrderID in", values, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidNotIn(List<Integer> values) {
            addCriterion("PPOrderID not in", values, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidBetween(Integer value1, Integer value2) {
            addCriterion("PPOrderID between", value1, value2, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPporderidNotBetween(Integer value1, Integer value2) {
            addCriterion("PPOrderID not between", value1, value2, "pporderid");
            return (Criteria) this;
        }

        public Criteria andPpordernoIsNull() {
            addCriterion("PPOrderNO is null");
            return (Criteria) this;
        }

        public Criteria andPpordernoIsNotNull() {
            addCriterion("PPOrderNO is not null");
            return (Criteria) this;
        }

        public Criteria andPpordernoEqualTo(String value) {
            addCriterion("PPOrderNO =", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotEqualTo(String value) {
            addCriterion("PPOrderNO <>", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoGreaterThan(String value) {
            addCriterion("PPOrderNO >", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoGreaterThanOrEqualTo(String value) {
            addCriterion("PPOrderNO >=", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoLessThan(String value) {
            addCriterion("PPOrderNO <", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoLessThanOrEqualTo(String value) {
            addCriterion("PPOrderNO <=", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoLike(String value) {
            addCriterion("PPOrderNO like", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotLike(String value) {
            addCriterion("PPOrderNO not like", value, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoIn(List<String> values) {
            addCriterion("PPOrderNO in", values, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotIn(List<String> values) {
            addCriterion("PPOrderNO not in", values, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoBetween(String value1, String value2) {
            addCriterion("PPOrderNO between", value1, value2, "pporderno");
            return (Criteria) this;
        }

        public Criteria andPpordernoNotBetween(String value1, String value2) {
            addCriterion("PPOrderNO not between", value1, value2, "pporderno");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("TotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("TotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Double value) {
            addCriterion("TotalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Double value) {
            addCriterion("TotalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Double value) {
            addCriterion("TotalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("TotalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Double value) {
            addCriterion("TotalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("TotalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Double> values) {
            addCriterion("TotalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Double> values) {
            addCriterion("TotalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Double value1, Double value2) {
            addCriterion("TotalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("TotalPrice not between", value1, value2, "totalprice");
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