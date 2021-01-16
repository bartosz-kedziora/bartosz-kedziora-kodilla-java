package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        Board board = context.getBean(Board.class);

        List<String> taskToDoList = board.getToDoList().getTasks();
        taskToDoList.add("To Do list - task 1");

        List<String> taskInProgressList = board.getInProgressList().getTasks();
        taskInProgressList.add("In progress list - task 1");

        List<String> taskDoneList = board.getDoneList().getTasks();
        taskDoneList.add("Done list - task 1");

        //Then
        assertEquals("To Do list - task 1", taskToDoList.get(0));
        assertEquals("In progress list - task 1", taskInProgressList.get(0));
        assertEquals("Done list - task 1", taskDoneList.get(0));
    }
}
