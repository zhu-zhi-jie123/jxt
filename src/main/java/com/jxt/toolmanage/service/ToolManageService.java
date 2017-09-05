package com.jxt.toolmanage.service;

import java.util.List;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.utils.JxtResult;

public interface ToolManageService {
	List<Tool> getToolsByCid(Long cid);
	Tool getToolById(Long id);
	List<Tool> getToolByStatus(Integer status);
	JxtResult updateStatusById(Long id,Integer status);
	JxtResult addTool(Tool tool) throws Exception;
}