package com.nf147.ssms.demo_formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PersonFormatter implements Formatter<Person> {
    private String style;

    @Override
    public Person parse(String text, Locale locale) throws ParseException {
        // "370784191111111111"
        return new Person(parseProvinceFromId(text), parseBirthFromId(text), parseGenderFromId(text));
    }

    @Override
    public String print(Person object, Locale locale) {
        return null;
    }

    private String parseProvinceFromId(String id) {
        return provinceMapping.get(id.substring(0, 2));
    }

    private Date parseBirthFromId(String id) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd").parse(id.substring(6, 14));
    }

    private String parseGenderFromId(String id) {
        // 17: 偶数 女，奇数 男
        if (style != null && style.equals("en")) {
            return id.charAt(16) % 2 == 0 ? "female" : "male";
        }
        return id.charAt(16) % 2 == 0 ? "女" : "男";
    }

    public void setStyle(String style) {
        this.style = style;
    }

    private static Map<String, String> provinceMapping = new HashMap<String, String>() {{
        this.put("11", "北京市");
        this.put("12", "天津市");
        this.put("13", "河北省");
        this.put("14", "山西省");
        this.put("15", "内蒙古自治区");
        this.put("21", "辽宁省");
        this.put("22", "吉林省");
        this.put("23", "黑龙江省");
        this.put("31", "上海市");
        this.put("32", "江苏省");
        this.put("33", "浙江省");
        this.put("34", "安徽省");
        this.put("35", "福建省");
        this.put("36", "江西省");
        this.put("37", "山东省");
        this.put("41", "河南省");
        this.put("42", "湖北省");
        this.put("43", "湖南省");
        this.put("44", "广东省");
        this.put("45", "广西壮族自治区");
        this.put("46", "海南省");
        this.put("51", "四川省");
        this.put("52", "贵州省");
        this.put("53", "云南省");
        this.put("54", "西藏自治区");
        this.put("50", "重庆市");
        this.put("61", "陕西省");
        this.put("62", "甘肃省");
        this.put("63", "青海省");
        this.put("64", "宁夏回族自治区");
        this.put("65", "新疆维吾尔族自治区");
        this.put("83", "台湾地区");
        this.put("81", "香港特别行政区");
        this.put("82", "澳门特别行政区");
    }};
}
