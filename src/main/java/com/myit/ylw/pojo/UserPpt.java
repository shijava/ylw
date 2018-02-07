package com.myit.ylw.pojo;

import java.util.Date;

public class UserPpt {
    private Integer userpptid;

    private Integer productid;

    private Integer shopid;

    private Integer userid;

    private Date addtime;

    private Integer isclose;

    private Integer listid;

    public UserPpt(Integer userpptid, Integer productid, Integer shopid, Integer userid, Date addtime, Integer isclose, Integer listid) {
        this.userpptid = userpptid;
        this.productid = productid;
        this.shopid = shopid;
        this.userid = userid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.listid = listid;
    }

    public UserPpt() {
        super();
    }

    public Integer getUserpptid() {
        return userpptid;
    }

    public void setUserpptid(Integer userpptid) {
        this.userpptid = userpptid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }
}