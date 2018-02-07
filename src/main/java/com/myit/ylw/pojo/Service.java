package com.myit.ylw.pojo;

import java.util.Date;

public class Service {
    private Integer serviceid;

    private String serviceno;

    private Integer orderid;

    private String orderno;

    private Integer selleruserid;

    private String userid;

    private Double realpayprices;

    private Double backprice;

    private Date addtime;

    private Date edittime;

    private Integer servicestate;

    private String shipname;

    private String shipno;

    private String consignee;

    private String consigneemobilephone;

    private String consignetelephone;

    private String consignepostcode;

    private Integer provinceid;

    private Integer cityid;

    private Integer district;

    private String consigneeadress;

    private String shipcertificate;

    private String shipcertificate2;

    private Integer servicetype;

    public Service(Integer serviceid, String serviceno, Integer orderid, String orderno, Integer selleruserid, String userid, Double realpayprices, Double backprice, Date addtime, Date edittime, Integer servicestate, String shipname, String shipno, String consignee, String consigneemobilephone, String consignetelephone, String consignepostcode, Integer provinceid, Integer cityid, Integer district, String consigneeadress, String shipcertificate, String shipcertificate2, Integer servicetype) {
        this.serviceid = serviceid;
        this.serviceno = serviceno;
        this.orderid = orderid;
        this.orderno = orderno;
        this.selleruserid = selleruserid;
        this.userid = userid;
        this.realpayprices = realpayprices;
        this.backprice = backprice;
        this.addtime = addtime;
        this.edittime = edittime;
        this.servicestate = servicestate;
        this.shipname = shipname;
        this.shipno = shipno;
        this.consignee = consignee;
        this.consigneemobilephone = consigneemobilephone;
        this.consignetelephone = consignetelephone;
        this.consignepostcode = consignepostcode;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.district = district;
        this.consigneeadress = consigneeadress;
        this.shipcertificate = shipcertificate;
        this.shipcertificate2 = shipcertificate2;
        this.servicetype = servicetype;
    }

    public Service() {
        super();
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServiceno() {
        return serviceno;
    }

    public void setServiceno(String serviceno) {
        this.serviceno = serviceno == null ? null : serviceno.trim();
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

    public Integer getSelleruserid() {
        return selleruserid;
    }

    public void setSelleruserid(Integer selleruserid) {
        this.selleruserid = selleruserid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Double getRealpayprices() {
        return realpayprices;
    }

    public void setRealpayprices(Double realpayprices) {
        this.realpayprices = realpayprices;
    }

    public Double getBackprice() {
        return backprice;
    }

    public void setBackprice(Double backprice) {
        this.backprice = backprice;
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

    public Integer getServicestate() {
        return servicestate;
    }

    public void setServicestate(Integer servicestate) {
        this.servicestate = servicestate;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getShipno() {
        return shipno;
    }

    public void setShipno(String shipno) {
        this.shipno = shipno == null ? null : shipno.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneemobilephone() {
        return consigneemobilephone;
    }

    public void setConsigneemobilephone(String consigneemobilephone) {
        this.consigneemobilephone = consigneemobilephone == null ? null : consigneemobilephone.trim();
    }

    public String getConsignetelephone() {
        return consignetelephone;
    }

    public void setConsignetelephone(String consignetelephone) {
        this.consignetelephone = consignetelephone == null ? null : consignetelephone.trim();
    }

    public String getConsignepostcode() {
        return consignepostcode;
    }

    public void setConsignepostcode(String consignepostcode) {
        this.consignepostcode = consignepostcode == null ? null : consignepostcode.trim();
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

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getConsigneeadress() {
        return consigneeadress;
    }

    public void setConsigneeadress(String consigneeadress) {
        this.consigneeadress = consigneeadress == null ? null : consigneeadress.trim();
    }

    public String getShipcertificate() {
        return shipcertificate;
    }

    public void setShipcertificate(String shipcertificate) {
        this.shipcertificate = shipcertificate == null ? null : shipcertificate.trim();
    }

    public String getShipcertificate2() {
        return shipcertificate2;
    }

    public void setShipcertificate2(String shipcertificate2) {
        this.shipcertificate2 = shipcertificate2 == null ? null : shipcertificate2.trim();
    }

    public Integer getServicetype() {
        return servicetype;
    }

    public void setServicetype(Integer servicetype) {
        this.servicetype = servicetype;
    }
}