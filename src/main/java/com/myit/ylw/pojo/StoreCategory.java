package com.myit.ylw.pojo;

import java.util.Date;

public class StoreCategory {
    private Integer storecategoryid;

    private Integer storeid;

    private Integer parentid;

    private Integer childnum;

    private Integer listid;

    private Date addtime;

    private String categoryname;

    public StoreCategory(Integer storecategoryid, Integer storeid, Integer parentid, Integer childnum, Integer listid, Date addtime, String categoryname) {
        this.storecategoryid = storecategoryid;
        this.storeid = storeid;
        this.parentid = parentid;
        this.childnum = childnum;
        this.listid = listid;
        this.addtime = addtime;
        this.categoryname = categoryname;
    }

    public StoreCategory() {
        super();
    }

    public Integer getStorecategoryid() {
        return storecategoryid;
    }

    public void setStorecategoryid(Integer storecategoryid) {
        this.storecategoryid = storecategoryid;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }
}