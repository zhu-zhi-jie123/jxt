package com.jxt.category.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxt.category.mapper.CategoryMapper;
import com.jxt.category.pojo.Category;
import com.jxt.category.pojo.CategoryExample;
import com.jxt.category.pojo.CategoryExample.Criteria;
import com.jxt.utils.JxtResult;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	/*
	 * 根据父分类id查询子分类(non-Javadoc)
	 * @see com.jxt.category.service.CategoryService#selectChildByPid(long)
	 */
	@Override
	public List<Category> getChildByPid(Long pid) {
		List<Category> childList = new ArrayList<Category>();
		//如果pid为0则查询一级分类
		if(pid == 0) {
			childList = categoryMapper.selectFirstLevelCategory(pid);
			return childList;
		}
		//pid不为0则查询相应的子分类
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		childList = categoryMapper.selectByExample(example);
		return childList;
	}

	/*
	 * 为某一分类添加子分类(non-Javadoc)
	 * @see com.jxt.category.service.CategoryService#addChildByCid(java.lang.Long)
	 */
	@Override
	public JxtResult addChildByCid(Long cid,String category_name) {
		//设置属性
		Category category = new Category();
		category.setCategoryName(category_name);
		category.setPid(cid); //cid为新分类的父分类id
		//插入,会自动将插入的记录的cid注入
		categoryMapper.insert(category);
		return JxtResult.build(200, "添加成功", category);
	}

}





