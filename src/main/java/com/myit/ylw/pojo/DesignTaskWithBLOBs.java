package com.myit.ylw.pojo;

public class DesignTaskWithBLOBs extends DesignTask {
    private String demand;

    private String detairequirements;

    private String picpaths;

    public DesignTaskWithBLOBs(Integer designtaskid, Integer userid, Integer category, Integer style, Double price, String username, String mobilephone, Date begintime, Date endtime, Date addtime, Date edittime, Integer listid, Integer isclose, Integer adminid, Integer status, String demand, String detairequirements, String picpaths) {
        super(designtaskid, userid, category, style, price, username, mobilephone, begintime, endtime, addtime, edittime, listid, isclose, adminid, status);
        this.demand = demand;
        this.detairequirements = detairequirements;
        this.picpaths = picpaths;
    }

    public DesignTaskWithBLOBs() {
        super();
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand == null ? null : demand.trim();
    }

    public String getDetairequirements() {
        return detairequirements;
    }

    public void setDetairequirements(String detairequirements) {
        this.detairequirements = detairequirements == null ? null : detairequirements.trim();
    }

    public String getPicpaths() {
        return picpaths;
    }

    public void setPicpaths(String picpaths) {
        this.picpaths = picpaths == null ? null : picpaths.trim();
    }
}