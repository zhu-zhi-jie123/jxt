package com.jxt.toolmanage.pojo;

import java.util.List;

import javax.validation.Valid;

public class ToolVo {
	//该注解为递归校验（此处会对Tool进行校验）
	@Valid
	List<Tool> toolList;  //用户批量操作

	public List<Tool> getToolList() {
		return toolList;
	}

	public void setToolList(List<Tool> toolList) {
		this.toolList = toolList;
	}
}
