package com.edu.imnu.biz;

import com.edu.imnu.entity.Grade;

import java.util.List;

public interface GradeBiz {
    void add(Grade grade);
    void remove(Integer gradeId);
    void edit(Grade grade);
    List<Grade> findAllGrade();
    Grade findByGradeId(Integer id);
}
