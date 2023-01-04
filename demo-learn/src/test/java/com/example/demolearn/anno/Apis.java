package com.example.demolearn.anno;

import java.lang.annotation.*;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-19 04:43
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Toop
@Marker("inside apis")
public @interface Apis {
    Api[] value();
}
