package com.jxt.toolmanage.pojo;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.jxt.toolmanage.validation.ValidGroup1;

public class Tool {
    private Long id;  //主键
    @NotNull(message="{tool.cid.isNull}")
    private Long cid;  //所属分类id
    @NotNull(message="{tool.number.isNull}",groups={ValidGroup1.class})
    private String number;  //编号
    @NotNull(message="{tool.toolName.isNull}",groups={ValidGroup1.class})
    private String toolName;  //工器具名称
    @NotNull(message="{tool.testPeriod.isNull}",groups={ValidGroup1.class})
    private Integer testPeriod;  //测试周期
    @NotNull(message="{tool.lastTestDate.isNull}")
    private Date lastTestDate;  //上次测试日期
    @NotNull(message="{tool.modelNumber.isNull}",groups={ValidGroup1.class})
    private String modelNumber;  //规格型号
    @NotNull(message="{tool.createDate.isNull}",groups={ValidGroup1.class})
    private Date createDate;  //出厂日期
    @NotNull(message="{tool.validUsePeriod.isNull}",groups={ValidGroup1.class})
    private Integer validUsePeriod;  //有效使用周期

    private String keepAndDepositRequire;  //保管与存放要求

    private String inspectionAndUseRequire;  //检查与使用要求
    @NotNull(message="{tool.isQualified.isNull}")
    private Integer isQualified;  //是否合格   0:合格，1:不合格
    @NotNull(message="{tool.twoDimensionCode.isNull}")
    private String twoDimensionCode;  //二维码图片路径
    @NotNull(message="{tool.status.isNull}")
    private Integer status;  //状态  0:正常，1:待试验，2:正在试验，3:待报废，4:已报废，5:未被领用，6:被领用

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