package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotoExample() {
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

        public Criteria andPhotoidIsNull() {
            addCriterion("PhotoID is null");
            return (Criteria) this;
        }

        public Criteria andPhotoidIsNotNull() {
            addCriterion("PhotoID is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoidEqualTo(Integer value) {
            addCriterion("PhotoID =", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotEqualTo(Integer value) {
            addCriterion("PhotoID <>", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidGreaterThan(Integer value) {
            addCriterion("PhotoID >", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhotoID >=", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLessThan(Integer value) {
            addCriterion("PhotoID <", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidLessThanOrEqualTo(Integer value) {
            addCriterion("PhotoID <=", value, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidIn(List<Integer> values) {
            addCriterion("PhotoID in", values, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotIn(List<Integer> values) {
            addCriterion("PhotoID not in", values, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidBetween(Integer value1, Integer value2) {
            addCriterion("PhotoID between", value1, value2, "photoid");
            return (Criteria) this;
        }

        public Criteria andPhotoidNotBetween(Integer value1, Integer value2) {
            addCriterion("PhotoID not between", value1, value2, "photoid");
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

        public Criteria andPhotonameIsNull() {
            addCriterion("PhotoName is null");
            return (Criteria) this;
        }

        public Criteria andPhotonameIsNotNull() {
            addCriterion("PhotoName is not null");
            return (Criteria) this;
        }

        public Criteria andPhotonameEqualTo(String value) {
            addCriterion("PhotoName =", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotEqualTo(String value) {
            addCriterion("PhotoName <>", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameGreaterThan(String value) {
            addCriterion("PhotoName >", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoName >=", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLessThan(String value) {
            addCriterion("PhotoName <", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLessThanOrEqualTo(String value) {
            addCriterion("PhotoName <=", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameLike(String value) {
            addCriterion("PhotoName like", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotLike(String value) {
            addCriterion("PhotoName not like", value, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameIn(List<String> values) {
            addCriterion("PhotoName in", values, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotIn(List<String> values) {
            addCriterion("PhotoName not in", values, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameBetween(String value1, String value2) {
            addCriterion("PhotoName between", value1, value2, "photoname");
            return (Criteria) this;
        }

        public Criteria andPhotonameNotBetween(String value1, String value2) {
            addCriterion("PhotoName not between", value1, value2, "photoname");
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