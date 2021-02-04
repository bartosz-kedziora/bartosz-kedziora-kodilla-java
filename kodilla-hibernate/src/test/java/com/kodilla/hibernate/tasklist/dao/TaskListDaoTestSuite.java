package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String Name = "Exam";


    @Test
    void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList(Name, "Student List");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        //taskListDao.deleteAll();
        taskListDao.deleteById(id);
    }

    @Test
    void TaskListDaoTestSuit(){
        //Given
        TaskList taskList = new TaskList(Name, "Student List");

        //Then
        String listName = taskList.getListName();

        //When
        taskListDao.save(taskList);
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
        //taskListDao.deleteAll();
    }
}
