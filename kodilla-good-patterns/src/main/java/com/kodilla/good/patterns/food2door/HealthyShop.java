package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Manufacturer
{
    private final String NAME = "Healthy Shop";
    private String ADRESS = "Zielona 3, 00-196 Warszawa";
    private final List<Product> productList = new ArrayList();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> getProductsList() {
        return productList;
    }

    @Override
    public void process(Order order) {
        ExecutionOrder executionOrder = new ExecutionOrder();
        if(executionOrder.isComplete(order, productList))
        {
            contact();
        }
        else
        {
            System.out.println("The order can not be processed");
        }
    }

    public void contact()
    {
        System.out.println("send the customer information about the order");
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "NAME='" + NAME + '\'' +
                ", ADRESS='" + ADRESS + '\'' +
                ", productList=" + productList +
                '}';
    }

    public String getADRESS() {
        return ADRESS;
    }

    public void setADRESS(String ADRESS) {
        this.ADRESS = ADRESS;
    }
}
