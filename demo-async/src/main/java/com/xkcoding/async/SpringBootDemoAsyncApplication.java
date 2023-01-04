package com.xkcoding.async;

import com.xkcoding.async.task.TaskFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-29 10:28
 */
@EnableAsync
@SpringBootApplication
@Slf4j
public class SpringBootDemoAsyncApplication {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        TaskFactory bean = SpringApplication.run(SpringBootDemoAsyncApplication.class, args).getBean(TaskFactory.class);
        Future<Boolean> future = bean.asyncTask2();
        log.info("in main");
        log.info(String.valueOf(future.get()));
    }

}

