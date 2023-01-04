package com.example.demolearn.anno;

import java.lang.annotation.*;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-19 04:04
 **/
@Target(ElementType.TYPE)
@Repeatable(Apis.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Api {
    int type() default 0;

    String level() default "info";

    String value() default "";
}

