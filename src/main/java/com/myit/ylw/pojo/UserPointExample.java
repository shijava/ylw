package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPointExample() {
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

        public Criteria andPointidIsNull() {
            addCriterion("PointID is null");
            return (Criteria) this;
        }

        public Criteria andPointidIsNotNull() {
            addCriterion("PointID is not null");
            return (Criteria) this;
        }

        public Criteria andPointidEqualTo(Integer value) {
            addCriterion("PointID =", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotEqualTo(Integer value) {
            addCriterion("PointID <>", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidGreaterThan(Integer value) {
            addCriterion("PointID >", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PointID >=", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidLessThan(Integer value) {
            addCriterion("PointID <", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidLessThanOrEqualTo(Integer value) {
            addCriterion("PointID <=", value, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidIn(List<Integer> values) {
            addCriterion("PointID in", values, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotIn(List<Integer> values) {
            addCriterion("PointID not in", values, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidBetween(Integer value1, Integer value2) {
            addCriterion("PointID between", value1, value2, "pointid");
            return (Criteria) this;
        }

        public Criteria andPointidNotBetween(Integer value1, Integer value2) {
            addCriterion("PointID not between", value1, value2, "pointid");
            return (Criteria) this;
        }

        public Criteria andInoutIsNull() {
            addCriterion("InOut is null");
            return (Criteria) this;
        }

        public Criteria andInoutIsNotNull() {
            addCriterion("InOut is not null");
            return (Criteria) this;
        }

        public Criteria andInoutEqualTo(Integer value) {
            addCriterion("InOut =", value, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutNotEqualTo(Integer value) {
            addCriterion("InOut <>", value, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutGreaterThan(Integer value) {
            addCriterion("InOut >", value, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("InOut >=", value, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutLessThan(Integer value) {
            addCriterion("InOut <", value, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutLessThanOrEqualTo(Integer value) {
            addCriterion("InOut <=", value, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutIn(List<Integer> values) {
            addCriterion("InOut in", values, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutNotIn(List<Integer> values) {
            addCriterion("InOut not in", values, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutBetween(Integer value1, Integer value2) {
            addCriterion("InOut between", value1, value2, "inout");
            return (Criteria) this;
        }

        public Criteria andInoutNotBetween(Integer value1, Integer value2) {
            addCriterion("InOut not between", value1, value2, "inout");
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

        public Criteria andPointtypeIsNull() {
            addCriterion("PointType is null");
            return (Criteria) this;
        }

        public Criteria andPointtypeIsNotNull() {
            addCriterion("PointType is not null");
            return (Criteria) this;
        }

        public Criteria andPointtypeEqualTo(Integer value) {
            addCriterion("PointType =", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotEqualTo(Integer value) {
            addCriterion("PointType <>", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeGreaterThan(Integer value) {
            addCriterion("PointType >", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PointType >=", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeLessThan(Integer value) {
            addCriterion("PointType <", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeLessThanOrEqualTo(Integer value) {
            addCriterion("PointType <=", value, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeIn(List<Integer> values) {
            addCriterion("PointType in", values, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotIn(List<Integer> values) {
            addCriterion("PointType not in", values, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeBetween(Integer value1, Integer value2) {
            addCriterion("PointType between", value1, value2, "pointtype");
            return (Criteria) this;
        }

        public Criteria andPointtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PointType not between", value1, value2, "pointtype");
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

        public Criteria andShowpicIsNull() {
            addCriterion("ShowPic is null");
            return (Criteria) this;
        }

        public Criteria andShowpicIsNotNull() {
            addCriterion("ShowPic is not null");
            return (Criteria) this;
        }

        public Criteria andShowpicEqualTo(String value) {
            addCriterion("ShowPic =", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotEqualTo(String value) {
            addCriterion("ShowPic <>", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicGreaterThan(String value) {
            addCriterion("ShowPic >", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicGreaterThanOrEqualTo(String value) {
            addCriterion("ShowPic >=", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicLessThan(String value) {
            addCriterion("ShowPic <", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicLessThanOrEqualTo(String value) {
            addCriterion("ShowPic <=", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicLike(String value) {
            addCriterion("ShowPic like", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotLike(String value) {
            addCriterion("ShowPic not like", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicIn(List<String> values) {
            addCriterion("ShowPic in", values, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotIn(List<String> values) {
            addCriterion("ShowPic not in", values, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicBetween(String value1, String value2) {
            addCriterion("ShowPic between", value1, value2, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotBetween(String value1, String value2) {
            addCriterion("ShowPic not between", value1, value2, "showpic");
            return (Criteria) this;
        }

        public Criteria andObjectnoIsNull() {
            addCriterion("ObjectNO is null");
            return (Criteria) this;
        }

        public Criteria andObjectnoIsNotNull() {
            addCriterion("ObjectNO is not null");
            return (Criteria) this;
        }

        public Criteria andObjectnoEqualTo(String value) {
            addCriterion("ObjectNO =", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotEqualTo(String value) {
            addCriterion("ObjectNO <>", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoGreaterThan(String value) {
            addCriterion("ObjectNO >", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoGreaterThanOrEqualTo(String value) {
            addCriterion("ObjectNO >=", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoLessThan(String value) {
            addCriterion("ObjectNO <", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoLessThanOrEqualTo(String value) {
            addCriterion("ObjectNO <=", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoLike(String value) {
            addCriterion("ObjectNO like", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotLike(String value) {
            addCriterion("ObjectNO not like", value, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoIn(List<String> values) {
            addCriterion("ObjectNO in", values, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotIn(List<String> values) {
            addCriterion("ObjectNO not in", values, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoBetween(String value1, String value2) {
            addCriterion("ObjectNO between", value1, value2, "objectno");
            return (Criteria) this;
        }

        public Criteria andObjectnoNotBetween(String value1, String value2) {
            addCriterion("ObjectNO not between", value1, value2, "objectno");
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