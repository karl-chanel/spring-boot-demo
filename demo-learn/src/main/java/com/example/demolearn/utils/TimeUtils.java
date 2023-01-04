package com.example.demolearn.utils;

import java.time.Instant;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-18 01:28
 **/
public class TimeUtils {
    public static String hello(Instant now)
    {
        return "现在时间是：" + now.toString();
    }

}
