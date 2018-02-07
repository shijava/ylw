package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExhibitionPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitionPositionExample() {
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

        public Criteria andExhibitionpositionidIsNull() {
            addCriterion("ExhibitionPositionID is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidIsNotNull() {
            addCriterion("ExhibitionPositionID is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidEqualTo(Integer value) {
            addCriterion("ExhibitionPositionID =", value, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidNotEqualTo(Integer value) {
            addCriterion("ExhibitionPositionID <>", value, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidGreaterThan(Integer value) {
            addCriterion("ExhibitionPositionID >", value, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExhibitionPositionID >=", value, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidLessThan(Integer value) {
            addCriterion("ExhibitionPositionID <", value, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidLessThanOrEqualTo(Integer value) {
            addCriterion("ExhibitionPositionID <=", value, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidIn(List<Integer> values) {
            addCriterion("ExhibitionPositionID in", values, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidNotIn(List<Integer> values) {
            addCriterion("ExhibitionPositionID not in", values, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidBetween(Integer value1, Integer value2) {
            addCriterion("ExhibitionPositionID between", value1, value2, "exhibitionpositionid");
            return (Criteria) this;
        }

        public Criteria andExhibitionpositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("ExhibitionPositionID not between", value1, value2, "exhibitionpositionid");
            return (Criteria) this;
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

        public Criteria andEpnameIsNull() {
            addCriterion("EPName is null");
            return (Criteria) this;
        }

        public Criteria andEpnameIsNotNull() {
            addCriterion("EPName is not null");
            return (Criteria) this;
        }

        public Criteria andEpnameEqualTo(String value) {
            addCriterion("EPName =", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameNotEqualTo(String value) {
            addCriterion("EPName <>", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameGreaterThan(String value) {
            addCriterion("EPName >", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EPName >=", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameLessThan(String value) {
            addCriterion("EPName <", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameLessThanOrEqualTo(String value) {
            addCriterion("EPName <=", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameLike(String value) {
            addCriterion("EPName like", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameNotLike(String value) {
            addCriterion("EPName not like", value, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameIn(List<String> values) {
            addCriterion("EPName in", values, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameNotIn(List<String> values) {
            addCriterion("EPName not in", values, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameBetween(String value1, String value2) {
            addCriterion("EPName between", value1, value2, "epname");
            return (Criteria) this;
        }

        public Criteria andEpnameNotBetween(String value1, String value2) {
            addCriterion("EPName not between", value1, value2, "epname");
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

        public Criteria andNtopIsNull() {
            addCriterion("NTop is null");
            return (Criteria) this;
        }

        public Criteria andNtopIsNotNull() {
            addCriterion("NTop is not null");
            return (Criteria) this;
        }

        public Criteria andNtopEqualTo(Integer value) {
            addCriterion("NTop =", value, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopNotEqualTo(Integer value) {
            addCriterion("NTop <>", value, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopGreaterThan(Integer value) {
            addCriterion("NTop >", value, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopGreaterThanOrEqualTo(Integer value) {
            addCriterion("NTop >=", value, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopLessThan(Integer value) {
            addCriterion("NTop <", value, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopLessThanOrEqualTo(Integer value) {
            addCriterion("NTop <=", value, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopIn(List<Integer> values) {
            addCriterion("NTop in", values, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopNotIn(List<Integer> values) {
            addCriterion("NTop not in", values, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopBetween(Integer value1, Integer value2) {
            addCriterion("NTop between", value1, value2, "ntop");
            return (Criteria) this;
        }

        public Criteria andNtopNotBetween(Integer value1, Integer value2) {
            addCriterion("NTop not between", value1, value2, "ntop");
            return (Criteria) this;
        }

        public Criteria andNleftIsNull() {
            addCriterion("NLeft is null");
            return (Criteria) this;
        }

        public Criteria andNleftIsNotNull() {
            addCriterion("NLeft is not null");
            return (Criteria) this;
        }

        public Criteria andNleftEqualTo(Integer value) {
            addCriterion("NLeft =", value, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftNotEqualTo(Integer value) {
            addCriterion("NLeft <>", value, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftGreaterThan(Integer value) {
            addCriterion("NLeft >", value, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("NLeft >=", value, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftLessThan(Integer value) {
            addCriterion("NLeft <", value, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftLessThanOrEqualTo(Integer value) {
            addCriterion("NLeft <=", value, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftIn(List<Integer> values) {
            addCriterion("NLeft in", values, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftNotIn(List<Integer> values) {
            addCriterion("NLeft not in", values, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftBetween(Integer value1, Integer value2) {
            addCriterion("NLeft between", value1, value2, "nleft");
            return (Criteria) this;
        }

        public Criteria andNleftNotBetween(Integer value1, Integer value2) {
            addCriterion("NLeft not between", value1, value2, "nleft");
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