package com.myit.ylw.pojo;

public class Price {
    private Integer priceid;

    private Integer storageid;

    private Integer beginnum;

    private Integer endnum;

    private Integer isincludeendnum;

    private Integer ismaxvalue;

    private Double price;

    public Price(Integer priceid, Integer storageid, Integer beginnum, Integer endnum, Integer isincludeendnum, Integer ismaxvalue, Double price) {
        this.priceid = priceid;
        this.storageid = storageid;
        this.beginnum = beginnum;
        this.endnum = endnum;
        this.isincludeendnum = isincludeendnum;
        this.ismaxvalue = ismaxvalue;
        this.price = price;
    }

    public Price() {
        super();
    }

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
        this.priceid = priceid;
    }

    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
        this.storageid = storageid;
    }

    public Integer getBeginnum() {
        return beginnum;
    }

    public void setBeginnum(Integer beginnum) {
        this.beginnum = beginnum;
    }

    public Integer getEndnum() {
        return endnum;
    }

    public void setEndnum(Integer endnum) {
        this.endnum = endnum;
    }

    public Integer getIsincludeendnum() {
        return isincludeendnum;
    }

    public void setIsincludeendnum(Integer isincludeendnum) {
        this.isincludeendnum = isincludeendnum;
    }

    public Integer getIsmaxvalue() {
        return ismaxvalue;
    }

    public void setIsmaxvalue(Integer ismaxvalue) {
        this.ismaxvalue = ismaxvalue;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}