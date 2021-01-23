package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String PAINTING_TASK = "PAINTING";
    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String DRIVING_TASK = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping List", "Beers", 7);
            case PAINTING_TASK:
                return new PaintingTask("Painitng challenge", "Black", "Masterpiece");
            case DRIVING_TASK:
                return new DrivingTask("Holiday route", "USA", "Car");
            default:
                return null;
        }
    }
}
