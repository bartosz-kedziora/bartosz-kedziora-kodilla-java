package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductService implements ProductsOrderService {
    @Override
    public boolean order(User user, LocalDateTime dateOfPurchase) {
        return true;
    }
}
