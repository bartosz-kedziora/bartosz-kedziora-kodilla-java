package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface OrderPizza {
    BigDecimal getCost();
    String getDescription();
}