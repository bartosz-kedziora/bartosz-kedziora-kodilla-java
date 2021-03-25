package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractOrderPizzaDecorator implements OrderPizza {

    private final OrderPizza orderPizza;

    protected AbstractOrderPizzaDecorator(OrderPizza orderPizza) {
        this.orderPizza = orderPizza;
    }

    @Override
    public BigDecimal getCost() {
        return orderPizza.getCost();
    }

    @Override
    public String getDescription() {
        return orderPizza.getDescription();
    }
}