package com.zzw.serverorder;

import com.zzw.serverorder.mapper.MapperConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackageClasses = MapperConfig.class)
@EnableFeignClients
public class ServerOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerOrderApp.class, args);
    }
}
