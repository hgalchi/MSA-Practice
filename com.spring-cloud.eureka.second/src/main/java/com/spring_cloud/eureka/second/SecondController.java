package com.spring_cloud.eureka.second;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class SecondController {

    @Autowired
    private final SecondService secondService;

    @GetMapping
    public String getDefaultOrder(){
        return "Order Default";
    }

    @GetMapping("/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return secondService.getOrder(orderId);
    }

    @GetMapping("/details/{orderId}")
    public Order getOrderDetails(@PathVariable String orderId) {
        return secondService.getOrderDetails(orderId);
    }
}
