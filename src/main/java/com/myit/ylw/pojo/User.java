package com.myit.ylw.pojo;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String userpass;

    private String realname;

    private String sex;

    private String email;

    private String tel;

    private String mobile;

    private String address;

    private String comment;

    private Integer userrankid;

    private Integer isaudit;

    private Integer point;

    private Integer willoverpoint;

    private Integer loginnum;

    private Date lastlogintime;

    private Date thislogintime;

    private Date addtime;

    private Integer isclose;

    private Integer province;

    private Integer city;

    private Integer district;

    private Integer usertype;

    private String zhifubao;

    private Integer bank;

    private String bankno;

    private String headpic;

    private String niname;

    private String qq;

    private Integer isdesigner;

    private String zhifubaorname;

    private String qqlink;

    public User(Integer userid, String username, String userpass, String realname, String sex, String email, String tel, String mobile, String address, String comment, Integer userrankid, Integer isaudit, Integer point, Integer willoverpoint, Integer loginnum, Date lastlogintime, Date thislogintime, Date addtime, Integer isclose, Integer province, Integer city, Integer district, Integer usertype, String zhifubao, Integer bank, String bankno, String headpic, String niname, String qq, Integer isdesigner, String zhifubaorname, String qqlink) {
        this.userid = userid;
        this.username = username;
        this.userpass = userpass;
        this.realname = realname;
        this.sex = sex;
        this.email = email;
        this.tel = tel;
        this.mobile = mobile;
        this.address = address;
        this.comment = comment;
        this.userrankid = userrankid;
        this.isaudit = isaudit;
        this.point = point;
        this.willoverpoint = willoverpoint;
        this.loginnum = loginnum;
        this.lastlogintime = lastlogintime;
        this.thislogintime = thislogintime;
        this.addtime = addtime;
        this.isclose = isclose;
        this.province = province;
        this.city = city;
        this.district = district;
        this.usertype = usertype;
        this.zhifubao = zhifubao;
        this.bank = bank;
        this.bankno = bankno;
        this.headpic = headpic;
        this.niname = niname;
        this.qq = qq;
        this.isdesigner = isdesigner;
        this.zhifubaorname = zhifubaorname;
        this.qqlink = qqlink;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getUserrankid() {
        return userrankid;
    }

    public void setUserrankid(Integer userrankid) {
        this.userrankid = userrankid;
    }

    public Integer getIsaudit() {
        return isaudit;
    }

    public void setIsaudit(Integer isaudit) {
        this.isaudit = isaudit;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getWilloverpoint() {
        return willoverpoint;
    }

    public void setWilloverpoint(Integer willoverpoint) {
        this.willoverpoint = willoverpoint;
    }

    public Integer getLoginnum() {
        return loginnum;
    }

    public void setLoginnum(Integer loginnum) {
        this.loginnum = loginnum;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getThislogintime() {
        return thislogintime;
    }

    public void setThislogintime(Date thislogintime) {
        this.thislogintime = thislogintime;
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

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getZhifubao() {
        return zhifubao;
    }

    public void setZhifubao(String zhifubao) {
        this.zhifubao = zhifubao == null ? null : zhifubao.trim();
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    public String getNiname() {
        return niname;
    }

    public void setNiname(String niname) {
        this.niname = niname == null ? null : niname.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getIsdesigner() {
        return isdesigner;
    }

    public void setIsdesigner(Integer isdesigner) {
        this.isdesigner = isdesigner;
    }

    public String getZhifubaorname() {
        return zhifubaorname;
    }

    public void setZhifubaorname(String zhifubaorname) {
        this.zhifubaorname = zhifubaorname == null ? null : zhifubaorname.trim();
    }

    public String getQqlink() {
        return qqlink;
    }

    public void setQqlink(String qqlink) {
        this.qqlink = qqlink == null ? null : qqlink.trim();
    }
}