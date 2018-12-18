package com.nf147.ssms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Computer {
    private String name = "dell";

    @JsonIgnore
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
