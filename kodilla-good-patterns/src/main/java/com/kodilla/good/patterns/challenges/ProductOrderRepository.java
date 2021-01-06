package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean createOrder(User user, LocalDateTime dateOfPurchase);
}
