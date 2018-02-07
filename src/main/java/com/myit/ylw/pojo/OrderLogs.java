package com.myit.ylw.pojo;

import java.util.Date;

public class OrderLogs {
    private Integer logid;

    private String orderid;

    private String orderno;

    private Integer orderstate;

    private Date createdate;

    private String description;

    public OrderLogs(Integer logid, String orderid, String orderno, Integer orderstate, Date createdate, String description) {
        this.logid = logid;
        this.orderid = orderid;
        this.orderno = orderno;
        this.orderstate = orderstate;
        this.createdate = createdate;
        this.description = description;
    }

    public OrderLogs() {
        super();
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}