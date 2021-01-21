package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        assertTrue(shoppingTask.isTaskExecuted());
        assertEquals("Shopping List", shoppingTask.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        assertTrue(paintingTask.isTaskExecuted());
        assertEquals("Painitng challenge", paintingTask.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        assertTrue(drivingTask.isTaskExecuted());
        assertEquals("Holiday route", drivingTask.getTaskName());
    }
}
