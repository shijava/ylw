package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("SupplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("SupplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("SupplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("SupplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("SupplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("SupplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierID not between", value1, value2, "supplierid");
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

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlIsNull() {
            addCriterion("BusinessLicenseUrl is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlIsNotNull() {
            addCriterion("BusinessLicenseUrl is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlEqualTo(String value) {
            addCriterion("BusinessLicenseUrl =", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlNotEqualTo(String value) {
            addCriterion("BusinessLicenseUrl <>", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlGreaterThan(String value) {
            addCriterion("BusinessLicenseUrl >", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicenseUrl >=", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlLessThan(String value) {
            addCriterion("BusinessLicenseUrl <", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicenseUrl <=", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlLike(String value) {
            addCriterion("BusinessLicenseUrl like", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlNotLike(String value) {
            addCriterion("BusinessLicenseUrl not like", value, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlIn(List<String> values) {
            addCriterion("BusinessLicenseUrl in", values, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlNotIn(List<String> values) {
            addCriterion("BusinessLicenseUrl not in", values, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlBetween(String value1, String value2) {
            addCriterion("BusinessLicenseUrl between", value1, value2, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseurlNotBetween(String value1, String value2) {
            addCriterion("BusinessLicenseUrl not between", value1, value2, "businesslicenseurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlIsNull() {
            addCriterion("OrganizationCodeUrl is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlIsNotNull() {
            addCriterion("OrganizationCodeUrl is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlEqualTo(String value) {
            addCriterion("OrganizationCodeUrl =", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlNotEqualTo(String value) {
            addCriterion("OrganizationCodeUrl <>", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlGreaterThan(String value) {
            addCriterion("OrganizationCodeUrl >", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlGreaterThanOrEqualTo(String value) {
            addCriterion("OrganizationCodeUrl >=", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlLessThan(String value) {
            addCriterion("OrganizationCodeUrl <", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlLessThanOrEqualTo(String value) {
            addCriterion("OrganizationCodeUrl <=", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlLike(String value) {
            addCriterion("OrganizationCodeUrl like", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlNotLike(String value) {
            addCriterion("OrganizationCodeUrl not like", value, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlIn(List<String> values) {
            addCriterion("OrganizationCodeUrl in", values, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlNotIn(List<String> values) {
            addCriterion("OrganizationCodeUrl not in", values, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlBetween(String value1, String value2) {
            addCriterion("OrganizationCodeUrl between", value1, value2, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeurlNotBetween(String value1, String value2) {
            addCriterion("OrganizationCodeUrl not between", value1, value2, "organizationcodeurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlIsNull() {
            addCriterion("TaxRegistrationCertificateUrl is null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlIsNotNull() {
            addCriterion("TaxRegistrationCertificateUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlEqualTo(String value) {
            addCriterion("TaxRegistrationCertificateUrl =", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlNotEqualTo(String value) {
            addCriterion("TaxRegistrationCertificateUrl <>", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlGreaterThan(String value) {
            addCriterion("TaxRegistrationCertificateUrl >", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlGreaterThanOrEqualTo(String value) {
            addCriterion("TaxRegistrationCertificateUrl >=", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlLessThan(String value) {
            addCriterion("TaxRegistrationCertificateUrl <", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlLessThanOrEqualTo(String value) {
            addCriterion("TaxRegistrationCertificateUrl <=", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlLike(String value) {
            addCriterion("TaxRegistrationCertificateUrl like", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlNotLike(String value) {
            addCriterion("TaxRegistrationCertificateUrl not like", value, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlIn(List<String> values) {
            addCriterion("TaxRegistrationCertificateUrl in", values, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlNotIn(List<String> values) {
            addCriterion("TaxRegistrationCertificateUrl not in", values, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlBetween(String value1, String value2) {
            addCriterion("TaxRegistrationCertificateUrl between", value1, value2, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificateurlNotBetween(String value1, String value2) {
            addCriterion("TaxRegistrationCertificateUrl not between", value1, value2, "taxregistrationcertificateurl");
            return (Criteria) this;
        }

        public Criteria andCorporatenameIsNull() {
            addCriterion("CorporateName is null");
            return (Criteria) this;
        }

        public Criteria andCorporatenameIsNotNull() {
            addCriterion("CorporateName is not null");
            return (Criteria) this;
        }

        public Criteria andCorporatenameEqualTo(String value) {
            addCriterion("CorporateName =", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameNotEqualTo(String value) {
            addCriterion("CorporateName <>", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameGreaterThan(String value) {
            addCriterion("CorporateName >", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameGreaterThanOrEqualTo(String value) {
            addCriterion("CorporateName >=", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameLessThan(String value) {
            addCriterion("CorporateName <", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameLessThanOrEqualTo(String value) {
            addCriterion("CorporateName <=", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameLike(String value) {
            addCriterion("CorporateName like", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameNotLike(String value) {
            addCriterion("CorporateName not like", value, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameIn(List<String> values) {
            addCriterion("CorporateName in", values, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameNotIn(List<String> values) {
            addCriterion("CorporateName not in", values, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameBetween(String value1, String value2) {
            addCriterion("CorporateName between", value1, value2, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCorporatenameNotBetween(String value1, String value2) {
            addCriterion("CorporateName not between", value1, value2, "corporatename");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIsNull() {
            addCriterion("CompanyLogo is null");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIsNotNull() {
            addCriterion("CompanyLogo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylogoEqualTo(String value) {
            addCriterion("CompanyLogo =", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotEqualTo(String value) {
            addCriterion("CompanyLogo <>", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoGreaterThan(String value) {
            addCriterion("CompanyLogo >", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyLogo >=", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLessThan(String value) {
            addCriterion("CompanyLogo <", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLessThanOrEqualTo(String value) {
            addCriterion("CompanyLogo <=", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoLike(String value) {
            addCriterion("CompanyLogo like", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotLike(String value) {
            addCriterion("CompanyLogo not like", value, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoIn(List<String> values) {
            addCriterion("CompanyLogo in", values, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotIn(List<String> values) {
            addCriterion("CompanyLogo not in", values, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoBetween(String value1, String value2) {
            addCriterion("CompanyLogo between", value1, value2, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanylogoNotBetween(String value1, String value2) {
            addCriterion("CompanyLogo not between", value1, value2, "companylogo");
            return (Criteria) this;
        }

        public Criteria andCompanypicIsNull() {
            addCriterion("CompanyPic is null");
            return (Criteria) this;
        }

        public Criteria andCompanypicIsNotNull() {
            addCriterion("CompanyPic is not null");
            return (Criteria) this;
        }

        public Criteria andCompanypicEqualTo(String value) {
            addCriterion("CompanyPic =", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicNotEqualTo(String value) {
            addCriterion("CompanyPic <>", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicGreaterThan(String value) {
            addCriterion("CompanyPic >", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyPic >=", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicLessThan(String value) {
            addCriterion("CompanyPic <", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicLessThanOrEqualTo(String value) {
            addCriterion("CompanyPic <=", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicLike(String value) {
            addCriterion("CompanyPic like", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicNotLike(String value) {
            addCriterion("CompanyPic not like", value, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicIn(List<String> values) {
            addCriterion("CompanyPic in", values, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicNotIn(List<String> values) {
            addCriterion("CompanyPic not in", values, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicBetween(String value1, String value2) {
            addCriterion("CompanyPic between", value1, value2, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypicNotBetween(String value1, String value2) {
            addCriterion("CompanyPic not between", value1, value2, "companypic");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkIsNull() {
            addCriterion("CompanyPicLink is null");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkIsNotNull() {
            addCriterion("CompanyPicLink is not null");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkEqualTo(String value) {
            addCriterion("CompanyPicLink =", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkNotEqualTo(String value) {
            addCriterion("CompanyPicLink <>", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkGreaterThan(String value) {
            addCriterion("CompanyPicLink >", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyPicLink >=", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkLessThan(String value) {
            addCriterion("CompanyPicLink <", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkLessThanOrEqualTo(String value) {
            addCriterion("CompanyPicLink <=", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkLike(String value) {
            addCriterion("CompanyPicLink like", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkNotLike(String value) {
            addCriterion("CompanyPicLink not like", value, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkIn(List<String> values) {
            addCriterion("CompanyPicLink in", values, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkNotIn(List<String> values) {
            addCriterion("CompanyPicLink not in", values, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkBetween(String value1, String value2) {
            addCriterion("CompanyPicLink between", value1, value2, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andCompanypiclinkNotBetween(String value1, String value2) {
            addCriterion("CompanyPicLink not between", value1, value2, "companypiclink");
            return (Criteria) this;
        }

        public Criteria andShopleverIsNull() {
            addCriterion("ShopLever is null");
            return (Criteria) this;
        }

        public Criteria andShopleverIsNotNull() {
            addCriterion("ShopLever is not null");
            return (Criteria) this;
        }

        public Criteria andShopleverEqualTo(String value) {
            addCriterion("ShopLever =", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverNotEqualTo(String value) {
            addCriterion("ShopLever <>", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverGreaterThan(String value) {
            addCriterion("ShopLever >", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverGreaterThanOrEqualTo(String value) {
            addCriterion("ShopLever >=", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverLessThan(String value) {
            addCriterion("ShopLever <", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverLessThanOrEqualTo(String value) {
            addCriterion("ShopLever <=", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverLike(String value) {
            addCriterion("ShopLever like", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverNotLike(String value) {
            addCriterion("ShopLever not like", value, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverIn(List<String> values) {
            addCriterion("ShopLever in", values, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverNotIn(List<String> values) {
            addCriterion("ShopLever not in", values, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverBetween(String value1, String value2) {
            addCriterion("ShopLever between", value1, value2, "shoplever");
            return (Criteria) this;
        }

        public Criteria andShopleverNotBetween(String value1, String value2) {
            addCriterion("ShopLever not between", value1, value2, "shoplever");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateIsNull() {
            addCriterion("GoodCommentRate is null");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateIsNotNull() {
            addCriterion("GoodCommentRate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateEqualTo(Double value) {
            addCriterion("GoodCommentRate =", value, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateNotEqualTo(Double value) {
            addCriterion("GoodCommentRate <>", value, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateGreaterThan(Double value) {
            addCriterion("GoodCommentRate >", value, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateGreaterThanOrEqualTo(Double value) {
            addCriterion("GoodCommentRate >=", value, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateLessThan(Double value) {
            addCriterion("GoodCommentRate <", value, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateLessThanOrEqualTo(Double value) {
            addCriterion("GoodCommentRate <=", value, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateIn(List<Double> values) {
            addCriterion("GoodCommentRate in", values, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateNotIn(List<Double> values) {
            addCriterion("GoodCommentRate not in", values, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateBetween(Double value1, Double value2) {
            addCriterion("GoodCommentRate between", value1, value2, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andGoodcommentrateNotBetween(Double value1, Double value2) {
            addCriterion("GoodCommentRate not between", value1, value2, "goodcommentrate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateIsNull() {
            addCriterion("OpenShopDate is null");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateIsNotNull() {
            addCriterion("OpenShopDate is not null");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateEqualTo(Date value) {
            addCriterion("OpenShopDate =", value, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateNotEqualTo(Date value) {
            addCriterion("OpenShopDate <>", value, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateGreaterThan(Date value) {
            addCriterion("OpenShopDate >", value, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OpenShopDate >=", value, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateLessThan(Date value) {
            addCriterion("OpenShopDate <", value, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateLessThanOrEqualTo(Date value) {
            addCriterion("OpenShopDate <=", value, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateIn(List<Date> values) {
            addCriterion("OpenShopDate in", values, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateNotIn(List<Date> values) {
            addCriterion("OpenShopDate not in", values, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateBetween(Date value1, Date value2) {
            addCriterion("OpenShopDate between", value1, value2, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andOpenshopdateNotBetween(Date value1, Date value2) {
            addCriterion("OpenShopDate not between", value1, value2, "openshopdate");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyIsNull() {
            addCriterion("IsPayQualityMoney is null");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyIsNotNull() {
            addCriterion("IsPayQualityMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyEqualTo(Integer value) {
            addCriterion("IsPayQualityMoney =", value, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyNotEqualTo(Integer value) {
            addCriterion("IsPayQualityMoney <>", value, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyGreaterThan(Integer value) {
            addCriterion("IsPayQualityMoney >", value, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPayQualityMoney >=", value, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyLessThan(Integer value) {
            addCriterion("IsPayQualityMoney <", value, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyLessThanOrEqualTo(Integer value) {
            addCriterion("IsPayQualityMoney <=", value, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyIn(List<Integer> values) {
            addCriterion("IsPayQualityMoney in", values, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyNotIn(List<Integer> values) {
            addCriterion("IsPayQualityMoney not in", values, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyBetween(Integer value1, Integer value2) {
            addCriterion("IsPayQualityMoney between", value1, value2, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayqualitymoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPayQualityMoney not between", value1, value2, "ispayqualitymoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyIsNull() {
            addCriterion("IsPayVIPServerMoney is null");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyIsNotNull() {
            addCriterion("IsPayVIPServerMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyEqualTo(Integer value) {
            addCriterion("IsPayVIPServerMoney =", value, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyNotEqualTo(Integer value) {
            addCriterion("IsPayVIPServerMoney <>", value, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyGreaterThan(Integer value) {
            addCriterion("IsPayVIPServerMoney >", value, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsPayVIPServerMoney >=", value, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyLessThan(Integer value) {
            addCriterion("IsPayVIPServerMoney <", value, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyLessThanOrEqualTo(Integer value) {
            addCriterion("IsPayVIPServerMoney <=", value, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyIn(List<Integer> values) {
            addCriterion("IsPayVIPServerMoney in", values, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyNotIn(List<Integer> values) {
            addCriterion("IsPayVIPServerMoney not in", values, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyBetween(Integer value1, Integer value2) {
            addCriterion("IsPayVIPServerMoney between", value1, value2, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andIspayvipservermoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsPayVIPServerMoney not between", value1, value2, "ispayvipservermoney");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNull() {
            addCriterion("ProductCount is null");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNotNull() {
            addCriterion("ProductCount is not null");
            return (Criteria) this;
        }

        public Criteria andProductcountEqualTo(Integer value) {
            addCriterion("ProductCount =", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotEqualTo(Integer value) {
            addCriterion("ProductCount <>", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThan(Integer value) {
            addCriterion("ProductCount >", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductCount >=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThan(Integer value) {
            addCriterion("ProductCount <", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThanOrEqualTo(Integer value) {
            addCriterion("ProductCount <=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountIn(List<Integer> values) {
            addCriterion("ProductCount in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotIn(List<Integer> values) {
            addCriterion("ProductCount not in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountBetween(Integer value1, Integer value2) {
            addCriterion("ProductCount between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductCount not between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andShopscoreIsNull() {
            addCriterion("ShopScore is null");
            return (Criteria) this;
        }

        public Criteria andShopscoreIsNotNull() {
            addCriterion("ShopScore is not null");
            return (Criteria) this;
        }

        public Criteria andShopscoreEqualTo(Integer value) {
            addCriterion("ShopScore =", value, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreNotEqualTo(Integer value) {
            addCriterion("ShopScore <>", value, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreGreaterThan(Integer value) {
            addCriterion("ShopScore >", value, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShopScore >=", value, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreLessThan(Integer value) {
            addCriterion("ShopScore <", value, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreLessThanOrEqualTo(Integer value) {
            addCriterion("ShopScore <=", value, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreIn(List<Integer> values) {
            addCriterion("ShopScore in", values, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreNotIn(List<Integer> values) {
            addCriterion("ShopScore not in", values, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreBetween(Integer value1, Integer value2) {
            addCriterion("ShopScore between", value1, value2, "shopscore");
            return (Criteria) this;
        }

        public Criteria andShopscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("ShopScore not between", value1, value2, "shopscore");
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

        public Criteria andShopstyleIsNull() {
            addCriterion("ShopStyle is null");
            return (Criteria) this;
        }

        public Criteria andShopstyleIsNotNull() {
            addCriterion("ShopStyle is not null");
            return (Criteria) this;
        }

        public Criteria andShopstyleEqualTo(String value) {
            addCriterion("ShopStyle =", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleNotEqualTo(String value) {
            addCriterion("ShopStyle <>", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleGreaterThan(String value) {
            addCriterion("ShopStyle >", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleGreaterThanOrEqualTo(String value) {
            addCriterion("ShopStyle >=", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleLessThan(String value) {
            addCriterion("ShopStyle <", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleLessThanOrEqualTo(String value) {
            addCriterion("ShopStyle <=", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleLike(String value) {
            addCriterion("ShopStyle like", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleNotLike(String value) {
            addCriterion("ShopStyle not like", value, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleIn(List<String> values) {
            addCriterion("ShopStyle in", values, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleNotIn(List<String> values) {
            addCriterion("ShopStyle not in", values, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleBetween(String value1, String value2) {
            addCriterion("ShopStyle between", value1, value2, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andShopstyleNotBetween(String value1, String value2) {
            addCriterion("ShopStyle not between", value1, value2, "shopstyle");
            return (Criteria) this;
        }

        public Criteria andSeconddomainIsNull() {
            addCriterion("SecondDomain is null");
            return (Criteria) this;
        }

        public Criteria andSeconddomainIsNotNull() {
            addCriterion("SecondDomain is not null");
            return (Criteria) this;
        }

        public Criteria andSeconddomainEqualTo(String value) {
            addCriterion("SecondDomain =", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainNotEqualTo(String value) {
            addCriterion("SecondDomain <>", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainGreaterThan(String value) {
            addCriterion("SecondDomain >", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainGreaterThanOrEqualTo(String value) {
            addCriterion("SecondDomain >=", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainLessThan(String value) {
            addCriterion("SecondDomain <", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainLessThanOrEqualTo(String value) {
            addCriterion("SecondDomain <=", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainLike(String value) {
            addCriterion("SecondDomain like", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainNotLike(String value) {
            addCriterion("SecondDomain not like", value, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainIn(List<String> values) {
            addCriterion("SecondDomain in", values, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainNotIn(List<String> values) {
            addCriterion("SecondDomain not in", values, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainBetween(String value1, String value2) {
            addCriterion("SecondDomain between", value1, value2, "seconddomain");
            return (Criteria) this;
        }

        public Criteria andSeconddomainNotBetween(String value1, String value2) {
            addCriterion("SecondDomain not between", value1, value2, "seconddomain");
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

        public Criteria andApprovalstateIsNull() {
            addCriterion("ApprovalState is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNotNull() {
            addCriterion("ApprovalState is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateEqualTo(Integer value) {
            addCriterion("ApprovalState =", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotEqualTo(Integer value) {
            addCriterion("ApprovalState <>", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThan(Integer value) {
            addCriterion("ApprovalState >", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApprovalState >=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThan(Integer value) {
            addCriterion("ApprovalState <", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThanOrEqualTo(Integer value) {
            addCriterion("ApprovalState <=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIn(List<Integer> values) {
            addCriterion("ApprovalState in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotIn(List<Integer> values) {
            addCriterion("ApprovalState not in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateBetween(Integer value1, Integer value2) {
            addCriterion("ApprovalState between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ApprovalState not between", value1, value2, "approvalstate");
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