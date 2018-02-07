package com.myit.ylw.pojo;

public class ExhibitionHallWithBLOBs extends ExhibitionHall {
    private String outerimg;

    private String innerimg;

    public ExhibitionHallWithBLOBs(Integer exhibitionhallid, String exname, Integer ltop, Integer lleft, Integer atop, Integer aleft, Integer positionnum, Integer isclose, Integer adminid, Date addtime, Integer listid, String outerimg, String innerimg) {
        super(exhibitionhallid, exname, ltop, lleft, atop, aleft, positionnum, isclose, adminid, addtime, listid);
        this.outerimg = outerimg;
        this.innerimg = innerimg;
    }

    public ExhibitionHallWithBLOBs() {
        super();
    }

    public String getOuterimg() {
        return outerimg;
    }

    public void setOuterimg(String outerimg) {
        this.outerimg = outerimg == null ? null : outerimg.trim();
    }

    public String getInnerimg() {
        return innerimg;
    }

    public void setInnerimg(String innerimg) {
        this.innerimg = innerimg == null ? null : innerimg.trim();
    }
}