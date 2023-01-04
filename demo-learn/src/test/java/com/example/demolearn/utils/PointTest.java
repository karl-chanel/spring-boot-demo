package com.example.demolearn.utils;

import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;

import java.lang.reflect.*;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-18 03:17
 **/
class PointTest {
    @Test
    void reflectTest() throws NoSuchFieldException, IllegalAccessException {
        String s = "hulu";

        Field f = String.class.getDeclaredField("value");
        AnnotatedType[] classes = s.getClass().getAnnotatedInterfaces();
        for (AnnotatedType aClass : classes) {
            System.out.println(aClass.getAnnotations());
        }
        f.setAccessible(true);
        byte[] o = (byte[])f.get(s);
        System.out.println(new String(o));
//        Field[] fields = String.class.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getGenericType() + " : " + field.getName());
//        }
        System.out.println("====================================");
        System.out.println(f.getName()); // "value"
        System.out.println(f.getType()); // class [B 表示byte[]类型
        int m = f.getModifiers();
        System.out.println(m);
        System.out.println(Modifier.isFinal(m)); // true
        System.out.println(Modifier.isPublic(m)); // false
        System.out.println(Modifier.isProtected(m)); // false
        System.out.println(Modifier.isPrivate(m)); // true
        System.out.println(Modifier.isStatic(m)); // false

    }
    @Test
    void fastjsonPonit() {
        Point point = new Point(53, 16,10);
        String s = JSON.toJSONString(point);
        System.out.println(s);
        Point object = JSON.parseObject(s, Point.class);
        System.out.println(object.radis());
    }

    @Test
    void stringTest() {
//        String s1 = new String("二哥三妹");
//        String s2 = s1.intern();
//        System.out.println(s1 == s2);
        String s1 = "二哥三妹";
//        String s2 = "二哥三妹";
        String s2 = s1.intern();
        String s = new String("dfdfd");
        System.out.println(s1 == s2);
        System.out.println(this.getClass().getClassLoader().getParent().getParent());
        System.out.println(this.getClass().getPackageName());

    }


    @Test
    void name() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
            Hello.class.getClassLoader(), // 传入ClassLoader
            new Class[] { Hello.class }, // 传入要实现的接口
            handler); // 传入处理调用方法的InvocationHandler
        hello.morning("Bob");
    }
    }

interface Hello {
    void morning(String name);
}
