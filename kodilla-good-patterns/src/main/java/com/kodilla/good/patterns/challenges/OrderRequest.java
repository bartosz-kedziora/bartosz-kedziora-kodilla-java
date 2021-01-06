package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest
{
    private final User user;

    private final LocalDateTime dateOfPurchase;

    public OrderRequest(final User user, final LocalDateTime dateOfPurchase) {
        this.user = user;
        this.dateOfPurchase = dateOfPurchase;
    }

    public User getUser() { return user; }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }
}
