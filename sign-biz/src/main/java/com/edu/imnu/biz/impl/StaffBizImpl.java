package com.edu.imnu.biz.impl;

import com.edu.imnu.biz.StaffBiz;
import com.edu.imnu.dao.StaffDao;
import com.edu.imnu.entity.Staff;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service(value = "staffBiz")
public class StaffBizImpl implements StaffBiz {

    @Resource(name = "staffDao")
    private StaffDao staffDao;

    public void add(Staff staff) {
        staff.setPassword("123");
        staffDao.insert(staff);
    }

    public void remove(Integer staffId) {
        staffDao.delete(staffId);
    }

    public Boolean editByPassword(String oldPwd, String newPwd1 , String newPwd2, Integer staffId) {
        Staff staff = staffDao.select(staffId);
        System.out.println(staffId);
//        System.out.println(oldPwd+"   "+staff.getPassword());
        if (oldPwd.equals(staff.getPassword())){
//            System.out.println(newPwd1+"  "+newPwd2);
            if (newPwd1.equals(newPwd2)){
                staff.setPassword(newPwd1);
                staffDao.updateByInfo(staff);
                return true;
            }
        }
        return false;
    }

    public void editByInfo(Staff staff) {
        staffDao.updateByInfo(staff);
    }


    public List<Staff> findByGradeId(Integer gradeId) {
        return staffDao.selectByGradeId(gradeId);
    }

    public Staff find(Integer staffId) {
        return staffDao.select(staffId);
    }

    public Staff Login(String username){

        return staffDao.selectByUsername(username);
    }
}
