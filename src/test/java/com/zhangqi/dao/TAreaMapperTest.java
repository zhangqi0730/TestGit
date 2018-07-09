package com.zhangqi.dao;

import com.zhangqi.model.TArea;
import com.zhangqi.model.TAreaExample;
import org.apache.catalina.mapper.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/3/28 0028.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TAreaMapperTest {
    @Autowired
    private TAreaMapper tAreaMapper;
    @Test
    public void countByExample() throws Exception {
        TAreaExample tAreaExample = new TAreaExample();
        TAreaExample.Criteria criteria = tAreaExample.createCriteria();
        criteria.andAreaNameEqualTo("南");
        int i = tAreaMapper.countByExample(tAreaExample);
        System.out.println(i);
    }

    @Test
    public void deleteByExample() throws Exception {

    }

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {
        TArea tArea = new TArea();
        tArea.setAreaName("南北");
        tArea.setAreaPriority("5");
        tArea.setCreateTime(new Date());
        tArea.setUpdateTime(new Date());
        int insert = tAreaMapper.insert(tArea);
        System.out.println(insert);
    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void selectByExample() throws Exception {

    }

    @Test
    public void selectByPrimaryKey() throws Exception {

    }

    @Test
    public void updateByExampleSelective() throws Exception {

    }

    @Test
    public void updateByExample() throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void updateByPrimaryKey() throws Exception {

    }

}