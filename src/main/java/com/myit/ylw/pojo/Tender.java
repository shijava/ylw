package com.myit.ylw.pojo;

import java.util.Date;

public class Tender {
    private Integer tenderid;

    private Integer userid;

    private Integer quantity;

    private Integer iscustommade;

    private Integer deliverydays;

    private Integer invoicetype;

    private Integer province;

    private Integer city;

    private Integer district;

    private Date begintime;

    private Date endtime;

    private String contact;

    private String mobilephone;

    private Integer tenderstatus;

    private Integer isaudit;

    private Integer isclose;

    private Date addtime;

    private Integer adminid;

    private Integer listid;

    public Tender(Integer tenderid, Integer userid, Integer quantity, Integer iscustommade, Integer deliverydays, Integer invoicetype, Integer province, Integer city, Integer district, Date begintime, Date endtime, String contact, String mobilephone, Integer tenderstatus, Integer isaudit, Integer isclose, Date addtime, Integer adminid, Integer listid) {
        this.tenderid = tenderid;
        this.userid = userid;
        this.quantity = quantity;
        this.iscustommade = iscustommade;
        this.deliverydays = deliverydays;
        this.invoicetype = invoicetype;
        this.province = province;
        this.city = city;
        this.district = district;
        this.begintime = begintime;
        this.endtime = endtime;
        this.contact = contact;
        this.mobilephone = mobilephone;
        this.tenderstatus = tenderstatus;
        this.isaudit = isaudit;
        this.isclose = isclose;
        this.addtime = addtime;
        this.adminid = adminid;
        this.listid = listid;
    }

    public Tender() {
        super();
    }

    public Integer getTenderid() {
        return tenderid;
    }

    public void setTenderid(Integer tenderid) {
        this.tenderid = tenderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getIscustommade() {
        return iscustommade;
    }

    public void setIscustommade(Integer iscustommade) {
        this.iscustommade = iscustommade;
    }

    public Integer getDeliverydays() {
        return deliverydays;
    }

    public void setDeliverydays(Integer deliverydays) {
        this.deliverydays = deliverydays;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Integer getTenderstatus() {
        return tenderstatus;
    }

    public void setTenderstatus(Integer tenderstatus) {
        this.tenderstatus = tenderstatus;
    }

    public Integer getIsaudit() {
        return isaudit;
    }

    public void setIsaudit(Integer isaudit) {
        this.isaudit = isaudit;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
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

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }
}