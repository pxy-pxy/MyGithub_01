package com.itgaoshu.controller;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.service.EmpService;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping("selectEmpList.do")
    public String selectEmpList(Model model){
        List<Emp> emps = empService.selectEmpList();
        model.addAttribute("emps",emps);
        return  "index2";
    }
}
