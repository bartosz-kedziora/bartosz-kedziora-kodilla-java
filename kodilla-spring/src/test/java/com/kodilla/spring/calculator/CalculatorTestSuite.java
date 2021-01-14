package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When
        double resultAdd = context.getBean(Calculator.class).add(5,4);
        double resultSub = context.getBean(Calculator.class).sub(5,4);
        double resultMul = context.getBean(Calculator.class).mul(5,4);
        double resultDiv = context.getBean(Calculator.class).div(5,4);

        //Then
        assertEquals(9.0, resultAdd );
        assertEquals(1.0, resultSub );
        assertEquals(20.0, resultMul );
        assertEquals(1.25, resultDiv );
    }
}
