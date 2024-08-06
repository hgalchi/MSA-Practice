package com.spring_cloud.eureka.second;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "first-service")
public interface FirstClient {
    @GetMapping("/product/{id}")
    String getFirstProduct(@PathVariable("id") String id);
}
