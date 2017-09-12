package com.jxt.toolmanage.service;

import java.util.List;
import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.pojo.ToolVo;
import com.jxt.utils.JxtResult;

public interface ToolManageService {
	List<Tool> getToolsByCid(Long cid);
	Tool getToolById(Long id);
	List<Tool> getToolByStatus(Integer status);
	JxtResult updateStatusById(Long id,Integer status);
	List<Tool> getAllTools();
	JxtResult addTool(Tool tool) throws Exception;
	JxtResult addTools(ToolVo toolVo) throws Exception;
	JxtResult editTool(Tool tool) throws Exception;
	JxtResult editTools(ToolVo toolVo) throws Exception;
	JxtResult exportExcel(String path) throws Exception;
}
