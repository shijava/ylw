package com.myit.ylw.pojo;

import java.util.Date;

public class Designer {
    private Integer designeerid;

    private Integer userid;

    private String specialty;

    private Integer seniority;

    private Date addtime;

    private Date edittime;

    private Integer isaudit;

    private Integer isclose;

    private Integer clicknum;

    private Integer adminid;

    private Integer listid;

    private Integer isrecommend;

    public Designer(Integer designeerid, Integer userid, String specialty, Integer seniority, Date addtime, Date edittime, Integer isaudit, Integer isclose, Integer clicknum, Integer adminid, Integer listid, Integer isrecommend) {
        this.designeerid = designeerid;
        this.userid = userid;
        this.specialty = specialty;
        this.seniority = seniority;
        this.addtime = addtime;
        this.edittime = edittime;
        this.isaudit = isaudit;
        this.isclose = isclose;
        this.clicknum = clicknum;
        this.adminid = adminid;
        this.listid = listid;
        this.isrecommend = isrecommend;
    }

    public Designer() {
        super();
    }

    public Integer getDesigneerid() {
        return designeerid;
    }

    public void setDesigneerid(Integer designeerid) {
        this.designeerid = designeerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public Integer getSeniority() {
        return seniority;
    }

    public void setSeniority(Integer seniority) {
        this.seniority = seniority;
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

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }
}