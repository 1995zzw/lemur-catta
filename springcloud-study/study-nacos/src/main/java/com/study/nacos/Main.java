package com.study.nacos;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        int index = random.nextInt(20);
//
//        for (int i = 0; i < 20; i++) {
//            index = (index + 1) % 20;
//            System.out.println(index);
//        }
        ScheduledExecutorService executorService = Executors
                .newScheduledThreadPool(1, new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread thread = new Thread(r);
                        thread.setDaemon(true);
                        thread.setName("zzw");
                        return thread;
                    }
                });

        ScheduledFuture<?> yes = executorService.scheduleWithFixedDelay(() ->
                System.out.println("正在执行"), 0, 5000, TimeUnit.MILLISECONDS);

        System.out.println("主线程沉睡");

        try {
            Thread.sleep(20000);
        } catch (Exception e) {

        }
    }
}
