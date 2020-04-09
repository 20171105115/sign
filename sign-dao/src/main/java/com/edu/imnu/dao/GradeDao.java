package com.edu.imnu.dao;

import com.edu.imnu.entity.Grade;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "gradeDao")
public interface GradeDao {
    void insert(Grade grade);
    void delete(Integer gradeId);
    void update(Grade grade);
    List<Grade> selectAllGrade();
    Grade selectByGradeId(@Param(value = "id") Integer id);
}
