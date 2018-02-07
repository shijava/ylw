package com.myit.ylw.pojo;

import java.util.Date;

public class Dictionary {
    private Integer dictionaryid;

    private String dictionaryname;

    private Integer parentid;

    private Integer childnum;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    private Integer classid;

    private String dictionaryvalue;

    private String dictionaryimg;

    public Dictionary(Integer dictionaryid, String dictionaryname, Integer parentid, Integer childnum, Integer listid, Integer adminid, Date addtime, Integer isclose, Integer classid, String dictionaryvalue, String dictionaryimg) {
        this.dictionaryid = dictionaryid;
        this.dictionaryname = dictionaryname;
        this.parentid = parentid;
        this.childnum = childnum;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.classid = classid;
        this.dictionaryvalue = dictionaryvalue;
        this.dictionaryimg = dictionaryimg;
    }

    public Dictionary() {
        super();
    }

    public Integer getDictionaryid() {
        return dictionaryid;
    }

    public void setDictionaryid(Integer dictionaryid) {
        this.dictionaryid = dictionaryid;
    }

    public String getDictionaryname() {
        return dictionaryname;
    }

    public void setDictionaryname(String dictionaryname) {
        this.dictionaryname = dictionaryname == null ? null : dictionaryname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
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

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getDictionaryvalue() {
        return dictionaryvalue;
    }

    public void setDictionaryvalue(String dictionaryvalue) {
        this.dictionaryvalue = dictionaryvalue == null ? null : dictionaryvalue.trim();
    }

    public String getDictionaryimg() {
        return dictionaryimg;
    }

    public void setDictionaryimg(String dictionaryimg) {
        this.dictionaryimg = dictionaryimg == null ? null : dictionaryimg.trim();
    }
}