package com.myit.ylw.pojo;

public class DesignerOrderPicWithBLOBs extends DesignerOrderPic {
    private String picurl;

    private String picdescribe;

    public DesignerOrderPicWithBLOBs(Integer designerpicid, Integer dorderid, String dorderno, Date addtime, String picurl, String picdescribe) {
        super(designerpicid, dorderid, dorderno, addtime);
        this.picurl = picurl;
        this.picdescribe = picdescribe;
    }

    public DesignerOrderPicWithBLOBs() {
        super();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getPicdescribe() {
        return picdescribe;
    }

    public void setPicdescribe(String picdescribe) {
        this.picdescribe = picdescribe == null ? null : picdescribe.trim();
    }
}