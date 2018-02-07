package com.myit.ylw.pojo;

import java.util.Date;

public class SendMsg {
    private Integer sendmsgid;

    private String phone;

    private String code;

    private Date addtime;

    private String usetype;

    private String phonemsgcontent;

    public SendMsg(Integer sendmsgid, String phone, String code, Date addtime, String usetype, String phonemsgcontent) {
        this.sendmsgid = sendmsgid;
        this.phone = phone;
        this.code = code;
        this.addtime = addtime;
        this.usetype = usetype;
        this.phonemsgcontent = phonemsgcontent;
    }

    public SendMsg() {
        super();
    }

    public Integer getSendmsgid() {
        return sendmsgid;
    }

    public void setSendmsgid(Integer sendmsgid) {
        this.sendmsgid = sendmsgid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype == null ? null : usetype.trim();
    }

    public String getPhonemsgcontent() {
        return phonemsgcontent;
    }

    public void setPhonemsgcontent(String phonemsgcontent) {
        this.phonemsgcontent = phonemsgcontent == null ? null : phonemsgcontent.trim();
    }
}