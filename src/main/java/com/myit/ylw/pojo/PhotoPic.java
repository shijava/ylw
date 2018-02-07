package com.myit.ylw.pojo;

import java.util.Date;

public class PhotoPic {
    private Integer photopicid;

    private Integer photoid;

    private String title;

    private String smallpic;

    private String bigpic;

    private String description;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public PhotoPic(Integer photopicid, Integer photoid, String title, String smallpic, String bigpic, String description, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.photopicid = photopicid;
        this.photoid = photoid;
        this.title = title;
        this.smallpic = smallpic;
        this.bigpic = bigpic;
        this.description = description;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public PhotoPic() {
        super();
    }

    public Integer getPhotopicid() {
        return photopicid;
    }

    public void setPhotopicid(Integer photopicid) {
        this.photopicid = photopicid;
    }

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic == null ? null : smallpic.trim();
    }

    public String getBigpic() {
        return bigpic;
    }

    public void setBigpic(String bigpic) {
        this.bigpic = bigpic == null ? null : bigpic.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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