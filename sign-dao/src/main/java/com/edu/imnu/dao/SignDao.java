package com.edu.imnu.dao;
import com.edu.imnu.entity.Sign;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "signDao")
public interface SignDao {
    void insert(Sign sign);//创建签到

    List<Sign> selectBySignList(Integer createId);//老师查看发布的签到列表
}
