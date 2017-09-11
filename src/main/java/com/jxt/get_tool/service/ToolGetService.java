package com.jxt.get_tool.service;

import com.jxt.get_tool.pojo.ToolGet;
import com.jxt.utils.JxtResult;

public interface ToolGetService {
	JxtResult addToolGetForm(ToolGet toolGet);
	JxtResult editToolGetForm(ToolGet toolGet);
}
