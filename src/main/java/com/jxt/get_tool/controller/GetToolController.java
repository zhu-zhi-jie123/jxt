package com.jxt.get_tool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxt.get_tool.pojo.ToolGet;
import com.jxt.utils.JxtResult;

/*
 * 领用工器具的Controller
 */
@Controller
public class GetToolController {

	/*
	 * 添加工器具领用表
	 */
	@RequestMapping("/get_tool/addToolGetForm")
	@ResponseBody
	public JxtResult addToolGetForm(ToolGet toolGet) {
		return null;
	}
	
	/*
	 * 编辑工器具领用表
	 */
	@RequestMapping("/get_tool/editToolGetForm")
	@ResponseBody
	public JxtResult editToolGetForm(ToolGet toolGet) {
		return null;
	}
	
}









