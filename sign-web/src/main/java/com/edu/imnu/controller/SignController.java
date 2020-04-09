package com.edu.imnu.controller;

import com.edu.imnu.biz.GradeBiz;
import com.edu.imnu.biz.SignBiz;
import com.edu.imnu.biz.StaffBiz;
import com.edu.imnu.entity.Sign;
import com.edu.imnu.entity.SignItem;
import com.edu.imnu.entity.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller("signController")
@RequestMapping("/Sign")
public class SignController {

    @Resource(name = "gradeBiz")
    private GradeBiz gradeBiz;

    @Resource(name = "signBiz")
    private SignBiz signBiz;

    @Resource(name = "staffBiz")
    private StaffBiz staffBiz;

    @RequestMapping("/to_add_sign")
    public String to_add_sign(Map<String,Object> map){
        map.put("sign",new Sign());
        return "sign_add";
    }

    @RequestMapping("/add_sign")
    public String add_sign(Sign sign){
        signBiz.add(sign);
        return "redirect:sign_list";
    }

    @RequestMapping("/sign_list")
    public String sign_list(HttpSession session,Map<String,Object> map){
        Staff staff = (Staff)session.getAttribute("user");
        map.put("List",signBiz.findByList(staff.getStaffId()));
        return "sign_list";
    }

    @RequestMapping("/sign_details")//查看签到详情
    public String details(Integer signId, Map<String,Object> map) throws ParseException {//查看详情
        map.put("List",signBiz.findByDetail(signId));
        return "sign_details";
    }

    @RequestMapping("/to_sign")//查看自己的签到
    public String to_sign(Integer signInId,Map<String,Object> map){
        map.put("Self",signBiz.findByGrade(signInId));
        return "sign";
    }

    @RequestMapping("/sign")
    public String sign(SignItem signItem){
        signBiz.edit(signItem);
        return "redirect:to_sign";
    }






}
