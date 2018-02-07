package com.myit.ylw.pojo;

import java.util.Date;

public class PayMargin {
    private Integer paymarginid;

    private String paymarginno;

    private Integer margintype;

    private Integer userid;

    private Double price;

    private Integer paymethodid;

    private Integer isaudit;

    private Integer isclose;

    private Date addtime;

    private Date edittime;

    private String adminid;

    private Integer isdz;

    private Date dztime;

    private Integer dzadminid;

    private String dzadminname;

    private Integer isbackbzj;

    private Date backtime;

    private Integer backadminid;

    private String backadminname;

    private Double backprice;

    public PayMargin(Integer paymarginid, String paymarginno, Integer margintype, Integer userid, Double price, Integer paymethodid, Integer isaudit, Integer isclose, Date addtime, Date edittime, String adminid, Integer isdz, Date dztime, Integer dzadminid, String dzadminname, Integer isbackbzj, Date backtime, Integer backadminid, String backadminname, Double backprice) {
        this.paymarginid = paymarginid;
        this.paymarginno = paymarginno;
        this.margintype = margintype;
        this.userid = userid;
        this.price = price;
        this.paymethodid = paymethodid;
        this.isaudit = isaudit;
        this.isclose = isclose;
        this.addtime = addtime;
        this.edittime = edittime;
        this.adminid = adminid;
        this.isdz = isdz;
        this.dztime = dztime;
        this.dzadminid = dzadminid;
        this.dzadminname = dzadminname;
        this.isbackbzj = isbackbzj;
        this.backtime = backtime;
        this.backadminid = backadminid;
        this.backadminname = backadminname;
        this.backprice = backprice;
    }

    public PayMargin() {
        super();
    }

    public Integer getPaymarginid() {
        return paymarginid;
    }

    public void setPaymarginid(Integer paymarginid) {
        this.paymarginid = paymarginid;
    }

    public String getPaymarginno() {
        return paymarginno;
    }

    public void setPaymarginno(String paymarginno) {
        this.paymarginno = paymarginno == null ? null : paymarginno.trim();
    }

    public Integer getMargintype() {
        return margintype;
    }

    public void setMargintype(Integer margintype) {
        this.margintype = margintype;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPaymethodid() {
        return paymethodid;
    }

    public void setPaymethodid(Integer paymethodid) {
        this.paymethodid = paymethodid;
    }

    public Integer getIsaudit() {
        return isaudit;
    }

    public void setIsaudit(Integer isaudit) {
        this.isaudit = isaudit;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
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

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public Integer getIsdz() {
        return isdz;
    }

    public void setIsdz(Integer isdz) {
        this.isdz = isdz;
    }

    public Date getDztime() {
        return dztime;
    }

    public void setDztime(Date dztime) {
        this.dztime = dztime;
    }

    public Integer getDzadminid() {
        return dzadminid;
    }

    public void setDzadminid(Integer dzadminid) {
        this.dzadminid = dzadminid;
    }

    public String getDzadminname() {
        return dzadminname;
    }

    public void setDzadminname(String dzadminname) {
        this.dzadminname = dzadminname == null ? null : dzadminname.trim();
    }

    public Integer getIsbackbzj() {
        return isbackbzj;
    }

    public void setIsbackbzj(Integer isbackbzj) {
        this.isbackbzj = isbackbzj;
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    public Integer getBackadminid() {
        return backadminid;
    }

    public void setBackadminid(Integer backadminid) {
        this.backadminid = backadminid;
    }

    public String getBackadminname() {
        return backadminname;
    }

    public void setBackadminname(String backadminname) {
        this.backadminname = backadminname == null ? null : backadminname.trim();
    }

    public Double getBackprice() {
        return backprice;
    }

    public void setBackprice(Double backprice) {
        this.backprice = backprice;
    }
}