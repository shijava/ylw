package com.myit.ylw.pojo;

import java.util.Date;

public class ExhibitionHall {
    private Integer exhibitionhallid;

    private String exname;

    private Integer ltop;

    private Integer lleft;

    private Integer atop;

    private Integer aleft;

    private Integer positionnum;

    private Integer isclose;

    private Integer adminid;

    private Date addtime;

    private Integer listid;

    public ExhibitionHall(Integer exhibitionhallid, String exname, Integer ltop, Integer lleft, Integer atop, Integer aleft, Integer positionnum, Integer isclose, Integer adminid, Date addtime, Integer listid) {
        this.exhibitionhallid = exhibitionhallid;
        this.exname = exname;
        this.ltop = ltop;
        this.lleft = lleft;
        this.atop = atop;
        this.aleft = aleft;
        this.positionnum = positionnum;
        this.isclose = isclose;
        this.adminid = adminid;
        this.addtime = addtime;
        this.listid = listid;
    }

    public ExhibitionHall() {
        super();
    }

    public Integer getExhibitionhallid() {
        return exhibitionhallid;
    }

    public void setExhibitionhallid(Integer exhibitionhallid) {
        this.exhibitionhallid = exhibitionhallid;
    }

    public String getExname() {
        return exname;
    }

    public void setExname(String exname) {
        this.exname = exname == null ? null : exname.trim();
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

    public Integer getAtop() {
        return atop;
    }

    public void setAtop(Integer atop) {
        this.atop = atop;
    }

    public Integer getAleft() {
        return aleft;
    }

    public void setAleft(Integer aleft) {
        this.aleft = aleft;
    }

    public Integer getPositionnum() {
        return positionnum;
    }

    public void setPositionnum(Integer positionnum) {
        this.positionnum = positionnum;
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