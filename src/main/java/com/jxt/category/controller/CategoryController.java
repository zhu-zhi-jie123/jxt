package com.jxt.category.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxt.category.pojo.Category;
import com.jxt.category.service.CategoryService;
import com.jxt.utils.JxtResult;

/*
 * 分类Controller
 */
@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	/*
	 * 通过父分类查询子分类
	 */
	@RequestMapping("/category/getChildByPid")
	@ResponseBody
	public List<Category> getChildByPid(Long pid){
		List<Category> childList = categoryService.getChildByPid(pid);
		return childList;
	}
	
	/*
	 * 为某一分类添加子分类
	 */
	@RequestMapping("/category/addChildByCid")
	@ResponseBody
	public JxtResult addChildByCid(Long cid,String category_name) throws UnsupportedEncodingException {
		category_name = new String(category_name.getBytes("ISO-8859-1"), "UTF-8");
		JxtResult result = categoryService.addChildByCid(cid, category_name);
		return result;
	}
		
}





