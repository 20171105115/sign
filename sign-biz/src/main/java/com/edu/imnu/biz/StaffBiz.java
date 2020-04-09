package com.edu.imnu.biz;

import com.edu.imnu.entity.Staff;

import java.util.List;

public interface StaffBiz {
    void add(Staff staff);

    void remove(Integer staffId);

    Boolean editByPassword(String oldPwd,String newPwd1,String newPwd2,Integer staffId);//改密码

    void editByInfo(Staff staff);//改个人信息

    List<Staff> findByGradeId(Integer gradeId);//通过班级查同学信息

    Staff find(Integer staffId);//查个人信息

    Staff Login(String username);

}
