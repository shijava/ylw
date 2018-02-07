package com.myit.ylw.pojo;

import java.util.Date;

public class ExhibitionPosition {
    private Integer exhibitionpositionid;

    private Integer exhibitionhallid;

    private String epname;

    private Integer ltop;

    private Integer lleft;

    private Integer isclose;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer ntop;

    private Integer nleft;

    private String planimg;

    public ExhibitionPosition(Integer exhibitionpositionid, Integer exhibitionhallid, String epname, Integer ltop, Integer lleft, Integer isclose, Integer listid, Integer adminid, Date addtime, Integer ntop, Integer nleft, String planimg) {
        this.exhibitionpositionid = exhibitionpositionid;
        this.exhibitionhallid = exhibitionhallid;
        this.epname = epname;
        this.ltop = ltop;
        this.lleft = lleft;
        this.isclose = isclose;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.ntop = ntop;
        this.nleft = nleft;
        this.planimg = planimg;
    }

    public ExhibitionPosition() {
        super();
    }

    public Integer getExhibitionpositionid() {
        return exhibitionpositionid;
    }

    public void setExhibitionpositionid(Integer exhibitionpositionid) {
        this.exhibitionpositionid = exhibitionpositionid;
    }

    public Integer getExhibitionhallid() {
        return exhibitionhallid;
    }

    public void setExhibitionhallid(Integer exhibitionhallid) {
        this.exhibitionhallid = exhibitionhallid;
    }

    public String getEpname() {
        return epname;
    }

    public void setEpname(String epname) {
        this.epname = epname == null ? null : epname.trim();
    }

    public Integer getLtop() {
        return ltop;
    }

    public void setLtop(Integer ltop) {
        this.ltop = ltop;
    }

    public Integer getLleft() {
        return lleft;
    }

    public void setLleft(Integer lleft) {
        this.lleft = lleft;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
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

    public Integer getNtop() {
        return ntop;
    }

    public void setNtop(Integer ntop) {
        this.ntop = ntop;
    }

    public Integer getNleft() {
        return nleft;
    }

    public void setNleft(Integer nleft) {
        this.nleft = nleft;
    }

    public String getPlanimg() {
        return planimg;
    }

    public void setPlanimg(String planimg) {
        this.planimg = planimg == null ? null : planimg.trim();
    }
}