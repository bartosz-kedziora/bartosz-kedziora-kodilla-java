package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever
{
    public OrderRequest retrieve() {
        User user = new User("Jan", "Nowak");
        LocalDateTime dateOfPurchase = LocalDateTime.of(2021, 1, 6, 12, 0);
        return new OrderRequest(user, dateOfPurchase);
    }
}
