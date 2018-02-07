package com.myit.ylw.pojo;

import java.util.Date;

public class DesignerOrder {
    private Integer dorderid;

    private String dorderno;

    private Date orderdatetime;

    private Integer designworksid;

    private Double orderprices;

    private Double realpayprices;

    private Integer orderstate;

    private Integer appealstate;

    private Integer isappeal;

    private Integer bulleruserid;

    private Integer designeruserid;

    private Integer paymethodsid;

    private Double ylwpayprice;

    private String cancelordernote;

    private String giveupordernote;

    private String dzPayorderrecordno;

    private Double dzPointpricetotal;

    private Double dzRealpaypricetotal;

    private Date dzRealpaytime;

    private Integer isdz;

    private Date ordercompletetime;

    public DesignerOrder(Integer dorderid, String dorderno, Date orderdatetime, Integer designworksid, Double orderprices, Double realpayprices, Integer orderstate, Integer appealstate, Integer isappeal, Integer bulleruserid, Integer designeruserid, Integer paymethodsid, Double ylwpayprice, String cancelordernote, String giveupordernote, String dzPayorderrecordno, Double dzPointpricetotal, Double dzRealpaypricetotal, Date dzRealpaytime, Integer isdz, Date ordercompletetime) {
        this.dorderid = dorderid;
        this.dorderno = dorderno;
        this.orderdatetime = orderdatetime;
        this.designworksid = designworksid;
        this.orderprices = orderprices;
        this.realpayprices = realpayprices;
        this.orderstate = orderstate;
        this.appealstate = appealstate;
        this.isappeal = isappeal;
        this.bulleruserid = bulleruserid;
        this.designeruserid = designeruserid;
        this.paymethodsid = paymethodsid;
        this.ylwpayprice = ylwpayprice;
        this.cancelordernote = cancelordernote;
        this.giveupordernote = giveupordernote;
        this.dzPayorderrecordno = dzPayorderrecordno;
        this.dzPointpricetotal = dzPointpricetotal;
        this.dzRealpaypricetotal = dzRealpaypricetotal;
        this.dzRealpaytime = dzRealpaytime;
        this.isdz = isdz;
        this.ordercompletetime = ordercompletetime;
    }

    public DesignerOrder() {
        super();
    }

    public Integer getDorderid() {
        return dorderid;
    }

    public void setDorderid(Integer dorderid) {
        this.dorderid = dorderid;
    }

    public String getDorderno() {
        return dorderno;
    }

    public void setDorderno(String dorderno) {
        this.dorderno = dorderno == null ? null : dorderno.trim();
    }

    public Date getOrderdatetime() {
        return orderdatetime;
    }

    public void setOrderdatetime(Date orderdatetime) {
        this.orderdatetime = orderdatetime;
    }

    public Integer getDesignworksid() {
        return designworksid;
    }

    public void setDesignworksid(Integer designworksid) {
        this.designworksid = designworksid;
    }

    public Double getOrderprices() {
        return orderprices;
    }

    public void setOrderprices(Double orderprices) {
        this.orderprices = orderprices;
    }

    public Double getRealpayprices() {
        return realpayprices;
    }

    public void setRealpayprices(Double realpayprices) {
        this.realpayprices = realpayprices;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getAppealstate() {
        return appealstate;
    }

    public void setAppealstate(Integer appealstate) {
        this.appealstate = appealstate;
    }

    public Integer getIsappeal() {
        return isappeal;
    }

    public void setIsappeal(Integer isappeal) {
        this.isappeal = isappeal;
    }

    public Integer getBulleruserid() {
        return bulleruserid;
    }

    public void setBulleruserid(Integer bulleruserid) {
        this.bulleruserid = bulleruserid;
    }

    public Integer getDesigneruserid() {
        return designeruserid;
    }

    public void setDesigneruserid(Integer designeruserid) {
        this.designeruserid = designeruserid;
    }

    public Integer getPaymethodsid() {
        return paymethodsid;
    }

    public void setPaymethodsid(Integer paymethodsid) {
        this.paymethodsid = paymethodsid;
    }

    public Double getYlwpayprice() {
        return ylwpayprice;
    }

    public void setYlwpayprice(Double ylwpayprice) {
        this.ylwpayprice = ylwpayprice;
    }

    public String getCancelordernote() {
        return cancelordernote;
    }

    public void setCancelordernote(String cancelordernote) {
        this.cancelordernote = cancelordernote == null ? null : cancelordernote.trim();
    }

    public String getGiveupordernote() {
        return giveupordernote;
    }

    public void setGiveupordernote(String giveupordernote) {
        this.giveupordernote = giveupordernote == null ? null : giveupordernote.trim();
    }

    public String getDzPayorderrecordno() {
        return dzPayorderrecordno;
    }

    public void setDzPayorderrecordno(String dzPayorderrecordno) {
        this.dzPayorderrecordno = dzPayorderrecordno == null ? null : dzPayorderrecordno.trim();
    }

    public Double getDzPointpricetotal() {
        return dzPointpricetotal;
    }

    public void setDzPointpricetotal(Double dzPointpricetotal) {
        this.dzPointpricetotal = dzPointpricetotal;
    }

    public Double getDzRealpaypricetotal() {
        return dzRealpaypricetotal;
    }

    public void setDzRealpaypricetotal(Double dzRealpaypricetotal) {
        this.dzRealpaypricetotal = dzRealpaypricetotal;
    }

    public Date getDzRealpaytime() {
        return dzRealpaytime;
    }

    public void setDzRealpaytime(Date dzRealpaytime) {
        this.dzRealpaytime = dzRealpaytime;
    }

    public Integer getIsdz() {
        return isdz;
    }

    public void setIsdz(Integer isdz) {
        this.isdz = isdz;
    }

    public Date getOrdercompletetime() {
        return ordercompletetime;
    }

    public void setOrdercompletetime(Date ordercompletetime) {
        this.ordercompletetime = ordercompletetime;
    }
}