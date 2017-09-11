package com.jxt.get_tool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxt.get_tool.mapper.ToolGetMapper;
import com.jxt.get_tool.pojo.ToolGet;
import com.jxt.get_tool.pojo.ToolGetResult;
import com.jxt.toolmanage.mapper.ToolMapper;
import com.jxt.toolmanage.pojo.Tool;
import com.jxt.utils.JxtResult;

@Service
public class ToolGetServiceImpl implements ToolGetService {
	
	@Autowired
	private ToolGetMapper toolGetMapper;
	@Autowired
	private ToolMapper toolMapper;

	/*
	 * 添加工器具领用表(non-Javadoc)
	 * @see com.jxt.get_tool.service.ToolGetService#addToolGetForm(com.jxt.get_tool.pojo.ToolGet)
	 */
	@Override
	public JxtResult addToolGetForm(ToolGet toolGet) {
		//插入
		toolGetMapper.insertSelective(toolGet);
		//创建返回结果的对象
		ToolGetResult toolGetResult = new ToolGetResult(toolGet);
		//返回结果中的工器具名称
		StringBuilder toolNames = new StringBuilder("");
		//根据领用的id查询工器具名称
		String[] toolIds = toolGet.getToolids().split(",");
		for (int i=0; i<toolIds.length; i++) {
			Tool tool = toolMapper.selectByPrimaryKey(Long.parseLong(toolIds[i]));
			toolNames.append(tool.getToolName());
			if(i != (toolIds.length-1)) {
				toolNames.append(",");
			}
		}
		//设置属性
		toolGetResult.setGetToolNames((toolNames.toString()));
		return JxtResult.build(200, "添加成功！", toolGetResult);
	}

	/*
	 * 编辑工器具领用表(non-Javadoc)
	 * @see com.jxt.get_tool.service.ToolGetService#editToolGetForm(com.jxt.get_tool.pojo.ToolGet)
	 */
	@Override
	public JxtResult editToolGetForm(ToolGet toolGet) {
		//编辑
		toolGetMapper.updateByPrimaryKeySelective(toolGet);
		//创建返回结果的对象
		ToolGetResult toolGetResult = new ToolGetResult(toolGet);
		//返回结果中的工器具名称
		StringBuilder toolNames = new StringBuilder("");
		//根据领用的id查询工器具名称
		String[] toolIds = toolGet.getToolids().split(",");
		for (int i=0; i<toolIds.length; i++) {
			Tool tool = toolMapper.selectByPrimaryKey(Long.parseLong(toolIds[i]));
			toolNames.append(tool.getToolName());
			if(i != (toolIds.length-1)) {
				toolNames.append(",");
			}
		}
		//设置属性
		toolGetResult.setGetToolNames((toolNames.toString()));
		return JxtResult.build(200, "编辑成功！", toolGetResult);
	}

}







