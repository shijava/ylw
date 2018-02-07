package com.myit.ylw.pojo;

import java.util.Date;

public class Config {
    private Integer pointsuseid;

    private Integer userid;

    private String source;

    private Integer usepoints;

    private Integer isincome;

    private Date addtime;

    private String note;

    public Config(Integer pointsuseid, Integer userid, String source, Integer usepoints, Integer isincome, Date addtime, String note) {
        this.pointsuseid = pointsuseid;
        this.userid = userid;
        this.source = source;
        this.usepoints = usepoints;
        this.isincome = isincome;
        this.addtime = addtime;
        this.note = note;
    }

    public Config() {
        super();
    }

    public Integer getPointsuseid() {
        return pointsuseid;
    }

    public void setPointsuseid(Integer pointsuseid) {
        this.pointsuseid = pointsuseid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getUsepoints() {
        return usepoints;
    }

    public void setUsepoints(Integer usepoints) {
        this.usepoints = usepoints;
    }

    public Integer getIsincome() {
        return isincome;
    }

    public void setIsincome(Integer isincome) {
        this.isincome = isincome;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}