package com.spring_cloud.eureka.client.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/product/{id}")
    public String getFirstProduct(@PathVariable int id) {
        return "Product"+id +" :" + port;
    }
}
