package jxt.tool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.pojo.ToolVo;
import com.jxt.toolmanage.service.ToolManageService;
import com.jxt.utils.JxtResult;

public class TestToolManageServiceImpl {

	private ApplicationContext applicationContext;  
    
    @Before  
    public void setUp() throws Exception {  
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");  
    }  
	
    /*
     * 测试单个添加工器具
     */
	@Test
	public void testAddTool() throws Exception {
		Tool tool = new Tool();
		tool.setCid((long)2);
		tool.setCreateDate(new Date());
		tool.setInspectionAndUseRequire("222");
		tool.setKeepAndDepositRequire("222");
		tool.setLastTestDate(new Date());
		tool.setModelNumber("222");
		tool.setNumber("222");
		tool.setTestPeriod(30);
		tool.setToolName("222");
		tool.setValidUsePeriod(360);
		ToolManageService toolManageService = (ToolManageService) applicationContext.getBean("toolManageServiceImpl");
		JxtResult result = toolManageService.addTool(tool);
		
		System.out.println(((Tool)result.getData()).getId());
		System.out.println(((Tool)result.getData()).getStatus());
		System.out.println(((Tool)result.getData()).getTwoDimensionCode());
		System.out.println(((Tool)result.getData()).getCreateDate());
	}
	
	/*
     * 测试批量添加工器具
     */
	@SuppressWarnings("unchecked")
	@Test
	public void testAddTools() throws Exception {
		ToolVo toolVo = new ToolVo();
		List<Tool> toolList = new ArrayList<Tool>();
		
		Tool tool1 = new Tool();
		tool1.setCid((long)2);
		tool1.setCreateDate(new Date());
		tool1.setInspectionAndUseRequire("222");
		tool1.setKeepAndDepositRequire("222");
		tool1.setLastTestDate(new Date());
		tool1.setModelNumber("222");
		tool1.setNumber("222");
		tool1.setTestPeriod(30);
		tool1.setToolName("222");
		tool1.setValidUsePeriod(360);
		
		Tool tool2 = new Tool();
		tool2.setCid((long)3);
		tool2.setCreateDate(new Date());
		tool2.setInspectionAndUseRequire("333");
		tool2.setKeepAndDepositRequire("333");
		tool2.setLastTestDate(new Date());
		tool2.setModelNumber("333");
		tool2.setNumber("333");
		tool2.setTestPeriod(60);
		tool2.setToolName("333");
		tool2.setValidUsePeriod(560);
		
		//检查事务（缺少cid则不能插入，前面两个就会回退）
		Tool tool3 = new Tool();
		//tool3.setCid((long)4);
		tool3.setCreateDate(new Date());
		tool3.setInspectionAndUseRequire("444");
		tool3.setKeepAndDepositRequire("444");
		tool3.setLastTestDate(new Date());
		tool3.setModelNumber("444");
		tool3.setNumber("444");
		tool3.setTestPeriod(60);
		tool3.setToolName("444");
		tool3.setValidUsePeriod(560);
		
		toolList.add(tool1);
		toolList.add(tool2);
		toolList.add(tool3);
		toolVo.setToolList(toolList);
		
		
		ToolManageService toolManageService = (ToolManageService) applicationContext.getBean("toolManageServiceImpl");
		JxtResult result = toolManageService.addTools(toolVo);
		
		List<Tool> toolListResult = new ArrayList<Tool>();
		if(result.getData() instanceof List<?>) {
			toolListResult = (List<Tool>) result.getData();
		}
		
		for (Tool tool : toolListResult) {
			System.out.println(tool.getId());
			System.out.println(tool.getCid());
			System.out.println(tool.getTwoDimensionCode());
			System.out.println("###################################");
		}
	}
	
	/*
	 * 测试单个编辑工器具
	 */
	@Test
	public void testEditTool() throws Exception {
		Tool tool = new Tool();
		tool.setId((long)16);
		tool.setCreateDate(new Date());
		tool.setLastTestDate(new Date());
		tool.setKeepAndDepositRequire("666");
		tool.setModelNumber("666");
		tool.setNumber("666");
		tool.setTestPeriod(666);
		tool.setToolName("666");
		tool.setValidUsePeriod(666);
		ToolManageService toolManageService = (ToolManageService) applicationContext.getBean("toolManageServiceImpl");
		JxtResult result = toolManageService.editTool(tool);
		
		System.out.println(result.getStatus());
		System.out.println(result.getMsg());
		System.out.println(((Tool)result.getData()).getId());
		System.out.println(((Tool)result.getData()).getTwoDimensionCode());
		System.out.println(((Tool)result.getData()).getInspectionAndUseRequire());
		System.out.println(((Tool)result.getData()).getNumber());
	}

}




