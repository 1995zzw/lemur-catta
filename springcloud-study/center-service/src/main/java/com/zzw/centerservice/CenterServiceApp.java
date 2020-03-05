package com.zzw.centerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CenterServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(CenterServiceApp.class, args);
    }
}
