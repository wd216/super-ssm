package com.nf147.ssms.vo;

import com.nf147.ssms.entity.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class FormBean {
    private Set<Integer> ids;
    private List<Student> students;
    private Map<String, Student> studentMap;

    public Set<Integer> getIds() {
        return ids;
    }

    public void setIds(Set<Integer> ids) {
        this.ids = ids;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }
}
