package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class t_QuestionAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public t_QuestionAnswerExample() {
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

        public Criteria andAnsweridIsNull() {
            addCriterion("AnswerID is null");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNotNull() {
            addCriterion("AnswerID is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweridEqualTo(Integer value) {
            addCriterion("AnswerID =", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotEqualTo(Integer value) {
            addCriterion("AnswerID <>", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThan(Integer value) {
            addCriterion("AnswerID >", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("AnswerID >=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThan(Integer value) {
            addCriterion("AnswerID <", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThanOrEqualTo(Integer value) {
            addCriterion("AnswerID <=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridIn(List<Integer> values) {
            addCriterion("AnswerID in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotIn(List<Integer> values) {
            addCriterion("AnswerID not in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridBetween(Integer value1, Integer value2) {
            addCriterion("AnswerID between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotBetween(Integer value1, Integer value2) {
            addCriterion("AnswerID not between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNull() {
            addCriterion("QuestionID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("QuestionID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Integer value) {
            addCriterion("QuestionID =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Integer value) {
            addCriterion("QuestionID <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Integer value) {
            addCriterion("QuestionID >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QuestionID >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Integer value) {
            addCriterion("QuestionID <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("QuestionID <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Integer> values) {
            addCriterion("QuestionID in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Integer> values) {
            addCriterion("QuestionID not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("QuestionID between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("QuestionID not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridIsNull() {
            addCriterion("SupplierUserID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridIsNotNull() {
            addCriterion("SupplierUserID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridEqualTo(Integer value) {
            addCriterion("SupplierUserID =", value, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridNotEqualTo(Integer value) {
            addCriterion("SupplierUserID <>", value, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridGreaterThan(Integer value) {
            addCriterion("SupplierUserID >", value, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierUserID >=", value, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridLessThan(Integer value) {
            addCriterion("SupplierUserID <", value, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierUserID <=", value, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridIn(List<Integer> values) {
            addCriterion("SupplierUserID in", values, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridNotIn(List<Integer> values) {
            addCriterion("SupplierUserID not in", values, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierUserID between", value1, value2, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andSupplieruseridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierUserID not between", value1, value2, "supplieruserid");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIsNull() {
            addCriterion("AnswerContent is null");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIsNotNull() {
            addCriterion("AnswerContent is not null");
            return (Criteria) this;
        }

        public Criteria andAnswercontentEqualTo(String value) {
            addCriterion("AnswerContent =", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotEqualTo(String value) {
            addCriterion("AnswerContent <>", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentGreaterThan(String value) {
            addCriterion("AnswerContent >", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentGreaterThanOrEqualTo(String value) {
            addCriterion("AnswerContent >=", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLessThan(String value) {
            addCriterion("AnswerContent <", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLessThanOrEqualTo(String value) {
            addCriterion("AnswerContent <=", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentLike(String value) {
            addCriterion("AnswerContent like", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotLike(String value) {
            addCriterion("AnswerContent not like", value, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentIn(List<String> values) {
            addCriterion("AnswerContent in", values, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotIn(List<String> values) {
            addCriterion("AnswerContent not in", values, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentBetween(String value1, String value2) {
            addCriterion("AnswerContent between", value1, value2, "answercontent");
            return (Criteria) this;
        }

        public Criteria andAnswercontentNotBetween(String value1, String value2) {
            addCriterion("AnswerContent not between", value1, value2, "answercontent");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsIsNull() {
            addCriterion("RecommendProducts is null");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsIsNotNull() {
            addCriterion("RecommendProducts is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsEqualTo(String value) {
            addCriterion("RecommendProducts =", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsNotEqualTo(String value) {
            addCriterion("RecommendProducts <>", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsGreaterThan(String value) {
            addCriterion("RecommendProducts >", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsGreaterThanOrEqualTo(String value) {
            addCriterion("RecommendProducts >=", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsLessThan(String value) {
            addCriterion("RecommendProducts <", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsLessThanOrEqualTo(String value) {
            addCriterion("RecommendProducts <=", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsLike(String value) {
            addCriterion("RecommendProducts like", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsNotLike(String value) {
            addCriterion("RecommendProducts not like", value, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsIn(List<String> values) {
            addCriterion("RecommendProducts in", values, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsNotIn(List<String> values) {
            addCriterion("RecommendProducts not in", values, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsBetween(String value1, String value2) {
            addCriterion("RecommendProducts between", value1, value2, "recommendproducts");
            return (Criteria) this;
        }

        public Criteria andRecommendproductsNotBetween(String value1, String value2) {
            addCriterion("RecommendProducts not between", value1, value2, "recommendproducts");
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