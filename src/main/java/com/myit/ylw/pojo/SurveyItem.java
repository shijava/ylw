package com.myit.ylw.pojo;

import java.util.Date;

public class SurveyItem {
    private Integer surveyitemid;

    private String itemname;

    private Integer typeid;

    private Integer surveyid;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public SurveyItem(Integer surveyitemid, String itemname, Integer typeid, Integer surveyid, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.surveyitemid = surveyitemid;
        this.itemname = itemname;
        this.typeid = typeid;
        this.surveyid = surveyid;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public SurveyItem() {
        super();
    }

    public Integer getSurveyitemid() {
        return surveyitemid;
    }

    public void setSurveyitemid(Integer surveyitemid) {
        this.surveyitemid = surveyitemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Integer surveyid) {
        this.surveyid = surveyid;
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
}