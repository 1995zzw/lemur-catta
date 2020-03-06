package com.zzw.centerservice.controller;

import com.zzw.centerservice.dto.Event;
import com.zzw.studyapi.api.OrderApi;
import com.zzw.studyapi.api.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private OrderApi orderApi;

    @Autowired
    private ProductApi productApi;

    @GetMapping("/get")
    public String takeOrder() {
        String order = orderApi.order();
        String product = productApi.product();
        Event event = new Event();
        event.setEventBy("zzw");
        event.setEventTime(new Date());
        event.setEventTypeCode("order");
        event.insert();
        return "success";
    }
}
