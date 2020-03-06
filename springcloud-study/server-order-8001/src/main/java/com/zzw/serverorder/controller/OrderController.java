package com.zzw.serverorder.controller;

import com.zzw.serverorder.dto.SsOrder;
import com.zzw.serverorder.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/get")
    public String order() {
        String s = orderMapper.queryOrder();
        SsOrder order = new SsOrder();
        order.setOrderName("product");
        order.setOrderTime(new Date());
        order.insert();
        return "success";
    }
}
