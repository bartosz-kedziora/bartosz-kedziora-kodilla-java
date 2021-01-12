package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Manufacturer
{
    private final String NAME = "Gluten Free Shop";
    private String Adress = "Zaborska 34, 34-190 Olsztyn";
    private final List<Product>productList = new ArrayList();

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
            saveOrderToDatabase(order);
        }
        else
        {
            System.out.println("The order can not be processed");
        }
    }

    public void saveOrderToDatabase(Order order)
    {
        System.out.println("Name Food:" + order.getProduct().getNameFood() + ", Quantity: " + order.getProduct().getQuantity());
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "NAME='" + NAME + '\'' +
                ", Adress='" + Adress + '\'' +
                ", productList=" + productList +
                '}';
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
}
