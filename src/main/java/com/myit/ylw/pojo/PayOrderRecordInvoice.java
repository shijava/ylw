package com.myit.ylw.pojo;

import java.util.Date;

public class PayOrderRecordInvoice {
    private Integer invoiceid;

    private Integer payorderrecordid;

    private String payorderrecordno;

    private String invoiceno;

    private Double invoiceprice;

    private Integer adminid;

    private Date addtime;

    public PayOrderRecordInvoice(Integer invoiceid, Integer payorderrecordid, String payorderrecordno, String invoiceno, Double invoiceprice, Integer adminid, Date addtime) {
        this.invoiceid = invoiceid;
        this.payorderrecordid = payorderrecordid;
        this.payorderrecordno = payorderrecordno;
        this.invoiceno = invoiceno;
        this.invoiceprice = invoiceprice;
        this.adminid = adminid;
        this.addtime = addtime;
    }

    public PayOrderRecordInvoice() {
        super();
    }

    public Integer getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    public Integer getPayorderrecordid() {
        return payorderrecordid;
    }

    public void setPayorderrecordid(Integer payorderrecordid) {
        this.payorderrecordid = payorderrecordid;
    }

    public String getPayorderrecordno() {
        return payorderrecordno;
    }

    public void setPayorderrecordno(String payorderrecordno) {
        this.payorderrecordno = payorderrecordno == null ? null : payorderrecordno.trim();
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }

    public Double getInvoiceprice() {
        return invoiceprice;
    }

    public void setInvoiceprice(Double invoiceprice) {
        this.invoiceprice = invoiceprice;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}