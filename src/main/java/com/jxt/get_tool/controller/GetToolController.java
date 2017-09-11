package com.jxt.get_tool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxt.get_tool.pojo.ToolGet;
import com.jxt.get_tool.service.ToolGetService;
import com.jxt.utils.JxtResult;

/*
 * 领用工器具的Controller
 */
@Controller
public class GetToolController {

	@Autowired
	private ToolGetService toolGetService;
	
	/*
	 * 添加工器具领用表
	 */
	@RequestMapping("/get_tool/addToolGetForm")
	@ResponseBody
	public JxtResult addToolGetForm(@Validated ToolGet toolGet,BindingResult bindingResult) {
		//校验
		if(bindingResult.hasErrors()) {
			return JxtResult.build(500, "必填项不能为空！",toolGet);
		}
		JxtResult result = toolGetService.addToolGetForm(toolGet);
		return result;
	}
	
	/*
	 * 编辑工器具领用表
	 */
	@RequestMapping("/get_tool/editToolGetForm")
	@ResponseBody
	public JxtResult editToolGetForm(@Validated ToolGet toolGet,BindingResult bindingResult) {
		if(bindingResult.hasErrors() || toolGet.getId()==null) {
			return JxtResult.build(500, "必填项不能为空！",toolGet);
		}
		JxtResult result = toolGetService.editToolGetForm(toolGet);
		return result;
	}
	
}









