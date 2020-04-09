package com.edu.imnu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Grade {
    private Integer gradeId;
    private String gradeName;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date createTime;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
