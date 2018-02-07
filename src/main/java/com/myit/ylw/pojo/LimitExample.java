package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimitExample() {
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

        public Criteria andLimitidIsNull() {
            addCriterion("LimitID is null");
            return (Criteria) this;
        }

        public Criteria andLimitidIsNotNull() {
            addCriterion("LimitID is not null");
            return (Criteria) this;
        }

        public Criteria andLimitidEqualTo(Integer value) {
            addCriterion("LimitID =", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidNotEqualTo(Integer value) {
            addCriterion("LimitID <>", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidGreaterThan(Integer value) {
            addCriterion("LimitID >", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LimitID >=", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidLessThan(Integer value) {
            addCriterion("LimitID <", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidLessThanOrEqualTo(Integer value) {
            addCriterion("LimitID <=", value, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidIn(List<Integer> values) {
            addCriterion("LimitID in", values, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidNotIn(List<Integer> values) {
            addCriterion("LimitID not in", values, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidBetween(Integer value1, Integer value2) {
            addCriterion("LimitID between", value1, value2, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitidNotBetween(Integer value1, Integer value2) {
            addCriterion("LimitID not between", value1, value2, "limitid");
            return (Criteria) this;
        }

        public Criteria andLimitfieldIsNull() {
            addCriterion("LimitField is null");
            return (Criteria) this;
        }

        public Criteria andLimitfieldIsNotNull() {
            addCriterion("LimitField is not null");
            return (Criteria) this;
        }

        public Criteria andLimitfieldEqualTo(String value) {
            addCriterion("LimitField =", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldNotEqualTo(String value) {
            addCriterion("LimitField <>", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldGreaterThan(String value) {
            addCriterion("LimitField >", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldGreaterThanOrEqualTo(String value) {
            addCriterion("LimitField >=", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldLessThan(String value) {
            addCriterion("LimitField <", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldLessThanOrEqualTo(String value) {
            addCriterion("LimitField <=", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldLike(String value) {
            addCriterion("LimitField like", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldNotLike(String value) {
            addCriterion("LimitField not like", value, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldIn(List<String> values) {
            addCriterion("LimitField in", values, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldNotIn(List<String> values) {
            addCriterion("LimitField not in", values, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldBetween(String value1, String value2) {
            addCriterion("LimitField between", value1, value2, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitfieldNotBetween(String value1, String value2) {
            addCriterion("LimitField not between", value1, value2, "limitfield");
            return (Criteria) this;
        }

        public Criteria andLimitvalueIsNull() {
            addCriterion("LimitValue is null");
            return (Criteria) this;
        }

        public Criteria andLimitvalueIsNotNull() {
            addCriterion("LimitValue is not null");
            return (Criteria) this;
        }

        public Criteria andLimitvalueEqualTo(String value) {
            addCriterion("LimitValue =", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueNotEqualTo(String value) {
            addCriterion("LimitValue <>", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueGreaterThan(String value) {
            addCriterion("LimitValue >", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueGreaterThanOrEqualTo(String value) {
            addCriterion("LimitValue >=", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueLessThan(String value) {
            addCriterion("LimitValue <", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueLessThanOrEqualTo(String value) {
            addCriterion("LimitValue <=", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueLike(String value) {
            addCriterion("LimitValue like", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueNotLike(String value) {
            addCriterion("LimitValue not like", value, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueIn(List<String> values) {
            addCriterion("LimitValue in", values, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueNotIn(List<String> values) {
            addCriterion("LimitValue not in", values, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueBetween(String value1, String value2) {
            addCriterion("LimitValue between", value1, value2, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andLimitvalueNotBetween(String value1, String value2) {
            addCriterion("LimitValue not between", value1, value2, "limitvalue");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andChildnumIsNull() {
            addCriterion("ChildNum is null");
            return (Criteria) this;
        }

        public Criteria andChildnumIsNotNull() {
            addCriterion("ChildNum is not null");
            return (Criteria) this;
        }

        public Criteria andChildnumEqualTo(Integer value) {
            addCriterion("ChildNum =", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotEqualTo(Integer value) {
            addCriterion("ChildNum <>", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumGreaterThan(Integer value) {
            addCriterion("ChildNum >", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChildNum >=", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumLessThan(Integer value) {
            addCriterion("ChildNum <", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumLessThanOrEqualTo(Integer value) {
            addCriterion("ChildNum <=", value, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumIn(List<Integer> values) {
            addCriterion("ChildNum in", values, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotIn(List<Integer> values) {
            addCriterion("ChildNum not in", values, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumBetween(Integer value1, Integer value2) {
            addCriterion("ChildNum between", value1, value2, "childnum");
            return (Criteria) this;
        }

        public Criteria andChildnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ChildNum not between", value1, value2, "childnum");
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

        public Criteria andIsdistIsNull() {
            addCriterion("IsDist is null");
            return (Criteria) this;
        }

        public Criteria andIsdistIsNotNull() {
            addCriterion("IsDist is not null");
            return (Criteria) this;
        }

        public Criteria andIsdistEqualTo(Integer value) {
            addCriterion("IsDist =", value, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistNotEqualTo(Integer value) {
            addCriterion("IsDist <>", value, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistGreaterThan(Integer value) {
            addCriterion("IsDist >", value, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDist >=", value, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistLessThan(Integer value) {
            addCriterion("IsDist <", value, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistLessThanOrEqualTo(Integer value) {
            addCriterion("IsDist <=", value, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistIn(List<Integer> values) {
            addCriterion("IsDist in", values, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistNotIn(List<Integer> values) {
            addCriterion("IsDist not in", values, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistBetween(Integer value1, Integer value2) {
            addCriterion("IsDist between", value1, value2, "isdist");
            return (Criteria) this;
        }

        public Criteria andIsdistNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDist not between", value1, value2, "isdist");
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