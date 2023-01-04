package com.example.demolearn.thread;


import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2022-12-20 06:48
 **/

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
            ThreadInfo[] threadInfo = threadBean.dumpAllThreads(false, false);
            System.out.println(threadInfo.length + " os thread");
//            for (ThreadInfo info : threadInfo) {
//                System.out.println(info.getThreadName());
//            }
        }, 1, 2, TimeUnit.SECONDS);
        long l = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(200);

        IntStream.range(0, 10000).forEach(i -> {
            executor.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            });
        });
        executor.shutdown();
        executor.awaitTermination(100, TimeUnit.SECONDS);
        System.out.printf("耗时：%d ms\n", System.currentTimeMillis() - l);
    }
}
