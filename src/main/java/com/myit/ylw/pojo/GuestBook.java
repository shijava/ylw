package com.myit.ylw.pojo;

import java.util.Date;

public class GuestBook {
    private Integer guestbookid;

    private String nickname;

    private String bookcontent;

    private String ipaddress;

    private Date addtime;

    private Integer isreply;

    private String replycontent;

    private Date replytime;

    private Integer adminid;

    private Integer isclose;

    public GuestBook(Integer guestbookid, String nickname, String bookcontent, String ipaddress, Date addtime, Integer isreply, String replycontent, Date replytime, Integer adminid, Integer isclose) {
        this.guestbookid = guestbookid;
        this.nickname = nickname;
        this.bookcontent = bookcontent;
        this.ipaddress = ipaddress;
        this.addtime = addtime;
        this.isreply = isreply;
        this.replycontent = replycontent;
        this.replytime = replytime;
        this.adminid = adminid;
        this.isclose = isclose;
    }

    public GuestBook() {
        super();
    }

    public Integer getGuestbookid() {
        return guestbookid;
    }

    public void setGuestbookid(Integer guestbookid) {
        this.guestbookid = guestbookid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getBookcontent() {
        return bookcontent;
    }

    public void setBookcontent(String bookcontent) {
        this.bookcontent = bookcontent == null ? null : bookcontent.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getIsreply() {
        return isreply;
    }

    public void setIsreply(Integer isreply) {
        this.isreply = isreply;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }
}