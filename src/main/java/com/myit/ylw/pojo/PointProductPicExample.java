package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointProductPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointProductPicExample() {
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

        public Criteria andPpicidIsNull() {
            addCriterion("PPicID is null");
            return (Criteria) this;
        }

        public Criteria andPpicidIsNotNull() {
            addCriterion("PPicID is not null");
            return (Criteria) this;
        }

        public Criteria andPpicidEqualTo(Integer value) {
            addCriterion("PPicID =", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidNotEqualTo(Integer value) {
            addCriterion("PPicID <>", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidGreaterThan(Integer value) {
            addCriterion("PPicID >", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PPicID >=", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidLessThan(Integer value) {
            addCriterion("PPicID <", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidLessThanOrEqualTo(Integer value) {
            addCriterion("PPicID <=", value, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidIn(List<Integer> values) {
            addCriterion("PPicID in", values, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidNotIn(List<Integer> values) {
            addCriterion("PPicID not in", values, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidBetween(Integer value1, Integer value2) {
            addCriterion("PPicID between", value1, value2, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPpicidNotBetween(Integer value1, Integer value2) {
            addCriterion("PPicID not between", value1, value2, "ppicid");
            return (Criteria) this;
        }

        public Criteria andPointproductidIsNull() {
            addCriterion("PointProductID is null");
            return (Criteria) this;
        }

        public Criteria andPointproductidIsNotNull() {
            addCriterion("PointProductID is not null");
            return (Criteria) this;
        }

        public Criteria andPointproductidEqualTo(Integer value) {
            addCriterion("PointProductID =", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidNotEqualTo(Integer value) {
            addCriterion("PointProductID <>", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidGreaterThan(Integer value) {
            addCriterion("PointProductID >", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PointProductID >=", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidLessThan(Integer value) {
            addCriterion("PointProductID <", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidLessThanOrEqualTo(Integer value) {
            addCriterion("PointProductID <=", value, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidIn(List<Integer> values) {
            addCriterion("PointProductID in", values, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidNotIn(List<Integer> values) {
            addCriterion("PointProductID not in", values, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidBetween(Integer value1, Integer value2) {
            addCriterion("PointProductID between", value1, value2, "pointproductid");
            return (Criteria) this;
        }

        public Criteria andPointproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("PointProductID not between", value1, value2, "pointproductid");
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