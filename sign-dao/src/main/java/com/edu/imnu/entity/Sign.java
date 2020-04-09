package com.edu.imnu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Sign {
    private Integer signId;

    private Integer createId;//创建人

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date createTime;//创建时间

    private Integer gradeId;//发布班级

    private Staff creator;

    private Grade grade;

    public Staff getCreator() {
        return creator;
    }

    public void setCreator(Staff creator) {
        this.creator = creator;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }
}
