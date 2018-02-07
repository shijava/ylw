package com.myit.ylw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierCertificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierCertificationExample() {
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

        public Criteria andCertificationidIsNull() {
            addCriterion("CertificationID is null");
            return (Criteria) this;
        }

        public Criteria andCertificationidIsNotNull() {
            addCriterion("CertificationID is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationidEqualTo(Integer value) {
            addCriterion("CertificationID =", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotEqualTo(Integer value) {
            addCriterion("CertificationID <>", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidGreaterThan(Integer value) {
            addCriterion("CertificationID >", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CertificationID >=", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLessThan(Integer value) {
            addCriterion("CertificationID <", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLessThanOrEqualTo(Integer value) {
            addCriterion("CertificationID <=", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidIn(List<Integer> values) {
            addCriterion("CertificationID in", values, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotIn(List<Integer> values) {
            addCriterion("CertificationID not in", values, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidBetween(Integer value1, Integer value2) {
            addCriterion("CertificationID between", value1, value2, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotBetween(Integer value1, Integer value2) {
            addCriterion("CertificationID not between", value1, value2, "certificationid");
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

        public Criteria andCertificationtypeIsNull() {
            addCriterion("CertificationType is null");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeIsNotNull() {
            addCriterion("CertificationType is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeEqualTo(Integer value) {
            addCriterion("CertificationType =", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotEqualTo(Integer value) {
            addCriterion("CertificationType <>", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeGreaterThan(Integer value) {
            addCriterion("CertificationType >", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CertificationType >=", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeLessThan(Integer value) {
            addCriterion("CertificationType <", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeLessThanOrEqualTo(Integer value) {
            addCriterion("CertificationType <=", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeIn(List<Integer> values) {
            addCriterion("CertificationType in", values, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotIn(List<Integer> values) {
            addCriterion("CertificationType not in", values, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeBetween(Integer value1, Integer value2) {
            addCriterion("CertificationType between", value1, value2, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CertificationType not between", value1, value2, "certificationtype");
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