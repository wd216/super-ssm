package com.nf147.ssms.service.impl;

import com.nf147.ssms.entity.Computer;
import com.nf147.ssms.entity.Student;
import com.nf147.ssms.exception.ConnException;
import com.nf147.ssms.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public Student getStudent() {
        Student student = new Student();
        Computer computer = new Computer();

        computer.setStudent(student);
        student.setComputer(computer);

        int i = new Random().nextInt();
        if (i % 2 == 0) {
            throw new ConnException("连接错误，你不能连接成双成对的");
        } else if (i % 3 == 0) {
            throw new RuntimeException();
        }

        student.setName("shui");
        student.setId(233);
        student.setEmail("shui@gmail.com");
        student.setBirthday(new Date());
        return student;
    }
}
