package com.zzw.serverorder.controller;

import com.zzw.serverorder.dto.SsOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/get")
    public String order() {
        SsOrder order = new SsOrder();
        order.setOrderName("product");
        order.setOrderTime(new Date());
        order.insert();
        return "success";
    }
}
