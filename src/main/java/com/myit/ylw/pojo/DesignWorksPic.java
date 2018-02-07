package com.myit.ylw.pojo;

import java.util.Date;

public class DesignWorksPic {
    private Integer designworkspicid;

    private Integer designworksid;

    private Integer title;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public DesignWorksPic(Integer designworkspicid, Integer designworksid, Integer title, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.designworkspicid = designworkspicid;
        this.designworksid = designworksid;
        this.title = title;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public DesignWorksPic() {
        super();
    }

    public Integer getDesignworkspicid() {
        return designworkspicid;
    }

    public void setDesignworkspicid(Integer designworkspicid) {
        this.designworkspicid = designworkspicid;
    }

    public Integer getDesignworksid() {
        return designworksid;
    }

    public void setDesignworksid(Integer designworksid) {
        this.designworksid = designworksid;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }
}