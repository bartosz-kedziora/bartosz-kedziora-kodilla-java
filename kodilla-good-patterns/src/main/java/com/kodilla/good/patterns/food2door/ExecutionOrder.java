package com.kodilla.good.patterns.food2door;

import java.util.List;

public class ExecutionOrder {
    public boolean isComplete(Order order,List<Product> productsList) {
        boolean result = false;
        for (Product product : productsList) {
            if (order.getProduct().equals(product)) {
                order.setCompleted(true);
                result = true;
            }
        }
        return result;
    }
}