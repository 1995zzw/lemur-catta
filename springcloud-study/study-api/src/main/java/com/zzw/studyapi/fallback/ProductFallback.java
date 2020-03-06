package com.zzw.studyapi.fallback;

import com.zzw.studyapi.api.ProductApi;
import org.springframework.stereotype.Component;

@Component
public class ProductFallback implements ProductApi {
    @Override
    public String product() {
        return "failed";
    }
}
