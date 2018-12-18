package com.nf147.ssms.databinder;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyStringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        try {
            return new SimpleDateFormat("yyyy-mm-dd").parse(source);
        } catch (ParseException e) {
            return null;
        }
    }
}

