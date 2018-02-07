package com.myit.ylw.pojo;

import java.util.Date;

public class Limit {
    private Integer limitid;

    private String limitfield;

    private String limitvalue;

    private Integer parentid;

    private Integer childnum;

    private Integer listid;

    private Integer isdist;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public Limit(Integer limitid, String limitfield, String limitvalue, Integer parentid, Integer childnum, Integer listid, Integer isdist, Integer adminid, Date addtime, Integer isclose) {
        this.limitid = limitid;
        this.limitfield = limitfield;
        this.limitvalue = limitvalue;
        this.parentid = parentid;
        this.childnum = childnum;
        this.listid = listid;
        this.isdist = isdist;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public Limit() {
        super();
    }

    public Integer getLimitid() {
        return limitid;
    }

    public void setLimitid(Integer limitid) {
        this.limitid = limitid;
    }

    public String getLimitfield() {
        return limitfield;
    }

    public void setLimitfield(String limitfield) {
        this.limitfield = limitfield == null ? null : limitfield.trim();
    }

    public String getLimitvalue() {
        return limitvalue;
    }

    public void setLimitvalue(String limitvalue) {
        this.limitvalue = limitvalue == null ? null : limitvalue.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getIsdist() {
        return isdist;
    }

    public void setIsdist(Integer isdist) {
        this.isdist = isdist;
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
}