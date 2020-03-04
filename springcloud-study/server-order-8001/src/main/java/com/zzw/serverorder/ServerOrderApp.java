package com.zzw.serverorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerOrderApp.class, args);
    }
}
