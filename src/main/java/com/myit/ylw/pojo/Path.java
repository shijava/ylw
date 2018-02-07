package com.myit.ylw.pojo;

public class Path {
    private String path;

    private Integer adminid;

    public Path(String path, Integer adminid) {
        this.path = path;
        this.adminid = adminid;
    }

    public Path() {
        super();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }
}