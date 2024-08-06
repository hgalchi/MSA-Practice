package com.spring_cloud.eureka.second;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecondController {

    @Autowired
    private final SecondService secondService;

    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return secondService.getOrder(orderId);
    }

    @GetMapping("/order/details/{orderId}")
    public Order getOrderDetails(@PathVariable String orderId) {
        return secondService.getOrderDetails(orderId);
    }
}
