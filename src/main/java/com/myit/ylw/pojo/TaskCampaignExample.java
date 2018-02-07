package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskCampaignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskCampaignExample() {
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

        public Criteria andTaskcampaignidIsNull() {
            addCriterion("TaskCampaignID is null");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidIsNotNull() {
            addCriterion("TaskCampaignID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidEqualTo(Integer value) {
            addCriterion("TaskCampaignID =", value, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidNotEqualTo(Integer value) {
            addCriterion("TaskCampaignID <>", value, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidGreaterThan(Integer value) {
            addCriterion("TaskCampaignID >", value, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaskCampaignID >=", value, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidLessThan(Integer value) {
            addCriterion("TaskCampaignID <", value, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidLessThanOrEqualTo(Integer value) {
            addCriterion("TaskCampaignID <=", value, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidIn(List<Integer> values) {
            addCriterion("TaskCampaignID in", values, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidNotIn(List<Integer> values) {
            addCriterion("TaskCampaignID not in", values, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidBetween(Integer value1, Integer value2) {
            addCriterion("TaskCampaignID between", value1, value2, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andTaskcampaignidNotBetween(Integer value1, Integer value2) {
            addCriterion("TaskCampaignID not between", value1, value2, "taskcampaignid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidIsNull() {
            addCriterion("DesignTaskID is null");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidIsNotNull() {
            addCriterion("DesignTaskID is not null");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidEqualTo(Integer value) {
            addCriterion("DesignTaskID =", value, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidNotEqualTo(Integer value) {
            addCriterion("DesignTaskID <>", value, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidGreaterThan(Integer value) {
            addCriterion("DesignTaskID >", value, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DesignTaskID >=", value, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidLessThan(Integer value) {
            addCriterion("DesignTaskID <", value, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidLessThanOrEqualTo(Integer value) {
            addCriterion("DesignTaskID <=", value, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidIn(List<Integer> values) {
            addCriterion("DesignTaskID in", values, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidNotIn(List<Integer> values) {
            addCriterion("DesignTaskID not in", values, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidBetween(Integer value1, Integer value2) {
            addCriterion("DesignTaskID between", value1, value2, "designtaskid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("DesignTaskID not between", value1, value2, "designtaskid");
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

        public Criteria andDesigntaskuseridIsNull() {
            addCriterion("DesignTaskUserID is null");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridIsNotNull() {
            addCriterion("DesignTaskUserID is not null");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridEqualTo(Integer value) {
            addCriterion("DesignTaskUserID =", value, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridNotEqualTo(Integer value) {
            addCriterion("DesignTaskUserID <>", value, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridGreaterThan(Integer value) {
            addCriterion("DesignTaskUserID >", value, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DesignTaskUserID >=", value, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridLessThan(Integer value) {
            addCriterion("DesignTaskUserID <", value, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridLessThanOrEqualTo(Integer value) {
            addCriterion("DesignTaskUserID <=", value, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridIn(List<Integer> values) {
            addCriterion("DesignTaskUserID in", values, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridNotIn(List<Integer> values) {
            addCriterion("DesignTaskUserID not in", values, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridBetween(Integer value1, Integer value2) {
            addCriterion("DesignTaskUserID between", value1, value2, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andDesigntaskuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("DesignTaskUserID not between", value1, value2, "designtaskuserid");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusIsNull() {
            addCriterion("CampaignStatus is null");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusIsNotNull() {
            addCriterion("CampaignStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusEqualTo(Integer value) {
            addCriterion("CampaignStatus =", value, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusNotEqualTo(Integer value) {
            addCriterion("CampaignStatus <>", value, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusGreaterThan(Integer value) {
            addCriterion("CampaignStatus >", value, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CampaignStatus >=", value, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusLessThan(Integer value) {
            addCriterion("CampaignStatus <", value, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusLessThanOrEqualTo(Integer value) {
            addCriterion("CampaignStatus <=", value, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusIn(List<Integer> values) {
            addCriterion("CampaignStatus in", values, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusNotIn(List<Integer> values) {
            addCriterion("CampaignStatus not in", values, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusBetween(Integer value1, Integer value2) {
            addCriterion("CampaignStatus between", value1, value2, "campaignstatus");
            return (Criteria) this;
        }

        public Criteria andCampaignstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CampaignStatus not between", value1, value2, "campaignstatus");
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

        public Criteria andEdittimeIsNull() {
            addCriterion("EditTime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("EditTime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("EditTime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("EditTime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("EditTime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EditTime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("EditTime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("EditTime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("EditTime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("EditTime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("EditTime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("EditTime not between", value1, value2, "edittime");
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