package com.myit.ylw.pojo;

import java.util.Date;

public class UserRank {
    private Integer userrankid;

    private String userrankname;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public UserRank(Integer userrankid, String userrankname, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.userrankid = userrankid;
        this.userrankname = userrankname;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public UserRank() {
        super();
    }

    public Integer getUserrankid() {
        return userrankid;
    }

    public void setUserrankid(Integer userrankid) {
        this.userrankid = userrankid;
    }

    public String getUserrankname() {
        return userrankname;
    }

    public void setUserrankname(String userrankname) {
        this.userrankname = userrankname == null ? null : userrankname.trim();
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