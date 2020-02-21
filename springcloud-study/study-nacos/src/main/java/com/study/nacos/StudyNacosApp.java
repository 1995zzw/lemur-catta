package com.study.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudyNacosApp {
    public static void main(String[] args) {
        SpringApplication.run(StudyNacosApp.class, args);
    }
}
