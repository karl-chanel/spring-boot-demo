package com.example.demolearn;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-17 04:42
 **/
public class EnumLearn {
    public static void main(String[] args) {
        Number integer = Integer.valueOf(1000);
        System.out.println(integer);
        integer = Integer.valueOf(100202);
        System.out.println(integer.hashCode());
        color red = color.RED;
        Weekday sat = Weekday.SAT;
        System.out.println(sat);
        System.out.println(sat.name());
        Weekday day = Weekday.SUN;
        switch (day) {
            case MON, TUE, WED, THU, FRI -> System.out.println("Today is " + day + ". Work at office!");
            case SAT, SUN -> System.out.println("Today is " + day + ". Work at home!");
            default -> throw new RuntimeException("cannot process " + day);
        }
    }
}

enum color {
    RED, BLUE, GREEN, BLACK

}

enum Weekday {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
