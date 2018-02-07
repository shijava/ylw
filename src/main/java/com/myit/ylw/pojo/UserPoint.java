package com.myit.ylw.pojo;

import java.util.Date;

public class UserPoint {
    private Integer pointid;

    private Integer inout;

    private Date addtime;

    private Integer userid;

    private Integer pointtype;

    private Integer point;

    private String showpic;

    private String objectno;

    public UserPoint(Integer pointid, Integer inout, Date addtime, Integer userid, Integer pointtype, Integer point, String showpic, String objectno) {
        this.pointid = pointid;
        this.inout = inout;
        this.addtime = addtime;
        this.userid = userid;
        this.pointtype = pointtype;
        this.point = point;
        this.showpic = showpic;
        this.objectno = objectno;
    }

    public UserPoint() {
        super();
    }

    public Integer getPointid() {
        return pointid;
    }

    public void setPointid(Integer pointid) {
        this.pointid = pointid;
    }

    public Integer getInout() {
        return inout;
    }

    public void setInout(Integer inout) {
        this.inout = inout;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPointtype() {
        return pointtype;
    }

    public void setPointtype(Integer pointtype) {
        this.pointtype = pointtype;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getShowpic() {
        return showpic;
    }

    public void setShowpic(String showpic) {
        this.showpic = showpic == null ? null : showpic.trim();
    }

    public String getObjectno() {
        return objectno;
    }

    public void setObjectno(String objectno) {
        this.objectno = objectno == null ? null : objectno.trim();
    }
}