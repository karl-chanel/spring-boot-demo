package com.example.demolearn.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.HexFormat;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-17 05:36
 **/
public record Point(int x, int y,int radis) {
    public Point {
    }

    public static Point of(int x, int y, int radis) {
        return new Point(x, y,radis);
    }

}

class Test {
    public static void main(String[] args) {
        String asad = "asad";
        try {
            byte[] bytes = asad.getBytes("GBK");
            int i = 100/0;
        } catch (UnsupportedEncodingException | ArithmeticException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("inside finally");
        }
        Point point = Point.of(5, 501,10);
        System.out.println(point.hashCode());
        point = Point.of(15, 15,10);
        System.out.println(point.hashCode());
        System.out.println(asad.hashCode());
        System.out.println(point);
        BigInteger bigInteger = BigInteger.valueOf(15145534);
        BigInteger pow = bigInteger.multiply(BigInteger.TEN).pow(10);
        System.out.println(pow.doubleValue());
        HexFormat hf = HexFormat.ofDelimiter(" ").withPrefix("0x").withUpperCase();
        System.out.println(hf.formatHex("Hello".getBytes()));

    }

}
class Person {
    String[] name = new String[2];
    Address address = new Address();
}

class Address {
    String city;
    String street;
    String zipcode;
}
