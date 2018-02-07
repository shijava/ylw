package com.myit.ylw.pojo;

import java.util.Date;

public class Product {
    private Integer productid;

    private Integer classid;

    private String productname;

    private String smallpic;

    private String bigpic;

    private String keywords;

    private String description;

    private String details;

    private Integer isrecommend;

    private Integer clicknum;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    private Integer initisclose;

    private Integer materialtype;

    private String technics;

    private String productno;

    private Integer surfacetechnics;

    private Integer utensilsdesign;

    private Integer construction;

    private Integer modeling;

    private Integer packaging;

    private Integer isprintlogin;

    private String giftgivingoccasion;

    private String giftcategory;

    private String giftpurposes;

    private String giftstyle;

    private String giftobject;

    private Integer iscustommade;

    private Double price;

    private Integer point;

    private Integer storecategoryid;

    private Integer isnoreasonreturn;

    private Integer province;

    private Integer city;

    private Integer district;

    private Integer isuserrecommend;

    private Integer userrecommendlistid;

    private Integer commentscore;

    private Integer commentnum;

    private Integer consultnum;

    private Integer collectnum;

    private Integer shopid;

    private Integer storage;

    private Integer salesvolume;

    private Integer isputaway;

    private Date putawaytime;

    private Integer islocalfeaturesgifts;

    private Date gaddtime;

    private Integer gisaudit;

    private Integer gprovince;

    private Integer gcity;

    private Integer gdistrict;

    private Integer pricerange;

    private Double pointpercent;

    private Integer giftpricerange;

    private Integer trendygiftrecommend;

    private String adpic;

    private Integer fromtype;

    private String sellernick;

    public Product(Integer productid, Integer classid, String productname, String smallpic, String bigpic, String keywords, String description, String details, Integer isrecommend, Integer clicknum, Integer listid, Integer adminid, Date addtime, Integer isclose, Integer initisclose, Integer materialtype, String technics, String productno, Integer surfacetechnics, Integer utensilsdesign, Integer construction, Integer modeling, Integer packaging, Integer isprintlogin, String giftgivingoccasion, String giftcategory, String giftpurposes, String giftstyle, String giftobject, Integer iscustommade, Double price, Integer point, Integer storecategoryid, Integer isnoreasonreturn, Integer province, Integer city, Integer district, Integer isuserrecommend, Integer userrecommendlistid, Integer commentscore, Integer commentnum, Integer consultnum, Integer collectnum, Integer shopid, Integer storage, Integer salesvolume, Integer isputaway, Date putawaytime, Integer islocalfeaturesgifts, Date gaddtime, Integer gisaudit, Integer gprovince, Integer gcity, Integer gdistrict, Integer pricerange, Double pointpercent, Integer giftpricerange, Integer trendygiftrecommend, String adpic, Integer fromtype, String sellernick) {
        this.productid = productid;
        this.classid = classid;
        this.productname = productname;
        this.smallpic = smallpic;
        this.bigpic = bigpic;
        this.keywords = keywords;
        this.description = description;
        this.details = details;
        this.isrecommend = isrecommend;
        this.clicknum = clicknum;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
        this.initisclose = initisclose;
        this.materialtype = materialtype;
        this.technics = technics;
        this.productno = productno;
        this.surfacetechnics = surfacetechnics;
        this.utensilsdesign = utensilsdesign;
        this.construction = construction;
        this.modeling = modeling;
        this.packaging = packaging;
        this.isprintlogin = isprintlogin;
        this.giftgivingoccasion = giftgivingoccasion;
        this.giftcategory = giftcategory;
        this.giftpurposes = giftpurposes;
        this.giftstyle = giftstyle;
        this.giftobject = giftobject;
        this.iscustommade = iscustommade;
        this.price = price;
        this.point = point;
        this.storecategoryid = storecategoryid;
        this.isnoreasonreturn = isnoreasonreturn;
        this.province = province;
        this.city = city;
        this.district = district;
        this.isuserrecommend = isuserrecommend;
        this.userrecommendlistid = userrecommendlistid;
        this.commentscore = commentscore;
        this.commentnum = commentnum;
        this.consultnum = consultnum;
        this.collectnum = collectnum;
        this.shopid = shopid;
        this.storage = storage;
        this.salesvolume = salesvolume;
        this.isputaway = isputaway;
        this.putawaytime = putawaytime;
        this.islocalfeaturesgifts = islocalfeaturesgifts;
        this.gaddtime = gaddtime;
        this.gisaudit = gisaudit;
        this.gprovince = gprovince;
        this.gcity = gcity;
        this.gdistrict = gdistrict;
        this.pricerange = pricerange;
        this.pointpercent = pointpercent;
        this.giftpricerange = giftpricerange;
        this.trendygiftrecommend = trendygiftrecommend;
        this.adpic = adpic;
        this.fromtype = fromtype;
        this.sellernick = sellernick;
    }

    public Product() {
        super();
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic == null ? null : smallpic.trim();
    }

    public String getBigpic() {
        return bigpic;
    }

    public void setBigpic(String bigpic) {
        this.bigpic = bigpic == null ? null : bigpic.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getInitisclose() {
        return initisclose;
    }

    public void setInitisclose(Integer initisclose) {
        this.initisclose = initisclose;
    }

    public Integer getMaterialtype() {
        return materialtype;
    }

    public void setMaterialtype(Integer materialtype) {
        this.materialtype = materialtype;
    }

    public String getTechnics() {
        return technics;
    }

    public void setTechnics(String technics) {
        this.technics = technics == null ? null : technics.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public Integer getSurfacetechnics() {
        return surfacetechnics;
    }

    public void setSurfacetechnics(Integer surfacetechnics) {
        this.surfacetechnics = surfacetechnics;
    }

    public Integer getUtensilsdesign() {
        return utensilsdesign;
    }

    public void setUtensilsdesign(Integer utensilsdesign) {
        this.utensilsdesign = utensilsdesign;
    }

    public Integer getConstruction() {
        return construction;
    }

    public void setConstruction(Integer construction) {
        this.construction = construction;
    }

    public Integer getModeling() {
        return modeling;
    }

    public void setModeling(Integer modeling) {
        this.modeling = modeling;
    }

    public Integer getPackaging() {
        return packaging;
    }

    public void setPackaging(Integer packaging) {
        this.packaging = packaging;
    }

    public Integer getIsprintlogin() {
        return isprintlogin;
    }

    public void setIsprintlogin(Integer isprintlogin) {
        this.isprintlogin = isprintlogin;
    }

    public String getGiftgivingoccasion() {
        return giftgivingoccasion;
    }

    public void setGiftgivingoccasion(String giftgivingoccasion) {
        this.giftgivingoccasion = giftgivingoccasion == null ? null : giftgivingoccasion.trim();
    }

    public String getGiftcategory() {
        return giftcategory;
    }

    public void setGiftcategory(String giftcategory) {
        this.giftcategory = giftcategory == null ? null : giftcategory.trim();
    }

    public String getGiftpurposes() {
        return giftpurposes;
    }

    public void setGiftpurposes(String giftpurposes) {
        this.giftpurposes = giftpurposes == null ? null : giftpurposes.trim();
    }

    public String getGiftstyle() {
        return giftstyle;
    }

    public void setGiftstyle(String giftstyle) {
        this.giftstyle = giftstyle == null ? null : giftstyle.trim();
    }

    public String getGiftobject() {
        return giftobject;
    }

    public void setGiftobject(String giftobject) {
        this.giftobject = giftobject == null ? null : giftobject.trim();
    }

    public Integer getIscustommade() {
        return iscustommade;
    }

    public void setIscustommade(Integer iscustommade) {
        this.iscustommade = iscustommade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getStorecategoryid() {
        return storecategoryid;
    }

    public void setStorecategoryid(Integer storecategoryid) {
        this.storecategoryid = storecategoryid;
    }

    public Integer getIsnoreasonreturn() {
        return isnoreasonreturn;
    }

    public void setIsnoreasonreturn(Integer isnoreasonreturn) {
        this.isnoreasonreturn = isnoreasonreturn;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getIsuserrecommend() {
        return isuserrecommend;
    }

    public void setIsuserrecommend(Integer isuserrecommend) {
        this.isuserrecommend = isuserrecommend;
    }

    public Integer getUserrecommendlistid() {
        return userrecommendlistid;
    }

    public void setUserrecommendlistid(Integer userrecommendlistid) {
        this.userrecommendlistid = userrecommendlistid;
    }

    public Integer getCommentscore() {
        return commentscore;
    }

    public void setCommentscore(Integer commentscore) {
        this.commentscore = commentscore;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public Integer getConsultnum() {
        return consultnum;
    }

    public void setConsultnum(Integer consultnum) {
        this.consultnum = consultnum;
    }

    public Integer getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Integer collectnum) {
        this.collectnum = collectnum;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
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

    public Integer getIsputaway() {
        return isputaway;
    }

    public void setIsputaway(Integer isputaway) {
        this.isputaway = isputaway;
    }

    public Date getPutawaytime() {
        return putawaytime;
    }

    public void setPutawaytime(Date putawaytime) {
        this.putawaytime = putawaytime;
    }

    public Integer getIslocalfeaturesgifts() {
        return islocalfeaturesgifts;
    }

    public void setIslocalfeaturesgifts(Integer islocalfeaturesgifts) {
        this.islocalfeaturesgifts = islocalfeaturesgifts;
    }

    public Date getGaddtime() {
        return gaddtime;
    }

    public void setGaddtime(Date gaddtime) {
        this.gaddtime = gaddtime;
    }

    public Integer getGisaudit() {
        return gisaudit;
    }

    public void setGisaudit(Integer gisaudit) {
        this.gisaudit = gisaudit;
    }

    public Integer getGprovince() {
        return gprovince;
    }

    public void setGprovince(Integer gprovince) {
        this.gprovince = gprovince;
    }

    public Integer getGcity() {
        return gcity;
    }

    public void setGcity(Integer gcity) {
        this.gcity = gcity;
    }

    public Integer getGdistrict() {
        return gdistrict;
    }

    public void setGdistrict(Integer gdistrict) {
        this.gdistrict = gdistrict;
    }

    public Integer getPricerange() {
        return pricerange;
    }

    public void setPricerange(Integer pricerange) {
        this.pricerange = pricerange;
    }

    public Double getPointpercent() {
        return pointpercent;
    }

    public void setPointpercent(Double pointpercent) {
        this.pointpercent = pointpercent;
    }

    public Integer getGiftpricerange() {
        return giftpricerange;
    }

    public void setGiftpricerange(Integer giftpricerange) {
        this.giftpricerange = giftpricerange;
    }

    public Integer getTrendygiftrecommend() {
        return trendygiftrecommend;
    }

    public void setTrendygiftrecommend(Integer trendygiftrecommend) {
        this.trendygiftrecommend = trendygiftrecommend;
    }

    public String getAdpic() {
        return adpic;
    }

    public void setAdpic(String adpic) {
        this.adpic = adpic == null ? null : adpic.trim();
    }

    public Integer getFromtype() {
        return fromtype;
    }

    public void setFromtype(Integer fromtype) {
        this.fromtype = fromtype;
    }

    public String getSellernick() {
        return sellernick;
    }

    public void setSellernick(String sellernick) {
        this.sellernick = sellernick == null ? null : sellernick.trim();
    }
}