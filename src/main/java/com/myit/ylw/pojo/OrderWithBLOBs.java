package com.myit.ylw.pojo;

public class OrderWithBLOBs extends Order {
    private String remark;

    private String sellerremark;

    private String bullercancelnote;

    private String sellercancelnote;

    public OrderWithBLOBs(Integer orderid, String orderno, Integer userid, Integer shopid, Date orderdatetime, Date orderdateedittime, String consignee, String consignepostcode, String consignetelephone, String consigneemobilephone, Integer provinceid, Integer cityid, Integer district, String consigneeadress, Integer paymethodsid, String shipname, String shipno, String shipcertificate, Integer orderstate, Integer servicestate, Integer ordertype, Double shipprice, Date shipdatetime, Double orderprices, Double realpayprices, Integer points, Integer donatepoints, Integer iscomment, Integer parentid, String dzPayorderrecordno, Double dzPointpricetotal, Double dzRealpaypricetotal, Date dzRealpaytime, Integer isdz, String remark, String sellerremark, String bullercancelnote, String sellercancelnote) {
        super(orderid, orderno, userid, shopid, orderdatetime, orderdateedittime, consignee, consignepostcode, consignetelephone, consigneemobilephone, provinceid, cityid, district, consigneeadress, paymethodsid, shipname, shipno, shipcertificate, orderstate, servicestate, ordertype, shipprice, shipdatetime, orderprices, realpayprices, points, donatepoints, iscomment, parentid, dzPayorderrecordno, dzPointpricetotal, dzRealpaypricetotal, dzRealpaytime, isdz);
        this.remark = remark;
        this.sellerremark = sellerremark;
        this.bullercancelnote = bullercancelnote;
        this.sellercancelnote = sellercancelnote;
    }

    public OrderWithBLOBs() {
        super();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSellerremark() {
        return sellerremark;
    }

    public void setSellerremark(String sellerremark) {
        this.sellerremark = sellerremark == null ? null : sellerremark.trim();
    }

    public String getBullercancelnote() {
        return bullercancelnote;
    }

    public void setBullercancelnote(String bullercancelnote) {
        this.bullercancelnote = bullercancelnote == null ? null : bullercancelnote.trim();
    }

    public String getSellercancelnote() {
        return sellercancelnote;
    }

    public void setSellercancelnote(String sellercancelnote) {
        this.sellercancelnote = sellercancelnote == null ? null : sellercancelnote.trim();
    }
}