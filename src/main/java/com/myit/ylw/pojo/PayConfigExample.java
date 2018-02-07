package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.List;

public class PayConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayConfigExample() {
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

        public Criteria andPayidIsNull() {
            addCriterion("PayID is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("PayID is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Integer value) {
            addCriterion("PayID =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Integer value) {
            addCriterion("PayID <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Integer value) {
            addCriterion("PayID >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayID >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Integer value) {
            addCriterion("PayID <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Integer value) {
            addCriterion("PayID <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Integer> values) {
            addCriterion("PayID in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Integer> values) {
            addCriterion("PayID not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Integer value1, Integer value2) {
            addCriterion("PayID between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("PayID not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIsNull() {
            addCriterion("InterFaceName is null");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIsNotNull() {
            addCriterion("InterFaceName is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacenameEqualTo(String value) {
            addCriterion("InterFaceName =", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotEqualTo(String value) {
            addCriterion("InterFaceName <>", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameGreaterThan(String value) {
            addCriterion("InterFaceName >", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameGreaterThanOrEqualTo(String value) {
            addCriterion("InterFaceName >=", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLessThan(String value) {
            addCriterion("InterFaceName <", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLessThanOrEqualTo(String value) {
            addCriterion("InterFaceName <=", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameLike(String value) {
            addCriterion("InterFaceName like", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotLike(String value) {
            addCriterion("InterFaceName not like", value, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameIn(List<String> values) {
            addCriterion("InterFaceName in", values, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotIn(List<String> values) {
            addCriterion("InterFaceName not in", values, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameBetween(String value1, String value2) {
            addCriterion("InterFaceName between", value1, value2, "interfacename");
            return (Criteria) this;
        }

        public Criteria andInterfacenameNotBetween(String value1, String value2) {
            addCriterion("InterFaceName not between", value1, value2, "interfacename");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerIsNull() {
            addCriterion("Receiving_Partner is null");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerIsNotNull() {
            addCriterion("Receiving_Partner is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerEqualTo(String value) {
            addCriterion("Receiving_Partner =", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerNotEqualTo(String value) {
            addCriterion("Receiving_Partner <>", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerGreaterThan(String value) {
            addCriterion("Receiving_Partner >", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("Receiving_Partner >=", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerLessThan(String value) {
            addCriterion("Receiving_Partner <", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerLessThanOrEqualTo(String value) {
            addCriterion("Receiving_Partner <=", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerLike(String value) {
            addCriterion("Receiving_Partner like", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerNotLike(String value) {
            addCriterion("Receiving_Partner not like", value, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerIn(List<String> values) {
            addCriterion("Receiving_Partner in", values, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerNotIn(List<String> values) {
            addCriterion("Receiving_Partner not in", values, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerBetween(String value1, String value2) {
            addCriterion("Receiving_Partner between", value1, value2, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingPartnerNotBetween(String value1, String value2) {
            addCriterion("Receiving_Partner not between", value1, value2, "receivingPartner");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyIsNull() {
            addCriterion("Receiving_Key is null");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyIsNotNull() {
            addCriterion("Receiving_Key is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyEqualTo(String value) {
            addCriterion("Receiving_Key =", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyNotEqualTo(String value) {
            addCriterion("Receiving_Key <>", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyGreaterThan(String value) {
            addCriterion("Receiving_Key >", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyGreaterThanOrEqualTo(String value) {
            addCriterion("Receiving_Key >=", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyLessThan(String value) {
            addCriterion("Receiving_Key <", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyLessThanOrEqualTo(String value) {
            addCriterion("Receiving_Key <=", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyLike(String value) {
            addCriterion("Receiving_Key like", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyNotLike(String value) {
            addCriterion("Receiving_Key not like", value, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyIn(List<String> values) {
            addCriterion("Receiving_Key in", values, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyNotIn(List<String> values) {
            addCriterion("Receiving_Key not in", values, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyBetween(String value1, String value2) {
            addCriterion("Receiving_Key between", value1, value2, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingKeyNotBetween(String value1, String value2) {
            addCriterion("Receiving_Key not between", value1, value2, "receivingKey");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailIsNull() {
            addCriterion("Receiving_Seller_Email is null");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailIsNotNull() {
            addCriterion("Receiving_Seller_Email is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailEqualTo(String value) {
            addCriterion("Receiving_Seller_Email =", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailNotEqualTo(String value) {
            addCriterion("Receiving_Seller_Email <>", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailGreaterThan(String value) {
            addCriterion("Receiving_Seller_Email >", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Receiving_Seller_Email >=", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailLessThan(String value) {
            addCriterion("Receiving_Seller_Email <", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailLessThanOrEqualTo(String value) {
            addCriterion("Receiving_Seller_Email <=", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailLike(String value) {
            addCriterion("Receiving_Seller_Email like", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailNotLike(String value) {
            addCriterion("Receiving_Seller_Email not like", value, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailIn(List<String> values) {
            addCriterion("Receiving_Seller_Email in", values, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailNotIn(List<String> values) {
            addCriterion("Receiving_Seller_Email not in", values, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailBetween(String value1, String value2) {
            addCriterion("Receiving_Seller_Email between", value1, value2, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andReceivingSellerEmailNotBetween(String value1, String value2) {
            addCriterion("Receiving_Seller_Email not between", value1, value2, "receivingSellerEmail");
            return (Criteria) this;
        }

        public Criteria andPayPartnerIsNull() {
            addCriterion("Pay_Partner is null");
            return (Criteria) this;
        }

        public Criteria andPayPartnerIsNotNull() {
            addCriterion("Pay_Partner is not null");
            return (Criteria) this;
        }

        public Criteria andPayPartnerEqualTo(String value) {
            addCriterion("Pay_Partner =", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerNotEqualTo(String value) {
            addCriterion("Pay_Partner <>", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerGreaterThan(String value) {
            addCriterion("Pay_Partner >", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_Partner >=", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerLessThan(String value) {
            addCriterion("Pay_Partner <", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerLessThanOrEqualTo(String value) {
            addCriterion("Pay_Partner <=", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerLike(String value) {
            addCriterion("Pay_Partner like", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerNotLike(String value) {
            addCriterion("Pay_Partner not like", value, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerIn(List<String> values) {
            addCriterion("Pay_Partner in", values, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerNotIn(List<String> values) {
            addCriterion("Pay_Partner not in", values, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerBetween(String value1, String value2) {
            addCriterion("Pay_Partner between", value1, value2, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayPartnerNotBetween(String value1, String value2) {
            addCriterion("Pay_Partner not between", value1, value2, "payPartner");
            return (Criteria) this;
        }

        public Criteria andPayKeyIsNull() {
            addCriterion("Pay_Key is null");
            return (Criteria) this;
        }

        public Criteria andPayKeyIsNotNull() {
            addCriterion("Pay_Key is not null");
            return (Criteria) this;
        }

        public Criteria andPayKeyEqualTo(String value) {
            addCriterion("Pay_Key =", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotEqualTo(String value) {
            addCriterion("Pay_Key <>", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyGreaterThan(String value) {
            addCriterion("Pay_Key >", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_Key >=", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyLessThan(String value) {
            addCriterion("Pay_Key <", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyLessThanOrEqualTo(String value) {
            addCriterion("Pay_Key <=", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyLike(String value) {
            addCriterion("Pay_Key like", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotLike(String value) {
            addCriterion("Pay_Key not like", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyIn(List<String> values) {
            addCriterion("Pay_Key in", values, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotIn(List<String> values) {
            addCriterion("Pay_Key not in", values, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyBetween(String value1, String value2) {
            addCriterion("Pay_Key between", value1, value2, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotBetween(String value1, String value2) {
            addCriterion("Pay_Key not between", value1, value2, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayIsNull() {
            addCriterion("Pay_Email_Pay is null");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayIsNotNull() {
            addCriterion("Pay_Email_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayEqualTo(String value) {
            addCriterion("Pay_Email_Pay =", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayNotEqualTo(String value) {
            addCriterion("Pay_Email_Pay <>", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayGreaterThan(String value) {
            addCriterion("Pay_Email_Pay >", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayGreaterThanOrEqualTo(String value) {
            addCriterion("Pay_Email_Pay >=", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayLessThan(String value) {
            addCriterion("Pay_Email_Pay <", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayLessThanOrEqualTo(String value) {
            addCriterion("Pay_Email_Pay <=", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayLike(String value) {
            addCriterion("Pay_Email_Pay like", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayNotLike(String value) {
            addCriterion("Pay_Email_Pay not like", value, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayIn(List<String> values) {
            addCriterion("Pay_Email_Pay in", values, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayNotIn(List<String> values) {
            addCriterion("Pay_Email_Pay not in", values, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayBetween(String value1, String value2) {
            addCriterion("Pay_Email_Pay between", value1, value2, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andPayEmailPayNotBetween(String value1, String value2) {
            addCriterion("Pay_Email_Pay not between", value1, value2, "payEmailPay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayIsNull() {
            addCriterion("Account_name_Pay is null");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayIsNotNull() {
            addCriterion("Account_name_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayEqualTo(String value) {
            addCriterion("Account_name_Pay =", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayNotEqualTo(String value) {
            addCriterion("Account_name_Pay <>", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayGreaterThan(String value) {
            addCriterion("Account_name_Pay >", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayGreaterThanOrEqualTo(String value) {
            addCriterion("Account_name_Pay >=", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayLessThan(String value) {
            addCriterion("Account_name_Pay <", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayLessThanOrEqualTo(String value) {
            addCriterion("Account_name_Pay <=", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayLike(String value) {
            addCriterion("Account_name_Pay like", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayNotLike(String value) {
            addCriterion("Account_name_Pay not like", value, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayIn(List<String> values) {
            addCriterion("Account_name_Pay in", values, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayNotIn(List<String> values) {
            addCriterion("Account_name_Pay not in", values, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayBetween(String value1, String value2) {
            addCriterion("Account_name_Pay between", value1, value2, "accountNamePay");
            return (Criteria) this;
        }

        public Criteria andAccountNamePayNotBetween(String value1, String value2) {
            addCriterion("Account_name_Pay not between", value1, value2, "accountNamePay");
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