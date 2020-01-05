package com.oppo.pojo;

public class AdsSearchKwOperate {

    private Integer appId;
    private String keyWord;
    private Float correlation;
    private Integer pv1;
    private Integer pv7;
    private Integer insertTime;
    private Integer lastModifyTime;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Float getCorrelation() {
        return correlation;
    }

    public void setCorrelation(Float correlation) {
        this.correlation = correlation;
    }

    public Integer getPv1() {
        return pv1;
    }

    public void setPv1(Integer pv1) {
        this.pv1 = pv1;
    }

    public Integer getPv7() {
        return pv7;
    }

    public void setPv7(Integer pv7) {
        this.pv7 = pv7;
    }

    public Integer getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Integer insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Integer lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
