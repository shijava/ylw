package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
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

        public Criteria andSmallpicIsNull() {
            addCriterion("SmallPic is null");
            return (Criteria) this;
        }

        public Criteria andSmallpicIsNotNull() {
            addCriterion("SmallPic is not null");
            return (Criteria) this;
        }

        public Criteria andSmallpicEqualTo(String value) {
            addCriterion("SmallPic =", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicNotEqualTo(String value) {
            addCriterion("SmallPic <>", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicGreaterThan(String value) {
            addCriterion("SmallPic >", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicGreaterThanOrEqualTo(String value) {
            addCriterion("SmallPic >=", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicLessThan(String value) {
            addCriterion("SmallPic <", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicLessThanOrEqualTo(String value) {
            addCriterion("SmallPic <=", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicLike(String value) {
            addCriterion("SmallPic like", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicNotLike(String value) {
            addCriterion("SmallPic not like", value, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicIn(List<String> values) {
            addCriterion("SmallPic in", values, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicNotIn(List<String> values) {
            addCriterion("SmallPic not in", values, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicBetween(String value1, String value2) {
            addCriterion("SmallPic between", value1, value2, "smallpic");
            return (Criteria) this;
        }

        public Criteria andSmallpicNotBetween(String value1, String value2) {
            addCriterion("SmallPic not between", value1, value2, "smallpic");
            return (Criteria) this;
        }

        public Criteria andBigpicIsNull() {
            addCriterion("BigPic is null");
            return (Criteria) this;
        }

        public Criteria andBigpicIsNotNull() {
            addCriterion("BigPic is not null");
            return (Criteria) this;
        }

        public Criteria andBigpicEqualTo(String value) {
            addCriterion("BigPic =", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotEqualTo(String value) {
            addCriterion("BigPic <>", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicGreaterThan(String value) {
            addCriterion("BigPic >", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicGreaterThanOrEqualTo(String value) {
            addCriterion("BigPic >=", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicLessThan(String value) {
            addCriterion("BigPic <", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicLessThanOrEqualTo(String value) {
            addCriterion("BigPic <=", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicLike(String value) {
            addCriterion("BigPic like", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotLike(String value) {
            addCriterion("BigPic not like", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicIn(List<String> values) {
            addCriterion("BigPic in", values, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotIn(List<String> values) {
            addCriterion("BigPic not in", values, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicBetween(String value1, String value2) {
            addCriterion("BigPic between", value1, value2, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotBetween(String value1, String value2) {
            addCriterion("BigPic not between", value1, value2, "bigpic");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("Keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("Keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("Keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("Keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("Keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("Keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("Keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("Keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("Keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("Keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("Keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("Keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("Keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("Keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("Details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("Details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("Details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("Details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("Details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("Details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("Details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("Details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("Details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("Details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("Details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("Details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("Details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("Details not between", value1, value2, "details");
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

        public Criteria andMaterialtypeIsNull() {
            addCriterion("MaterialType is null");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeIsNotNull() {
            addCriterion("MaterialType is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeEqualTo(Integer value) {
            addCriterion("MaterialType =", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotEqualTo(Integer value) {
            addCriterion("MaterialType <>", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeGreaterThan(Integer value) {
            addCriterion("MaterialType >", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaterialType >=", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeLessThan(Integer value) {
            addCriterion("MaterialType <", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeLessThanOrEqualTo(Integer value) {
            addCriterion("MaterialType <=", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeIn(List<Integer> values) {
            addCriterion("MaterialType in", values, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotIn(List<Integer> values) {
            addCriterion("MaterialType not in", values, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeBetween(Integer value1, Integer value2) {
            addCriterion("MaterialType between", value1, value2, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MaterialType not between", value1, value2, "materialtype");
            return (Criteria) this;
        }

        public Criteria andTechnicsIsNull() {
            addCriterion("Technics is null");
            return (Criteria) this;
        }

        public Criteria andTechnicsIsNotNull() {
            addCriterion("Technics is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicsEqualTo(String value) {
            addCriterion("Technics =", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotEqualTo(String value) {
            addCriterion("Technics <>", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsGreaterThan(String value) {
            addCriterion("Technics >", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsGreaterThanOrEqualTo(String value) {
            addCriterion("Technics >=", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsLessThan(String value) {
            addCriterion("Technics <", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsLessThanOrEqualTo(String value) {
            addCriterion("Technics <=", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsLike(String value) {
            addCriterion("Technics like", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotLike(String value) {
            addCriterion("Technics not like", value, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsIn(List<String> values) {
            addCriterion("Technics in", values, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotIn(List<String> values) {
            addCriterion("Technics not in", values, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsBetween(String value1, String value2) {
            addCriterion("Technics between", value1, value2, "technics");
            return (Criteria) this;
        }

        public Criteria andTechnicsNotBetween(String value1, String value2) {
            addCriterion("Technics not between", value1, value2, "technics");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("ProductNO is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("ProductNO is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("ProductNO =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("ProductNO <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("ProductNO >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("ProductNO >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("ProductNO <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("ProductNO <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("ProductNO like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("ProductNO not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("ProductNO in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("ProductNO not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("ProductNO between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("ProductNO not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsIsNull() {
            addCriterion("SurfaceTechnics is null");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsIsNotNull() {
            addCriterion("SurfaceTechnics is not null");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsEqualTo(Integer value) {
            addCriterion("SurfaceTechnics =", value, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsNotEqualTo(Integer value) {
            addCriterion("SurfaceTechnics <>", value, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsGreaterThan(Integer value) {
            addCriterion("SurfaceTechnics >", value, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SurfaceTechnics >=", value, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsLessThan(Integer value) {
            addCriterion("SurfaceTechnics <", value, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsLessThanOrEqualTo(Integer value) {
            addCriterion("SurfaceTechnics <=", value, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsIn(List<Integer> values) {
            addCriterion("SurfaceTechnics in", values, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsNotIn(List<Integer> values) {
            addCriterion("SurfaceTechnics not in", values, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsBetween(Integer value1, Integer value2) {
            addCriterion("SurfaceTechnics between", value1, value2, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andSurfacetechnicsNotBetween(Integer value1, Integer value2) {
            addCriterion("SurfaceTechnics not between", value1, value2, "surfacetechnics");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignIsNull() {
            addCriterion("UtensilsDesign is null");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignIsNotNull() {
            addCriterion("UtensilsDesign is not null");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignEqualTo(Integer value) {
            addCriterion("UtensilsDesign =", value, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignNotEqualTo(Integer value) {
            addCriterion("UtensilsDesign <>", value, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignGreaterThan(Integer value) {
            addCriterion("UtensilsDesign >", value, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("UtensilsDesign >=", value, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignLessThan(Integer value) {
            addCriterion("UtensilsDesign <", value, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignLessThanOrEqualTo(Integer value) {
            addCriterion("UtensilsDesign <=", value, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignIn(List<Integer> values) {
            addCriterion("UtensilsDesign in", values, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignNotIn(List<Integer> values) {
            addCriterion("UtensilsDesign not in", values, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignBetween(Integer value1, Integer value2) {
            addCriterion("UtensilsDesign between", value1, value2, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andUtensilsdesignNotBetween(Integer value1, Integer value2) {
            addCriterion("UtensilsDesign not between", value1, value2, "utensilsdesign");
            return (Criteria) this;
        }

        public Criteria andConstructionIsNull() {
            addCriterion("Construction is null");
            return (Criteria) this;
        }

        public Criteria andConstructionIsNotNull() {
            addCriterion("Construction is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionEqualTo(Integer value) {
            addCriterion("Construction =", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionNotEqualTo(Integer value) {
            addCriterion("Construction <>", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionGreaterThan(Integer value) {
            addCriterion("Construction >", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Construction >=", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionLessThan(Integer value) {
            addCriterion("Construction <", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionLessThanOrEqualTo(Integer value) {
            addCriterion("Construction <=", value, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionIn(List<Integer> values) {
            addCriterion("Construction in", values, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionNotIn(List<Integer> values) {
            addCriterion("Construction not in", values, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionBetween(Integer value1, Integer value2) {
            addCriterion("Construction between", value1, value2, "construction");
            return (Criteria) this;
        }

        public Criteria andConstructionNotBetween(Integer value1, Integer value2) {
            addCriterion("Construction not between", value1, value2, "construction");
            return (Criteria) this;
        }

        public Criteria andModelingIsNull() {
            addCriterion("Modeling is null");
            return (Criteria) this;
        }

        public Criteria andModelingIsNotNull() {
            addCriterion("Modeling is not null");
            return (Criteria) this;
        }

        public Criteria andModelingEqualTo(Integer value) {
            addCriterion("Modeling =", value, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingNotEqualTo(Integer value) {
            addCriterion("Modeling <>", value, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingGreaterThan(Integer value) {
            addCriterion("Modeling >", value, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Modeling >=", value, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingLessThan(Integer value) {
            addCriterion("Modeling <", value, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingLessThanOrEqualTo(Integer value) {
            addCriterion("Modeling <=", value, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingIn(List<Integer> values) {
            addCriterion("Modeling in", values, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingNotIn(List<Integer> values) {
            addCriterion("Modeling not in", values, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingBetween(Integer value1, Integer value2) {
            addCriterion("Modeling between", value1, value2, "modeling");
            return (Criteria) this;
        }

        public Criteria andModelingNotBetween(Integer value1, Integer value2) {
            addCriterion("Modeling not between", value1, value2, "modeling");
            return (Criteria) this;
        }

        public Criteria andPackagingIsNull() {
            addCriterion("Packaging is null");
            return (Criteria) this;
        }

        public Criteria andPackagingIsNotNull() {
            addCriterion("Packaging is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingEqualTo(Integer value) {
            addCriterion("Packaging =", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotEqualTo(Integer value) {
            addCriterion("Packaging <>", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingGreaterThan(Integer value) {
            addCriterion("Packaging >", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Packaging >=", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingLessThan(Integer value) {
            addCriterion("Packaging <", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingLessThanOrEqualTo(Integer value) {
            addCriterion("Packaging <=", value, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingIn(List<Integer> values) {
            addCriterion("Packaging in", values, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotIn(List<Integer> values) {
            addCriterion("Packaging not in", values, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingBetween(Integer value1, Integer value2) {
            addCriterion("Packaging between", value1, value2, "packaging");
            return (Criteria) this;
        }

        public Criteria andPackagingNotBetween(Integer value1, Integer value2) {
            addCriterion("Packaging not between", value1, value2, "packaging");
            return (Criteria) this;
        }

        public Criteria andIsprintloginIsNull() {
            addCriterion("IsPrintLogin is null");
            return (Criteria) this;
        }

        public Criteria andIsprintloginIsNotNull() {
            addCriterion("IsPrintLogin is not null");
            return (Criteria) this;
        }

        public Criteria andIsprintloginEqualTo(Integer value) {
            addCriterion("IsPrintLogin =", value, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginNotEqualTo(Integer value) {
            addCriterion("IsPrintLogin <>", value, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginGreaterThan(Integer value) {
            addCriterion("IsPrintLogin >", value, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPrintLogin >=", value, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginLessThan(Integer value) {
            addCriterion("IsPrintLogin <", value, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginLessThanOrEqualTo(Integer value) {
            addCriterion("IsPrintLogin <=", value, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginIn(List<Integer> values) {
            addCriterion("IsPrintLogin in", values, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginNotIn(List<Integer> values) {
            addCriterion("IsPrintLogin not in", values, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginBetween(Integer value1, Integer value2) {
            addCriterion("IsPrintLogin between", value1, value2, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andIsprintloginNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPrintLogin not between", value1, value2, "isprintlogin");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionIsNull() {
            addCriterion("GiftGivingOccasion is null");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionIsNotNull() {
            addCriterion("GiftGivingOccasion is not null");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionEqualTo(String value) {
            addCriterion("GiftGivingOccasion =", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionNotEqualTo(String value) {
            addCriterion("GiftGivingOccasion <>", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionGreaterThan(String value) {
            addCriterion("GiftGivingOccasion >", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionGreaterThanOrEqualTo(String value) {
            addCriterion("GiftGivingOccasion >=", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionLessThan(String value) {
            addCriterion("GiftGivingOccasion <", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionLessThanOrEqualTo(String value) {
            addCriterion("GiftGivingOccasion <=", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionLike(String value) {
            addCriterion("GiftGivingOccasion like", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionNotLike(String value) {
            addCriterion("GiftGivingOccasion not like", value, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionIn(List<String> values) {
            addCriterion("GiftGivingOccasion in", values, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionNotIn(List<String> values) {
            addCriterion("GiftGivingOccasion not in", values, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionBetween(String value1, String value2) {
            addCriterion("GiftGivingOccasion between", value1, value2, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftgivingoccasionNotBetween(String value1, String value2) {
            addCriterion("GiftGivingOccasion not between", value1, value2, "giftgivingoccasion");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryIsNull() {
            addCriterion("GiftCategory is null");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryIsNotNull() {
            addCriterion("GiftCategory is not null");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryEqualTo(String value) {
            addCriterion("GiftCategory =", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryNotEqualTo(String value) {
            addCriterion("GiftCategory <>", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryGreaterThan(String value) {
            addCriterion("GiftCategory >", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("GiftCategory >=", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryLessThan(String value) {
            addCriterion("GiftCategory <", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryLessThanOrEqualTo(String value) {
            addCriterion("GiftCategory <=", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryLike(String value) {
            addCriterion("GiftCategory like", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryNotLike(String value) {
            addCriterion("GiftCategory not like", value, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryIn(List<String> values) {
            addCriterion("GiftCategory in", values, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryNotIn(List<String> values) {
            addCriterion("GiftCategory not in", values, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryBetween(String value1, String value2) {
            addCriterion("GiftCategory between", value1, value2, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftcategoryNotBetween(String value1, String value2) {
            addCriterion("GiftCategory not between", value1, value2, "giftcategory");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesIsNull() {
            addCriterion("GiftPurposes is null");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesIsNotNull() {
            addCriterion("GiftPurposes is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesEqualTo(String value) {
            addCriterion("GiftPurposes =", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesNotEqualTo(String value) {
            addCriterion("GiftPurposes <>", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesGreaterThan(String value) {
            addCriterion("GiftPurposes >", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesGreaterThanOrEqualTo(String value) {
            addCriterion("GiftPurposes >=", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesLessThan(String value) {
            addCriterion("GiftPurposes <", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesLessThanOrEqualTo(String value) {
            addCriterion("GiftPurposes <=", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesLike(String value) {
            addCriterion("GiftPurposes like", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesNotLike(String value) {
            addCriterion("GiftPurposes not like", value, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesIn(List<String> values) {
            addCriterion("GiftPurposes in", values, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesNotIn(List<String> values) {
            addCriterion("GiftPurposes not in", values, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesBetween(String value1, String value2) {
            addCriterion("GiftPurposes between", value1, value2, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftpurposesNotBetween(String value1, String value2) {
            addCriterion("GiftPurposes not between", value1, value2, "giftpurposes");
            return (Criteria) this;
        }

        public Criteria andGiftstyleIsNull() {
            addCriterion("GiftStyle is null");
            return (Criteria) this;
        }

        public Criteria andGiftstyleIsNotNull() {
            addCriterion("GiftStyle is not null");
            return (Criteria) this;
        }

        public Criteria andGiftstyleEqualTo(String value) {
            addCriterion("GiftStyle =", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleNotEqualTo(String value) {
            addCriterion("GiftStyle <>", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleGreaterThan(String value) {
            addCriterion("GiftStyle >", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleGreaterThanOrEqualTo(String value) {
            addCriterion("GiftStyle >=", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleLessThan(String value) {
            addCriterion("GiftStyle <", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleLessThanOrEqualTo(String value) {
            addCriterion("GiftStyle <=", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleLike(String value) {
            addCriterion("GiftStyle like", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleNotLike(String value) {
            addCriterion("GiftStyle not like", value, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleIn(List<String> values) {
            addCriterion("GiftStyle in", values, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleNotIn(List<String> values) {
            addCriterion("GiftStyle not in", values, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleBetween(String value1, String value2) {
            addCriterion("GiftStyle between", value1, value2, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftstyleNotBetween(String value1, String value2) {
            addCriterion("GiftStyle not between", value1, value2, "giftstyle");
            return (Criteria) this;
        }

        public Criteria andGiftobjectIsNull() {
            addCriterion("GiftObject is null");
            return (Criteria) this;
        }

        public Criteria andGiftobjectIsNotNull() {
            addCriterion("GiftObject is not null");
            return (Criteria) this;
        }

        public Criteria andGiftobjectEqualTo(String value) {
            addCriterion("GiftObject =", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectNotEqualTo(String value) {
            addCriterion("GiftObject <>", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectGreaterThan(String value) {
            addCriterion("GiftObject >", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectGreaterThanOrEqualTo(String value) {
            addCriterion("GiftObject >=", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectLessThan(String value) {
            addCriterion("GiftObject <", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectLessThanOrEqualTo(String value) {
            addCriterion("GiftObject <=", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectLike(String value) {
            addCriterion("GiftObject like", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectNotLike(String value) {
            addCriterion("GiftObject not like", value, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectIn(List<String> values) {
            addCriterion("GiftObject in", values, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectNotIn(List<String> values) {
            addCriterion("GiftObject not in", values, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectBetween(String value1, String value2) {
            addCriterion("GiftObject between", value1, value2, "giftobject");
            return (Criteria) this;
        }

        public Criteria andGiftobjectNotBetween(String value1, String value2) {
            addCriterion("GiftObject not between", value1, value2, "giftobject");
            return (Criteria) this;
        }

        public Criteria andIscustommadeIsNull() {
            addCriterion("IsCustomMade is null");
            return (Criteria) this;
        }

        public Criteria andIscustommadeIsNotNull() {
            addCriterion("IsCustomMade is not null");
            return (Criteria) this;
        }

        public Criteria andIscustommadeEqualTo(Integer value) {
            addCriterion("IsCustomMade =", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeNotEqualTo(Integer value) {
            addCriterion("IsCustomMade <>", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeGreaterThan(Integer value) {
            addCriterion("IsCustomMade >", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsCustomMade >=", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeLessThan(Integer value) {
            addCriterion("IsCustomMade <", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeLessThanOrEqualTo(Integer value) {
            addCriterion("IsCustomMade <=", value, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeIn(List<Integer> values) {
            addCriterion("IsCustomMade in", values, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeNotIn(List<Integer> values) {
            addCriterion("IsCustomMade not in", values, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeBetween(Integer value1, Integer value2) {
            addCriterion("IsCustomMade between", value1, value2, "iscustommade");
            return (Criteria) this;
        }

        public Criteria andIscustommadeNotBetween(Integer value1, Integer value2) {
            addCriterion("IsCustomMade not between", value1, value2, "iscustommade");
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

        public Criteria andStorecategoryidIsNull() {
            addCriterion("StoreCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidIsNotNull() {
            addCriterion("StoreCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidEqualTo(Integer value) {
            addCriterion("StoreCategoryID =", value, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidNotEqualTo(Integer value) {
            addCriterion("StoreCategoryID <>", value, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidGreaterThan(Integer value) {
            addCriterion("StoreCategoryID >", value, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StoreCategoryID >=", value, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidLessThan(Integer value) {
            addCriterion("StoreCategoryID <", value, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("StoreCategoryID <=", value, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidIn(List<Integer> values) {
            addCriterion("StoreCategoryID in", values, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidNotIn(List<Integer> values) {
            addCriterion("StoreCategoryID not in", values, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidBetween(Integer value1, Integer value2) {
            addCriterion("StoreCategoryID between", value1, value2, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andStorecategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("StoreCategoryID not between", value1, value2, "storecategoryid");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnIsNull() {
            addCriterion("IsNoReasonReturn is null");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnIsNotNull() {
            addCriterion("IsNoReasonReturn is not null");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnEqualTo(Integer value) {
            addCriterion("IsNoReasonReturn =", value, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnNotEqualTo(Integer value) {
            addCriterion("IsNoReasonReturn <>", value, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnGreaterThan(Integer value) {
            addCriterion("IsNoReasonReturn >", value, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNoReasonReturn >=", value, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnLessThan(Integer value) {
            addCriterion("IsNoReasonReturn <", value, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnLessThanOrEqualTo(Integer value) {
            addCriterion("IsNoReasonReturn <=", value, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnIn(List<Integer> values) {
            addCriterion("IsNoReasonReturn in", values, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnNotIn(List<Integer> values) {
            addCriterion("IsNoReasonReturn not in", values, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnBetween(Integer value1, Integer value2) {
            addCriterion("IsNoReasonReturn between", value1, value2, "isnoreasonreturn");
            return (Criteria) this;
        }

        public Criteria andIsnoreasonreturnNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNoReasonReturn not between", value1, value2, "isnoreasonreturn");
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

        public Criteria andIsuserrecommendIsNull() {
            addCriterion("IsUserRecommend is null");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendIsNotNull() {
            addCriterion("IsUserRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendEqualTo(Integer value) {
            addCriterion("IsUserRecommend =", value, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendNotEqualTo(Integer value) {
            addCriterion("IsUserRecommend <>", value, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendGreaterThan(Integer value) {
            addCriterion("IsUserRecommend >", value, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUserRecommend >=", value, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendLessThan(Integer value) {
            addCriterion("IsUserRecommend <", value, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendLessThanOrEqualTo(Integer value) {
            addCriterion("IsUserRecommend <=", value, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendIn(List<Integer> values) {
            addCriterion("IsUserRecommend in", values, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendNotIn(List<Integer> values) {
            addCriterion("IsUserRecommend not in", values, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendBetween(Integer value1, Integer value2) {
            addCriterion("IsUserRecommend between", value1, value2, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andIsuserrecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("IsUserRecommend not between", value1, value2, "isuserrecommend");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidIsNull() {
            addCriterion("UserRecommendListID is null");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidIsNotNull() {
            addCriterion("UserRecommendListID is not null");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidEqualTo(Integer value) {
            addCriterion("UserRecommendListID =", value, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidNotEqualTo(Integer value) {
            addCriterion("UserRecommendListID <>", value, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidGreaterThan(Integer value) {
            addCriterion("UserRecommendListID >", value, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserRecommendListID >=", value, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidLessThan(Integer value) {
            addCriterion("UserRecommendListID <", value, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidLessThanOrEqualTo(Integer value) {
            addCriterion("UserRecommendListID <=", value, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidIn(List<Integer> values) {
            addCriterion("UserRecommendListID in", values, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidNotIn(List<Integer> values) {
            addCriterion("UserRecommendListID not in", values, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidBetween(Integer value1, Integer value2) {
            addCriterion("UserRecommendListID between", value1, value2, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andUserrecommendlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserRecommendListID not between", value1, value2, "userrecommendlistid");
            return (Criteria) this;
        }

        public Criteria andCommentscoreIsNull() {
            addCriterion("CommentScore is null");
            return (Criteria) this;
        }

        public Criteria andCommentscoreIsNotNull() {
            addCriterion("CommentScore is not null");
            return (Criteria) this;
        }

        public Criteria andCommentscoreEqualTo(Integer value) {
            addCriterion("CommentScore =", value, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreNotEqualTo(Integer value) {
            addCriterion("CommentScore <>", value, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreGreaterThan(Integer value) {
            addCriterion("CommentScore >", value, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentScore >=", value, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreLessThan(Integer value) {
            addCriterion("CommentScore <", value, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreLessThanOrEqualTo(Integer value) {
            addCriterion("CommentScore <=", value, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreIn(List<Integer> values) {
            addCriterion("CommentScore in", values, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreNotIn(List<Integer> values) {
            addCriterion("CommentScore not in", values, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreBetween(Integer value1, Integer value2) {
            addCriterion("CommentScore between", value1, value2, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentScore not between", value1, value2, "commentscore");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNull() {
            addCriterion("CommentNum is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("CommentNum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Integer value) {
            addCriterion("CommentNum =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Integer value) {
            addCriterion("CommentNum <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Integer value) {
            addCriterion("CommentNum >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentNum >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Integer value) {
            addCriterion("CommentNum <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("CommentNum <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Integer> values) {
            addCriterion("CommentNum in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Integer> values) {
            addCriterion("CommentNum not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("CommentNum between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentNum not between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumIsNull() {
            addCriterion("ConsultNum is null");
            return (Criteria) this;
        }

        public Criteria andConsultnumIsNotNull() {
            addCriterion("ConsultNum is not null");
            return (Criteria) this;
        }

        public Criteria andConsultnumEqualTo(Integer value) {
            addCriterion("ConsultNum =", value, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumNotEqualTo(Integer value) {
            addCriterion("ConsultNum <>", value, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumGreaterThan(Integer value) {
            addCriterion("ConsultNum >", value, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConsultNum >=", value, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumLessThan(Integer value) {
            addCriterion("ConsultNum <", value, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumLessThanOrEqualTo(Integer value) {
            addCriterion("ConsultNum <=", value, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumIn(List<Integer> values) {
            addCriterion("ConsultNum in", values, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumNotIn(List<Integer> values) {
            addCriterion("ConsultNum not in", values, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumBetween(Integer value1, Integer value2) {
            addCriterion("ConsultNum between", value1, value2, "consultnum");
            return (Criteria) this;
        }

        public Criteria andConsultnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ConsultNum not between", value1, value2, "consultnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumIsNull() {
            addCriterion("CollectNum is null");
            return (Criteria) this;
        }

        public Criteria andCollectnumIsNotNull() {
            addCriterion("CollectNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollectnumEqualTo(Integer value) {
            addCriterion("CollectNum =", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotEqualTo(Integer value) {
            addCriterion("CollectNum <>", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumGreaterThan(Integer value) {
            addCriterion("CollectNum >", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CollectNum >=", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumLessThan(Integer value) {
            addCriterion("CollectNum <", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumLessThanOrEqualTo(Integer value) {
            addCriterion("CollectNum <=", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumIn(List<Integer> values) {
            addCriterion("CollectNum in", values, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotIn(List<Integer> values) {
            addCriterion("CollectNum not in", values, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumBetween(Integer value1, Integer value2) {
            addCriterion("CollectNum between", value1, value2, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotBetween(Integer value1, Integer value2) {
            addCriterion("CollectNum not between", value1, value2, "collectnum");
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

        public Criteria andStorageIsNull() {
            addCriterion("Storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("Storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(Integer value) {
            addCriterion("Storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(Integer value) {
            addCriterion("Storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(Integer value) {
            addCriterion("Storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("Storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(Integer value) {
            addCriterion("Storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(Integer value) {
            addCriterion("Storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<Integer> values) {
            addCriterion("Storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<Integer> values) {
            addCriterion("Storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(Integer value1, Integer value2) {
            addCriterion("Storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(Integer value1, Integer value2) {
            addCriterion("Storage not between", value1, value2, "storage");
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

        public Criteria andIsputawayIsNull() {
            addCriterion("IsPutaway is null");
            return (Criteria) this;
        }

        public Criteria andIsputawayIsNotNull() {
            addCriterion("IsPutaway is not null");
            return (Criteria) this;
        }

        public Criteria andIsputawayEqualTo(Integer value) {
            addCriterion("IsPutaway =", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotEqualTo(Integer value) {
            addCriterion("IsPutaway <>", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThan(Integer value) {
            addCriterion("IsPutaway >", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPutaway >=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThan(Integer value) {
            addCriterion("IsPutaway <", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayLessThanOrEqualTo(Integer value) {
            addCriterion("IsPutaway <=", value, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayIn(List<Integer> values) {
            addCriterion("IsPutaway in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotIn(List<Integer> values) {
            addCriterion("IsPutaway not in", values, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayBetween(Integer value1, Integer value2) {
            addCriterion("IsPutaway between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andIsputawayNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPutaway not between", value1, value2, "isputaway");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeIsNull() {
            addCriterion("PutawayTime is null");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeIsNotNull() {
            addCriterion("PutawayTime is not null");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeEqualTo(Date value) {
            addCriterion("PutawayTime =", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeNotEqualTo(Date value) {
            addCriterion("PutawayTime <>", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeGreaterThan(Date value) {
            addCriterion("PutawayTime >", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PutawayTime >=", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeLessThan(Date value) {
            addCriterion("PutawayTime <", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeLessThanOrEqualTo(Date value) {
            addCriterion("PutawayTime <=", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeIn(List<Date> values) {
            addCriterion("PutawayTime in", values, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeNotIn(List<Date> values) {
            addCriterion("PutawayTime not in", values, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeBetween(Date value1, Date value2) {
            addCriterion("PutawayTime between", value1, value2, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeNotBetween(Date value1, Date value2) {
            addCriterion("PutawayTime not between", value1, value2, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsIsNull() {
            addCriterion("IsLocalFeaturesGifts is null");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsIsNotNull() {
            addCriterion("IsLocalFeaturesGifts is not null");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsEqualTo(Integer value) {
            addCriterion("IsLocalFeaturesGifts =", value, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsNotEqualTo(Integer value) {
            addCriterion("IsLocalFeaturesGifts <>", value, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsGreaterThan(Integer value) {
            addCriterion("IsLocalFeaturesGifts >", value, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsLocalFeaturesGifts >=", value, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsLessThan(Integer value) {
            addCriterion("IsLocalFeaturesGifts <", value, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsLessThanOrEqualTo(Integer value) {
            addCriterion("IsLocalFeaturesGifts <=", value, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsIn(List<Integer> values) {
            addCriterion("IsLocalFeaturesGifts in", values, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsNotIn(List<Integer> values) {
            addCriterion("IsLocalFeaturesGifts not in", values, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsBetween(Integer value1, Integer value2) {
            addCriterion("IsLocalFeaturesGifts between", value1, value2, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andIslocalfeaturesgiftsNotBetween(Integer value1, Integer value2) {
            addCriterion("IsLocalFeaturesGifts not between", value1, value2, "islocalfeaturesgifts");
            return (Criteria) this;
        }

        public Criteria andGaddtimeIsNull() {
            addCriterion("GAddTime is null");
            return (Criteria) this;
        }

        public Criteria andGaddtimeIsNotNull() {
            addCriterion("GAddTime is not null");
            return (Criteria) this;
        }

        public Criteria andGaddtimeEqualTo(Date value) {
            addCriterion("GAddTime =", value, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeNotEqualTo(Date value) {
            addCriterion("GAddTime <>", value, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeGreaterThan(Date value) {
            addCriterion("GAddTime >", value, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GAddTime >=", value, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeLessThan(Date value) {
            addCriterion("GAddTime <", value, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("GAddTime <=", value, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeIn(List<Date> values) {
            addCriterion("GAddTime in", values, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeNotIn(List<Date> values) {
            addCriterion("GAddTime not in", values, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeBetween(Date value1, Date value2) {
            addCriterion("GAddTime between", value1, value2, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("GAddTime not between", value1, value2, "gaddtime");
            return (Criteria) this;
        }

        public Criteria andGisauditIsNull() {
            addCriterion("GIsAudit is null");
            return (Criteria) this;
        }

        public Criteria andGisauditIsNotNull() {
            addCriterion("GIsAudit is not null");
            return (Criteria) this;
        }

        public Criteria andGisauditEqualTo(Integer value) {
            addCriterion("GIsAudit =", value, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditNotEqualTo(Integer value) {
            addCriterion("GIsAudit <>", value, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditGreaterThan(Integer value) {
            addCriterion("GIsAudit >", value, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("GIsAudit >=", value, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditLessThan(Integer value) {
            addCriterion("GIsAudit <", value, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditLessThanOrEqualTo(Integer value) {
            addCriterion("GIsAudit <=", value, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditIn(List<Integer> values) {
            addCriterion("GIsAudit in", values, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditNotIn(List<Integer> values) {
            addCriterion("GIsAudit not in", values, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditBetween(Integer value1, Integer value2) {
            addCriterion("GIsAudit between", value1, value2, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGisauditNotBetween(Integer value1, Integer value2) {
            addCriterion("GIsAudit not between", value1, value2, "gisaudit");
            return (Criteria) this;
        }

        public Criteria andGprovinceIsNull() {
            addCriterion("GProvince is null");
            return (Criteria) this;
        }

        public Criteria andGprovinceIsNotNull() {
            addCriterion("GProvince is not null");
            return (Criteria) this;
        }

        public Criteria andGprovinceEqualTo(Integer value) {
            addCriterion("GProvince =", value, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceNotEqualTo(Integer value) {
            addCriterion("GProvince <>", value, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceGreaterThan(Integer value) {
            addCriterion("GProvince >", value, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("GProvince >=", value, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceLessThan(Integer value) {
            addCriterion("GProvince <", value, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceLessThanOrEqualTo(Integer value) {
            addCriterion("GProvince <=", value, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceIn(List<Integer> values) {
            addCriterion("GProvince in", values, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceNotIn(List<Integer> values) {
            addCriterion("GProvince not in", values, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceBetween(Integer value1, Integer value2) {
            addCriterion("GProvince between", value1, value2, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGprovinceNotBetween(Integer value1, Integer value2) {
            addCriterion("GProvince not between", value1, value2, "gprovince");
            return (Criteria) this;
        }

        public Criteria andGcityIsNull() {
            addCriterion("GCity is null");
            return (Criteria) this;
        }

        public Criteria andGcityIsNotNull() {
            addCriterion("GCity is not null");
            return (Criteria) this;
        }

        public Criteria andGcityEqualTo(Integer value) {
            addCriterion("GCity =", value, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityNotEqualTo(Integer value) {
            addCriterion("GCity <>", value, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityGreaterThan(Integer value) {
            addCriterion("GCity >", value, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityGreaterThanOrEqualTo(Integer value) {
            addCriterion("GCity >=", value, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityLessThan(Integer value) {
            addCriterion("GCity <", value, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityLessThanOrEqualTo(Integer value) {
            addCriterion("GCity <=", value, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityIn(List<Integer> values) {
            addCriterion("GCity in", values, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityNotIn(List<Integer> values) {
            addCriterion("GCity not in", values, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityBetween(Integer value1, Integer value2) {
            addCriterion("GCity between", value1, value2, "gcity");
            return (Criteria) this;
        }

        public Criteria andGcityNotBetween(Integer value1, Integer value2) {
            addCriterion("GCity not between", value1, value2, "gcity");
            return (Criteria) this;
        }

        public Criteria andGdistrictIsNull() {
            addCriterion("GDistrict is null");
            return (Criteria) this;
        }

        public Criteria andGdistrictIsNotNull() {
            addCriterion("GDistrict is not null");
            return (Criteria) this;
        }

        public Criteria andGdistrictEqualTo(Integer value) {
            addCriterion("GDistrict =", value, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictNotEqualTo(Integer value) {
            addCriterion("GDistrict <>", value, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictGreaterThan(Integer value) {
            addCriterion("GDistrict >", value, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("GDistrict >=", value, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictLessThan(Integer value) {
            addCriterion("GDistrict <", value, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictLessThanOrEqualTo(Integer value) {
            addCriterion("GDistrict <=", value, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictIn(List<Integer> values) {
            addCriterion("GDistrict in", values, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictNotIn(List<Integer> values) {
            addCriterion("GDistrict not in", values, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictBetween(Integer value1, Integer value2) {
            addCriterion("GDistrict between", value1, value2, "gdistrict");
            return (Criteria) this;
        }

        public Criteria andGdistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("GDistrict not between", value1, value2, "gdistrict");
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

        public Criteria andGiftpricerangeIsNull() {
            addCriterion("GiftPriceRange is null");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeIsNotNull() {
            addCriterion("GiftPriceRange is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeEqualTo(Integer value) {
            addCriterion("GiftPriceRange =", value, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeNotEqualTo(Integer value) {
            addCriterion("GiftPriceRange <>", value, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeGreaterThan(Integer value) {
            addCriterion("GiftPriceRange >", value, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GiftPriceRange >=", value, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeLessThan(Integer value) {
            addCriterion("GiftPriceRange <", value, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeLessThanOrEqualTo(Integer value) {
            addCriterion("GiftPriceRange <=", value, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeIn(List<Integer> values) {
            addCriterion("GiftPriceRange in", values, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeNotIn(List<Integer> values) {
            addCriterion("GiftPriceRange not in", values, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeBetween(Integer value1, Integer value2) {
            addCriterion("GiftPriceRange between", value1, value2, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andGiftpricerangeNotBetween(Integer value1, Integer value2) {
            addCriterion("GiftPriceRange not between", value1, value2, "giftpricerange");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendIsNull() {
            addCriterion("TrendyGiftRecommend is null");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendIsNotNull() {
            addCriterion("TrendyGiftRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendEqualTo(Integer value) {
            addCriterion("TrendyGiftRecommend =", value, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendNotEqualTo(Integer value) {
            addCriterion("TrendyGiftRecommend <>", value, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendGreaterThan(Integer value) {
            addCriterion("TrendyGiftRecommend >", value, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("TrendyGiftRecommend >=", value, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendLessThan(Integer value) {
            addCriterion("TrendyGiftRecommend <", value, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendLessThanOrEqualTo(Integer value) {
            addCriterion("TrendyGiftRecommend <=", value, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendIn(List<Integer> values) {
            addCriterion("TrendyGiftRecommend in", values, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendNotIn(List<Integer> values) {
            addCriterion("TrendyGiftRecommend not in", values, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendBetween(Integer value1, Integer value2) {
            addCriterion("TrendyGiftRecommend between", value1, value2, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andTrendygiftrecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("TrendyGiftRecommend not between", value1, value2, "trendygiftrecommend");
            return (Criteria) this;
        }

        public Criteria andAdpicIsNull() {
            addCriterion("AdPic is null");
            return (Criteria) this;
        }

        public Criteria andAdpicIsNotNull() {
            addCriterion("AdPic is not null");
            return (Criteria) this;
        }

        public Criteria andAdpicEqualTo(String value) {
            addCriterion("AdPic =", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicNotEqualTo(String value) {
            addCriterion("AdPic <>", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicGreaterThan(String value) {
            addCriterion("AdPic >", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicGreaterThanOrEqualTo(String value) {
            addCriterion("AdPic >=", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicLessThan(String value) {
            addCriterion("AdPic <", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicLessThanOrEqualTo(String value) {
            addCriterion("AdPic <=", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicLike(String value) {
            addCriterion("AdPic like", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicNotLike(String value) {
            addCriterion("AdPic not like", value, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicIn(List<String> values) {
            addCriterion("AdPic in", values, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicNotIn(List<String> values) {
            addCriterion("AdPic not in", values, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicBetween(String value1, String value2) {
            addCriterion("AdPic between", value1, value2, "adpic");
            return (Criteria) this;
        }

        public Criteria andAdpicNotBetween(String value1, String value2) {
            addCriterion("AdPic not between", value1, value2, "adpic");
            return (Criteria) this;
        }

        public Criteria andFromtypeIsNull() {
            addCriterion("fromtype is null");
            return (Criteria) this;
        }

        public Criteria andFromtypeIsNotNull() {
            addCriterion("fromtype is not null");
            return (Criteria) this;
        }

        public Criteria andFromtypeEqualTo(Integer value) {
            addCriterion("fromtype =", value, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeNotEqualTo(Integer value) {
            addCriterion("fromtype <>", value, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeGreaterThan(Integer value) {
            addCriterion("fromtype >", value, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromtype >=", value, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeLessThan(Integer value) {
            addCriterion("fromtype <", value, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeLessThanOrEqualTo(Integer value) {
            addCriterion("fromtype <=", value, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeIn(List<Integer> values) {
            addCriterion("fromtype in", values, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeNotIn(List<Integer> values) {
            addCriterion("fromtype not in", values, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeBetween(Integer value1, Integer value2) {
            addCriterion("fromtype between", value1, value2, "fromtype");
            return (Criteria) this;
        }

        public Criteria andFromtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fromtype not between", value1, value2, "fromtype");
            return (Criteria) this;
        }

        public Criteria andSellernickIsNull() {
            addCriterion("sellernick is null");
            return (Criteria) this;
        }

        public Criteria andSellernickIsNotNull() {
            addCriterion("sellernick is not null");
            return (Criteria) this;
        }

        public Criteria andSellernickEqualTo(String value) {
            addCriterion("sellernick =", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickNotEqualTo(String value) {
            addCriterion("sellernick <>", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickGreaterThan(String value) {
            addCriterion("sellernick >", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickGreaterThanOrEqualTo(String value) {
            addCriterion("sellernick >=", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickLessThan(String value) {
            addCriterion("sellernick <", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickLessThanOrEqualTo(String value) {
            addCriterion("sellernick <=", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickLike(String value) {
            addCriterion("sellernick like", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickNotLike(String value) {
            addCriterion("sellernick not like", value, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickIn(List<String> values) {
            addCriterion("sellernick in", values, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickNotIn(List<String> values) {
            addCriterion("sellernick not in", values, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickBetween(String value1, String value2) {
            addCriterion("sellernick between", value1, value2, "sellernick");
            return (Criteria) this;
        }

        public Criteria andSellernickNotBetween(String value1, String value2) {
            addCriterion("sellernick not between", value1, value2, "sellernick");
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