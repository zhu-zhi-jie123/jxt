package com.jxt.get_tool.pojo;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ToolGet {
    private Long id;  //主键
    @NotEmpty(message="{get_tool.toolids.isNull}")
    private String toolids;  //所领工器具id
    @NotEmpty(message="{get_tool.noteNum.isNull}")
    private String noteNum;  //票据号码
    @NotNull(message="{get_tool.getDate.isNull}")
    private Date getDate;  //领用日期
    @NotNull(message="{get_tool.returnDate.isNull}")
    private Date returnDate;  //归还日期
    @NotEmpty(message="{get_tool.userName.isNull}")
    private String userName;  //领用人
    @NotEmpty(message="{get_tool.workingPlace.isNull}")
    private String workingPlace;  //工作地点

    private String workingContent;  //工作内容
    @NotNull(message="{get_tool.workBeginDate.isNull}")
    private Date workBeginDate;  //工作开始日期
    @NotNull(message="{get_tool.workEndDate.isNull}")
    private Date workEndDate;  //工作结束日期

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToolids() {
        return toolids;
    }

    public void setToolids(String toolids) {
        this.toolids = toolids == null ? null : toolids.trim();
    }

    public String getNoteNum() {
        return noteNum;
    }

    public void setNoteNum(String noteNum) {
        this.noteNum = noteNum == null ? null : noteNum.trim();
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace == null ? null : workingPlace.trim();
    }

    public String getWorkingContent() {
        return workingContent;
    }

    public void setWorkingContent(String workingContent) {
        this.workingContent = workingContent == null ? null : workingContent.trim();
    }

    public Date getWorkBeginDate() {
        return workBeginDate;
    }

    public void setWorkBeginDate(Date workBeginDate) {
        this.workBeginDate = workBeginDate;
    }

    public Date getWorkEndDate() {
        return workEndDate;
    }

    public void setWorkEndDate(Date workEndDate) {
        this.workEndDate = workEndDate;
    }
}