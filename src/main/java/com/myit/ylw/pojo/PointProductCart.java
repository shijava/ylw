package com.myit.ylw.pojo;

public class PointProductCart {
    private Integer ppcart;

    private Integer userid;

    private Integer pointproductid;

    private Integer ppstorageid;

    private Integer quantity;

    private Integer carttype;

    public PointProductCart(Integer ppcart, Integer userid, Integer pointproductid, Integer ppstorageid, Integer quantity, Integer carttype) {
        this.ppcart = ppcart;
        this.userid = userid;
        this.pointproductid = pointproductid;
        this.ppstorageid = ppstorageid;
        this.quantity = quantity;
        this.carttype = carttype;
    }

    public PointProductCart() {
        super();
    }

    public Integer getPpcart() {
        return ppcart;
    }

    public void setPpcart(Integer ppcart) {
        this.ppcart = ppcart;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPointproductid() {
        return pointproductid;
    }

    public void setPointproductid(Integer pointproductid) {
        this.pointproductid = pointproductid;
    }

    public Integer getPpstorageid() {
        return ppstorageid;
    }

    public void setPpstorageid(Integer ppstorageid) {
        this.ppstorageid = ppstorageid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCarttype() {
        return carttype;
    }

    public void setCarttype(Integer carttype) {
        this.carttype = carttype;
    }
}