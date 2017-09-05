package com.jxt.get_tool.pojo;

import java.util.Date;

public class ToolGet {
    private Long id;

    private Long toolid;

    private String noteNum;

    private Date getDate;

    private Date returnDate;

    private Long userId;

    private String getToolName;

    private String workingPlace;

    private String workingContent;

    private Date workBeginDate;

    private Date workEndDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getToolid() {
        return toolid;
    }

    public void setToolid(Long toolid) {
        this.toolid = toolid;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGetToolName() {
        return getToolName;
    }

    public void setGetToolName(String getToolName) {
        this.getToolName = getToolName == null ? null : getToolName.trim();
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