package jxt.category;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxt.category.pojo.Category;
import com.jxt.category.service.CategoryService;

public class TestCategory {
	
	private ApplicationContext applicationContext;  
    
    @Before  
    public void setUp() throws Exception {  
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");  
    }  
	
	/*
	 * 测试根据父分类查询子分类
	 */
	@Test
	public void testGetChildByPid() {
		CategoryService categoryService = (CategoryService) applicationContext.getBean("categoryServiceImpl");
		List<Category> categoryList = categoryService.getChildByPid((long)2);
		for (Category category : categoryList) {
			System.out.println(category.getCid());
			System.out.println(category.getCategoryName());
			System.out.println("#########################");
		}
	}
	
}
