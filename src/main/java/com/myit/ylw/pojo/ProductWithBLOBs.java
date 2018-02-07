package com.myit.ylw.pojo;

public class ProductWithBLOBs extends Product {
    private String brandname;

    private String shopUrl;

    private String clickUrl;

    private String detailsUrl;

    public ProductWithBLOBs(Integer productid, Integer classid, String productname, String smallpic, String bigpic, String keywords, String description, String details, Integer isrecommend, Integer clicknum, Integer listid, Integer adminid, Date addtime, Integer isclose, Integer initisclose, Integer materialtype, String technics, String productno, Integer surfacetechnics, Integer utensilsdesign, Integer construction, Integer modeling, Integer packaging, Integer isprintlogin, String giftgivingoccasion, String giftcategory, String giftpurposes, String giftstyle, String giftobject, Integer iscustommade, Double price, Integer point, Integer storecategoryid, Integer isnoreasonreturn, Integer province, Integer city, Integer district, Integer isuserrecommend, Integer userrecommendlistid, Integer commentscore, Integer commentnum, Integer consultnum, Integer collectnum, Integer shopid, Integer storage, Integer salesvolume, Integer isputaway, Date putawaytime, Integer islocalfeaturesgifts, Date gaddtime, Integer gisaudit, Integer gprovince, Integer gcity, Integer gdistrict, Integer pricerange, Double pointpercent, Integer giftpricerange, Integer trendygiftrecommend, String adpic, Integer fromtype, String sellernick, String brandname, String shopUrl, String clickUrl, String detailsUrl) {
        super(productid, classid, productname, smallpic, bigpic, keywords, description, details, isrecommend, clicknum, listid, adminid, addtime, isclose, initisclose, materialtype, technics, productno, surfacetechnics, utensilsdesign, construction, modeling, packaging, isprintlogin, giftgivingoccasion, giftcategory, giftpurposes, giftstyle, giftobject, iscustommade, price, point, storecategoryid, isnoreasonreturn, province, city, district, isuserrecommend, userrecommendlistid, commentscore, commentnum, consultnum, collectnum, shopid, storage, salesvolume, isputaway, putawaytime, islocalfeaturesgifts, gaddtime, gisaudit, gprovince, gcity, gdistrict, pricerange, pointpercent, giftpricerange, trendygiftrecommend, adpic, fromtype, sellernick);
        this.brandname = brandname;
        this.shopUrl = shopUrl;
        this.clickUrl = clickUrl;
        this.detailsUrl = detailsUrl;
    }

    public ProductWithBLOBs() {
        super();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl == null ? null : shopUrl.trim();
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl == null ? null : clickUrl.trim();
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl == null ? null : detailsUrl.trim();
    }
}