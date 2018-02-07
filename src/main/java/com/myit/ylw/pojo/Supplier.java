package com.myit.ylw.pojo;

import java.util.Date;

public class Supplier {
    private Integer supplierid;

    private Integer userid;

    private String companyname;

    private String businesslicenseurl;

    private String organizationcodeurl;

    private String taxregistrationcertificateurl;

    private String corporatename;

    private String companylogo;

    private String companypic;

    private String companypiclink;

    private String shoplever;

    private Double goodcommentrate;

    private Date openshopdate;

    private Integer ispayqualitymoney;

    private Integer ispayvipservermoney;

    private Integer productcount;

    private Integer shopscore;

    private String qq;

    private String shopstyle;

    private String seconddomain;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    private Integer listid;

    private Integer approvalstate;

    public Supplier(Integer supplierid, Integer userid, String companyname, String businesslicenseurl, String organizationcodeurl, String taxregistrationcertificateurl, String corporatename, String companylogo, String companypic, String companypiclink, String shoplever, Double goodcommentrate, Date openshopdate, Integer ispayqualitymoney, Integer ispayvipservermoney, Integer productcount, Integer shopscore, String qq, String shopstyle, String seconddomain, Integer adminid, Date addtime, Integer isclose, Integer listid, Integer approvalstate) {
        this.supplierid = supplierid;
        this.userid = userid;
        this.companyname = companyname;
        this.businesslicenseurl = businesslicenseurl;
        this.organizationcodeurl = organizationcodeurl;
        this.taxregistrationcertificateurl = taxregistrationcertificateurl;
        this.corporatename = corporatename;
        this.companylogo = companylogo;
        this.companypic = companypic;
        this.companypiclink = companypiclink;
        this.shoplever = shoplever;
        this.goodcommentrate = goodcommentrate;
        this.openshopdate = openshopdate;
        this.ispayqualitymoney = ispayqualitymoney;
        this.ispayvipservermoney = ispayvipservermoney;
        this.productcount = productcount;
        this.shopscore = shopscore;
        this.qq = qq;
        this.shopstyle = shopstyle;
        this.seconddomain = seconddomain;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.listid = listid;
        this.approvalstate = approvalstate;
    }

    public Supplier() {
        super();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getCompanylogo() {
        return companylogo;
    }

    public void setCompanylogo(String companylogo) {
        this.companylogo = companylogo == null ? null : companylogo.trim();
    }

    public String getCompanypic() {
        return companypic;
    }

    public void setCompanypic(String companypic) {
        this.companypic = companypic == null ? null : companypic.trim();
    }

    public String getCompanypiclink() {
        return companypiclink;
    }

    public void setCompanypiclink(String companypiclink) {
        this.companypiclink = companypiclink == null ? null : companypiclink.trim();
    }

    public String getShoplever() {
        return shoplever;
    }

    public void setShoplever(String shoplever) {
        this.shoplever = shoplever == null ? null : shoplever.trim();
    }

    public Double getGoodcommentrate() {
        return goodcommentrate;
    }

    public void setGoodcommentrate(Double goodcommentrate) {
        this.goodcommentrate = goodcommentrate;
    }

    public Date getOpenshopdate() {
        return openshopdate;
    }

    public void setOpenshopdate(Date openshopdate) {
        this.openshopdate = openshopdate;
    }

    public Integer getIspayqualitymoney() {
        return ispayqualitymoney;
    }

    public void setIspayqualitymoney(Integer ispayqualitymoney) {
        this.ispayqualitymoney = ispayqualitymoney;
    }

    public Integer getIspayvipservermoney() {
        return ispayvipservermoney;
    }

    public void setIspayvipservermoney(Integer ispayvipservermoney) {
        this.ispayvipservermoney = ispayvipservermoney;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public Integer getShopscore() {
        return shopscore;
    }

    public void setShopscore(Integer shopscore) {
        this.shopscore = shopscore;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getShopstyle() {
        return shopstyle;
    }

    public void setShopstyle(String shopstyle) {
        this.shopstyle = shopstyle == null ? null : shopstyle.trim();
    }

    public String getSeconddomain() {
        return seconddomain;
    }

    public void setSeconddomain(String seconddomain) {
        this.seconddomain = seconddomain == null ? null : seconddomain.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(Integer approvalstate) {
        this.approvalstate = approvalstate;
    }
}