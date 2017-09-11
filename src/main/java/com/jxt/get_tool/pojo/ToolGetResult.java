package com.jxt.get_tool.pojo;

public class ToolGetResult extends ToolGet {
	private String getToolNames;
	
	public ToolGetResult(ToolGet toolGet) {
		super();
		this.setId(toolGet.getId());
		this.setGetDate(toolGet.getGetDate());
		this.setNoteNum(toolGet.getNoteNum());
		this.setReturnDate(toolGet.getReturnDate());
		this.setToolids(toolGet.getToolids());
		this.setUserName(toolGet.getUserName());
		this.setWorkBeginDate(toolGet.getWorkBeginDate());
		this.setWorkEndDate(toolGet.getWorkEndDate());
		this.setWorkingContent(toolGet.getWorkingContent());
		this.setWorkingPlace(toolGet.getWorkingPlace());
	}

	public String getGetToolNames() {
		return getToolNames;
	}

	public void setGetToolNames(String getToolNames) {
		this.getToolNames = getToolNames;
	}
}
