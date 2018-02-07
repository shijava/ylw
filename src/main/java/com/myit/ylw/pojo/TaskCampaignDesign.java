package com.myit.ylw.pojo;

import java.util.Date;

public class TaskCampaignDesign {
    private Integer tcdesignid;

    private Integer taskcampaignid;

    private Integer designtaskid;

    private Integer designworksid;

    private Date addtime;

    private Integer isclose;

    private Integer adminid;

    private Integer isbid;

    public TaskCampaignDesign(Integer tcdesignid, Integer taskcampaignid, Integer designtaskid, Integer designworksid, Date addtime, Integer isclose, Integer adminid, Integer isbid) {
        this.tcdesignid = tcdesignid;
        this.taskcampaignid = taskcampaignid;
        this.designtaskid = designtaskid;
        this.designworksid = designworksid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.adminid = adminid;
        this.isbid = isbid;
    }

    public TaskCampaignDesign() {
        super();
    }

    public Integer getTcdesignid() {
        return tcdesignid;
    }

    public void setTcdesignid(Integer tcdesignid) {
        this.tcdesignid = tcdesignid;
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

    public Integer getDesignworksid() {
        return designworksid;
    }

    public void setDesignworksid(Integer designworksid) {
        this.designworksid = designworksid;
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

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getIsbid() {
        return isbid;
    }

    public void setIsbid(Integer isbid) {
        this.isbid = isbid;
    }
}