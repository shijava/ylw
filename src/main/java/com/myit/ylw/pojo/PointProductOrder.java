package com.myit.ylw.pojo;

import java.util.Date;

public class PointProductOrder {
    private Integer pporderid;

    private String pporderno;

    private Integer userid;

    private Date orderdatetime;

    private String consignee;

    private String consignetelephone;

    private String consigneemobilephone;

    private Integer provinceid;

    private Integer cityid;

    private Integer district;

    private String consigneeadress;

    private String shipname;

    private String shipno;

    private String shipcertificate;

    private Integer orderstate;

    private Integer points;

    private String remark;

    private Double totalprice;

    public PointProductOrder(Integer pporderid, String pporderno, Integer userid, Date orderdatetime, String consignee, String consignetelephone, String consigneemobilephone, Integer provinceid, Integer cityid, Integer district, String consigneeadress, String shipname, String shipno, String shipcertificate, Integer orderstate, Integer points, String remark, Double totalprice) {
        this.pporderid = pporderid;
        this.pporderno = pporderno;
        this.userid = userid;
        this.orderdatetime = orderdatetime;
        this.consignee = consignee;
        this.consignetelephone = consignetelephone;
        this.consigneemobilephone = consigneemobilephone;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.district = district;
        this.consigneeadress = consigneeadress;
        this.shipname = shipname;
        this.shipno = shipno;
        this.shipcertificate = shipcertificate;
        this.orderstate = orderstate;
        this.points = points;
        this.remark = remark;
        this.totalprice = totalprice;
    }

    public PointProductOrder() {
        super();
    }

    public Integer getPporderid() {
        return pporderid;
    }

    public void setPporderid(Integer pporderid) {
        this.pporderid = pporderid;
    }

    public String getPporderno() {
        return pporderno;
    }

    public void setPporderno(String pporderno) {
        this.pporderno = pporderno == null ? null : pporderno.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOrderdatetime() {
        return orderdatetime;
    }

    public void setOrderdatetime(Date orderdatetime) {
        this.orderdatetime = orderdatetime;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsignetelephone() {
        return consignetelephone;
    }

    public void setConsignetelephone(String consignetelephone) {
        this.consignetelephone = consignetelephone == null ? null : consignetelephone.trim();
    }

    public String getConsigneemobilephone() {
        return consigneemobilephone;
    }

    public void setConsigneemobilephone(String consigneemobilephone) {
        this.consigneemobilephone = consigneemobilephone == null ? null : consigneemobilephone.trim();
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

    public String getShipcertificate() {
        return shipcertificate;
    }

    public void setShipcertificate(String shipcertificate) {
        this.shipcertificate = shipcertificate == null ? null : shipcertificate.trim();
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }
}