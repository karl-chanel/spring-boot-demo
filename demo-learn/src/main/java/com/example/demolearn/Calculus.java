package com.example.demolearn;

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
    public static void main(String[] args) {
//        fun1();
//        fun2();
//        fun3();
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
        System.out.println(s);
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
