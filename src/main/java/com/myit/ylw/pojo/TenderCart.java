package com.myit.ylw.pojo;

import java.util.Date;

public class TenderCart {
    private Integer tendercartid;

    private Integer userid;

    private Integer tenderid;

    private Integer biddingproductid;

    private Date addtime;

    public TenderCart(Integer tendercartid, Integer userid, Integer tenderid, Integer biddingproductid, Date addtime) {
        this.tendercartid = tendercartid;
        this.userid = userid;
        this.tenderid = tenderid;
        this.biddingproductid = biddingproductid;
        this.addtime = addtime;
    }

    public TenderCart() {
        super();
    }

    public Integer getTendercartid() {
        return tendercartid;
    }

    public void setTendercartid(Integer tendercartid) {
        this.tendercartid = tendercartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTenderid() {
        return tenderid;
    }

    public void setTenderid(Integer tenderid) {
        this.tenderid = tenderid;
    }

    public Integer getBiddingproductid() {
        return biddingproductid;
    }

    public void setBiddingproductid(Integer biddingproductid) {
        this.biddingproductid = biddingproductid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}