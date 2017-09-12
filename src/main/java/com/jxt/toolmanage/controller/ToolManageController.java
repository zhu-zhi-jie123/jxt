package com.jxt.toolmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.pojo.ToolVo;
import com.jxt.toolmanage.service.ToolManageService;
import com.jxt.toolmanage.validation.ValidGroup1;
import com.jxt.toolmanage.validation.ValidGroup2;
import com.jxt.utils.JxtResult;

/*
 * 工器具管理Controller
 */
@Controller
public class ToolManageController {
	
	@Autowired
	private ToolManageService toolManageService;

	/*
	 * 按分类查询工器具
	 */
	@RequestMapping("/tool/getToolsByCid")
	@ResponseBody
	public List<Tool> getToolsByCid(Long cid) {
		List<Tool> tools = toolManageService.getToolsByCid(cid);
		return tools;
	}
	
	/*
	 * 某分类下添加单个工器具
	 */
	@RequestMapping("/tool/addTool")
	@ResponseBody
	public JxtResult addTool(@Validated(value={ValidGroup2.class}) Tool tool,BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			return JxtResult.build(500, "必填项不能为空！", tool);
		}
		JxtResult result = toolManageService.addTool(tool);
		return result;
	}
	
	/*
	 * 某分类下批量新增工器具
	 */
	@RequestMapping("/tool/addTools")
	@ResponseBody
	public JxtResult addTools(@Validated(value={ValidGroup2.class}) ToolVo toolVo,BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			return JxtResult.build(500, "必填项不能为空！", toolVo.getToolList());
		}
		JxtResult result = toolManageService.addTools(toolVo);
		return result;
	}
	
	/*
	 * 单个编辑工器具
	 */
	@RequestMapping("/tool/editTool")
	@ResponseBody
	public JxtResult editTool(@Validated(value={ValidGroup1.class}) Tool tool,BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			return JxtResult.build(500, "必填项不能为空！", tool);
		}
		JxtResult result = toolManageService.editTool(tool);
		return result;
	}
	
	/*
	 * 批量编辑工器具
	 */
	@RequestMapping("/tool/editTools")
	@ResponseBody
	public JxtResult editTools(@Validated(value={ValidGroup1.class}) ToolVo toolVo,BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()) {
			return JxtResult.build(500, "必填项不能为空！", toolVo.getToolList());
		}
		JxtResult result = toolManageService.editTools(toolVo);
		return result;
	}
	
	/*
	 * 根据id查询工器具
	 */
	@RequestMapping("/tool/getToolById")
	@ResponseBody
	public Tool getToolById(Long id) {
		Tool tool = toolManageService.getToolById(id);
		return tool;
	}
	
	/*
	 * 根据状态查询工器具
	 * 0:正常，1:待试验，2:正在试验，3:待报废，4:已报废，5:未被领用，6:被领用
	 */
	@RequestMapping("/tool/getToolByStatus")
	@ResponseBody
	public List<Tool> getToolByStatus(int status) {
		List<Tool> tools = toolManageService.getToolByStatus(status);
		return tools;
	}
	
	/*
	 * 根据工器具id修改其状态
	 */
	@RequestMapping("/tool/updateStatusById")
	@ResponseBody
	public JxtResult updateStatusById(Long id,int status) {
		JxtResult result = toolManageService.updateStatusById(id, status);
		return result;
	}
	
	/*
	 * 查询所有工器具
	 */
	@RequestMapping("/tool/getAllTools")
	@ResponseBody
	public List<Tool> getAllTools() {
		List<Tool> tools = toolManageService.getAllTools();
		return tools;
	}
	
	/*
	 * 以excel格式导出工器具信息
	 */
	@RequestMapping("/tool/exportExcel")
	@ResponseBody
	public JxtResult exportExcel(String path) {
		JxtResult result;
		try {
			result = toolManageService.exportExcel(path);
		} catch (Exception e) {
			return JxtResult.build(500, "导出失败！");
		}
		return result;
	}
	
}














