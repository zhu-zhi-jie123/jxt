package jxt.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.utils.JsonUtils;

public class TestListToJson {

	@Test
	public void testListToJson() {
		List<Tool> toolList = new ArrayList<Tool>();
		
		Tool tool1 = new Tool();
		tool1.setCid((long)111);
		tool1.setCreateDate(new Date());
		tool1.setInspectionAndUseRequire("1111");
		tool1.setKeepAndDepositRequire("111");
		
		Tool tool2 = new Tool();
		tool2.setCid((long)222);
		tool2.setCreateDate(new Date());
		tool2.setInspectionAndUseRequire("222");
		tool2.setKeepAndDepositRequire("222");
		
		Tool tool3 = new Tool();
		tool3.setCid((long)333);
		tool3.setCreateDate(new Date());
		tool3.setInspectionAndUseRequire("333");
		tool3.setKeepAndDepositRequire("333");
		
		toolList.add(tool1);
		toolList.add(tool2);
		toolList.add(tool3);
		
		System.out.println(JsonUtils.objectToJson(toolList));
	}
	
}
