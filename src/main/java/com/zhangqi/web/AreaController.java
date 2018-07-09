package com.zhangqi.web;

import com.zhangqi.manage.AreaService;
import com.zhangqi.model.TArea;
import com.zhangqi.model.TAreaExample;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
@RestController
@RequestMapping(value = "/areaAdmin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/areaList", method = RequestMethod.GET)
    public Map<String, Object> getList(TArea area, Integer pageNo, Integer pageSize, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> model = new HashMap<String, Object>();
        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        TAreaExample tAreaExample = new TAreaExample();
        TAreaExample.Criteria criteria = tAreaExample.createCriteria();
        criteria.andIdBetween((pageNo - 1) * pageSize + 1, pageNo * pageSize);
        tAreaExample.setOrderByClause("id desc");
        List<TArea> tAreas = areaService.selectByExample(tAreaExample);
        model.put("tAreas", tAreas);
        return model;
    }
}
