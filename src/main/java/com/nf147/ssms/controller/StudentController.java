package com.nf147.ssms.controller;


import com.nf147.ssms.entity.Student;
import com.nf147.ssms.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
  private  StudentMapper studentMapper;

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model) {
        List<Student> students = studentMapper.selectAll();
        model.addAttribute("students", students);
        return "home";
    }
    @RequestMapping(value = "/a",method = RequestMethod.GET )
    public String go(Model model){
        return "ArrayList";
    }


   /* @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity homeDemo (Model model) {
        ResponseEntity.BodyBuilder status = ResponseEntity.status(200);
        return ResponseEntity.status(200);
    }*/
}
