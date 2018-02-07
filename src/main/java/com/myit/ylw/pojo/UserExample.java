package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNull() {
            addCriterion("UserPass is null");
            return (Criteria) this;
        }

        public Criteria andUserpassIsNotNull() {
            addCriterion("UserPass is not null");
            return (Criteria) this;
        }

        public Criteria andUserpassEqualTo(String value) {
            addCriterion("UserPass =", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotEqualTo(String value) {
            addCriterion("UserPass <>", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThan(String value) {
            addCriterion("UserPass >", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassGreaterThanOrEqualTo(String value) {
            addCriterion("UserPass >=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThan(String value) {
            addCriterion("UserPass <", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLessThanOrEqualTo(String value) {
            addCriterion("UserPass <=", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassLike(String value) {
            addCriterion("UserPass like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotLike(String value) {
            addCriterion("UserPass not like", value, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassIn(List<String> values) {
            addCriterion("UserPass in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotIn(List<String> values) {
            addCriterion("UserPass not in", values, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassBetween(String value1, String value2) {
            addCriterion("UserPass between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andUserpassNotBetween(String value1, String value2) {
            addCriterion("UserPass not between", value1, value2, "userpass");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andUserrankidIsNull() {
            addCriterion("UserRankID is null");
            return (Criteria) this;
        }

        public Criteria andUserrankidIsNotNull() {
            addCriterion("UserRankID is not null");
            return (Criteria) this;
        }

        public Criteria andUserrankidEqualTo(Integer value) {
            addCriterion("UserRankID =", value, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidNotEqualTo(Integer value) {
            addCriterion("UserRankID <>", value, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidGreaterThan(Integer value) {
            addCriterion("UserRankID >", value, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserRankID >=", value, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidLessThan(Integer value) {
            addCriterion("UserRankID <", value, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidLessThanOrEqualTo(Integer value) {
            addCriterion("UserRankID <=", value, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidIn(List<Integer> values) {
            addCriterion("UserRankID in", values, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidNotIn(List<Integer> values) {
            addCriterion("UserRankID not in", values, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidBetween(Integer value1, Integer value2) {
            addCriterion("UserRankID between", value1, value2, "userrankid");
            return (Criteria) this;
        }

        public Criteria andUserrankidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserRankID not between", value1, value2, "userrankid");
            return (Criteria) this;
        }

        public Criteria andIsauditIsNull() {
            addCriterion("IsAudit is null");
            return (Criteria) this;
        }

        public Criteria andIsauditIsNotNull() {
            addCriterion("IsAudit is not null");
            return (Criteria) this;
        }

        public Criteria andIsauditEqualTo(Integer value) {
            addCriterion("IsAudit =", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditNotEqualTo(Integer value) {
            addCriterion("IsAudit <>", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditGreaterThan(Integer value) {
            addCriterion("IsAudit >", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAudit >=", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditLessThan(Integer value) {
            addCriterion("IsAudit <", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditLessThanOrEqualTo(Integer value) {
            addCriterion("IsAudit <=", value, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditIn(List<Integer> values) {
            addCriterion("IsAudit in", values, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditNotIn(List<Integer> values) {
            addCriterion("IsAudit not in", values, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditBetween(Integer value1, Integer value2) {
            addCriterion("IsAudit between", value1, value2, "isaudit");
            return (Criteria) this;
        }

        public Criteria andIsauditNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAudit not between", value1, value2, "isaudit");
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

        public Criteria andWilloverpointIsNull() {
            addCriterion("WillOverPoint is null");
            return (Criteria) this;
        }

        public Criteria andWilloverpointIsNotNull() {
            addCriterion("WillOverPoint is not null");
            return (Criteria) this;
        }

        public Criteria andWilloverpointEqualTo(Integer value) {
            addCriterion("WillOverPoint =", value, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointNotEqualTo(Integer value) {
            addCriterion("WillOverPoint <>", value, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointGreaterThan(Integer value) {
            addCriterion("WillOverPoint >", value, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("WillOverPoint >=", value, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointLessThan(Integer value) {
            addCriterion("WillOverPoint <", value, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointLessThanOrEqualTo(Integer value) {
            addCriterion("WillOverPoint <=", value, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointIn(List<Integer> values) {
            addCriterion("WillOverPoint in", values, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointNotIn(List<Integer> values) {
            addCriterion("WillOverPoint not in", values, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointBetween(Integer value1, Integer value2) {
            addCriterion("WillOverPoint between", value1, value2, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andWilloverpointNotBetween(Integer value1, Integer value2) {
            addCriterion("WillOverPoint not between", value1, value2, "willoverpoint");
            return (Criteria) this;
        }

        public Criteria andLoginnumIsNull() {
            addCriterion("LoginNum is null");
            return (Criteria) this;
        }

        public Criteria andLoginnumIsNotNull() {
            addCriterion("LoginNum is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnumEqualTo(Integer value) {
            addCriterion("LoginNum =", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotEqualTo(Integer value) {
            addCriterion("LoginNum <>", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumGreaterThan(Integer value) {
            addCriterion("LoginNum >", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginNum >=", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumLessThan(Integer value) {
            addCriterion("LoginNum <", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumLessThanOrEqualTo(Integer value) {
            addCriterion("LoginNum <=", value, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumIn(List<Integer> values) {
            addCriterion("LoginNum in", values, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotIn(List<Integer> values) {
            addCriterion("LoginNum not in", values, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumBetween(Integer value1, Integer value2) {
            addCriterion("LoginNum between", value1, value2, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLoginnumNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginNum not between", value1, value2, "loginnum");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("LastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("LastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("LastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("LastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("LastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("LastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeIsNull() {
            addCriterion("ThisLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andThislogintimeIsNotNull() {
            addCriterion("ThisLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andThislogintimeEqualTo(Date value) {
            addCriterion("ThisLoginTime =", value, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeNotEqualTo(Date value) {
            addCriterion("ThisLoginTime <>", value, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeGreaterThan(Date value) {
            addCriterion("ThisLoginTime >", value, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ThisLoginTime >=", value, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeLessThan(Date value) {
            addCriterion("ThisLoginTime <", value, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeLessThanOrEqualTo(Date value) {
            addCriterion("ThisLoginTime <=", value, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeIn(List<Date> values) {
            addCriterion("ThisLoginTime in", values, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeNotIn(List<Date> values) {
            addCriterion("ThisLoginTime not in", values, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeBetween(Date value1, Date value2) {
            addCriterion("ThisLoginTime between", value1, value2, "thislogintime");
            return (Criteria) this;
        }

        public Criteria andThislogintimeNotBetween(Date value1, Date value2) {
            addCriterion("ThisLoginTime not between", value1, value2, "thislogintime");
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

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("District is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("District is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Integer value) {
            addCriterion("District =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Integer value) {
            addCriterion("District <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Integer value) {
            addCriterion("District >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("District >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Integer value) {
            addCriterion("District <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("District <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Integer> values) {
            addCriterion("District in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Integer> values) {
            addCriterion("District not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Integer value1, Integer value2) {
            addCriterion("District between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("District not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("UserType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("UserType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("UserType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("UserType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("UserType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("UserType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("UserType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("UserType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("UserType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("UserType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("UserType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andZhifubaoIsNull() {
            addCriterion("ZhiFuBao is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoIsNotNull() {
            addCriterion("ZhiFuBao is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoEqualTo(String value) {
            addCriterion("ZhiFuBao =", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotEqualTo(String value) {
            addCriterion("ZhiFuBao <>", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoGreaterThan(String value) {
            addCriterion("ZhiFuBao >", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiFuBao >=", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoLessThan(String value) {
            addCriterion("ZhiFuBao <", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoLessThanOrEqualTo(String value) {
            addCriterion("ZhiFuBao <=", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoLike(String value) {
            addCriterion("ZhiFuBao like", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotLike(String value) {
            addCriterion("ZhiFuBao not like", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoIn(List<String> values) {
            addCriterion("ZhiFuBao in", values, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotIn(List<String> values) {
            addCriterion("ZhiFuBao not in", values, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoBetween(String value1, String value2) {
            addCriterion("ZhiFuBao between", value1, value2, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotBetween(String value1, String value2) {
            addCriterion("ZhiFuBao not between", value1, value2, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("Bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("Bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(Integer value) {
            addCriterion("Bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(Integer value) {
            addCriterion("Bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(Integer value) {
            addCriterion("Bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(Integer value) {
            addCriterion("Bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(Integer value) {
            addCriterion("Bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<Integer> values) {
            addCriterion("Bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<Integer> values) {
            addCriterion("Bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(Integer value1, Integer value2) {
            addCriterion("Bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(Integer value1, Integer value2) {
            addCriterion("Bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("BankNo is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("BankNo is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("BankNo =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("BankNo <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("BankNo >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("BankNo >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("BankNo <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("BankNo <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("BankNo like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("BankNo not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("BankNo in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("BankNo not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("BankNo between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("BankNo not between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNull() {
            addCriterion("HeadPic is null");
            return (Criteria) this;
        }

        public Criteria andHeadpicIsNotNull() {
            addCriterion("HeadPic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpicEqualTo(String value) {
            addCriterion("HeadPic =", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotEqualTo(String value) {
            addCriterion("HeadPic <>", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThan(String value) {
            addCriterion("HeadPic >", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicGreaterThanOrEqualTo(String value) {
            addCriterion("HeadPic >=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThan(String value) {
            addCriterion("HeadPic <", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLessThanOrEqualTo(String value) {
            addCriterion("HeadPic <=", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicLike(String value) {
            addCriterion("HeadPic like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotLike(String value) {
            addCriterion("HeadPic not like", value, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicIn(List<String> values) {
            addCriterion("HeadPic in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotIn(List<String> values) {
            addCriterion("HeadPic not in", values, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicBetween(String value1, String value2) {
            addCriterion("HeadPic between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andHeadpicNotBetween(String value1, String value2) {
            addCriterion("HeadPic not between", value1, value2, "headpic");
            return (Criteria) this;
        }

        public Criteria andNinameIsNull() {
            addCriterion("NiName is null");
            return (Criteria) this;
        }

        public Criteria andNinameIsNotNull() {
            addCriterion("NiName is not null");
            return (Criteria) this;
        }

        public Criteria andNinameEqualTo(String value) {
            addCriterion("NiName =", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameNotEqualTo(String value) {
            addCriterion("NiName <>", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameGreaterThan(String value) {
            addCriterion("NiName >", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameGreaterThanOrEqualTo(String value) {
            addCriterion("NiName >=", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameLessThan(String value) {
            addCriterion("NiName <", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameLessThanOrEqualTo(String value) {
            addCriterion("NiName <=", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameLike(String value) {
            addCriterion("NiName like", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameNotLike(String value) {
            addCriterion("NiName not like", value, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameIn(List<String> values) {
            addCriterion("NiName in", values, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameNotIn(List<String> values) {
            addCriterion("NiName not in", values, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameBetween(String value1, String value2) {
            addCriterion("NiName between", value1, value2, "niname");
            return (Criteria) this;
        }

        public Criteria andNinameNotBetween(String value1, String value2) {
            addCriterion("NiName not between", value1, value2, "niname");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andIsdesignerIsNull() {
            addCriterion("IsDesigner is null");
            return (Criteria) this;
        }

        public Criteria andIsdesignerIsNotNull() {
            addCriterion("IsDesigner is not null");
            return (Criteria) this;
        }

        public Criteria andIsdesignerEqualTo(Integer value) {
            addCriterion("IsDesigner =", value, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerNotEqualTo(Integer value) {
            addCriterion("IsDesigner <>", value, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerGreaterThan(Integer value) {
            addCriterion("IsDesigner >", value, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsDesigner >=", value, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerLessThan(Integer value) {
            addCriterion("IsDesigner <", value, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerLessThanOrEqualTo(Integer value) {
            addCriterion("IsDesigner <=", value, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerIn(List<Integer> values) {
            addCriterion("IsDesigner in", values, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerNotIn(List<Integer> values) {
            addCriterion("IsDesigner not in", values, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerBetween(Integer value1, Integer value2) {
            addCriterion("IsDesigner between", value1, value2, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andIsdesignerNotBetween(Integer value1, Integer value2) {
            addCriterion("IsDesigner not between", value1, value2, "isdesigner");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameIsNull() {
            addCriterion("ZhiFuBaoRName is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameIsNotNull() {
            addCriterion("ZhiFuBaoRName is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameEqualTo(String value) {
            addCriterion("ZhiFuBaoRName =", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameNotEqualTo(String value) {
            addCriterion("ZhiFuBaoRName <>", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameGreaterThan(String value) {
            addCriterion("ZhiFuBaoRName >", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiFuBaoRName >=", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameLessThan(String value) {
            addCriterion("ZhiFuBaoRName <", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameLessThanOrEqualTo(String value) {
            addCriterion("ZhiFuBaoRName <=", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameLike(String value) {
            addCriterion("ZhiFuBaoRName like", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameNotLike(String value) {
            addCriterion("ZhiFuBaoRName not like", value, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameIn(List<String> values) {
            addCriterion("ZhiFuBaoRName in", values, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameNotIn(List<String> values) {
            addCriterion("ZhiFuBaoRName not in", values, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameBetween(String value1, String value2) {
            addCriterion("ZhiFuBaoRName between", value1, value2, "zhifubaorname");
            return (Criteria) this;
        }

        public Criteria andZhifubaornameNotBetween(String value1, String value2) {
            addCriterion("ZhiFuBaoRName not between", value1, value2, "zhifubaorname");
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