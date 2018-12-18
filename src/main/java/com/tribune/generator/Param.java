package com.tribune.generator;

public class Param {
    private Long paramId;
    private String paramKey;
    private String paramValue;
    private String paramName;
    private String memo;
    private Long createdAt;
    private Long updatedAt;
    private Long createdPersonId;
    private Long updatedPersonId;
    private Integer isDeleted;

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getCreatedPersonId() {
        return createdPersonId;
    }

    public void setCreatedPersonId(Long createdPersonId) {
        this.createdPersonId = createdPersonId;
    }

    public Long getUpdatedPersonId() {
        return updatedPersonId;
    }

    public void setUpdatedPersonId(Long updatedPersonId) {
        this.updatedPersonId = updatedPersonId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
