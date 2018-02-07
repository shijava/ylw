package com.myit.ylw.pojo;

import java.util.Date;

public class OrderGoods {
    private Integer ordergoodsid;

    private Integer orderid;

    private String orderno;

    private Integer productid;

    private String productname;

    private Integer storageid;

    private Integer quantity;

    private Double price;

    private Double realprice;

    private Integer point;

    private Integer donatepoint;

    private Double shipprice;

    private Integer commentstate;

    private Date edittime;

    private Double pointpercent;

    public OrderGoods(Integer ordergoodsid, Integer orderid, String orderno, Integer productid, String productname, Integer storageid, Integer quantity, Double price, Double realprice, Integer point, Integer donatepoint, Double shipprice, Integer commentstate, Date edittime, Double pointpercent) {
        this.ordergoodsid = ordergoodsid;
        this.orderid = orderid;
        this.orderno = orderno;
        this.productid = productid;
        this.productname = productname;
        this.storageid = storageid;
        this.quantity = quantity;
        this.price = price;
        this.realprice = realprice;
        this.point = point;
        this.donatepoint = donatepoint;
        this.shipprice = shipprice;
        this.commentstate = commentstate;
        this.edittime = edittime;
        this.pointpercent = pointpercent;
    }

    public OrderGoods() {
        super();
    }

    public Integer getOrdergoodsid() {
        return ordergoodsid;
    }

    public void setOrdergoodsid(Integer ordergoodsid) {
        this.ordergoodsid = ordergoodsid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
        this.storageid = storageid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRealprice() {
        return realprice;
    }

    public void setRealprice(Double realprice) {
        this.realprice = realprice;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getDonatepoint() {
        return donatepoint;
    }

    public void setDonatepoint(Integer donatepoint) {
        this.donatepoint = donatepoint;
    }

    public Double getShipprice() {
        return shipprice;
    }

    public void setShipprice(Double shipprice) {
        this.shipprice = shipprice;
    }

    public Integer getCommentstate() {
        return commentstate;
    }

    public void setCommentstate(Integer commentstate) {
        this.commentstate = commentstate;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Double getPointpercent() {
        return pointpercent;
    }

    public void setPointpercent(Double pointpercent) {
        this.pointpercent = pointpercent;
    }
}