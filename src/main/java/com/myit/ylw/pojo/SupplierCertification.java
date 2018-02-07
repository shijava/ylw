package com.myit.ylw.pojo;

import java.util.Date;

public class SupplierCertification {
    private Integer certificationid;

    private Integer userid;

    private Integer supplierid;

    private String companyname;

    private String businesslicenseurl;

    private String organizationcodeurl;

    private String taxregistrationcertificateurl;

    private String corporatename;

    private Integer province;

    private Integer city;

    private Integer district;

    private Date addtime;

    private Date edittime;

    private Integer adminid;

    private Integer approvalstate;

    private Integer certificationtype;

    public SupplierCertification(Integer certificationid, Integer userid, Integer supplierid, String companyname, String businesslicenseurl, String organizationcodeurl, String taxregistrationcertificateurl, String corporatename, Integer province, Integer city, Integer district, Date addtime, Date edittime, Integer adminid, Integer approvalstate, Integer certificationtype) {
        this.certificationid = certificationid;
        this.userid = userid;
        this.supplierid = supplierid;
        this.companyname = companyname;
        this.businesslicenseurl = businesslicenseurl;
        this.organizationcodeurl = organizationcodeurl;
        this.taxregistrationcertificateurl = taxregistrationcertificateurl;
        this.corporatename = corporatename;
        this.province = province;
        this.city = city;
        this.district = district;
        this.addtime = addtime;
        this.edittime = edittime;
        this.adminid = adminid;
        this.approvalstate = approvalstate;
        this.certificationtype = certificationtype;
    }

    public SupplierCertification() {
        super();
    }

    public Integer getCertificationid() {
        return certificationid;
    }

    public void setCertificationid(Integer certificationid) {
        this.certificationid = certificationid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getBusinesslicenseurl() {
        return businesslicenseurl;
    }

    public void setBusinesslicenseurl(String businesslicenseurl) {
        this.businesslicenseurl = businesslicenseurl == null ? null : businesslicenseurl.trim();
    }

    public String getOrganizationcodeurl() {
        return organizationcodeurl;
    }

    public void setOrganizationcodeurl(String organizationcodeurl) {
        this.organizationcodeurl = organizationcodeurl == null ? null : organizationcodeurl.trim();
    }

    public String getTaxregistrationcertificateurl() {
        return taxregistrationcertificateurl;
    }

    public void setTaxregistrationcertificateurl(String taxregistrationcertificateurl) {
        this.taxregistrationcertificateurl = taxregistrationcertificateurl == null ? null : taxregistrationcertificateurl.trim();
    }

    public String getCorporatename() {
        return corporatename;
    }

    public void setCorporatename(String corporatename) {
        this.corporatename = corporatename == null ? null : corporatename.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(Integer approvalstate) {
        this.approvalstate = approvalstate;
    }

    public Integer getCertificationtype() {
        return certificationtype;
    }

    public void setCertificationtype(Integer certificationtype) {
        this.certificationtype = certificationtype;
    }
}