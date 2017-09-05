package com.jxt.toolmanage.mapper;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.pojo.ToolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolMapper {
    int countByExample(ToolExample example);

    int deleteByExample(ToolExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tool record);

    int insertSelective(Tool record);

    List<Tool> selectByExample(ToolExample example);

    Tool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tool record, @Param("example") ToolExample example);

    int updateByExample(@Param("record") Tool record, @Param("example") ToolExample example);

    int updateByPrimaryKeySelective(Tool record);

    int updateByPrimaryKey(Tool record);
}