package com.zhangqi.dao;

import com.zhangqi.model.TArea;
import com.zhangqi.model.TAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAreaMapper {
    int countByExample(TAreaExample example);

    int deleteByExample(TAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TArea record);

    int insertSelective(TArea record);

    List<TArea> selectByExample(TAreaExample example);

    TArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByExample(@Param("record") TArea record, @Param("example") TAreaExample example);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
}