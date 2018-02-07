package com.myit.ylw.pojo;

import java.util.Date;

public class FeedBack {
    private Integer feedbackid;

    private Integer typeid;

    private String title;

    private String feedbackcontent;

    private String ipaddress;

    private Date addtime;

    private Integer isdeal;

    private String dealmeno;

    public FeedBack(Integer feedbackid, Integer typeid, String title, String feedbackcontent, String ipaddress, Date addtime, Integer isdeal, String dealmeno) {
        this.feedbackid = feedbackid;
        this.typeid = typeid;
        this.title = title;
        this.feedbackcontent = feedbackcontent;
        this.ipaddress = ipaddress;
        this.addtime = addtime;
        this.isdeal = isdeal;
        this.dealmeno = dealmeno;
    }

    public FeedBack() {
        super();
    }

    public Integer getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(Integer feedbackid) {
        this.feedbackid = feedbackid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFeedbackcontent() {
        return feedbackcontent;
    }

    public void setFeedbackcontent(String feedbackcontent) {
        this.feedbackcontent = feedbackcontent == null ? null : feedbackcontent.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getIsdeal() {
        return isdeal;
    }

    public void setIsdeal(Integer isdeal) {
        this.isdeal = isdeal;
    }

    public String getDealmeno() {
        return dealmeno;
    }

    public void setDealmeno(String dealmeno) {
        this.dealmeno = dealmeno == null ? null : dealmeno.trim();
    }
}