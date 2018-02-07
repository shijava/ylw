package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLogExample() {
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

        public Criteria andUserlogidIsNull() {
            addCriterion("UserLogID is null");
            return (Criteria) this;
        }

        public Criteria andUserlogidIsNotNull() {
            addCriterion("UserLogID is not null");
            return (Criteria) this;
        }

        public Criteria andUserlogidEqualTo(Integer value) {
            addCriterion("UserLogID =", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidNotEqualTo(Integer value) {
            addCriterion("UserLogID <>", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidGreaterThan(Integer value) {
            addCriterion("UserLogID >", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserLogID >=", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidLessThan(Integer value) {
            addCriterion("UserLogID <", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidLessThanOrEqualTo(Integer value) {
            addCriterion("UserLogID <=", value, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidIn(List<Integer> values) {
            addCriterion("UserLogID in", values, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidNotIn(List<Integer> values) {
            addCriterion("UserLogID not in", values, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidBetween(Integer value1, Integer value2) {
            addCriterion("UserLogID between", value1, value2, "userlogid");
            return (Criteria) this;
        }

        public Criteria andUserlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserLogID not between", value1, value2, "userlogid");
            return (Criteria) this;
        }

        public Criteria andLogcontentIsNull() {
            addCriterion("LogContent is null");
            return (Criteria) this;
        }

        public Criteria andLogcontentIsNotNull() {
            addCriterion("LogContent is not null");
            return (Criteria) this;
        }

        public Criteria andLogcontentEqualTo(String value) {
            addCriterion("LogContent =", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotEqualTo(String value) {
            addCriterion("LogContent <>", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentGreaterThan(String value) {
            addCriterion("LogContent >", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentGreaterThanOrEqualTo(String value) {
            addCriterion("LogContent >=", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentLessThan(String value) {
            addCriterion("LogContent <", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentLessThanOrEqualTo(String value) {
            addCriterion("LogContent <=", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentLike(String value) {
            addCriterion("LogContent like", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotLike(String value) {
            addCriterion("LogContent not like", value, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentIn(List<String> values) {
            addCriterion("LogContent in", values, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotIn(List<String> values) {
            addCriterion("LogContent not in", values, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentBetween(String value1, String value2) {
            addCriterion("LogContent between", value1, value2, "logcontent");
            return (Criteria) this;
        }

        public Criteria andLogcontentNotBetween(String value1, String value2) {
            addCriterion("LogContent not between", value1, value2, "logcontent");
            return (Criteria) this;
        }

        public Criteria andScriptfileIsNull() {
            addCriterion("ScriptFile is null");
            return (Criteria) this;
        }

        public Criteria andScriptfileIsNotNull() {
            addCriterion("ScriptFile is not null");
            return (Criteria) this;
        }

        public Criteria andScriptfileEqualTo(String value) {
            addCriterion("ScriptFile =", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileNotEqualTo(String value) {
            addCriterion("ScriptFile <>", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileGreaterThan(String value) {
            addCriterion("ScriptFile >", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileGreaterThanOrEqualTo(String value) {
            addCriterion("ScriptFile >=", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileLessThan(String value) {
            addCriterion("ScriptFile <", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileLessThanOrEqualTo(String value) {
            addCriterion("ScriptFile <=", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileLike(String value) {
            addCriterion("ScriptFile like", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileNotLike(String value) {
            addCriterion("ScriptFile not like", value, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileIn(List<String> values) {
            addCriterion("ScriptFile in", values, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileNotIn(List<String> values) {
            addCriterion("ScriptFile not in", values, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileBetween(String value1, String value2) {
            addCriterion("ScriptFile between", value1, value2, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andScriptfileNotBetween(String value1, String value2) {
            addCriterion("ScriptFile not between", value1, value2, "scriptfile");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("IPAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("IPAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("IPAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("IPAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("IPAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("IPAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("IPAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("IPAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("IPAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("IPAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("IPAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("IPAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("IPAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("IPAddress not between", value1, value2, "ipaddress");
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