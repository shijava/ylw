package com.myit.ylw.pojo;

public class SupplierWithBLOBs extends Supplier {
    private String shopintroduce;

    private String qqlink;

    private String contact;

    public SupplierWithBLOBs(Integer supplierid, Integer userid, String companyname, String businesslicenseurl, String organizationcodeurl, String taxregistrationcertificateurl, String corporatename, String companylogo, String companypic, String companypiclink, String shoplever, Double goodcommentrate, Date openshopdate, Integer ispayqualitymoney, Integer ispayvipservermoney, Integer productcount, Integer shopscore, String qq, String shopstyle, String seconddomain, Integer adminid, Date addtime, Integer isclose, Integer listid, Integer approvalstate, String shopintroduce, String qqlink, String contact) {
        super(supplierid, userid, companyname, businesslicenseurl, organizationcodeurl, taxregistrationcertificateurl, corporatename, companylogo, companypic, companypiclink, shoplever, goodcommentrate, openshopdate, ispayqualitymoney, ispayvipservermoney, productcount, shopscore, qq, shopstyle, seconddomain, adminid, addtime, isclose, listid, approvalstate);
        this.shopintroduce = shopintroduce;
        this.qqlink = qqlink;
        this.contact = contact;
    }

    public SupplierWithBLOBs() {
        super();
    }

    public String getShopintroduce() {
        return shopintroduce;
    }

    public void setShopintroduce(String shopintroduce) {
        this.shopintroduce = shopintroduce == null ? null : shopintroduce.trim();
    }

    public String getQqlink() {
        return qqlink;
    }

    public void setQqlink(String qqlink) {
        this.qqlink = qqlink == null ? null : qqlink.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
}