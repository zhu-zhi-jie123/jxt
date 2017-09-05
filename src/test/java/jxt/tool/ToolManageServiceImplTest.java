package jxt.tool;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.service.ToolManageService;
import com.jxt.utils.JxtResult;

public class ToolManageServiceImplTest {

	private ApplicationContext applicationContext;  
    
    @Before  
    public void setUp() throws Exception {  
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");  
    }  
	
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

}




