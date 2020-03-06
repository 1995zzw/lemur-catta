package com.zzw.studyapi.api;

import com.zzw.studyapi.config.FeignConfig;
import com.zzw.studyapi.fallback.OrderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order", configuration = FeignConfig.class,
        fallback = OrderFallback.class)
public interface OrderApi {
    @RequestMapping(value = "/order/get", method = RequestMethod.GET)
    String order();
}
