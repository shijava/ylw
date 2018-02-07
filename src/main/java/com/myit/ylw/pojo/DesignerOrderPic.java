package com.myit.ylw.pojo;

import java.util.Date;

public class DesignerOrderPic {
    private Integer designerpicid;

    private Integer dorderid;

    private String dorderno;

    private Date addtime;

    public DesignerOrderPic(Integer designerpicid, Integer dorderid, String dorderno, Date addtime) {
        this.designerpicid = designerpicid;
        this.dorderid = dorderid;
        this.dorderno = dorderno;
        this.addtime = addtime;
    }

    public DesignerOrderPic() {
        super();
    }

    public Integer getDesignerpicid() {
        return designerpicid;
    }

    public void setDesignerpicid(Integer designerpicid) {
        this.designerpicid = designerpicid;
    }

    public Integer getDorderid() {
        return dorderid;
    }

    public void setDorderid(Integer dorderid) {
        this.dorderid = dorderid;
    }

    public String getDorderno() {
        return dorderno;
    }

    public void setDorderno(String dorderno) {
        this.dorderno = dorderno == null ? null : dorderno.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}