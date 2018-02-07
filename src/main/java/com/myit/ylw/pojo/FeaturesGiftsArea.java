package com.myit.ylw.pojo;

import java.util.Date;

public class FeaturesGiftsArea {
    private Integer featuresgiftsareaid;

    private String featuresgiftsareaname;

    private Integer adminid;

    private Date addtime;

    private Integer listid;

    private Integer isclose;

    public FeaturesGiftsArea(Integer featuresgiftsareaid, String featuresgiftsareaname, Integer adminid, Date addtime, Integer listid, Integer isclose) {
        this.featuresgiftsareaid = featuresgiftsareaid;
        this.featuresgiftsareaname = featuresgiftsareaname;
        this.adminid = adminid;
        this.addtime = addtime;
        this.listid = listid;
        this.isclose = isclose;
    }

    public FeaturesGiftsArea() {
        super();
    }

    public Integer getFeaturesgiftsareaid() {
        return featuresgiftsareaid;
    }

    public void setFeaturesgiftsareaid(Integer featuresgiftsareaid) {
        this.featuresgiftsareaid = featuresgiftsareaid;
    }

    public String getFeaturesgiftsareaname() {
        return featuresgiftsareaname;
    }

    public void setFeaturesgiftsareaname(String featuresgiftsareaname) {
        this.featuresgiftsareaname = featuresgiftsareaname == null ? null : featuresgiftsareaname.trim();
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

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }
}