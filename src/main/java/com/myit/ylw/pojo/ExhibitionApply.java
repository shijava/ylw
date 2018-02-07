package com.myit.ylw.pojo;

import java.util.Date;

public class ExhibitionApply {
    private Integer exhibitionapplyid;

    private Integer exhibitionhallid;

    private Integer exhibitionpositionid;

    private Integer userid;

    private Date begintime;

    private Date endtime;

    private Integer isclose;

    private Integer adminid;

    private Date addtime;

    private Date edittime;

    private String companyname;

    public ExhibitionApply(Integer exhibitionapplyid, Integer exhibitionhallid, Integer exhibitionpositionid, Integer userid, Date begintime, Date endtime, Integer isclose, Integer adminid, Date addtime, Date edittime, String companyname) {
        this.exhibitionapplyid = exhibitionapplyid;
        this.exhibitionhallid = exhibitionhallid;
        this.exhibitionpositionid = exhibitionpositionid;
        this.userid = userid;
        this.begintime = begintime;
        this.endtime = endtime;
        this.isclose = isclose;
        this.adminid = adminid;
        this.addtime = addtime;
        this.edittime = edittime;
        this.companyname = companyname;
    }

    public ExhibitionApply() {
        super();
    }

    public Integer getExhibitionapplyid() {
        return exhibitionapplyid;
    }

    public void setExhibitionapplyid(Integer exhibitionapplyid) {
        this.exhibitionapplyid = exhibitionapplyid;
    }

    public Integer getExhibitionhallid() {
        return exhibitionhallid;
    }

    public void setExhibitionhallid(Integer exhibitionhallid) {
        this.exhibitionhallid = exhibitionhallid;
    }

    public Integer getExhibitionpositionid() {
        return exhibitionpositionid;
    }

    public void setExhibitionpositionid(Integer exhibitionpositionid) {
        this.exhibitionpositionid = exhibitionpositionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
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

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }
}