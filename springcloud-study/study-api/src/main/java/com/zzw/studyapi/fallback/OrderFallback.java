package com.zzw.studyapi.fallback;

import com.zzw.studyapi.api.OrderApi;
import org.springframework.stereotype.Component;

@Component
public class OrderFallback implements OrderApi {
    @Override
    public String order() {
        return "failed";
    }
}
