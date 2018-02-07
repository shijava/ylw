package com.myit.ylw.pojo;

import java.util.Date;

public class DesignWorks {
    private Integer designworksid;

    private Integer userid;

    private Integer category;

    private Integer casestyle;

    private Double price;

    private Integer pricerange;

    private Integer listid;

    private Integer isrecommend;

    private Date addtime;

    private Date edittime;

    private Integer adminid;

    private Integer isclose;

    private Integer initisclose;

    private Integer isputaway;

    private Integer clicknum;

    private Integer salesvolume;

    public DesignWorks(Integer designworksid, Integer userid, Integer category, Integer casestyle, Double price, Integer pricerange, Integer listid, Integer isrecommend, Date addtime, Date edittime, Integer adminid, Integer isclose, Integer initisclose, Integer isputaway, Integer clicknum, Integer salesvolume) {
        this.designworksid = designworksid;
        this.userid = userid;
        this.category = category;
        this.casestyle = casestyle;
        this.price = price;
        this.pricerange = pricerange;
        this.listid = listid;
        this.isrecommend = isrecommend;
        this.addtime = addtime;
        this.edittime = edittime;
        this.adminid = adminid;
        this.isclose = isclose;
        this.initisclose = initisclose;
        this.isputaway = isputaway;
        this.clicknum = clicknum;
        this.salesvolume = salesvolume;
    }

    public DesignWorks() {
        super();
    }

    public Integer getDesignworksid() {
        return designworksid;
    }

    public void setDesignworksid(Integer designworksid) {
        this.designworksid = designworksid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getCasestyle() {
        return casestyle;
    }

    public void setCasestyle(Integer casestyle) {
        this.casestyle = casestyle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPricerange() {
        return pricerange;
    }

    public void setPricerange(Integer pricerange) {
        this.pricerange = pricerange;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
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

    public Integer getIsputaway() {
        return isputaway;
    }

    public void setIsputaway(Integer isputaway) {
        this.isputaway = isputaway;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Integer getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
    }
}