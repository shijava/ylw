package com.myit.ylw.pojo;

import java.util.Date;

public class Order {
    private Integer orderid;

    private String orderno;

    private Integer userid;

    private Integer shopid;

    private Date orderdatetime;

    private Date orderdateedittime;

    private String consignee;

    private String consignepostcode;

    private String consignetelephone;

    private String consigneemobilephone;

    private Integer provinceid;

    private Integer cityid;

    private Integer district;

    private String consigneeadress;

    private Integer paymethodsid;

    private String shipname;

    private String shipno;

    private String shipcertificate;

    private Integer orderstate;

    private Integer servicestate;

    private Integer ordertype;

    private Double shipprice;

    private Date shipdatetime;

    private Double orderprices;

    private Double realpayprices;

    private Integer points;

    private Integer donatepoints;

    private Integer iscomment;

    private Integer parentid;

    private String dzPayorderrecordno;

    private Double dzPointpricetotal;

    private Double dzRealpaypricetotal;

    private Date dzRealpaytime;

    private Integer isdz;

    public Order(Integer orderid, String orderno, Integer userid, Integer shopid, Date orderdatetime, Date orderdateedittime, String consignee, String consignepostcode, String consignetelephone, String consigneemobilephone, Integer provinceid, Integer cityid, Integer district, String consigneeadress, Integer paymethodsid, String shipname, String shipno, String shipcertificate, Integer orderstate, Integer servicestate, Integer ordertype, Double shipprice, Date shipdatetime, Double orderprices, Double realpayprices, Integer points, Integer donatepoints, Integer iscomment, Integer parentid, String dzPayorderrecordno, Double dzPointpricetotal, Double dzRealpaypricetotal, Date dzRealpaytime, Integer isdz) {
        this.orderid = orderid;
        this.orderno = orderno;
        this.userid = userid;
        this.shopid = shopid;
        this.orderdatetime = orderdatetime;
        this.orderdateedittime = orderdateedittime;
        this.consignee = consignee;
        this.consignepostcode = consignepostcode;
        this.consignetelephone = consignetelephone;
        this.consigneemobilephone = consigneemobilephone;
        this.provinceid = provinceid;
        this.cityid = cityid;
        this.district = district;
        this.consigneeadress = consigneeadress;
        this.paymethodsid = paymethodsid;
        this.shipname = shipname;
        this.shipno = shipno;
        this.shipcertificate = shipcertificate;
        this.orderstate = orderstate;
        this.servicestate = servicestate;
        this.ordertype = ordertype;
        this.shipprice = shipprice;
        this.shipdatetime = shipdatetime;
        this.orderprices = orderprices;
        this.realpayprices = realpayprices;
        this.points = points;
        this.donatepoints = donatepoints;
        this.iscomment = iscomment;
        this.parentid = parentid;
        this.dzPayorderrecordno = dzPayorderrecordno;
        this.dzPointpricetotal = dzPointpricetotal;
        this.dzRealpaypricetotal = dzRealpaypricetotal;
        this.dzRealpaytime = dzRealpaytime;
        this.isdz = isdz;
    }

    public Order() {
        super();
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

    public Date getOrderdatetime() {
        return orderdatetime;
    }

    public void setOrderdatetime(Date orderdatetime) {
        this.orderdatetime = orderdatetime;
    }

    public Date getOrderdateedittime() {
        return orderdateedittime;
    }

    public void setOrderdateedittime(Date orderdateedittime) {
        this.orderdateedittime = orderdateedittime;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsignepostcode() {
        return consignepostcode;
    }

    public void setConsignepostcode(String consignepostcode) {
        this.consignepostcode = consignepostcode == null ? null : consignepostcode.trim();
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

    public Integer getPaymethodsid() {
        return paymethodsid;
    }

    public void setPaymethodsid(Integer paymethodsid) {
        this.paymethodsid = paymethodsid;
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

    public Integer getServicestate() {
        return servicestate;
    }

    public void setServicestate(Integer servicestate) {
        this.servicestate = servicestate;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public Double getShipprice() {
        return shipprice;
    }

    public void setShipprice(Double shipprice) {
        this.shipprice = shipprice;
    }

    public Date getShipdatetime() {
        return shipdatetime;
    }

    public void setShipdatetime(Date shipdatetime) {
        this.shipdatetime = shipdatetime;
    }

    public Double getOrderprices() {
        return orderprices;
    }

    public void setOrderprices(Double orderprices) {
        this.orderprices = orderprices;
    }

    public Double getRealpayprices() {
        return realpayprices;
    }

    public void setRealpayprices(Double realpayprices) {
        this.realpayprices = realpayprices;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getDonatepoints() {
        return donatepoints;
    }

    public void setDonatepoints(Integer donatepoints) {
        this.donatepoints = donatepoints;
    }

    public Integer getIscomment() {
        return iscomment;
    }

    public void setIscomment(Integer iscomment) {
        this.iscomment = iscomment;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getDzPayorderrecordno() {
        return dzPayorderrecordno;
    }

    public void setDzPayorderrecordno(String dzPayorderrecordno) {
        this.dzPayorderrecordno = dzPayorderrecordno == null ? null : dzPayorderrecordno.trim();
    }

    public Double getDzPointpricetotal() {
        return dzPointpricetotal;
    }

    public void setDzPointpricetotal(Double dzPointpricetotal) {
        this.dzPointpricetotal = dzPointpricetotal;
    }

    public Double getDzRealpaypricetotal() {
        return dzRealpaypricetotal;
    }

    public void setDzRealpaypricetotal(Double dzRealpaypricetotal) {
        this.dzRealpaypricetotal = dzRealpaypricetotal;
    }

    public Date getDzRealpaytime() {
        return dzRealpaytime;
    }

    public void setDzRealpaytime(Date dzRealpaytime) {
        this.dzRealpaytime = dzRealpaytime;
    }

    public Integer getIsdz() {
        return isdz;
    }

    public void setIsdz(Integer isdz) {
        this.isdz = isdz;
    }
}