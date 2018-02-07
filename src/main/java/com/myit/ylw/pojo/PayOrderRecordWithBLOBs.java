package com.myit.ylw.pojo;

public class PayOrderRecordWithBLOBs extends PayOrderRecord {
    private String note;

    private String cwnote;

    public PayOrderRecordWithBLOBs(Integer payorderrecordid, String payorderrecordno, Double orderpricetotal, Double pointpricetotal, Double realpaypricetotal, Integer userid, Integer ordertype, Date addtime, Integer adminid, Integer paystate, Date realpaytime, Double usablepointpricetotal, String note, String cwnote) {
        super(payorderrecordid, payorderrecordno, orderpricetotal, pointpricetotal, realpaypricetotal, userid, ordertype, addtime, adminid, paystate, realpaytime, usablepointpricetotal);
        this.note = note;
        this.cwnote = cwnote;
    }

    public PayOrderRecordWithBLOBs() {
        super();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getCwnote() {
        return cwnote;
    }

    public void setCwnote(String cwnote) {
        this.cwnote = cwnote == null ? null : cwnote.trim();
    }
}