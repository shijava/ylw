package com.myit.ylw.pojo;

import java.util.Date;

public class PayAccountChangeRecord {
    private Integer payaccountchangeid;

    private String oldzfb;

    private String oldzfbname;

    private String oldbank;

    private String oldbankaccount;

    private String newzfb;

    private String newzfbname;

    private String newbank;

    private String newbankaccount;

    private Integer status;

    private Integer userid;

    private Date addtime;

    public PayAccountChangeRecord(Integer payaccountchangeid, String oldzfb, String oldzfbname, String oldbank, String oldbankaccount, String newzfb, String newzfbname, String newbank, String newbankaccount, Integer status, Integer userid, Date addtime) {
        this.payaccountchangeid = payaccountchangeid;
        this.oldzfb = oldzfb;
        this.oldzfbname = oldzfbname;
        this.oldbank = oldbank;
        this.oldbankaccount = oldbankaccount;
        this.newzfb = newzfb;
        this.newzfbname = newzfbname;
        this.newbank = newbank;
        this.newbankaccount = newbankaccount;
        this.status = status;
        this.userid = userid;
        this.addtime = addtime;
    }

    public PayAccountChangeRecord() {
        super();
    }

    public Integer getPayaccountchangeid() {
        return payaccountchangeid;
    }

    public void setPayaccountchangeid(Integer payaccountchangeid) {
        this.payaccountchangeid = payaccountchangeid;
    }

    public String getOldzfb() {
        return oldzfb;
    }

    public void setOldzfb(String oldzfb) {
        this.oldzfb = oldzfb == null ? null : oldzfb.trim();
    }

    public String getOldzfbname() {
        return oldzfbname;
    }

    public void setOldzfbname(String oldzfbname) {
        this.oldzfbname = oldzfbname == null ? null : oldzfbname.trim();
    }

    public String getOldbank() {
        return oldbank;
    }

    public void setOldbank(String oldbank) {
        this.oldbank = oldbank == null ? null : oldbank.trim();
    }

    public String getOldbankaccount() {
        return oldbankaccount;
    }

    public void setOldbankaccount(String oldbankaccount) {
        this.oldbankaccount = oldbankaccount == null ? null : oldbankaccount.trim();
    }

    public String getNewzfb() {
        return newzfb;
    }

    public void setNewzfb(String newzfb) {
        this.newzfb = newzfb == null ? null : newzfb.trim();
    }

    public String getNewzfbname() {
        return newzfbname;
    }

    public void setNewzfbname(String newzfbname) {
        this.newzfbname = newzfbname == null ? null : newzfbname.trim();
    }

    public String getNewbank() {
        return newbank;
    }

    public void setNewbank(String newbank) {
        this.newbank = newbank == null ? null : newbank.trim();
    }

    public String getNewbankaccount() {
        return newbankaccount;
    }

    public void setNewbankaccount(String newbankaccount) {
        this.newbankaccount = newbankaccount == null ? null : newbankaccount.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}