package com.myit.ylw.pojo;

import java.util.Date;

public class Link {
    private Integer linkid;

    private Integer configid;

    private Integer typeid;

    private String sitename;

    private String siteurl;

    private String logourl;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public Link(Integer linkid, Integer configid, Integer typeid, String sitename, String siteurl, String logourl, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.linkid = linkid;
        this.configid = configid;
        this.typeid = typeid;
        this.sitename = sitename;
        this.siteurl = siteurl;
        this.logourl = logourl;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public Link() {
        super();
    }

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public Integer getConfigid() {
        return configid;
    }

    public void setConfigid(Integer configid) {
        this.configid = configid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl == null ? null : siteurl.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
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