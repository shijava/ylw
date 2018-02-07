package com.myit.ylw.pojo;

public class Freight {
    private Integer freightid;

    private Integer productid;

    private Integer beginnum;

    private Integer endnum;

    private Double price;

    public Freight(Integer freightid, Integer productid, Integer beginnum, Integer endnum, Double price) {
        this.freightid = freightid;
        this.productid = productid;
        this.beginnum = beginnum;
        this.endnum = endnum;
        this.price = price;
    }

    public Freight() {
        super();
    }

    public Integer getFreightid() {
        return freightid;
    }

    public void setFreightid(Integer freightid) {
        this.freightid = freightid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}