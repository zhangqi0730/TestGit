package com.zhangqi.manage.impl;

import com.zhangqi.dao.TAreaMapper;
import com.zhangqi.manage.AreaService;
import com.zhangqi.model.TArea;
import com.zhangqi.model.TAreaExample;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
@Service
@Transactional
public class AreaServiceImpl implements AreaService {

    @Autowired
    private TAreaMapper tAreaMapper;

    @Override
    public int countByExample(TAreaExample example) {
        return tAreaMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TAreaExample example) {
        return tAreaMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        if (id != null) {
            try {
                int i = tAreaMapper.deleteByPrimaryKey(id);
                if (i > 0) {
                    return i;
                } else {
                    throw new RuntimeException("删除区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败:" + e.toString());
            }
        }
        throw new RuntimeException("删除区域信息失败:id=" + id);
    }

    @Override
    public int insert(TArea record) {
        if (StringUtils.isNotBlank(record.getAreaName())) {
            try {
                int insert = tAreaMapper.insert(record);
                if (insert > 0) {
                    return insert;
                } else {
                    throw new RuntimeException("插入区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败:" + e.toString());
            }
        }
        throw new RuntimeException("插入区域信息不能为空！");
    }

    @Override
    public int insertSelective(TArea record) {
        if (StringUtils.isNotBlank(record.getAreaName())) {
            try {
                int insert = tAreaMapper.insert(record);
                if (insert > 0) {
                    return insert;
                } else {
                    throw new RuntimeException("插入区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败:" + e.toString());
            }
        }
        throw new RuntimeException("插入区域信息不能为空！");
    }

    @Override
    public List<TArea> selectByExample(TAreaExample example) {
        return tAreaMapper.selectByExample(example);
    }

    @Override
    public TArea selectByPrimaryKey(Integer id) {
        if (id != null) {
            TArea tArea = tAreaMapper.selectByPrimaryKey(id);
            if (tArea != null) {
                return tArea;
            }
        }
        return null;
    }

    @Override
    public int updateByExampleSelective(@Param("record") TArea record, @Param("example") TAreaExample example) {

        try {
            int i = tAreaMapper.updateByExampleSelective(record, example);
            if (i > 0) {
                return i;
            } else {
                throw new RuntimeException("修改区域信息失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("修改区域信息失败:" + e.toString());
        }
    }

    @Override
    public int updateByExample(@Param("record") TArea record, @Param("example") TAreaExample example) {
        try {
            int i = tAreaMapper.updateByExampleSelective(record, example);
            if (i > 0) {
                return i;
            } else {
                throw new RuntimeException("修改区域信息失败！");
            }
        } catch (Exception e) {
            throw new RuntimeException("修改区域信息失败:" + e.toString());
        }
    }

    @Override
    public int updateByPrimaryKeySelective(TArea record) {

        if (record.getId() != null) {
            try {
                int i = tAreaMapper.updateByPrimaryKeySelective(record);
                if (i>0){
                    return i;
                }else {
                    throw new RuntimeException("修改区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("修改区域信息失败:" + e.toString());
            }
        }

        throw new RuntimeException("修改区域信息失败:id信息不能为空!");
    }

    @Override
    public int updateByPrimaryKey(TArea record) {
        if (record.getId() != null) {
            try {
                int i = tAreaMapper.updateByPrimaryKeySelective(record);
                if (i>0){
                    return i;
                }else {
                    throw new RuntimeException("修改区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("修改区域信息失败:" + e.toString());
            }
        }

        throw new RuntimeException("修改区域信息失败:id信息不能为空!");
    }
}
