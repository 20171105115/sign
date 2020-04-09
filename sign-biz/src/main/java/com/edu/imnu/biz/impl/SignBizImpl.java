package com.edu.imnu.biz.impl;

import com.edu.imnu.biz.SignBiz;
import com.edu.imnu.dao.SignDao;
import com.edu.imnu.dao.SignItemDao;
import com.edu.imnu.dao.StaffDao;
import com.edu.imnu.entity.Sign;
import com.edu.imnu.entity.SignItem;
import com.edu.imnu.entity.Staff;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service(value = "signBiz")
public class SignBizImpl implements SignBiz {

    @Resource(name = "signDao")
    private SignDao signDao;

    @Resource(name = "staffDao")
    private StaffDao staffDao;

    @Resource(name = "signItemDao")
    private SignItemDao signItemDao;

    public void add(Sign sign) {

        sign.setCreateTime(new Date());
        List<Staff> staff = staffDao.selectByGradeId(sign.getGradeId());
        signDao.insert(sign);
        for (Staff s:staff){
            SignItem signItem = new SignItem();
            signItem.setStatus("待签到");
            signItem.setSignId(sign.getSignId());
            signItem.setSignInId(s.getStaffId());
            signItemDao.insert(signItem);
        }
    }


    public List<SignItem> findByGrade(Integer signInId) {
        return signItemDao.selectBySelf(signInId);
    }

    public void edit(SignItem signItem) {
        signItem.setSignInTime(new Date());
        signItem.setStatus("已签到");

        signItemDao.update(signItem);
    }


    public List<Sign> findByList(Integer createId) {
        return signDao.selectBySignList(createId);
    }

    public List<SignItem> findByDetail(Integer signId){
        return signItemDao.selectByDetail(signId);
    }


}
