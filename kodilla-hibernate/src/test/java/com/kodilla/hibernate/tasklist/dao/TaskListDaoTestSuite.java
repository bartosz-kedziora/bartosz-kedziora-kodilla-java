package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskDao;
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
    @Autowired
    private TaskDao taskDao;
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
        //taskListDao.deleteById(id);
    }

    @Test
    void TaskListDaoTestSuit(){
        //Given
        TaskList taskList = new TaskList(Name, "Student List");

        //Then
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }

//    @Test
//    void testTaskListDaoSaveWithTasks() {
//        //Given
//        Task task = new Task("Test: Learn Hibernate", 14);
//        Task task2 = new Task("Test: Write some entities", 3);
//        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
//        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
//        task.setTaskFinancialDetails(tfd);
//        task2.setTaskFinancialDetails(tfd2);
//        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");
//        taskList.getTasks().add(task);
//        taskList.getTasks().add(task2);
//        task.setTaskList(taskList);
//        task2.setTaskList(taskList);
//
//        //When
//        taskListDao.save(taskList);
//        int id = taskList.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        //taskListDao.deleteById(id);
//    }


}
