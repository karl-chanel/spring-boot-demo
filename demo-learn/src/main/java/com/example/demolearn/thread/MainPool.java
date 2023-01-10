package com.example.demolearn.thread;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-06 23:12
 **/

import java.util.concurrent.*;

public class MainPool {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池:
        ExecutorService es = Executors.newCachedThreadPool();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(0, 10, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        // 关闭线程池:
        es.shutdown();
    }
}

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
