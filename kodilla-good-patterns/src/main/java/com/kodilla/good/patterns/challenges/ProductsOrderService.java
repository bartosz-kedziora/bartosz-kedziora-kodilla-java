package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductsOrderService {
    boolean order(User user, LocalDateTime dateOfPurchase);
}
