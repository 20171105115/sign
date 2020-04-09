package com.edu.imnu.dao;

import com.edu.imnu.entity.Grade;
import com.edu.imnu.entity.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "staffDao")
public interface StaffDao {
    void insert(Staff staff);

    void delete(Integer staffId);

    void updateByInfo(Staff staff);

    List<Staff> selectByGradeId(@Param(value = "gradeId") Integer gradeId);

    Staff select(@Param(value = "staffId") Integer staffId);

    Staff selectByUsername(@Param(value = "username")String username);


}
