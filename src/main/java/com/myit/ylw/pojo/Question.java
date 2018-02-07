package com.myit.ylw.pojo;

import java.util.Date;

public class Question {
    private Integer questionid;

    private String title;

    private Integer isrecommend;

    private Integer isclose;

    private Integer userid;

    private Date addtime;

    private String backgroundpic;

    private Integer listid;

    private Integer issolution;

    private String questioncontent;

    public Question(Integer questionid, String title, Integer isrecommend, Integer isclose, Integer userid, Date addtime, String backgroundpic, Integer listid, Integer issolution, String questioncontent) {
        this.questionid = questionid;
        this.title = title;
        this.isrecommend = isrecommend;
        this.isclose = isclose;
        this.userid = userid;
        this.addtime = addtime;
        this.backgroundpic = backgroundpic;
        this.listid = listid;
        this.issolution = issolution;
        this.questioncontent = questioncontent;
    }

    public Question() {
        super();
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getBackgroundpic() {
        return backgroundpic;
    }

    public void setBackgroundpic(String backgroundpic) {
        this.backgroundpic = backgroundpic == null ? null : backgroundpic.trim();
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getIssolution() {
        return issolution;
    }

    public void setIssolution(Integer issolution) {
        this.issolution = issolution;
    }

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent == null ? null : questioncontent.trim();
    }
}