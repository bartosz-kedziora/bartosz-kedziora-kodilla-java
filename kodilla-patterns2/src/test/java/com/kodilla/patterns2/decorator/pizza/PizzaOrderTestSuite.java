package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        OrderPizza order = new BasicPizza();

        //When
        BigDecimal cost = order.getCost();

        //Then
        assertEquals(new BigDecimal(30), cost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        OrderPizza order = new BasicPizza();

        //When
        String description = order.getDescription();

        //Then
        assertEquals("You ordered pizza", description);
    }

    @Test
    public void testBasicPizzaOrderWithCola() {
        //Given
        OrderPizza order = new BasicPizza();
        order = new PizzaWithCola(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(new BigDecimal(35), cost);
        assertEquals("You ordered pizza + cola 2L", description);
    }

    @Test
    public void testBasicPizzaOrderPanWithToppingsColaTakeAway() {
        //Given
        OrderPizza order = new BasicPizza();
        order = new PizzaPremium(order);
        order = new PizzaWithToppings(order);
        order = new PizzaWithCola(order);
        order = new PizzaTakeAwayDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(new BigDecimal(52), cost);
        assertEquals("You ordered pizza + premium + mushrooms + salami + double cheese + cola 2L + take away box", description);
    }
}