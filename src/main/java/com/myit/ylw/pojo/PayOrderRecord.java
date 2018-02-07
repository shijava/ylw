package com.myit.ylw.pojo;

import java.util.Date;

public class PayOrderRecord {
    private Integer payorderrecordid;

    private String payorderrecordno;

    private Double orderpricetotal;

    private Double pointpricetotal;

    private Double realpaypricetotal;

    private Integer userid;

    private Integer ordertype;

    private Date addtime;

    private Integer adminid;

    private Integer paystate;

    private Date realpaytime;

    private Double usablepointpricetotal;

    public PayOrderRecord(Integer payorderrecordid, String payorderrecordno, Double orderpricetotal, Double pointpricetotal, Double realpaypricetotal, Integer userid, Integer ordertype, Date addtime, Integer adminid, Integer paystate, Date realpaytime, Double usablepointpricetotal) {
        this.payorderrecordid = payorderrecordid;
        this.payorderrecordno = payorderrecordno;
        this.orderpricetotal = orderpricetotal;
        this.pointpricetotal = pointpricetotal;
        this.realpaypricetotal = realpaypricetotal;
        this.userid = userid;
        this.ordertype = ordertype;
        this.addtime = addtime;
        this.adminid = adminid;
        this.paystate = paystate;
        this.realpaytime = realpaytime;
        this.usablepointpricetotal = usablepointpricetotal;
    }

    public PayOrderRecord() {
        super();
    }

    public Integer getPayorderrecordid() {
        return payorderrecordid;
    }

    public void setPayorderrecordid(Integer payorderrecordid) {
        this.payorderrecordid = payorderrecordid;
    }

    public String getPayorderrecordno() {
        return payorderrecordno;
    }

    public void setPayorderrecordno(String payorderrecordno) {
        this.payorderrecordno = payorderrecordno == null ? null : payorderrecordno.trim();
    }

    public Double getOrderpricetotal() {
        return orderpricetotal;
    }

    public void setOrderpricetotal(Double orderpricetotal) {
        this.orderpricetotal = orderpricetotal;
    }

    public Double getPointpricetotal() {
        return pointpricetotal;
    }

    public void setPointpricetotal(Double pointpricetotal) {
        this.pointpricetotal = pointpricetotal;
    }

    public Double getRealpaypricetotal() {
        return realpaypricetotal;
    }

    public void setRealpaypricetotal(Double realpaypricetotal) {
        this.realpaypricetotal = realpaypricetotal;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public Date getRealpaytime() {
        return realpaytime;
    }

    public void setRealpaytime(Date realpaytime) {
        this.realpaytime = realpaytime;
    }

    public Double getUsablepointpricetotal() {
        return usablepointpricetotal;
    }

    public void setUsablepointpricetotal(Double usablepointpricetotal) {
        this.usablepointpricetotal = usablepointpricetotal;
    }
}