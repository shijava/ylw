package com.myit.ylw.pojo;

import java.util.Date;

public class VirtualOrderRecord {
    private Integer virtualrecordid;

    private String sellername;

    private String model;

    private Integer quantity;

    private Double price;

    private Date tradetime;

    private Date addtime;

    private Integer adminid;

    private Integer productid;

    public VirtualOrderRecord(Integer virtualrecordid, String sellername, String model, Integer quantity, Double price, Date tradetime, Date addtime, Integer adminid, Integer productid) {
        this.virtualrecordid = virtualrecordid;
        this.sellername = sellername;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.tradetime = tradetime;
        this.addtime = addtime;
        this.adminid = adminid;
        this.productid = productid;
    }

    public VirtualOrderRecord() {
        super();
    }

    public Integer getVirtualrecordid() {
        return virtualrecordid;
    }

    public void setVirtualrecordid(Integer virtualrecordid) {
        this.virtualrecordid = virtualrecordid;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }
}