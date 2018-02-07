package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExhibitionHallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitionHallExample() {
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

        public Criteria andExhibitionhallidIsNull() {
            addCriterion("ExhibitionHallID is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidIsNotNull() {
            addCriterion("ExhibitionHallID is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidEqualTo(Integer value) {
            addCriterion("ExhibitionHallID =", value, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidNotEqualTo(Integer value) {
            addCriterion("ExhibitionHallID <>", value, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidGreaterThan(Integer value) {
            addCriterion("ExhibitionHallID >", value, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExhibitionHallID >=", value, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidLessThan(Integer value) {
            addCriterion("ExhibitionHallID <", value, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidLessThanOrEqualTo(Integer value) {
            addCriterion("ExhibitionHallID <=", value, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidIn(List<Integer> values) {
            addCriterion("ExhibitionHallID in", values, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidNotIn(List<Integer> values) {
            addCriterion("ExhibitionHallID not in", values, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidBetween(Integer value1, Integer value2) {
            addCriterion("ExhibitionHallID between", value1, value2, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExhibitionhallidNotBetween(Integer value1, Integer value2) {
            addCriterion("ExhibitionHallID not between", value1, value2, "exhibitionhallid");
            return (Criteria) this;
        }

        public Criteria andExnameIsNull() {
            addCriterion("ExName is null");
            return (Criteria) this;
        }

        public Criteria andExnameIsNotNull() {
            addCriterion("ExName is not null");
            return (Criteria) this;
        }

        public Criteria andExnameEqualTo(String value) {
            addCriterion("ExName =", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotEqualTo(String value) {
            addCriterion("ExName <>", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameGreaterThan(String value) {
            addCriterion("ExName >", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameGreaterThanOrEqualTo(String value) {
            addCriterion("ExName >=", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameLessThan(String value) {
            addCriterion("ExName <", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameLessThanOrEqualTo(String value) {
            addCriterion("ExName <=", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameLike(String value) {
            addCriterion("ExName like", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotLike(String value) {
            addCriterion("ExName not like", value, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameIn(List<String> values) {
            addCriterion("ExName in", values, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotIn(List<String> values) {
            addCriterion("ExName not in", values, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameBetween(String value1, String value2) {
            addCriterion("ExName between", value1, value2, "exname");
            return (Criteria) this;
        }

        public Criteria andExnameNotBetween(String value1, String value2) {
            addCriterion("ExName not between", value1, value2, "exname");
            return (Criteria) this;
        }

        public Criteria andLtopIsNull() {
            addCriterion("LTop is null");
            return (Criteria) this;
        }

        public Criteria andLtopIsNotNull() {
            addCriterion("LTop is not null");
            return (Criteria) this;
        }

        public Criteria andLtopEqualTo(Integer value) {
            addCriterion("LTop =", value, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopNotEqualTo(Integer value) {
            addCriterion("LTop <>", value, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopGreaterThan(Integer value) {
            addCriterion("LTop >", value, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopGreaterThanOrEqualTo(Integer value) {
            addCriterion("LTop >=", value, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopLessThan(Integer value) {
            addCriterion("LTop <", value, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopLessThanOrEqualTo(Integer value) {
            addCriterion("LTop <=", value, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopIn(List<Integer> values) {
            addCriterion("LTop in", values, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopNotIn(List<Integer> values) {
            addCriterion("LTop not in", values, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopBetween(Integer value1, Integer value2) {
            addCriterion("LTop between", value1, value2, "ltop");
            return (Criteria) this;
        }

        public Criteria andLtopNotBetween(Integer value1, Integer value2) {
            addCriterion("LTop not between", value1, value2, "ltop");
            return (Criteria) this;
        }

        public Criteria andLleftIsNull() {
            addCriterion("LLeft is null");
            return (Criteria) this;
        }

        public Criteria andLleftIsNotNull() {
            addCriterion("LLeft is not null");
            return (Criteria) this;
        }

        public Criteria andLleftEqualTo(Integer value) {
            addCriterion("LLeft =", value, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftNotEqualTo(Integer value) {
            addCriterion("LLeft <>", value, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftGreaterThan(Integer value) {
            addCriterion("LLeft >", value, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("LLeft >=", value, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftLessThan(Integer value) {
            addCriterion("LLeft <", value, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftLessThanOrEqualTo(Integer value) {
            addCriterion("LLeft <=", value, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftIn(List<Integer> values) {
            addCriterion("LLeft in", values, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftNotIn(List<Integer> values) {
            addCriterion("LLeft not in", values, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftBetween(Integer value1, Integer value2) {
            addCriterion("LLeft between", value1, value2, "lleft");
            return (Criteria) this;
        }

        public Criteria andLleftNotBetween(Integer value1, Integer value2) {
            addCriterion("LLeft not between", value1, value2, "lleft");
            return (Criteria) this;
        }

        public Criteria andAtopIsNull() {
            addCriterion("ATop is null");
            return (Criteria) this;
        }

        public Criteria andAtopIsNotNull() {
            addCriterion("ATop is not null");
            return (Criteria) this;
        }

        public Criteria andAtopEqualTo(Integer value) {
            addCriterion("ATop =", value, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopNotEqualTo(Integer value) {
            addCriterion("ATop <>", value, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopGreaterThan(Integer value) {
            addCriterion("ATop >", value, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATop >=", value, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopLessThan(Integer value) {
            addCriterion("ATop <", value, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopLessThanOrEqualTo(Integer value) {
            addCriterion("ATop <=", value, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopIn(List<Integer> values) {
            addCriterion("ATop in", values, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopNotIn(List<Integer> values) {
            addCriterion("ATop not in", values, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopBetween(Integer value1, Integer value2) {
            addCriterion("ATop between", value1, value2, "atop");
            return (Criteria) this;
        }

        public Criteria andAtopNotBetween(Integer value1, Integer value2) {
            addCriterion("ATop not between", value1, value2, "atop");
            return (Criteria) this;
        }

        public Criteria andAleftIsNull() {
            addCriterion("ALeft is null");
            return (Criteria) this;
        }

        public Criteria andAleftIsNotNull() {
            addCriterion("ALeft is not null");
            return (Criteria) this;
        }

        public Criteria andAleftEqualTo(Integer value) {
            addCriterion("ALeft =", value, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftNotEqualTo(Integer value) {
            addCriterion("ALeft <>", value, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftGreaterThan(Integer value) {
            addCriterion("ALeft >", value, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALeft >=", value, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftLessThan(Integer value) {
            addCriterion("ALeft <", value, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftLessThanOrEqualTo(Integer value) {
            addCriterion("ALeft <=", value, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftIn(List<Integer> values) {
            addCriterion("ALeft in", values, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftNotIn(List<Integer> values) {
            addCriterion("ALeft not in", values, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftBetween(Integer value1, Integer value2) {
            addCriterion("ALeft between", value1, value2, "aleft");
            return (Criteria) this;
        }

        public Criteria andAleftNotBetween(Integer value1, Integer value2) {
            addCriterion("ALeft not between", value1, value2, "aleft");
            return (Criteria) this;
        }

        public Criteria andPositionnumIsNull() {
            addCriterion("PositionNum is null");
            return (Criteria) this;
        }

        public Criteria andPositionnumIsNotNull() {
            addCriterion("PositionNum is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnumEqualTo(Integer value) {
            addCriterion("PositionNum =", value, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumNotEqualTo(Integer value) {
            addCriterion("PositionNum <>", value, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumGreaterThan(Integer value) {
            addCriterion("PositionNum >", value, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PositionNum >=", value, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumLessThan(Integer value) {
            addCriterion("PositionNum <", value, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumLessThanOrEqualTo(Integer value) {
            addCriterion("PositionNum <=", value, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumIn(List<Integer> values) {
            addCriterion("PositionNum in", values, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumNotIn(List<Integer> values) {
            addCriterion("PositionNum not in", values, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumBetween(Integer value1, Integer value2) {
            addCriterion("PositionNum between", value1, value2, "positionnum");
            return (Criteria) this;
        }

        public Criteria andPositionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("PositionNum not between", value1, value2, "positionnum");
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