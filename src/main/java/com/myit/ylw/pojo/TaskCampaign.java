package com.myit.ylw.pojo;

import java.util.Date;

public class TaskCampaign {
    private Integer taskcampaignid;

    private Integer designtaskid;

    private Integer userid;

    private Integer designtaskuserid;

    private Integer campaignstatus;

    private Date addtime;

    private Date edittime;

    private Integer isclose;

    private Integer adminid;

    private String details;

    public TaskCampaign(Integer taskcampaignid, Integer designtaskid, Integer userid, Integer designtaskuserid, Integer campaignstatus, Date addtime, Date edittime, Integer isclose, Integer adminid, String details) {
        this.taskcampaignid = taskcampaignid;
        this.designtaskid = designtaskid;
        this.userid = userid;
        this.designtaskuserid = designtaskuserid;
        this.campaignstatus = campaignstatus;
        this.addtime = addtime;
        this.edittime = edittime;
        this.isclose = isclose;
        this.adminid = adminid;
        this.details = details;
    }

    public TaskCampaign() {
        super();
    }

    public Integer getTaskcampaignid() {
        return taskcampaignid;
    }

    public void setTaskcampaignid(Integer taskcampaignid) {
        this.taskcampaignid = taskcampaignid;
    }

    public Integer getDesigntaskid() {
        return designtaskid;
    }

    public void setDesigntaskid(Integer designtaskid) {
        this.designtaskid = designtaskid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDesigntaskuserid() {
        return designtaskuserid;
    }

    public void setDesigntaskuserid(Integer designtaskuserid) {
        this.designtaskuserid = designtaskuserid;
    }

    public Integer getCampaignstatus() {
        return campaignstatus;
    }

    public void setCampaignstatus(Integer campaignstatus) {
        this.campaignstatus = campaignstatus;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}