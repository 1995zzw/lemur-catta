package com.zzw.serverproduct;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerProductApp.class, args);
    }
}
