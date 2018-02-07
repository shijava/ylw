package com.myit.ylw.pojo;

public class PointProductStorage {
    private Integer ppstorageid;

    private Integer pointproductid;

    private String modelname;

    private Integer point;

    private Double price;

    private Integer storage;

    private Integer listid;

    public PointProductStorage(Integer ppstorageid, Integer pointproductid, String modelname, Integer point, Double price, Integer storage, Integer listid) {
        this.ppstorageid = ppstorageid;
        this.pointproductid = pointproductid;
        this.modelname = modelname;
        this.point = point;
        this.price = price;
        this.storage = storage;
        this.listid = listid;
    }

    public PointProductStorage() {
        super();
    }

    public Integer getPpstorageid() {
        return ppstorageid;
    }

    public void setPpstorageid(Integer ppstorageid) {
        this.ppstorageid = ppstorageid;
    }

    public Integer getPointproductid() {
        return pointproductid;
    }

    public void setPointproductid(Integer pointproductid) {
        this.pointproductid = pointproductid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
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

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }
}