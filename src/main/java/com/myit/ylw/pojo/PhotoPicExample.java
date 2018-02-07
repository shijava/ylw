package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotoPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotoPicExample() {
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

        public Criteria andPhotopicidIsNull() {
            addCriterion("PhotoPicID is null");
            return (Criteria) this;
        }

        public Criteria andPhotopicidIsNotNull() {
            addCriterion("PhotoPicID is not null");
            return (Criteria) this;
        }

        public Criteria andPhotopicidEqualTo(Integer value) {
            addCriterion("PhotoPicID =", value, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidNotEqualTo(Integer value) {
            addCriterion("PhotoPicID <>", value, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidGreaterThan(Integer value) {
            addCriterion("PhotoPicID >", value, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhotoPicID >=", value, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidLessThan(Integer value) {
            addCriterion("PhotoPicID <", value, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidLessThanOrEqualTo(Integer value) {
            addCriterion("PhotoPicID <=", value, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidIn(List<Integer> values) {
            addCriterion("PhotoPicID in", values, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidNotIn(List<Integer> values) {
            addCriterion("PhotoPicID not in", values, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidBetween(Integer value1, Integer value2) {
            addCriterion("PhotoPicID between", value1, value2, "photopicid");
            return (Criteria) this;
        }

        public Criteria andPhotopicidNotBetween(Integer value1, Integer value2) {
            addCriterion("PhotoPicID not between", value1, value2, "photopicid");
            return (Criteria) this;
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

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
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