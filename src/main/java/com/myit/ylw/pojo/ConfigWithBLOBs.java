package com.myit.ylw.pojo;

public class ConfigWithBLOBs extends Config {
    private String setcommentcontent;

    private String exhibitionpic;

    public ConfigWithBLOBs(Integer configid, String languagever, String websitename, String websitedir, String websitekeywords, String websitedescription, String mailreceiveaddressforfeedback, String mailreceiveaddressforproduct, String mailreceiveaddressforjob, String mailsmtpserver, String mailusername, String mailpassword, String footerinfo, Integer listid, Integer adminid, Date addtime, Integer isclose, Integer setcommentday, Integer setcommentscore, Integer setbackproductday, Integer addproductfreedays, Double productbond, Double productvipserver, Integer setcloseorderday, Integer setsignorderday, Integer setsellersolveday, Double minpointpercent, Double maxpointpercent, Integer setclosedesorderday, Integer exhibitionlong, Integer setcloseseewlday, String servicehotline, String logo, String wechatpic, Double pptmoney, String seotitle, String setcommentcontent, String exhibitionpic) {
        super(configid, languagever, websitename, websitedir, websitekeywords, websitedescription, mailreceiveaddressforfeedback, mailreceiveaddressforproduct, mailreceiveaddressforjob, mailsmtpserver, mailusername, mailpassword, footerinfo, listid, adminid, addtime, isclose, setcommentday, setcommentscore, setbackproductday, addproductfreedays, productbond, productvipserver, setcloseorderday, setsignorderday, setsellersolveday, minpointpercent, maxpointpercent, setclosedesorderday, exhibitionlong, setcloseseewlday, servicehotline, logo, wechatpic, pptmoney, seotitle);
        this.setcommentcontent = setcommentcontent;
        this.exhibitionpic = exhibitionpic;
    }

    public ConfigWithBLOBs() {
        super();
    }

    public String getSetcommentcontent() {
        return setcommentcontent;
    }

    public void setSetcommentcontent(String setcommentcontent) {
        this.setcommentcontent = setcommentcontent == null ? null : setcommentcontent.trim();
    }

    public String getExhibitionpic() {
        return exhibitionpic;
    }

    public void setExhibitionpic(String exhibitionpic) {
        this.exhibitionpic = exhibitionpic == null ? null : exhibitionpic.trim();
    }
}