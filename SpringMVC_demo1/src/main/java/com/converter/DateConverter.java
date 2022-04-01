package com.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Date 2022/3/7 - 上午 10:44
 *  自定义转换器  日期
 */
public class DateConverter implements Converter<String, Date> {

    //s 就是表单传过来的参数 2012-12-12
    @Override
    public Date convert(String s) {
        //将日期字符串转换日期对象，进行返回
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
            //simpleDateFormat.format(date)    format格式化   parse：解析
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
