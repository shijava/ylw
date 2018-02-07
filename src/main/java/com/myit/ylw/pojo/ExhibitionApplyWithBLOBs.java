package com.myit.ylw.pojo;

public class ExhibitionApplyWithBLOBs extends ExhibitionApply {
    private String details;

    private String productids;

    public ExhibitionApplyWithBLOBs(Integer exhibitionapplyid, Integer exhibitionhallid, Integer exhibitionpositionid, Integer userid, Date begintime, Date endtime, Integer isclose, Integer adminid, Date addtime, Date edittime, String companyname, String details, String productids) {
        super(exhibitionapplyid, exhibitionhallid, exhibitionpositionid, userid, begintime, endtime, isclose, adminid, addtime, edittime, companyname);
        this.details = details;
        this.productids = productids;
    }

    public ExhibitionApplyWithBLOBs() {
        super();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getProductids() {
        return productids;
    }

    public void setProductids(String productids) {
        this.productids = productids == null ? null : productids.trim();
    }
}