package com.example.demolearn.thread;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-06 21:06
 **/
public class MainThread {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread run...");
                System.out.println("thread end.");
            }
        };
//        t.setDaemon(true);
        t.start();
        System.out.println("main end...");
    }
}
