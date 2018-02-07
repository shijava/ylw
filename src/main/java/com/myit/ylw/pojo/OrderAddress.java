package com.myit.ylw.pojo;

public class OrderAddress {
    private Integer orderaddressid;

    private String userid;

    private String consignee;

    private String postcode;

    private String telphone;

    private String mobilephone;

    private Integer provinceid;

    private Integer cityid;

    private Integer districe;

    private String address;

    private Integer isdefault;

    public OrderAddress(Integer orderaddressid, String userid, String consignee, String postcode, String telphone, String mobilephone, Integer provinceid, Integer cityid, Integer districe, String address, Integer isdefault) {
        this.orderaddressid = orderaddressid;
        this.userid = userid;
        this.consignee = consignee;
        this.postcode = postcode;
        this.telphone = telphone;
        this.mobilephone = mobilephone;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.districe = districe;
        this.address = address;
        this.isdefault = isdefault;
    }

    public OrderAddress() {
        super();
    }

    public Integer getOrderaddressid() {
        return orderaddressid;
    }

    public void setOrderaddressid(Integer orderaddressid) {
        this.orderaddressid = orderaddressid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getDistrice() {
        return districe;
    }

    public void setDistrice(Integer districe) {
        this.districe = districe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }
}