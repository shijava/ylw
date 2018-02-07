package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andDictionaryidIsNull() {
            addCriterion("DictionaryID is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIsNotNull() {
            addCriterion("DictionaryID is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryidEqualTo(Integer value) {
            addCriterion("DictionaryID =", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotEqualTo(Integer value) {
            addCriterion("DictionaryID <>", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidGreaterThan(Integer value) {
            addCriterion("DictionaryID >", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DictionaryID >=", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLessThan(Integer value) {
            addCriterion("DictionaryID <", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLessThanOrEqualTo(Integer value) {
            addCriterion("DictionaryID <=", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIn(List<Integer> values) {
            addCriterion("DictionaryID in", values, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotIn(List<Integer> values) {
            addCriterion("DictionaryID not in", values, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidBetween(Integer value1, Integer value2) {
            addCriterion("DictionaryID between", value1, value2, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotBetween(Integer value1, Integer value2) {
            addCriterion("DictionaryID not between", value1, value2, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionarynameIsNull() {
            addCriterion("DictionaryName is null");
            return (Criteria) this;
        }

        public Criteria andDictionarynameIsNotNull() {
            addCriterion("DictionaryName is not null");
            return (Criteria) this;
        }

        public Criteria andDictionarynameEqualTo(String value) {
            addCriterion("DictionaryName =", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotEqualTo(String value) {
            addCriterion("DictionaryName <>", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameGreaterThan(String value) {
            addCriterion("DictionaryName >", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameGreaterThanOrEqualTo(String value) {
            addCriterion("DictionaryName >=", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameLessThan(String value) {
            addCriterion("DictionaryName <", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameLessThanOrEqualTo(String value) {
            addCriterion("DictionaryName <=", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameLike(String value) {
            addCriterion("DictionaryName like", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotLike(String value) {
            addCriterion("DictionaryName not like", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameIn(List<String> values) {
            addCriterion("DictionaryName in", values, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotIn(List<String> values) {
            addCriterion("DictionaryName not in", values, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameBetween(String value1, String value2) {
            addCriterion("DictionaryName between", value1, value2, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotBetween(String value1, String value2) {
            addCriterion("DictionaryName not between", value1, value2, "dictionaryname");
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

        public Criteria andDictionaryvalueIsNull() {
            addCriterion("DictionaryValue is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueIsNotNull() {
            addCriterion("DictionaryValue is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueEqualTo(String value) {
            addCriterion("DictionaryValue =", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueNotEqualTo(String value) {
            addCriterion("DictionaryValue <>", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueGreaterThan(String value) {
            addCriterion("DictionaryValue >", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DictionaryValue >=", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueLessThan(String value) {
            addCriterion("DictionaryValue <", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueLessThanOrEqualTo(String value) {
            addCriterion("DictionaryValue <=", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueLike(String value) {
            addCriterion("DictionaryValue like", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueNotLike(String value) {
            addCriterion("DictionaryValue not like", value, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueIn(List<String> values) {
            addCriterion("DictionaryValue in", values, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueNotIn(List<String> values) {
            addCriterion("DictionaryValue not in", values, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueBetween(String value1, String value2) {
            addCriterion("DictionaryValue between", value1, value2, "dictionaryvalue");
            return (Criteria) this;
        }

        public Criteria andDictionaryvalueNotBetween(String value1, String value2) {
            addCriterion("DictionaryValue not between", value1, value2, "dictionaryvalue");
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