package com.jxt.category.service;

import java.util.List;

import com.jxt.category.pojo.Category;
import com.jxt.utils.JxtResult;

public interface CategoryService {
	List<Category> getChildByPid(Long pid);
	JxtResult addChildByCid(Long cid,String category_name);
}
