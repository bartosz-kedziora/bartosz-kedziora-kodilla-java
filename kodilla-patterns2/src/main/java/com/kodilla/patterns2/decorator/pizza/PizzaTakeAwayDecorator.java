package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaTakeAwayDecorator extends AbstractOrderPizzaDecorator {
    protected PizzaTakeAwayDecorator(OrderPizza orderPizza) {
        super(orderPizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + take away box";
    }
}