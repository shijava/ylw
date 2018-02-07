package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuestBookExample() {
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

        public Criteria andGuestbookidIsNull() {
            addCriterion("GuestbookID is null");
            return (Criteria) this;
        }

        public Criteria andGuestbookidIsNotNull() {
            addCriterion("GuestbookID is not null");
            return (Criteria) this;
        }

        public Criteria andGuestbookidEqualTo(Integer value) {
            addCriterion("GuestbookID =", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidNotEqualTo(Integer value) {
            addCriterion("GuestbookID <>", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidGreaterThan(Integer value) {
            addCriterion("GuestbookID >", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuestbookID >=", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidLessThan(Integer value) {
            addCriterion("GuestbookID <", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidLessThanOrEqualTo(Integer value) {
            addCriterion("GuestbookID <=", value, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidIn(List<Integer> values) {
            addCriterion("GuestbookID in", values, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidNotIn(List<Integer> values) {
            addCriterion("GuestbookID not in", values, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidBetween(Integer value1, Integer value2) {
            addCriterion("GuestbookID between", value1, value2, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andGuestbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("GuestbookID not between", value1, value2, "guestbookid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andBookcontentIsNull() {
            addCriterion("BookContent is null");
            return (Criteria) this;
        }

        public Criteria andBookcontentIsNotNull() {
            addCriterion("BookContent is not null");
            return (Criteria) this;
        }

        public Criteria andBookcontentEqualTo(String value) {
            addCriterion("BookContent =", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentNotEqualTo(String value) {
            addCriterion("BookContent <>", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentGreaterThan(String value) {
            addCriterion("BookContent >", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentGreaterThanOrEqualTo(String value) {
            addCriterion("BookContent >=", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentLessThan(String value) {
            addCriterion("BookContent <", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentLessThanOrEqualTo(String value) {
            addCriterion("BookContent <=", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentLike(String value) {
            addCriterion("BookContent like", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentNotLike(String value) {
            addCriterion("BookContent not like", value, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentIn(List<String> values) {
            addCriterion("BookContent in", values, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentNotIn(List<String> values) {
            addCriterion("BookContent not in", values, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentBetween(String value1, String value2) {
            addCriterion("BookContent between", value1, value2, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andBookcontentNotBetween(String value1, String value2) {
            addCriterion("BookContent not between", value1, value2, "bookcontent");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNull() {
            addCriterion("IpAddress is null");
            return (Criteria) this;
        }

        public Criteria andIpaddressIsNotNull() {
            addCriterion("IpAddress is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddressEqualTo(String value) {
            addCriterion("IpAddress =", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotEqualTo(String value) {
            addCriterion("IpAddress <>", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThan(String value) {
            addCriterion("IpAddress >", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("IpAddress >=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThan(String value) {
            addCriterion("IpAddress <", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLessThanOrEqualTo(String value) {
            addCriterion("IpAddress <=", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressLike(String value) {
            addCriterion("IpAddress like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotLike(String value) {
            addCriterion("IpAddress not like", value, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressIn(List<String> values) {
            addCriterion("IpAddress in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotIn(List<String> values) {
            addCriterion("IpAddress not in", values, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressBetween(String value1, String value2) {
            addCriterion("IpAddress between", value1, value2, "ipaddress");
            return (Criteria) this;
        }

        public Criteria andIpaddressNotBetween(String value1, String value2) {
            addCriterion("IpAddress not between", value1, value2, "ipaddress");
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

        public Criteria andIsreplyIsNull() {
            addCriterion("IsReply is null");
            return (Criteria) this;
        }

        public Criteria andIsreplyIsNotNull() {
            addCriterion("IsReply is not null");
            return (Criteria) this;
        }

        public Criteria andIsreplyEqualTo(Integer value) {
            addCriterion("IsReply =", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyNotEqualTo(Integer value) {
            addCriterion("IsReply <>", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyGreaterThan(Integer value) {
            addCriterion("IsReply >", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsReply >=", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyLessThan(Integer value) {
            addCriterion("IsReply <", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyLessThanOrEqualTo(Integer value) {
            addCriterion("IsReply <=", value, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyIn(List<Integer> values) {
            addCriterion("IsReply in", values, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyNotIn(List<Integer> values) {
            addCriterion("IsReply not in", values, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyBetween(Integer value1, Integer value2) {
            addCriterion("IsReply between", value1, value2, "isreply");
            return (Criteria) this;
        }

        public Criteria andIsreplyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsReply not between", value1, value2, "isreply");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNull() {
            addCriterion("ReplyContent is null");
            return (Criteria) this;
        }

        public Criteria andReplycontentIsNotNull() {
            addCriterion("ReplyContent is not null");
            return (Criteria) this;
        }

        public Criteria andReplycontentEqualTo(String value) {
            addCriterion("ReplyContent =", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotEqualTo(String value) {
            addCriterion("ReplyContent <>", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThan(String value) {
            addCriterion("ReplyContent >", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("ReplyContent >=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThan(String value) {
            addCriterion("ReplyContent <", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLessThanOrEqualTo(String value) {
            addCriterion("ReplyContent <=", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentLike(String value) {
            addCriterion("ReplyContent like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotLike(String value) {
            addCriterion("ReplyContent not like", value, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentIn(List<String> values) {
            addCriterion("ReplyContent in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotIn(List<String> values) {
            addCriterion("ReplyContent not in", values, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentBetween(String value1, String value2) {
            addCriterion("ReplyContent between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplycontentNotBetween(String value1, String value2) {
            addCriterion("ReplyContent not between", value1, value2, "replycontent");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("ReplyTime is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("ReplyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(Date value) {
            addCriterion("ReplyTime =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(Date value) {
            addCriterion("ReplyTime <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(Date value) {
            addCriterion("ReplyTime >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ReplyTime >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(Date value) {
            addCriterion("ReplyTime <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(Date value) {
            addCriterion("ReplyTime <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<Date> values) {
            addCriterion("ReplyTime in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<Date> values) {
            addCriterion("ReplyTime not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(Date value1, Date value2) {
            addCriterion("ReplyTime between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(Date value1, Date value2) {
            addCriterion("ReplyTime not between", value1, value2, "replytime");
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