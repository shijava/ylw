package com.myit.ylw.pojo;

public class PointProductOrderGoods {
    private Integer ppordergoodsid;

    private Integer pporderid;

    private String pporderno;

    private Integer pointproductid;

    private Integer ppstorageid;

    private String pname;

    private String modelname;

    private Integer point;

    private Integer quantity;

    private Double price;

    public PointProductOrderGoods(Integer ppordergoodsid, Integer pporderid, String pporderno, Integer pointproductid, Integer ppstorageid, String pname, String modelname, Integer point, Integer quantity, Double price) {
        this.ppordergoodsid = ppordergoodsid;
        this.pporderid = pporderid;
        this.pporderno = pporderno;
        this.pointproductid = pointproductid;
        this.ppstorageid = ppstorageid;
        this.pname = pname;
        this.modelname = modelname;
        this.point = point;
        this.quantity = quantity;
        this.price = price;
    }

    public PointProductOrderGoods() {
        super();
    }

    public Integer getPpordergoodsid() {
        return ppordergoodsid;
    }

    public void setPpordergoodsid(Integer ppordergoodsid) {
        this.ppordergoodsid = ppordergoodsid;
    }

    public Integer getPporderid() {
        return pporderid;
    }

    public void setPporderid(Integer pporderid) {
        this.pporderid = pporderid;
    }

    public String getPporderno() {
        return pporderno;
    }

    public void setPporderno(String pporderno) {
        this.pporderno = pporderno == null ? null : pporderno.trim();
    }

    public Integer getPointproductid() {
        return pointproductid;
    }

    public void setPointproductid(Integer pointproductid) {
        this.pointproductid = pointproductid;
    }

    public Integer getPpstorageid() {
        return ppstorageid;
    }

    public void setPpstorageid(Integer ppstorageid) {
        this.ppstorageid = ppstorageid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}