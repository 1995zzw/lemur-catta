package com.study.jdbc.controller;

import com.study.jdbc.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final JdbcTemplate jdbcTemplate;

    private final TestMapper testMapper;

    @Autowired
    public DemoController(JdbcTemplate jdbcTemplate,
                          TestMapper testMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.testMapper = testMapper;
    }

    @GetMapping("/test01")
    public Object getTask() {
        return jdbcTemplate
                .queryForList("select * from test limit 2");
    }

    @GetMapping("/test02")
    public Object getTask2() {
        return testMapper.getTask2();
    }
}
