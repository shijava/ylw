package com.myit.ylw.pojo;

import java.util.Date;

public class ProductPic {
    private Integer productpicid;

    private Integer productid;

    private String title;

    private String smallpic;

    private String bigpic;

    private String description;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public ProductPic(Integer productpicid, Integer productid, String title, String smallpic, String bigpic, String description, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.productpicid = productpicid;
        this.productid = productid;
        this.title = title;
        this.smallpic = smallpic;
        this.bigpic = bigpic;
        this.description = description;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public ProductPic() {
        super();
    }

    public Integer getProductpicid() {
        return productpicid;
    }

    public void setProductpicid(Integer productpicid) {
        this.productpicid = productpicid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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