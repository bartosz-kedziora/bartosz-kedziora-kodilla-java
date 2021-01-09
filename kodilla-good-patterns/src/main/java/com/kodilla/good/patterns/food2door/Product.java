package com.kodilla.good.patterns.food2door;

import java.util.Objects;

public class Product
{
    private String nameFood;
    private int quantity;

    public String getNameFood() {
        return nameFood;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String nameFood, int quantity) {
        this.nameFood = nameFood;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameFood, product.nameFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFood);
    }
}
