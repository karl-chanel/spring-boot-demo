package com.example.demolearn;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.time.Instant;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-17 04:26
 **/
public class JbeanLean {
    private static final Logger l = LoggerFactory.getLogger(JbeanLean.class);
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(BeanTest.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            l.info(pd.getName()+" -> "+pd.getPropertyType());
            l.info("" + pd.getReadMethod());
            l.info("" + pd.getWriteMethod());
            l.info("=====================================");
            l.info("输出了javavbean字段:{}", pd.getName());
            l.warn(Instant.now().toString());

        }

        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}

class BeanTest {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
