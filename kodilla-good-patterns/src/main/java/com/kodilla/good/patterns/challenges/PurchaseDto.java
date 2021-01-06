package com.kodilla.good.patterns.challenges;

public class PurchaseDto
{
    public User user;
    public boolean isAvailable;

    public PurchaseDto(final User user, final boolean isAvailable) {
        this.user = user;
        this.isAvailable = isAvailable;
    }

    public User getUser() { return user; }

    public boolean isAvailable() { return isAvailable; }
}
