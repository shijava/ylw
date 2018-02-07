package com.myit.ylw.pojo;

import java.util.Date;

public class DesignerOrderLogs {
    private Integer dlogid;

    private Integer dorderid;

    private String dorderno;

    private Integer orderstate;

    private String description;

    private Date createdate;

    public DesignerOrderLogs(Integer dlogid, Integer dorderid, String dorderno, Integer orderstate, String description, Date createdate) {
        this.dlogid = dlogid;
        this.dorderid = dorderid;
        this.dorderno = dorderno;
        this.orderstate = orderstate;
        this.description = description;
        this.createdate = createdate;
    }

    public DesignerOrderLogs() {
        super();
    }

    public Integer getDlogid() {
        return dlogid;
    }

    public void setDlogid(Integer dlogid) {
        this.dlogid = dlogid;
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

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}