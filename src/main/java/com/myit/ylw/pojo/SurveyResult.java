package com.myit.ylw.pojo;

import java.util.Date;

public class SurveyResult {
    private Integer surveyresultid;

    private String surveycontent;

    private String ip;

    private Integer surveyid;

    private Date addtime;

    public SurveyResult(Integer surveyresultid, String surveycontent, String ip, Integer surveyid, Date addtime) {
        this.surveyresultid = surveyresultid;
        this.surveycontent = surveycontent;
        this.ip = ip;
        this.surveyid = surveyid;
        this.addtime = addtime;
    }

    public SurveyResult() {
        super();
    }

    public Integer getSurveyresultid() {
        return surveyresultid;
    }

    public void setSurveyresultid(Integer surveyresultid) {
        this.surveyresultid = surveyresultid;
    }

    public String getSurveycontent() {
        return surveycontent;
    }

    public void setSurveycontent(String surveycontent) {
        this.surveycontent = surveycontent == null ? null : surveycontent.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Integer surveyid) {
        this.surveyid = surveyid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}