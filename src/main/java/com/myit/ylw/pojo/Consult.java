package com.myit.ylw.pojo;

import java.util.Date;

public class Consult {
    private Integer consultid;

    private Integer userid;

    private Integer shopid;

    private Integer productid;

    private Integer targetconsultid;

    private Date addtime;

    private Integer isclose;

    private String content;

    public Consult(Integer consultid, Integer userid, Integer shopid, Integer productid, Integer targetconsultid, Date addtime, Integer isclose, String content) {
        this.consultid = consultid;
        this.userid = userid;
        this.shopid = shopid;
        this.productid = productid;
        this.targetconsultid = targetconsultid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.content = content;
    }

    public Consult() {
        super();
    }

    public Integer getConsultid() {
        return consultid;
    }

    public void setConsultid(Integer consultid) {
        this.consultid = consultid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getTargetconsultid() {
        return targetconsultid;
    }

    public void setTargetconsultid(Integer targetconsultid) {
        this.targetconsultid = targetconsultid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}