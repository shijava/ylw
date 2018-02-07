package com.myit.ylw.pojo;

import java.util.Date;

public class Video {
    private Integer videoid;

    private Integer classid;

    private String videoname;

    private String videopic;

    private String videopath;

    private String keywords;

    private String description;

    private String details;

    private Integer isrecommend;

    private Integer clicknum;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public Video(Integer videoid, Integer classid, String videoname, String videopic, String videopath, String keywords, String description, String details, Integer isrecommend, Integer clicknum, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.videoid = videoid;
        this.classid = classid;
        this.videoname = videoname;
        this.videopic = videopic;
        this.videopath = videopath;
        this.keywords = keywords;
        this.description = description;
        this.details = details;
        this.isrecommend = isrecommend;
        this.clicknum = clicknum;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public Video() {
        super();
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideopic() {
        return videopic;
    }

    public void setVideopic(String videopic) {
        this.videopic = videopic == null ? null : videopic.trim();
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath == null ? null : videopath.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
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

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }
}