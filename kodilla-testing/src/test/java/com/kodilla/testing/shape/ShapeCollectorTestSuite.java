package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite \uD83D\uDE31")

public class ShapeCollectorTestSuite
{
    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Tests for all Shape")
    class TestFigure
    {
        @DisplayName("Test to verify that the method behaves correctly when Shape objects are added to the list")
        @Test
        void testAddFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();
            Shape shape1 = new Circle();
            Shape shape2 = new Triangle();
            //When
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            //Then
            Assertions.assertEquals(3, shapeCollector.getShapeCollectorList().size());
        }

        @DisplayName("Test to verify that the method behaves correctly when Shape objects are removed to the list")
        @Test
        void testRemoveFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();
            Shape shape1 = new Circle();
            Shape shape2 = new Triangle();
            //When
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertEquals(2, shapeCollector.getShapeCollectorList().size());
        }

        @DisplayName("Test to verify that the method behaves correctly when Shape object is get to the list")
        @Test
        void testGetFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();
            Shape shape1 = new Circle();
            Shape shape2 = new Triangle();
            //When
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            int numberShape = 2;
            //Then
            Assertions.assertEquals(shape2, shapeCollector.getFigure(numberShape));
        }

        @DisplayName("Test to verify that the method behaves correctly when Shape objects are showed on the console")
        @Test
        void testShowFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();
            Shape shape1 = new Circle();
            Shape shape2 = new Triangle();
            //When
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            String nameShape = shapeCollector.showFigures();
            String result = "Square Circle Triangle";
            //Then
            Assertions.assertEquals(result, nameShape);
        }
    }
}
