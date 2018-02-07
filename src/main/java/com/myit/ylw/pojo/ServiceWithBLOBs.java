package com.myit.ylw.pojo;

public class ServiceWithBLOBs extends Service {
    private String productname;

    private String buyerbackreson;

    private String sellerrefusereson;

    private String ylwrefusereson;

    public ServiceWithBLOBs(Integer serviceid, String serviceno, Integer orderid, String orderno, Integer selleruserid, String userid, Double realpayprices, Double backprice, Date addtime, Date edittime, Integer servicestate, String shipname, String shipno, String consignee, String consigneemobilephone, String consignetelephone, String consignepostcode, Integer provinceid, Integer cityid, Integer district, String consigneeadress, String shipcertificate, String shipcertificate2, Integer servicetype, String productname, String buyerbackreson, String sellerrefusereson, String ylwrefusereson) {
        super(serviceid, serviceno, orderid, orderno, selleruserid, userid, realpayprices, backprice, addtime, edittime, servicestate, shipname, shipno, consignee, consigneemobilephone, consignetelephone, consignepostcode, provinceid, cityid, district, consigneeadress, shipcertificate, shipcertificate2, servicetype);
        this.productname = productname;
        this.buyerbackreson = buyerbackreson;
        this.sellerrefusereson = sellerrefusereson;
        this.ylwrefusereson = ylwrefusereson;
    }

    public ServiceWithBLOBs() {
        super();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getBuyerbackreson() {
        return buyerbackreson;
    }

    public void setBuyerbackreson(String buyerbackreson) {
        this.buyerbackreson = buyerbackreson == null ? null : buyerbackreson.trim();
    }

    public String getSellerrefusereson() {
        return sellerrefusereson;
    }

    public void setSellerrefusereson(String sellerrefusereson) {
        this.sellerrefusereson = sellerrefusereson == null ? null : sellerrefusereson.trim();
    }

    public String getYlwrefusereson() {
        return ylwrefusereson;
    }

    public void setYlwrefusereson(String ylwrefusereson) {
        this.ylwrefusereson = ylwrefusereson == null ? null : ylwrefusereson.trim();
    }
}