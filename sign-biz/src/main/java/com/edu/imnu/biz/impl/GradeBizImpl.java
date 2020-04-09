package com.edu.imnu.biz.impl;

import com.edu.imnu.biz.GradeBiz;
import com.edu.imnu.dao.GradeDao;
import com.edu.imnu.entity.Grade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service(value = "gradeBiz")
public class GradeBizImpl implements GradeBiz {
    @Resource(name = "gradeDao")
    private GradeDao gradeDao;

    public void add(Grade grade) {
        grade.setCreateTime(new Date());
        gradeDao.insert(grade);
    }

    public void remove(Integer gradeId) {
        gradeDao.delete(gradeId);
    }

    public void edit(Grade grade) {
        gradeDao.update(grade);
    }

    public List<Grade> findAllGrade() {
        return gradeDao.selectAllGrade();
    }

    public Grade findByGradeId(Integer id) {
        return gradeDao.selectByGradeId(id);
    }
}
