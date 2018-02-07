package com.myit.ylw.pojo;

import java.util.Date;

public class GiftsReComment {
    private Integer giftsrecommentid;

    private Integer featuresgiftsareaid;

    private String giftsrecommentname;

    private Integer province;

    private Integer city;

    private String picpath;

    private Integer isrecommend;

    private Integer isclose;

    private Integer adminid;

    private Date addtime;

    private Integer listid;

    public GiftsReComment(Integer giftsrecommentid, Integer featuresgiftsareaid, String giftsrecommentname, Integer province, Integer city, String picpath, Integer isrecommend, Integer isclose, Integer adminid, Date addtime, Integer listid) {
        this.giftsrecommentid = giftsrecommentid;
        this.featuresgiftsareaid = featuresgiftsareaid;
        this.giftsrecommentname = giftsrecommentname;
        this.province = province;
        this.city = city;
        this.picpath = picpath;
        this.isrecommend = isrecommend;
        this.isclose = isclose;
        this.adminid = adminid;
        this.addtime = addtime;
        this.listid = listid;
    }

    public GiftsReComment() {
        super();
    }

    public Integer getGiftsrecommentid() {
        return giftsrecommentid;
    }

    public void setGiftsrecommentid(Integer giftsrecommentid) {
        this.giftsrecommentid = giftsrecommentid;
    }

    public Integer getFeaturesgiftsareaid() {
        return featuresgiftsareaid;
    }

    public void setFeaturesgiftsareaid(Integer featuresgiftsareaid) {
        this.featuresgiftsareaid = featuresgiftsareaid;
    }

    public String getGiftsrecommentname() {
        return giftsrecommentname;
    }

    public void setGiftsrecommentname(String giftsrecommentname) {
        this.giftsrecommentname = giftsrecommentname == null ? null : giftsrecommentname.trim();
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

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
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

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }
}