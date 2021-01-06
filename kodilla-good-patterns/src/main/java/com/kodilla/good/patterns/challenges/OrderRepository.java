package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRepository implements ProductOrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime dateOfPurchase) {
        return true;
    }
}
