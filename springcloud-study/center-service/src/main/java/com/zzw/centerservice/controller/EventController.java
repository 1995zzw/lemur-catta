package com.zzw.centerservice.controller;

import cn.hutool.core.date.DateUtil;
import com.zzw.centerservice.dto.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/event")
public class EventController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EventController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/get")
    public String takeOrder() {
        Event event = new Event();
        event.setEventBy("zzw");
        event.setEventTime(new Date());
        event.setEventTypeCode("order");
        jdbcTemplate.execute("insert into event (event_type_code,event_time,event_by) values (\'" + event.getEventTypeCode() + "\',\'" +
                DateUtil.formatDateTime(event.getEventTime()) + "\',\'" + event.getEventBy() + "\')");
        return "success";
    }
}
