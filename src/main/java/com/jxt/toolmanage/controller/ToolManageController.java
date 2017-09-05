package com.jxt.toolmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.pojo.ToolVo;
import com.jxt.toolmanage.service.ToolManageService;
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
		List<Tool> toolList = toolManageService.getToolsByCid(cid);
		return toolList;
	}
	
	/*
	 * 某分类下添加单个工器具
	 */
	@RequestMapping("/tool/addTool")
	@ResponseBody
	public JxtResult addTool(Tool tool) throws Exception {
		JxtResult result = toolManageService.addTool(tool);
		return result;
	}
	
	/*
	 * 某分类下批量新增工器具
	 */
	@RequestMapping("/tool/addTools")
	@ResponseBody
	public JxtResult addTools(ToolVo toolVo) {
		return null;
	}
	
	/*
	 * 单个编辑工器具
	 */
	@RequestMapping("/tool/editTool")
	@ResponseBody
	public JxtResult editTool(Tool tool) {
		return null;
	}
	
	/*
	 * 批量编辑工器具
	 */
	@RequestMapping("/tool/editTools")
	@ResponseBody
	public JxtResult editTools(ToolVo toolVo) {
		return null;
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
		List<Tool> toolList = toolManageService.getToolByStatus(status);
		return toolList;
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
	
}














