package com.zzw.studyapi.api;

import com.zzw.studyapi.config.FeignConfig;
import com.zzw.studyapi.fallback.ProductFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "server-product", configuration = FeignConfig.class,
        fallback = ProductFallback.class)
public interface ProductApi {
    @RequestMapping(value = "/product/get", method = RequestMethod.GET)
    String product();
}
