package com.nf147.ssms.demo_formatter;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface PersonFromId {
    // 作为输出语言的控制
    String value() default "zh";
}