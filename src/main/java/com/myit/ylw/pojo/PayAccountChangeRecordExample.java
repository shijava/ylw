package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayAccountChangeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayAccountChangeRecordExample() {
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

        public Criteria andPayaccountchangeidIsNull() {
            addCriterion("payaccountchangeid is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidIsNotNull() {
            addCriterion("payaccountchangeid is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidEqualTo(Integer value) {
            addCriterion("payaccountchangeid =", value, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidNotEqualTo(Integer value) {
            addCriterion("payaccountchangeid <>", value, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidGreaterThan(Integer value) {
            addCriterion("payaccountchangeid >", value, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("payaccountchangeid >=", value, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidLessThan(Integer value) {
            addCriterion("payaccountchangeid <", value, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidLessThanOrEqualTo(Integer value) {
            addCriterion("payaccountchangeid <=", value, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidIn(List<Integer> values) {
            addCriterion("payaccountchangeid in", values, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidNotIn(List<Integer> values) {
            addCriterion("payaccountchangeid not in", values, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidBetween(Integer value1, Integer value2) {
            addCriterion("payaccountchangeid between", value1, value2, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andPayaccountchangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("payaccountchangeid not between", value1, value2, "payaccountchangeid");
            return (Criteria) this;
        }

        public Criteria andOldzfbIsNull() {
            addCriterion("oldzfb is null");
            return (Criteria) this;
        }

        public Criteria andOldzfbIsNotNull() {
            addCriterion("oldzfb is not null");
            return (Criteria) this;
        }

        public Criteria andOldzfbEqualTo(String value) {
            addCriterion("oldzfb =", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbNotEqualTo(String value) {
            addCriterion("oldzfb <>", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbGreaterThan(String value) {
            addCriterion("oldzfb >", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbGreaterThanOrEqualTo(String value) {
            addCriterion("oldzfb >=", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbLessThan(String value) {
            addCriterion("oldzfb <", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbLessThanOrEqualTo(String value) {
            addCriterion("oldzfb <=", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbLike(String value) {
            addCriterion("oldzfb like", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbNotLike(String value) {
            addCriterion("oldzfb not like", value, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbIn(List<String> values) {
            addCriterion("oldzfb in", values, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbNotIn(List<String> values) {
            addCriterion("oldzfb not in", values, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbBetween(String value1, String value2) {
            addCriterion("oldzfb between", value1, value2, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbNotBetween(String value1, String value2) {
            addCriterion("oldzfb not between", value1, value2, "oldzfb");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameIsNull() {
            addCriterion("oldzfbname is null");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameIsNotNull() {
            addCriterion("oldzfbname is not null");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameEqualTo(String value) {
            addCriterion("oldzfbname =", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameNotEqualTo(String value) {
            addCriterion("oldzfbname <>", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameGreaterThan(String value) {
            addCriterion("oldzfbname >", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameGreaterThanOrEqualTo(String value) {
            addCriterion("oldzfbname >=", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameLessThan(String value) {
            addCriterion("oldzfbname <", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameLessThanOrEqualTo(String value) {
            addCriterion("oldzfbname <=", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameLike(String value) {
            addCriterion("oldzfbname like", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameNotLike(String value) {
            addCriterion("oldzfbname not like", value, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameIn(List<String> values) {
            addCriterion("oldzfbname in", values, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameNotIn(List<String> values) {
            addCriterion("oldzfbname not in", values, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameBetween(String value1, String value2) {
            addCriterion("oldzfbname between", value1, value2, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldzfbnameNotBetween(String value1, String value2) {
            addCriterion("oldzfbname not between", value1, value2, "oldzfbname");
            return (Criteria) this;
        }

        public Criteria andOldbankIsNull() {
            addCriterion("oldbank is null");
            return (Criteria) this;
        }

        public Criteria andOldbankIsNotNull() {
            addCriterion("oldbank is not null");
            return (Criteria) this;
        }

        public Criteria andOldbankEqualTo(String value) {
            addCriterion("oldbank =", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankNotEqualTo(String value) {
            addCriterion("oldbank <>", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankGreaterThan(String value) {
            addCriterion("oldbank >", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankGreaterThanOrEqualTo(String value) {
            addCriterion("oldbank >=", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankLessThan(String value) {
            addCriterion("oldbank <", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankLessThanOrEqualTo(String value) {
            addCriterion("oldbank <=", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankLike(String value) {
            addCriterion("oldbank like", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankNotLike(String value) {
            addCriterion("oldbank not like", value, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankIn(List<String> values) {
            addCriterion("oldbank in", values, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankNotIn(List<String> values) {
            addCriterion("oldbank not in", values, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankBetween(String value1, String value2) {
            addCriterion("oldbank between", value1, value2, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankNotBetween(String value1, String value2) {
            addCriterion("oldbank not between", value1, value2, "oldbank");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountIsNull() {
            addCriterion("oldbankaccount is null");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountIsNotNull() {
            addCriterion("oldbankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountEqualTo(String value) {
            addCriterion("oldbankaccount =", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountNotEqualTo(String value) {
            addCriterion("oldbankaccount <>", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountGreaterThan(String value) {
            addCriterion("oldbankaccount >", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("oldbankaccount >=", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountLessThan(String value) {
            addCriterion("oldbankaccount <", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountLessThanOrEqualTo(String value) {
            addCriterion("oldbankaccount <=", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountLike(String value) {
            addCriterion("oldbankaccount like", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountNotLike(String value) {
            addCriterion("oldbankaccount not like", value, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountIn(List<String> values) {
            addCriterion("oldbankaccount in", values, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountNotIn(List<String> values) {
            addCriterion("oldbankaccount not in", values, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountBetween(String value1, String value2) {
            addCriterion("oldbankaccount between", value1, value2, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andOldbankaccountNotBetween(String value1, String value2) {
            addCriterion("oldbankaccount not between", value1, value2, "oldbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewzfbIsNull() {
            addCriterion("newzfb is null");
            return (Criteria) this;
        }

        public Criteria andNewzfbIsNotNull() {
            addCriterion("newzfb is not null");
            return (Criteria) this;
        }

        public Criteria andNewzfbEqualTo(String value) {
            addCriterion("newzfb =", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbNotEqualTo(String value) {
            addCriterion("newzfb <>", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbGreaterThan(String value) {
            addCriterion("newzfb >", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbGreaterThanOrEqualTo(String value) {
            addCriterion("newzfb >=", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbLessThan(String value) {
            addCriterion("newzfb <", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbLessThanOrEqualTo(String value) {
            addCriterion("newzfb <=", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbLike(String value) {
            addCriterion("newzfb like", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbNotLike(String value) {
            addCriterion("newzfb not like", value, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbIn(List<String> values) {
            addCriterion("newzfb in", values, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbNotIn(List<String> values) {
            addCriterion("newzfb not in", values, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbBetween(String value1, String value2) {
            addCriterion("newzfb between", value1, value2, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbNotBetween(String value1, String value2) {
            addCriterion("newzfb not between", value1, value2, "newzfb");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameIsNull() {
            addCriterion("newzfbname is null");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameIsNotNull() {
            addCriterion("newzfbname is not null");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameEqualTo(String value) {
            addCriterion("newzfbname =", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameNotEqualTo(String value) {
            addCriterion("newzfbname <>", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameGreaterThan(String value) {
            addCriterion("newzfbname >", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameGreaterThanOrEqualTo(String value) {
            addCriterion("newzfbname >=", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameLessThan(String value) {
            addCriterion("newzfbname <", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameLessThanOrEqualTo(String value) {
            addCriterion("newzfbname <=", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameLike(String value) {
            addCriterion("newzfbname like", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameNotLike(String value) {
            addCriterion("newzfbname not like", value, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameIn(List<String> values) {
            addCriterion("newzfbname in", values, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameNotIn(List<String> values) {
            addCriterion("newzfbname not in", values, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameBetween(String value1, String value2) {
            addCriterion("newzfbname between", value1, value2, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewzfbnameNotBetween(String value1, String value2) {
            addCriterion("newzfbname not between", value1, value2, "newzfbname");
            return (Criteria) this;
        }

        public Criteria andNewbankIsNull() {
            addCriterion("newbank is null");
            return (Criteria) this;
        }

        public Criteria andNewbankIsNotNull() {
            addCriterion("newbank is not null");
            return (Criteria) this;
        }

        public Criteria andNewbankEqualTo(String value) {
            addCriterion("newbank =", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankNotEqualTo(String value) {
            addCriterion("newbank <>", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankGreaterThan(String value) {
            addCriterion("newbank >", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankGreaterThanOrEqualTo(String value) {
            addCriterion("newbank >=", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankLessThan(String value) {
            addCriterion("newbank <", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankLessThanOrEqualTo(String value) {
            addCriterion("newbank <=", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankLike(String value) {
            addCriterion("newbank like", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankNotLike(String value) {
            addCriterion("newbank not like", value, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankIn(List<String> values) {
            addCriterion("newbank in", values, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankNotIn(List<String> values) {
            addCriterion("newbank not in", values, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankBetween(String value1, String value2) {
            addCriterion("newbank between", value1, value2, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankNotBetween(String value1, String value2) {
            addCriterion("newbank not between", value1, value2, "newbank");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountIsNull() {
            addCriterion("newbankaccount is null");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountIsNotNull() {
            addCriterion("newbankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountEqualTo(String value) {
            addCriterion("newbankaccount =", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountNotEqualTo(String value) {
            addCriterion("newbankaccount <>", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountGreaterThan(String value) {
            addCriterion("newbankaccount >", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("newbankaccount >=", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountLessThan(String value) {
            addCriterion("newbankaccount <", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountLessThanOrEqualTo(String value) {
            addCriterion("newbankaccount <=", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountLike(String value) {
            addCriterion("newbankaccount like", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountNotLike(String value) {
            addCriterion("newbankaccount not like", value, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountIn(List<String> values) {
            addCriterion("newbankaccount in", values, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountNotIn(List<String> values) {
            addCriterion("newbankaccount not in", values, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountBetween(String value1, String value2) {
            addCriterion("newbankaccount between", value1, value2, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andNewbankaccountNotBetween(String value1, String value2) {
            addCriterion("newbankaccount not between", value1, value2, "newbankaccount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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