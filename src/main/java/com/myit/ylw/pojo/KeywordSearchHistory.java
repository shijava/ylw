package com.myit.ylw.pojo;

public class KeywordSearchHistory {
    private Integer keyid;

    private String keyword;

    private Integer count;

    private Integer recordcount;

    private Integer type;

    public KeywordSearchHistory(Integer keyid, String keyword, Integer count, Integer recordcount, Integer type) {
        this.keyid = keyid;
        this.keyword = keyword;
        this.count = count;
        this.recordcount = recordcount;
        this.type = type;
    }

    public KeywordSearchHistory() {
        super();
    }

    public Integer getKeyid() {
        return keyid;
    }

    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getRecordcount() {
        return recordcount;
    }

    public void setRecordcount(Integer recordcount) {
        this.recordcount = recordcount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}