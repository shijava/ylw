package com.myit.ylw.pojo;

public class PayMarginWithBLOBs extends PayMargin {
    private String note;

    private String backnote;

    private String backzfnote;

    public PayMarginWithBLOBs(Integer paymarginid, String paymarginno, Integer margintype, Integer userid, Double price, Integer paymethodid, Integer isaudit, Integer isclose, Date addtime, Date edittime, String adminid, Integer isdz, Date dztime, Integer dzadminid, String dzadminname, Integer isbackbzj, Date backtime, Integer backadminid, String backadminname, Double backprice, String note, String backnote, String backzfnote) {
        super(paymarginid, paymarginno, margintype, userid, price, paymethodid, isaudit, isclose, addtime, edittime, adminid, isdz, dztime, dzadminid, dzadminname, isbackbzj, backtime, backadminid, backadminname, backprice);
        this.note = note;
        this.backnote = backnote;
        this.backzfnote = backzfnote;
    }

    public PayMarginWithBLOBs() {
        super();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getBacknote() {
        return backnote;
    }

    public void setBacknote(String backnote) {
        this.backnote = backnote == null ? null : backnote.trim();
    }

    public String getBackzfnote() {
        return backzfnote;
    }

    public void setBackzfnote(String backzfnote) {
        this.backzfnote = backzfnote == null ? null : backzfnote.trim();
    }
}