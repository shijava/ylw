package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkExample() {
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

        public Criteria andLinkidIsNull() {
            addCriterion("LinkID is null");
            return (Criteria) this;
        }

        public Criteria andLinkidIsNotNull() {
            addCriterion("LinkID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkidEqualTo(Integer value) {
            addCriterion("LinkID =", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidNotEqualTo(Integer value) {
            addCriterion("LinkID <>", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidGreaterThan(Integer value) {
            addCriterion("LinkID >", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LinkID >=", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidLessThan(Integer value) {
            addCriterion("LinkID <", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidLessThanOrEqualTo(Integer value) {
            addCriterion("LinkID <=", value, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidIn(List<Integer> values) {
            addCriterion("LinkID in", values, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidNotIn(List<Integer> values) {
            addCriterion("LinkID not in", values, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidBetween(Integer value1, Integer value2) {
            addCriterion("LinkID between", value1, value2, "linkid");
            return (Criteria) this;
        }

        public Criteria andLinkidNotBetween(Integer value1, Integer value2) {
            addCriterion("LinkID not between", value1, value2, "linkid");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNull() {
            addCriterion("ConfigID is null");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNotNull() {
            addCriterion("ConfigID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigidEqualTo(Integer value) {
            addCriterion("ConfigID =", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotEqualTo(Integer value) {
            addCriterion("ConfigID <>", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThan(Integer value) {
            addCriterion("ConfigID >", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConfigID >=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThan(Integer value) {
            addCriterion("ConfigID <", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThanOrEqualTo(Integer value) {
            addCriterion("ConfigID <=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidIn(List<Integer> values) {
            addCriterion("ConfigID in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotIn(List<Integer> values) {
            addCriterion("ConfigID not in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidBetween(Integer value1, Integer value2) {
            addCriterion("ConfigID between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotBetween(Integer value1, Integer value2) {
            addCriterion("ConfigID not between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("TypeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TypeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TypeID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TypeID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TypeID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TypeID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TypeID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TypeID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TypeID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TypeID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TypeID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TypeID not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("SiteName is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("SiteName is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("SiteName =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("SiteName <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("SiteName >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("SiteName >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("SiteName <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("SiteName <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("SiteName like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("SiteName not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("SiteName in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("SiteName not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("SiteName between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("SiteName not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSiteurlIsNull() {
            addCriterion("SiteUrl is null");
            return (Criteria) this;
        }

        public Criteria andSiteurlIsNotNull() {
            addCriterion("SiteUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSiteurlEqualTo(String value) {
            addCriterion("SiteUrl =", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotEqualTo(String value) {
            addCriterion("SiteUrl <>", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlGreaterThan(String value) {
            addCriterion("SiteUrl >", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlGreaterThanOrEqualTo(String value) {
            addCriterion("SiteUrl >=", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLessThan(String value) {
            addCriterion("SiteUrl <", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLessThanOrEqualTo(String value) {
            addCriterion("SiteUrl <=", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLike(String value) {
            addCriterion("SiteUrl like", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotLike(String value) {
            addCriterion("SiteUrl not like", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlIn(List<String> values) {
            addCriterion("SiteUrl in", values, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotIn(List<String> values) {
            addCriterion("SiteUrl not in", values, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlBetween(String value1, String value2) {
            addCriterion("SiteUrl between", value1, value2, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotBetween(String value1, String value2) {
            addCriterion("SiteUrl not between", value1, value2, "siteurl");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNull() {
            addCriterion("LogoUrl is null");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNotNull() {
            addCriterion("LogoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLogourlEqualTo(String value) {
            addCriterion("LogoUrl =", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotEqualTo(String value) {
            addCriterion("LogoUrl <>", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThan(String value) {
            addCriterion("LogoUrl >", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("LogoUrl >=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThan(String value) {
            addCriterion("LogoUrl <", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThanOrEqualTo(String value) {
            addCriterion("LogoUrl <=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLike(String value) {
            addCriterion("LogoUrl like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotLike(String value) {
            addCriterion("LogoUrl not like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlIn(List<String> values) {
            addCriterion("LogoUrl in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotIn(List<String> values) {
            addCriterion("LogoUrl not in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlBetween(String value1, String value2) {
            addCriterion("LogoUrl between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotBetween(String value1, String value2) {
            addCriterion("LogoUrl not between", value1, value2, "logourl");
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