package com.myit.ylw.pojo;

public class PayConfig {
    private Integer payid;

    private String interfacename;

    private String receivingPartner;

    private String receivingKey;

    private String receivingSellerEmail;

    private String payPartner;

    private String payKey;

    private String payEmailPay;

    private String accountNamePay;

    private String note;

    public PayConfig(Integer payid, String interfacename, String receivingPartner, String receivingKey, String receivingSellerEmail, String payPartner, String payKey, String payEmailPay, String accountNamePay, String note) {
        this.payid = payid;
        this.interfacename = interfacename;
        this.receivingPartner = receivingPartner;
        this.receivingKey = receivingKey;
        this.receivingSellerEmail = receivingSellerEmail;
        this.payPartner = payPartner;
        this.payKey = payKey;
        this.payEmailPay = payEmailPay;
        this.accountNamePay = accountNamePay;
        this.note = note;
    }

    public PayConfig() {
        super();
    }

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    public String getReceivingPartner() {
        return receivingPartner;
    }

    public void setReceivingPartner(String receivingPartner) {
        this.receivingPartner = receivingPartner == null ? null : receivingPartner.trim();
    }

    public String getReceivingKey() {
        return receivingKey;
    }

    public void setReceivingKey(String receivingKey) {
        this.receivingKey = receivingKey == null ? null : receivingKey.trim();
    }

    public String getReceivingSellerEmail() {
        return receivingSellerEmail;
    }

    public void setReceivingSellerEmail(String receivingSellerEmail) {
        this.receivingSellerEmail = receivingSellerEmail == null ? null : receivingSellerEmail.trim();
    }

    public String getPayPartner() {
        return payPartner;
    }

    public void setPayPartner(String payPartner) {
        this.payPartner = payPartner == null ? null : payPartner.trim();
    }

    public String getPayKey() {
        return payKey;
    }

    public void setPayKey(String payKey) {
        this.payKey = payKey == null ? null : payKey.trim();
    }

    public String getPayEmailPay() {
        return payEmailPay;
    }

    public void setPayEmailPay(String payEmailPay) {
        this.payEmailPay = payEmailPay == null ? null : payEmailPay.trim();
    }

    public String getAccountNamePay() {
        return accountNamePay;
    }

    public void setAccountNamePay(String accountNamePay) {
        this.accountNamePay = accountNamePay == null ? null : accountNamePay.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}