package com.myit.ylw.pojo;

import java.util.Date;

public class OrderPay {
    private Integer oderpayid;

    private String payname;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    private String description;

    public OrderPay(Integer oderpayid, String payname, Integer listid, Integer adminid, Date addtime, Integer isclose, String description) {
        this.oderpayid = oderpayid;
        this.payname = payname;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.description = description;
    }

    public OrderPay() {
        super();
    }

    public Integer getOderpayid() {
        return oderpayid;
    }

    public void setOderpayid(Integer oderpayid) {
        this.oderpayid = oderpayid;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname == null ? null : payname.trim();
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}