package jxt.get_tool;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxt.get_tool.pojo.ToolGet;
import com.jxt.get_tool.pojo.ToolGetResult;
import com.jxt.get_tool.service.ToolGetService;
import com.jxt.utils.JxtResult;

public class TestToolGetServiceImpl {
	
	private ApplicationContext applicationContext;  
    
    @Before  
    public void setUp() throws Exception {  
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");  
    }  
	
	@Test
	public void testToolGetService() {
		ToolGet toolGet = new ToolGet();
		toolGet.setGetDate(new Date());
		toolGet.setNoteNum("8888");
		toolGet.setReturnDate(new Date());
		toolGet.setToolids("1,2,6,7,8");
		toolGet.setUserName("竹志杰");
		toolGet.setWorkBeginDate(new Date());
		toolGet.setWorkEndDate(new Date());
		toolGet.setWorkingContent("啦啦啦");
		toolGet.setWorkingPlace("学校");
		ToolGetService toolGetService = (ToolGetService) applicationContext.getBean("toolGetServiceImpl");
		JxtResult result = toolGetService.addToolGetForm(toolGet);
		System.out.println(((ToolGetResult)result.getData()).getId());
		System.out.println(((ToolGetResult)result.getData()).getToolids());
		System.out.println(((ToolGetResult)result.getData()).getGetToolNames());
	}
	
}
