package com.myit.ylw.pojo;

import java.util.Date;

public class DesignTask {
    private Integer designtaskid;

    private Integer userid;

    private Integer category;

    private Integer style;

    private Double price;

    private String username;

    private String mobilephone;

    private Date begintime;

    private Date endtime;

    private Date addtime;

    private Date edittime;

    private Integer listid;

    private Integer isclose;

    private Integer adminid;

    private Integer status;

    public DesignTask(Integer designtaskid, Integer userid, Integer category, Integer style, Double price, String username, String mobilephone, Date begintime, Date endtime, Date addtime, Date edittime, Integer listid, Integer isclose, Integer adminid, Integer status) {
        this.designtaskid = designtaskid;
        this.userid = userid;
        this.category = category;
        this.style = style;
        this.price = price;
        this.username = username;
        this.mobilephone = mobilephone;
        this.begintime = begintime;
        this.endtime = endtime;
        this.addtime = addtime;
        this.edittime = edittime;
        this.listid = listid;
        this.isclose = isclose;
        this.adminid = adminid;
        this.status = status;
    }

    public DesignTask() {
        super();
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
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

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}