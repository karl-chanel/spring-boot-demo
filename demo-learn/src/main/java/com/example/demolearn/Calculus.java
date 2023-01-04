package com.example.demolearn;

import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-15 08:16
 **/
public class Calculus {
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
//        fun1();
//        fun2();
//        fun3();
//        fun4(args);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
            ThreadInfo[] threadInfo = threadBean.dumpAllThreads(false, false);
            System.out.println(threadInfo.length + " os thread");
        }, 10, 1, TimeUnit.SECONDS);

        byte[] b1 = "Hello我".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b2 = "Hello我".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b3 = "Hello我".getBytes("GBK"); // 按GBK编码转换
        byte[] b4 = "Hello我".getBytes(StandardCharsets.UTF_8);
        byte[] copy = Arrays.copyOf(b1, b1.length);
        System.out.println(b1.hashCode());
        System.out.println(copy.hashCode());
        System.out.println(b1.length);
        System.out.println(b2.length);
        System.out.println(b3.length);
        System.out.println(b4.length);
        String s = "heloo";
        String s1 = "test";
        String s3 = "heloo我";
        String s4 = "test我";
        StringBuilder sb = new StringBuilder(1024);
        sb.append("[");
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(", ");
        }
        sb.append("]");
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.deleteCharAt(sb.lastIndexOf(" "));
        System.out.println(sb.toString());
        String[] names = {"Bob", "Alice", "Grace"};
        System.out.println(String.join("--", names));
        System.out.println(Integer.toOctalString(58269));
    }

    private static void fun4(String[] args) {
        System.out.println("args = " + Arrays.toString(args));
        String s1 = "Hello";
        String s2 = "world";
        String s3 = "我是中国人";
        String s = """
            SELECT * FROM
              users
            WHERE id > 100
            ORDER BY name DESC
            """;
        String re = s1 + " " + s2 + "!";
        System.out.println(re);
        System.out.println("===============================");
        System.out.println(s);
        System.out.println("===============================");
        String[] names = {"ABC", "XYZ", "zoo"};
        String s4 = names[1];
        names[1] = "cat";
        System.out.println(s4);
    }

    /**
     *
     * @param d1
     * @param d2
     * @param d3
     */
    private static void fun3(double d1, double d2, double d3) {
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    private static void fun2() {
        double x1 = 1.0 / 10;
        double y1 = 1 - 9.0 / 10;
        double abs = Math.abs(x1 - y1);
        if (abs <= 0.1) {
            System.out.println("u got it");
        } else {
            System.out.println("lose ");
        }
        System.out.println(x1 == y1);
        // 观察x和y是否相等:
        System.out.println(x1);
        System.out.println(y1);
    }

    private static void fun1() {
        int x = 100;
        int y = 15;
        int sum = x + y;
        System.out.println("ts");
        System.out.println(sum); // -2147483641
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++x);
        System.out.println(y << 1);
    }
}
