package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DesignWorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignWorksExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("Category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("Category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("Category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("Category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("Category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("Category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("Category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("Category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("Category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("Category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCasestyleIsNull() {
            addCriterion("CaseStyle is null");
            return (Criteria) this;
        }

        public Criteria andCasestyleIsNotNull() {
            addCriterion("CaseStyle is not null");
            return (Criteria) this;
        }

        public Criteria andCasestyleEqualTo(Integer value) {
            addCriterion("CaseStyle =", value, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleNotEqualTo(Integer value) {
            addCriterion("CaseStyle <>", value, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleGreaterThan(Integer value) {
            addCriterion("CaseStyle >", value, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("CaseStyle >=", value, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleLessThan(Integer value) {
            addCriterion("CaseStyle <", value, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleLessThanOrEqualTo(Integer value) {
            addCriterion("CaseStyle <=", value, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleIn(List<Integer> values) {
            addCriterion("CaseStyle in", values, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleNotIn(List<Integer> values) {
            addCriterion("CaseStyle not in", values, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleBetween(Integer value1, Integer value2) {
            addCriterion("CaseStyle between", value1, value2, "casestyle");
            return (Criteria) this;
        }

        public Criteria andCasestyleNotBetween(Integer value1, Integer value2) {
            addCriterion("CaseStyle not between", value1, value2, "casestyle");
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

        public Criteria andPricerangeIsNull() {
            addCriterion("PriceRange is null");
            return (Criteria) this;
        }

        public Criteria andPricerangeIsNotNull() {
            addCriterion("PriceRange is not null");
            return (Criteria) this;
        }

        public Criteria andPricerangeEqualTo(Integer value) {
            addCriterion("PriceRange =", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotEqualTo(Integer value) {
            addCriterion("PriceRange <>", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeGreaterThan(Integer value) {
            addCriterion("PriceRange >", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceRange >=", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLessThan(Integer value) {
            addCriterion("PriceRange <", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeLessThanOrEqualTo(Integer value) {
            addCriterion("PriceRange <=", value, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeIn(List<Integer> values) {
            addCriterion("PriceRange in", values, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotIn(List<Integer> values) {
            addCriterion("PriceRange not in", values, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeBetween(Integer value1, Integer value2) {
            addCriterion("PriceRange between", value1, value2, "pricerange");
            return (Criteria) this;
        }

        public Criteria andPricerangeNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceRange not between", value1, value2, "pricerange");
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

        public Criteria andIsrecommendIsNull() {
            addCriterion("IsRecommend is null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIsNotNull() {
            addCriterion("IsRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendEqualTo(Integer value) {
            addCriterion("IsRecommend =", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotEqualTo(Integer value) {
            addCriterion("IsRecommend <>", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendGreaterThan(Integer value) {
            addCriterion("IsRecommend >", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsRecommend >=", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLessThan(Integer value) {
            addCriterion("IsRecommend <", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLessThanOrEqualTo(Integer value) {
            addCriterion("IsRecommend <=", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIn(List<Integer> values) {
            addCriterion("IsRecommend in", values, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotIn(List<Integer> values) {
            addCriterion("IsRecommend not in", values, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendBetween(Integer value1, Integer value2) {
            addCriterion("IsRecommend between", value1, value2, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("IsRecommend not between", value1, value2, "isrecommend");
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

        public Criteria andInitiscloseIsNull() {
            addCriterion("InitIsClose is null");
            return (Criteria) this;
        }

        public Criteria andInitiscloseIsNotNull() {
            addCriterion("InitIsClose is not null");
            return (Criteria) this;
        }

        public Criteria andInitiscloseEqualTo(Integer value) {
            addCriterion("InitIsClose =", value, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseNotEqualTo(Integer value) {
            addCriterion("InitIsClose <>", value, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseGreaterThan(Integer value) {
            addCriterion("InitIsClose >", value, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("InitIsClose >=", value, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseLessThan(Integer value) {
            addCriterion("InitIsClose <", value, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseLessThanOrEqualTo(Integer value) {
            addCriterion("InitIsClose <=", value, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseIn(List<Integer> values) {
            addCriterion("InitIsClose in", values, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseNotIn(List<Integer> values) {
            addCriterion("InitIsClose not in", values, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseBetween(Integer value1, Integer value2) {
            addCriterion("InitIsClose between", value1, value2, "initisclose");
            return (Criteria) this;
        }

        public Criteria andInitiscloseNotBetween(Integer value1, Integer value2) {
            addCriterion("InitIsClose not between", value1, value2, "initisclose");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNull() {
            addCriterion("IsPutAway is null");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNotNull() {
            addCriterion("IsPutAway is not null");
            return (Criteria) this;
        }

        public Criteria andIsputawayEqualTo(Integer value) {
            addCriterion("IsPutAway =", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotEqualTo(Integer value) {
            addCriterion("IsPutAway <>", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThan(Integer value) {
            addCriterion("IsPutAway >", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPutAway >=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThan(Integer value) {
            addCriterion("IsPutAway <", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThanOrEqualTo(Integer value) {
            addCriterion("IsPutAway <=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayIn(List<Integer> values) {
            addCriterion("IsPutAway in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotIn(List<Integer> values) {
            addCriterion("IsPutAway not in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayBetween(Integer value1, Integer value2) {
            addCriterion("IsPutAway between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPutAway not between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("ClickNum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("ClickNum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("ClickNum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("ClickNum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("ClickNum >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClickNum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("ClickNum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("ClickNum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("ClickNum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("ClickNum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("ClickNum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("ClickNum not between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNull() {
            addCriterion("SalesVolume is null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNotNull() {
            addCriterion("SalesVolume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeEqualTo(Integer value) {
            addCriterion("SalesVolume =", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotEqualTo(Integer value) {
            addCriterion("SalesVolume <>", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThan(Integer value) {
            addCriterion("SalesVolume >", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesVolume >=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThan(Integer value) {
            addCriterion("SalesVolume <", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("SalesVolume <=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIn(List<Integer> values) {
            addCriterion("SalesVolume in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotIn(List<Integer> values) {
            addCriterion("SalesVolume not in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeBetween(Integer value1, Integer value2) {
            addCriterion("SalesVolume between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesVolume not between", value1, value2, "salesvolume");
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