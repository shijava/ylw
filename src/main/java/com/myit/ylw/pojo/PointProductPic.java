package com.myit.ylw.pojo;

import java.util.Date;

public class PointProductPic {
    private Integer ppicid;

    private Integer pointproductid;

    private String smallpic;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public PointProductPic(Integer ppicid, Integer pointproductid, String smallpic, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.ppicid = ppicid;
        this.pointproductid = pointproductid;
        this.smallpic = smallpic;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public PointProductPic() {
        super();
    }

    public Integer getPpicid() {
        return ppicid;
    }

    public void setPpicid(Integer ppicid) {
        this.ppicid = ppicid;
    }

    public Integer getPointproductid() {
        return pointproductid;
    }

    public void setPointproductid(Integer pointproductid) {
        this.pointproductid = pointproductid;
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic == null ? null : smallpic.trim();
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