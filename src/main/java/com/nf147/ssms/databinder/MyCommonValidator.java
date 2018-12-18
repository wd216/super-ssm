package com.nf147.ssms.databinder;

import com.nf147.ssms.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

public class MyCommonValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        if (aClass == Student.class) {
            System.out.println("student");
            return true;
        }
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (o == null) {
            errors.reject("err.d");
        }
        if (o instanceof Student) {
            Student student = (Student) o;
            if (student.getEmail() == null || !Pattern.matches("^[a-zA-Z0-9]+@[a-zA-Z.]+$", student.getEmail())) {
                errors.rejectValue("email", "{err.order.email}");
            }
            if (student.getWeixin() == null || student.getWeixin().trim().length() < 10) {
                errors.rejectValue("weixin", null, "not right");
            }
        }
    }
}

