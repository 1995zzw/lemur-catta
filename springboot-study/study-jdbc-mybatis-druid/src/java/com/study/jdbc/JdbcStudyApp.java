package com.study.jdbc;

import com.study.jdbc.mapper.MapperConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackageClasses = MapperConfig.class)
public class JdbcStudyApp {
    public static void main(String[] args) {
        SpringApplication.run(JdbcStudyApp.class, args);
    }
}
