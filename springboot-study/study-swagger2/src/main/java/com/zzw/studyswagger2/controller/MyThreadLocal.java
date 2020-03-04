package com.zzw.studyswagger2.controller;

public class MyThreadLocal extends ThreadLocal<Integer> {
    @Override
    protected Integer initialValue() {
        return 0;
    }
}
