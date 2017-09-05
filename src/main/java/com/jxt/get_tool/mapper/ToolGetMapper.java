package com.jxt.get_tool.mapper;

import com.jxt.get_tool.pojo.ToolGet;
import com.jxt.get_tool.pojo.ToolGetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolGetMapper {
    int countByExample(ToolGetExample example);

    int deleteByExample(ToolGetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ToolGet record);

    int insertSelective(ToolGet record);

    List<ToolGet> selectByExample(ToolGetExample example);

    ToolGet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ToolGet record, @Param("example") ToolGetExample example);

    int updateByExample(@Param("record") ToolGet record, @Param("example") ToolGetExample example);

    int updateByPrimaryKeySelective(ToolGet record);

    int updateByPrimaryKey(ToolGet record);
}