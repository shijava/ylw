package com.myit.ylw.pojo;

public class TenderWithBLOBs extends Tender {
    private String tendername;

    private String tenderpic;

    private String content;

    private String paymethod;

    private String address;

    private String companyname;

    private String pic1;

    private String pic2;

    private String pic3;

    private String pic4;

    private String pic5;

    public TenderWithBLOBs(Integer tenderid, Integer userid, Integer quantity, Integer iscustommade, Integer deliverydays, Integer invoicetype, Integer province, Integer city, Integer district, Date begintime, Date endtime, String contact, String mobilephone, Integer tenderstatus, Integer isaudit, Integer isclose, Date addtime, Integer adminid, Integer listid, String tendername, String tenderpic, String content, String paymethod, String address, String companyname, String pic1, String pic2, String pic3, String pic4, String pic5) {
        super(tenderid, userid, quantity, iscustommade, deliverydays, invoicetype, province, city, district, begintime, endtime, contact, mobilephone, tenderstatus, isaudit, isclose, addtime, adminid, listid);
        this.tendername = tendername;
        this.tenderpic = tenderpic;
        this.content = content;
        this.paymethod = paymethod;
        this.address = address;
        this.companyname = companyname;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.pic4 = pic4;
        this.pic5 = pic5;
    }

    public TenderWithBLOBs() {
        super();
    }

    public String getTendername() {
        return tendername;
    }

    public void setTendername(String tendername) {
        this.tendername = tendername == null ? null : tendername.trim();
    }

    public String getTenderpic() {
        return tenderpic;
    }

    public void setTenderpic(String tenderpic) {
        this.tenderpic = tenderpic == null ? null : tenderpic.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod == null ? null : paymethod.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1 == null ? null : pic1.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3 == null ? null : pic3.trim();
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4 == null ? null : pic4.trim();
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5 == null ? null : pic5.trim();
    }
}