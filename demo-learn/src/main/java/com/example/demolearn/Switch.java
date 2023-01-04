package com.example.demolearn;

import java.util.Arrays;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-16 04:01
 **/
public class Switch {
    class inner{
        private int i ;
        private  String name;

        public inner(int i, String name) {
            this.i = i;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        int option = 99;
        switch (option) {
            case 1 -> System.out.println("Selected 1");
            case 2 -> System.out.println("Selected 2");
            case 3 -> System.out.println("Selected 3");
            case 4 -> System.out.println("Selected 4");
            default -> System.out.println("Not selected");
        }
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println(ns);
        System.out.println(Arrays.toString(ns));
        System.out.println(ns);
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        System.out.println(Arrays.toString(args));
        System.out.println(args.getClass().getName());
        System.out.println("=======================================");
        int[][] ns1 = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(ns1));
    }
}
