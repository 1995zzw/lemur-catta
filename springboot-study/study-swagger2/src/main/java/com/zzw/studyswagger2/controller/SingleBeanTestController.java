package com.zzw.studyswagger2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleBeanTestController {

    private MyThreadLocal k = new MyThreadLocal();
    private int a = 1;

    final Object o = new Object();

    @RequestMapping("/testA")
    public int testA() {
//        Integer integer = k.get();
//        integer++;
//        k.set(integer);
//        return k.get();
        synchronized (o) {
            a = a + 1;
        }
        return a;
    }

    @RequestMapping("/testB")
    public int testB() {
        a = a + 1;
        return a;
    }
}
