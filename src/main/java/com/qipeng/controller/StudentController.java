package com.qipeng.controller;

import com.qipeng.entity.Student;
import com.qipeng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 学生控制器
 * Created by Hooyuu14 on 2017/7/21.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("index")
    public String index(Model model) {
        List<Student> students = studentService.selectAll();
        model.addAttribute("listData", students);
        return "index";
    }
}
