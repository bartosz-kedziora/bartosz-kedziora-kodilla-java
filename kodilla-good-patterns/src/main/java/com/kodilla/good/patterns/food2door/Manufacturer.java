package com.kodilla.good.patterns.food2door;

import java.util.List;

public interface Manufacturer
{
    void addProduct(Product product);
    List<Product> getProductsList();
    void process(Order order);

}
