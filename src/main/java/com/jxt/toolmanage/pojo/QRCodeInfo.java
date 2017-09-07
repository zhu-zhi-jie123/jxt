package com.jxt.toolmanage.pojo;

import java.util.Date;

/*
 * 二维码信息类（二维码需要显示的信息）
 */
public class QRCodeInfo {
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
	
	public QRCodeInfo(Tool tool) {
		this.createDate = tool.getCreateDate();
		this.inspectionAndUseRequire = tool.getInspectionAndUseRequire();
		this.isQualified = tool.getIsQualified();
		this.keepAndDepositRequire = tool.getKeepAndDepositRequire();
		this.lastTestDate = tool.getLastTestDate();
		this.modelNumber = tool.getModelNumber();
		this.number=tool.getNumber();
		this.testPeriod = tool.getTestPeriod();
		this.toolName = tool.getToolName();
		this.validUsePeriod = tool.getValidUsePeriod();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getToolName() {
		return toolName;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
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
		this.modelNumber = modelNumber;
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
		this.keepAndDepositRequire = keepAndDepositRequire;
	}

	public String getInspectionAndUseRequire() {
		return inspectionAndUseRequire;
	}

	public void setInspectionAndUseRequire(String inspectionAndUseRequire) {
		this.inspectionAndUseRequire = inspectionAndUseRequire;
	}

	public Integer getIsQualified() {
		return isQualified;
	}

	public void setIsQualified(Integer isQualified) {
		this.isQualified = isQualified;
	}

}
