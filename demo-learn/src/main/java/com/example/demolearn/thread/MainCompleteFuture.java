package com.example.demolearn.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-06 23:33
 **/
public class MainCompleteFuture {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().isDaemon());
            ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
            ThreadInfo[] threadInfo = threadBean.dumpAllThreads(false, false);
            System.out.println(threadInfo.length + " os thread");
        }, 3, 1, TimeUnit.SECONDS);
        CompletableFuture.supplyAsync(MainCompleteFuture::fetch).thenAccept((re) -> {
            System.out.println(re);
            System.out.println(Thread.currentThread().getName());
        }).exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });

    }

    static int fetch() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
        return 1000;
    }


}
