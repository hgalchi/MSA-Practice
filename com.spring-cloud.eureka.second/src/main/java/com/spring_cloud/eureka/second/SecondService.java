package com.spring_cloud.eureka.second;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecondService {

    private final FirstClient firstClient;

    public String getFistProductInfo(String productId) {
        return firstClient.getFirstProduct(productId);
    }
    public String getOrder(String id) {
        if (id.equals("1")) {
            String productId = "2";
            String productInfo = getFistProductInfo(id);
            return "your order is "+id+"and"+productInfo;
        }
        return "not exist order..";
    }
}
