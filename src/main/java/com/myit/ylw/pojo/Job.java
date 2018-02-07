package com.myit.ylw.pojo;

import java.util.Date;

public class Job {
    private Integer jobid;

    private Integer classid;

    private String jobname;

    private String department;

    private String jobnum;

    private String salary;

    private String workplace;

    private Date endtime;

    private String keywords;

    private String description;

    private String details;

    private Integer isrecommend;

    private Integer clicknum;

    private Integer listid;

    private Integer adminid;

    private Date addtime;

    private Integer isclose;

    public Job(Integer jobid, Integer classid, String jobname, String department, String jobnum, String salary, String workplace, Date endtime, String keywords, String description, String details, Integer isrecommend, Integer clicknum, Integer listid, Integer adminid, Date addtime, Integer isclose) {
        this.jobid = jobid;
        this.classid = classid;
        this.jobname = jobname;
        this.department = department;
        this.jobnum = jobnum;
        this.salary = salary;
        this.workplace = workplace;
        this.endtime = endtime;
        this.keywords = keywords;
        this.description = description;
        this.details = details;
        this.isrecommend = isrecommend;
        this.clicknum = clicknum;
        this.listid = listid;
        this.adminid = adminid;
        this.addtime = addtime;
        this.isclose = isclose;
    }

    public Job() {
        super();
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getJobnum() {
        return jobnum;
    }

    public void setJobnum(String jobnum) {
        this.jobnum = jobnum == null ? null : jobnum.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
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