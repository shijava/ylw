package com.myit.ylw.pojo;

import java.util.Date;

public class Download {
    private Integer downloadid;

    private Integer classid;

    private String downname;

    private String downpic;

    private String downurl;

    private Double downsize;

    private String keywords;

    private String description;

    private String details;

    private Integer isrecommend;

    private Integer clicknum;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public Download(Integer downloadid, Integer classid, String downname, String downpic, String downurl, Double downsize, String keywords, String description, String details, Integer isrecommend, Integer clicknum, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.downloadid = downloadid;
        this.classid = classid;
        this.downname = downname;
        this.downpic = downpic;
        this.downurl = downurl;
        this.downsize = downsize;
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

    public Download() {
        super();
    }

    public Integer getDownloadid() {
        return downloadid;
    }

    public void setDownloadid(Integer downloadid) {
        this.downloadid = downloadid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getDownname() {
        return downname;
    }

    public void setDownname(String downname) {
        this.downname = downname == null ? null : downname.trim();
    }

    public String getDownpic() {
        return downpic;
    }

    public void setDownpic(String downpic) {
        this.downpic = downpic == null ? null : downpic.trim();
    }

    public String getDownurl() {
        return downurl;
    }

    public void setDownurl(String downurl) {
        this.downurl = downurl == null ? null : downurl.trim();
    }

    public Double getDownsize() {
        return downsize;
    }

    public void setDownsize(Double downsize) {
        this.downsize = downsize;
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