package com.edu.imnu.controller;


import com.edu.imnu.biz.GradeBiz;
import com.edu.imnu.biz.StaffBiz;
import com.edu.imnu.entity.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;
import java.util.List;
import java.util.Map;

@Controller("staffController")
@RequestMapping("/Staff")
public class StaffController {

    @Resource(name = "staffBiz")
    private StaffBiz staffBiz;

    @Resource(name = "gradeBiz")
    private GradeBiz gradeBiz;

    @RequestMapping("/self")
    public String self(Integer staffId,Map<String,Object> map){
        map.put("self",staffBiz.find(staffId));
        return "staff_self";
    }

    @RequestMapping("/to_add")
    public String to_add(Map<String,Object> map){
        map.put("gradeList",gradeBiz.findAllGrade());
        map.put("staff",new Staff());
        return "staff_add";
    }
    @RequestMapping("/add")
    public String add(Staff staff,HttpSession session){
        staffBiz.add(staff);
        return "redirect:self?staffId="+((Staff)session.getAttribute("user")).getStaffId();
    }
    @RequestMapping("/remove")//注销账户所用
    public String remove(HttpSession session){
        session.setAttribute("user",null);
        return "login";
    }

    @RequestMapping("/to_check")
    public String toCheckPwd(Integer staffId,Map<String,Object> map){
        map.put("staffId",staffId);
        return "check_pwd";
    }

    @RequestMapping("/checkPwd")
    public String checkPassword(String newPwd1,String newPwd2,String oldPwd,Integer staffId){
        if (staffBiz.editByPassword(oldPwd, newPwd1, newPwd2, staffId)) {
            return "redirect:self?staffId=" + staffId;
        }
        return "login";//修改失败返回重新登录
    }

    //查班级所有的同学
    @RequestMapping("/staff_list")
    public String listByGrade(Integer gradeId,Map<String,Object> map){
        List<Staff> list = staffBiz.findByGradeId(gradeId);
        map.put("list",list);
        return "staff_list";
    }


    @RequestMapping("/to_update")
    public String to_update(Integer staffId,Map<String,Object> map){
        map.put("gradeList",gradeBiz.findAllGrade());
        map.put("staff",staffBiz.find(staffId));
        return "staff_update";
    }
    @RequestMapping("/update")
    public String update(HttpSession session,Staff staff){
        staffBiz.editByInfo(staff);
        session.setAttribute("user",staff);
        return "redirect:self?staffId="+staff.getStaffId();
    }

    @RequestMapping("/to_login")
    public String to_login(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session,String username, String password){
        Staff staff = staffBiz.Login(username);
        if (password.equals(staff.getPassword())){
            session.setAttribute("user",staff);
            return "redirect:self?staffId="+staff.getStaffId();
        }
        return "login";
    }

}
