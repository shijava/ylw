package com.myit.ylw.pojo;

public class DesignerOrderWithBLOBs extends DesignerOrder {
    private String title;

    private String bullerdescribe;

    private String bulleruploadpic1;

    private String bulleruploadpic2;

    private String bulleruploadpic3;

    private String bulleruploadpic4;

    private String bulleruploadpic5;

    private String bullerremark;

    private String sellerremark;

    public DesignerOrderWithBLOBs(Integer dorderid, String dorderno, Date orderdatetime, Integer designworksid, Double orderprices, Double realpayprices, Integer orderstate, Integer appealstate, Integer isappeal, Integer bulleruserid, Integer designeruserid, Integer paymethodsid, Double ylwpayprice, String cancelordernote, String giveupordernote, String dzPayorderrecordno, Double dzPointpricetotal, Double dzRealpaypricetotal, Date dzRealpaytime, Integer isdz, Date ordercompletetime, String title, String bullerdescribe, String bulleruploadpic1, String bulleruploadpic2, String bulleruploadpic3, String bulleruploadpic4, String bulleruploadpic5, String bullerremark, String sellerremark) {
        super(dorderid, dorderno, orderdatetime, designworksid, orderprices, realpayprices, orderstate, appealstate, isappeal, bulleruserid, designeruserid, paymethodsid, ylwpayprice, cancelordernote, giveupordernote, dzPayorderrecordno, dzPointpricetotal, dzRealpaypricetotal, dzRealpaytime, isdz, ordercompletetime);
        this.title = title;
        this.bullerdescribe = bullerdescribe;
        this.bulleruploadpic1 = bulleruploadpic1;
        this.bulleruploadpic2 = bulleruploadpic2;
        this.bulleruploadpic3 = bulleruploadpic3;
        this.bulleruploadpic4 = bulleruploadpic4;
        this.bulleruploadpic5 = bulleruploadpic5;
        this.bullerremark = bullerremark;
        this.sellerremark = sellerremark;
    }

    public DesignerOrderWithBLOBs() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBullerdescribe() {
        return bullerdescribe;
    }

    public void setBullerdescribe(String bullerdescribe) {
        this.bullerdescribe = bullerdescribe == null ? null : bullerdescribe.trim();
    }

    public String getBulleruploadpic1() {
        return bulleruploadpic1;
    }

    public void setBulleruploadpic1(String bulleruploadpic1) {
        this.bulleruploadpic1 = bulleruploadpic1 == null ? null : bulleruploadpic1.trim();
    }

    public String getBulleruploadpic2() {
        return bulleruploadpic2;
    }

    public void setBulleruploadpic2(String bulleruploadpic2) {
        this.bulleruploadpic2 = bulleruploadpic2 == null ? null : bulleruploadpic2.trim();
    }

    public String getBulleruploadpic3() {
        return bulleruploadpic3;
    }

    public void setBulleruploadpic3(String bulleruploadpic3) {
        this.bulleruploadpic3 = bulleruploadpic3 == null ? null : bulleruploadpic3.trim();
    }

    public String getBulleruploadpic4() {
        return bulleruploadpic4;
    }

    public void setBulleruploadpic4(String bulleruploadpic4) {
        this.bulleruploadpic4 = bulleruploadpic4 == null ? null : bulleruploadpic4.trim();
    }

    public String getBulleruploadpic5() {
        return bulleruploadpic5;
    }

    public void setBulleruploadpic5(String bulleruploadpic5) {
        this.bulleruploadpic5 = bulleruploadpic5 == null ? null : bulleruploadpic5.trim();
    }

    public String getBullerremark() {
        return bullerremark;
    }

    public void setBullerremark(String bullerremark) {
        this.bullerremark = bullerremark == null ? null : bullerremark.trim();
    }

    public String getSellerremark() {
        return sellerremark;
    }

    public void setSellerremark(String sellerremark) {
        this.sellerremark = sellerremark == null ? null : sellerremark.trim();
    }
}