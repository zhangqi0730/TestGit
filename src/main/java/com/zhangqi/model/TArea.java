package com.zhangqi.model;

import java.util.Date;

public class TArea {
    private Integer id;

    private String areaName;

    private String areaPriority;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaPriority() {
        return areaPriority;
    }

    public void setAreaPriority(String areaPriority) {
        this.areaPriority = areaPriority == null ? null : areaPriority.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}