package com.myit.ylw.pojo;

import java.util.Date;

public class PointProduct {
    private Integer pointproductid;

    private Integer classid;

    private String pname;

    private Integer point;

    private Double price;

    private String smallpic;

    private String details;

    private Integer isrecommend;

    private Integer clicknum;

    private Integer listid;

    private Integer isclose;

    private Integer storage;

    private Integer salesvolume;

    private Integer adminid;

    private Date addtime;

    public PointProduct(Integer pointproductid, Integer classid, String pname, Integer point, Double price, String smallpic, String details, Integer isrecommend, Integer clicknum, Integer listid, Integer isclose, Integer storage, Integer salesvolume, Integer adminid, Date addtime) {
        this.pointproductid = pointproductid;
        this.classid = classid;
        this.pname = pname;
        this.point = point;
        this.price = price;
        this.smallpic = smallpic;
        this.details = details;
        this.isrecommend = isrecommend;
        this.clicknum = clicknum;
        this.listid = listid;
        this.isclose = isclose;
        this.storage = storage;
        this.salesvolume = salesvolume;
        this.adminid = adminid;
        this.addtime = addtime;
    }

    public PointProduct() {
        super();
    }

    public Integer getPointproductid() {
        return pointproductid;
    }

    public void setPointproductid(Integer pointproductid) {
        this.pointproductid = pointproductid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic == null ? null : smallpic.trim();
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

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
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
}