package com.myit.ylw.pojo;

public class SurveyItemOption {
    private Integer surveyitemoptionid;

    private String itemoptionname;

    private Integer surveyitemid;

    private Integer listid;

    private Integer adminid;

    public SurveyItemOption(Integer surveyitemoptionid, String itemoptionname, Integer surveyitemid, Integer listid, Integer adminid) {
        this.surveyitemoptionid = surveyitemoptionid;
        this.itemoptionname = itemoptionname;
        this.surveyitemid = surveyitemid;
        this.listid = listid;
        this.adminid = adminid;
    }

    public SurveyItemOption() {
        super();
    }

    public Integer getSurveyitemoptionid() {
        return surveyitemoptionid;
    }

    public void setSurveyitemoptionid(Integer surveyitemoptionid) {
        this.surveyitemoptionid = surveyitemoptionid;
    }

    public String getItemoptionname() {
        return itemoptionname;
    }

    public void setItemoptionname(String itemoptionname) {
        this.itemoptionname = itemoptionname == null ? null : itemoptionname.trim();
    }

    public Integer getSurveyitemid() {
        return surveyitemid;
    }

    public void setSurveyitemid(Integer surveyitemid) {
        this.surveyitemid = surveyitemid;
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
}