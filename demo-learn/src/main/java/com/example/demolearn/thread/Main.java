package com.example.demolearn.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-06 21:21
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        var add = new AddThread();
        var dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static final ReentrantLock l = new ReentrantLock();
    public static int count = 0;
}

class Counter1 {
    public static final AtomicInteger atomicInteger = new AtomicInteger(0);
}

class AddThread extends Thread {
    public void run() {
        for (int i = 0; i < 100000; i++) {
//            try {
//                Counter.l.lock();
//                Counter.count += 1;
//            } finally {
//                Counter.l.unlock();
//            }
            Counter1.atomicInteger.incrementAndGet();
        }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Counter1.atomicInteger.decrementAndGet();
//            try {
//                Counter.l.lock();
//                Counter.count -= 1;
//            } finally {
//                Counter.l.unlock();
//            }
        }

    }
}
