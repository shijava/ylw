package com.myit.ylw.pojo;

public class UserPointWithBLOBs extends UserPoint {
    private String sourceoruse;

    private String note;

    public UserPointWithBLOBs(Integer pointid, Integer inout, Date addtime, Integer userid, Integer pointtype, Integer point, String showpic, String objectno, String sourceoruse, String note) {
        super(pointid, inout, addtime, userid, pointtype, point, showpic, objectno);
        this.sourceoruse = sourceoruse;
        this.note = note;
    }

    public UserPointWithBLOBs() {
        super();
    }

    public String getSourceoruse() {
        return sourceoruse;
    }

    public void setSourceoruse(String sourceoruse) {
        this.sourceoruse = sourceoruse == null ? null : sourceoruse.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}