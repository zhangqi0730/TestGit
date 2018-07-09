package com.zhangqi.manage;

import com.zhangqi.model.TArea;
import com.zhangqi.model.TAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
public interface AreaService {

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
