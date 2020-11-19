package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain
{
    public static void main(String[] args)
    {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Kodilla Java Course",(java)->java.toUpperCase());
        poemBeautifier.beautify("Kodilla Java Course",(java)->"ABC " + java + " ABC");
        poemBeautifier.beautify("Kodilla Java Course",(java)->"JAVA ".toLowerCase() + java + " MAGIC".toUpperCase());
        poemBeautifier.beautify("Kodilla Java Course",(java)->"ECHO: " + java + " - "+ java.toUpperCase() + " - " + java.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
