package com.myit.ylw.pojo;

import java.util.Date;

public class t_QuestionAnswer {
    private Integer answerid;

    private Integer questionid;

    private Integer supplieruserid;

    private String answercontent;

    private String recommendproducts;

    private Date addtime;

    private Integer listid;

    private Integer isclose;

    public t_QuestionAnswer(Integer answerid, Integer questionid, Integer supplieruserid, String answercontent, String recommendproducts, Date addtime, Integer listid, Integer isclose) {
        this.answerid = answerid;
        this.questionid = questionid;
        this.supplieruserid = supplieruserid;
        this.answercontent = answercontent;
        this.recommendproducts = recommendproducts;
        this.addtime = addtime;
        this.listid = listid;
        this.isclose = isclose;
    }

    public t_QuestionAnswer() {
        super();
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getSupplieruserid() {
        return supplieruserid;
    }

    public void setSupplieruserid(Integer supplieruserid) {
        this.supplieruserid = supplieruserid;
    }

    public String getAnswercontent() {
        return answercontent;
    }

    public void setAnswercontent(String answercontent) {
        this.answercontent = answercontent == null ? null : answercontent.trim();
    }

    public String getRecommendproducts() {
        return recommendproducts;
    }

    public void setRecommendproducts(String recommendproducts) {
        this.recommendproducts = recommendproducts == null ? null : recommendproducts.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getListid() {
        return listid;
    }

    public void setListid(Integer listid) {
        this.listid = listid;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }
}