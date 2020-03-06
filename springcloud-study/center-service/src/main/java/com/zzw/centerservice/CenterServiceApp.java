package com.zzw.centerservice;

import com.zzw.centerservice.mapper.MapperConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackageClasses = MapperConfig.class)
@ComponentScan(basePackages = "com.zzw")
@EnableFeignClients
public class CenterServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(CenterServiceApp.class, args);
    }
}
