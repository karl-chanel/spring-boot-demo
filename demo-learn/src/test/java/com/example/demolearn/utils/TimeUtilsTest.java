package com.example.demolearn.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-18 01:28
 **/
@DisplayName("时间工具类测试")
class TimeUtilsTest {

    @Test
    void hello() {
        String[] strings = {"xsdcsd", "dasadsasd", "fwefewfw", "dwedwe"};
        Object[] ds = Arrays.stream(strings)
            .map(s -> s + "!!!!!")
            .filter(s -> {
                return s.startsWith("d");
            })
            .toArray();

        System.out.println(Arrays.toString(ds));
        Instant now = Instant.now();
        Map<String, String> map = System.getenv();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            System.out.println();
        }

        System.out.println();
        System.out.println();


        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getProperty("java.version"));
        String expect = "现在时间是：" + now.toString();
        assertEquals(expect, TimeUtils.hello(now));
        Callable<String> callable = new Callable<>() {
            @Override
            public String call() throws Exception {
                return "test";
            }
        };
        Callable<String> action1 = () -> "damn";
    }

    @Test
    void assume() {
        assumingThat("DEV".equals(System.getenv("ENV")),
            () -> {
                // 如果不为true这里将不执行
                System.out.println("test");
                assertEquals(1, 1);
            });

//        assumeTrue("DEV".equals(System.getenv("ENV")),
//            () -> "Aborting test: not on developer workstation");
        // 如果不为true这里将不执行
    }
}
