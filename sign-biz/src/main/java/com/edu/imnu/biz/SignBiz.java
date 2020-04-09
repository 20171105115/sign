package com.edu.imnu.biz;

import com.edu.imnu.entity.Sign;
import com.edu.imnu.entity.SignItem;

import java.util.List;

public interface SignBiz {
    void add(Sign sign);//发布签到

    void edit(SignItem signItem);//进行签到

    List<SignItem> findByGrade(Integer signInId);//学生查看应签到项目

    List<Sign> findByList(Integer createId);//老师查看自己发布的签到

    public List<SignItem> findByDetail(Integer signId);//查看具体签到人情况
}
