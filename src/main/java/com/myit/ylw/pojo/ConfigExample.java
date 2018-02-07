package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigExample() {
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

        public Criteria andPointsuseidIsNull() {
            addCriterion("PointsUseID is null");
            return (Criteria) this;
        }

        public Criteria andPointsuseidIsNotNull() {
            addCriterion("PointsUseID is not null");
            return (Criteria) this;
        }

        public Criteria andPointsuseidEqualTo(Integer value) {
            addCriterion("PointsUseID =", value, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidNotEqualTo(Integer value) {
            addCriterion("PointsUseID <>", value, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidGreaterThan(Integer value) {
            addCriterion("PointsUseID >", value, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PointsUseID >=", value, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidLessThan(Integer value) {
            addCriterion("PointsUseID <", value, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidLessThanOrEqualTo(Integer value) {
            addCriterion("PointsUseID <=", value, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidIn(List<Integer> values) {
            addCriterion("PointsUseID in", values, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidNotIn(List<Integer> values) {
            addCriterion("PointsUseID not in", values, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidBetween(Integer value1, Integer value2) {
            addCriterion("PointsUseID between", value1, value2, "pointsuseid");
            return (Criteria) this;
        }

        public Criteria andPointsuseidNotBetween(Integer value1, Integer value2) {
            addCriterion("PointsUseID not between", value1, value2, "pointsuseid");
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

        public Criteria andSourceIsNull() {
            addCriterion("Source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("Source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("Source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("Source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("Source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUsepointsIsNull() {
            addCriterion("UsePoints is null");
            return (Criteria) this;
        }

        public Criteria andUsepointsIsNotNull() {
            addCriterion("UsePoints is not null");
            return (Criteria) this;
        }

        public Criteria andUsepointsEqualTo(Integer value) {
            addCriterion("UsePoints =", value, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsNotEqualTo(Integer value) {
            addCriterion("UsePoints <>", value, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsGreaterThan(Integer value) {
            addCriterion("UsePoints >", value, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsePoints >=", value, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsLessThan(Integer value) {
            addCriterion("UsePoints <", value, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsLessThanOrEqualTo(Integer value) {
            addCriterion("UsePoints <=", value, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsIn(List<Integer> values) {
            addCriterion("UsePoints in", values, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsNotIn(List<Integer> values) {
            addCriterion("UsePoints not in", values, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsBetween(Integer value1, Integer value2) {
            addCriterion("UsePoints between", value1, value2, "usepoints");
            return (Criteria) this;
        }

        public Criteria andUsepointsNotBetween(Integer value1, Integer value2) {
            addCriterion("UsePoints not between", value1, value2, "usepoints");
            return (Criteria) this;
        }

        public Criteria andIsincomeIsNull() {
            addCriterion("IsInCome is null");
            return (Criteria) this;
        }

        public Criteria andIsincomeIsNotNull() {
            addCriterion("IsInCome is not null");
            return (Criteria) this;
        }

        public Criteria andIsincomeEqualTo(Integer value) {
            addCriterion("IsInCome =", value, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeNotEqualTo(Integer value) {
            addCriterion("IsInCome <>", value, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeGreaterThan(Integer value) {
            addCriterion("IsInCome >", value, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsInCome >=", value, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeLessThan(Integer value) {
            addCriterion("IsInCome <", value, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeLessThanOrEqualTo(Integer value) {
            addCriterion("IsInCome <=", value, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeIn(List<Integer> values) {
            addCriterion("IsInCome in", values, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeNotIn(List<Integer> values) {
            addCriterion("IsInCome not in", values, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeBetween(Integer value1, Integer value2) {
            addCriterion("IsInCome between", value1, value2, "isincome");
            return (Criteria) this;
        }

        public Criteria andIsincomeNotBetween(Integer value1, Integer value2) {
            addCriterion("IsInCome not between", value1, value2, "isincome");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("Addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("Addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("Addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("Addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("Addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("Addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("Addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("Addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("Addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("Addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("Addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
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