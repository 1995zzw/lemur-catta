package com.zzw.serverproduct.controller;

import com.zzw.serverproduct.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/get")
    public String product() {
        Product product = new Product().selectById(1);
        product.setCount(product.getCount()-1);
        product.updateById();
        return "success";
    }
}
