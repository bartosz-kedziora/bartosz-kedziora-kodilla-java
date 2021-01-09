package com.kodilla.good.patterns.food2door;

public class Order
{
    private Product product;
    private boolean completed;

    public Order(Product product, boolean completed) {
        this.product = product;
        this.completed = completed;
    }

    public Product getProduct() {
        return product;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }
}
