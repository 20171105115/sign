package com.edu.imnu.controller;


import com.edu.imnu.biz.GradeBiz;
import com.edu.imnu.entity.Grade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Controller("gradeController")
@RequestMapping("/Grade")
public class GradeController {

    @Resource(name = "gradeBiz")
    private GradeBiz gradeBiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",gradeBiz.findAllGrade());
        return "grade_list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("grade",new Grade());
        return "grade_add";
    }

    @RequestMapping("/add")
    public String add(Grade grade){
        gradeBiz.add(grade);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(int id,Map<String,Object> map){
        map.put("grade",gradeBiz.findByGradeId(id));
        return "grade_update";
    }

    @RequestMapping("/update")
    public String update(Grade grade){
        gradeBiz.edit(grade);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove",params = "id")
    public String remove(int id){
        gradeBiz.remove(id);
        return "redirect:list";
    }


}
