package com.jxt.toolmanage.pojo;

import java.util.Date;

public class Tool {
    private Long id;

    private Long cid;

    private String number;

    private String toolName;

    private Integer testPeriod;

    private Date lastTestDate;

    private String modelNumber;

    private Date createDate;

    private Integer validUsePeriod;

    private String keepAndDepositRequire;

    private String inspectionAndUseRequire;

    private Integer isQualified;

    private String twoDimensionCode;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName == null ? null : toolName.trim();
    }

    public Integer getTestPeriod() {
        return testPeriod;
    }

    public void setTestPeriod(Integer testPeriod) {
        this.testPeriod = testPeriod;
    }

    public Date getLastTestDate() {
        return lastTestDate;
    }

    public void setLastTestDate(Date lastTestDate) {
        this.lastTestDate = lastTestDate;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber == null ? null : modelNumber.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getValidUsePeriod() {
        return validUsePeriod;
    }

    public void setValidUsePeriod(Integer validUsePeriod) {
        this.validUsePeriod = validUsePeriod;
    }

    public String getKeepAndDepositRequire() {
        return keepAndDepositRequire;
    }

    public void setKeepAndDepositRequire(String keepAndDepositRequire) {
        this.keepAndDepositRequire = keepAndDepositRequire == null ? null : keepAndDepositRequire.trim();
    }

    public String getInspectionAndUseRequire() {
        return inspectionAndUseRequire;
    }

    public void setInspectionAndUseRequire(String inspectionAndUseRequire) {
        this.inspectionAndUseRequire = inspectionAndUseRequire == null ? null : inspectionAndUseRequire.trim();
    }

    public Integer getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Integer isQualified) {
        this.isQualified = isQualified;
    }

    public String getTwoDimensionCode() {
        return twoDimensionCode;
    }

    public void setTwoDimensionCode(String twoDimensionCode) {
        this.twoDimensionCode = twoDimensionCode == null ? null : twoDimensionCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}