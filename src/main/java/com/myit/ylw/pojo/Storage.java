package com.myit.ylw.pojo;

public class Storage {
    private Integer storageid;

    private Integer productid;

    private String modelname;

    private String unit;

    private Integer storage;

    private Integer listid;

    public Storage(Integer storageid, Integer productid, String modelname, String unit, Integer storage, Integer listid) {
        this.storageid = storageid;
        this.productid = productid;
        this.modelname = modelname;
        this.unit = unit;
        this.storage = storage;
        this.listid = listid;
    }

    public Storage() {
        super();
    }

    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
        this.storageid = storageid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
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