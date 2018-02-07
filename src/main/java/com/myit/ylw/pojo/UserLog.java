package com.myit.ylw.pojo;

import java.util.Date;

public class UserLog {
    private Integer userlogid;

    private String logcontent;

    private String scriptfile;

    private String ipaddress;

    private Integer userid;

    private Date addtime;

    public UserLog(Integer userlogid, String logcontent, String scriptfile, String ipaddress, Integer userid, Date addtime) {
        this.userlogid = userlogid;
        this.logcontent = logcontent;
        this.scriptfile = scriptfile;
        this.ipaddress = ipaddress;
        this.userid = userid;
        this.addtime = addtime;
    }

    public UserLog() {
        super();
    }

    public Integer getUserlogid() {
        return userlogid;
    }

    public void setUserlogid(Integer userlogid) {
        this.userlogid = userlogid;
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent == null ? null : logcontent.trim();
    }

    public String getScriptfile() {
        return scriptfile;
    }

    public void setScriptfile(String scriptfile) {
        this.scriptfile = scriptfile == null ? null : scriptfile.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}