package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithToppings extends AbstractOrderPizzaDecorator {
    protected PizzaWithToppings(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mushrooms + salami + double cheese";
    }
}