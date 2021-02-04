package com.kodilla.hibernate.task.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    void testFindByPaid() {
        //Given
//        TaskFinancialDetails taskFinancialDetails =
//                new TaskFinancialDetails(new BigDecimal(115), false);

//        int id = taskFinancialDetails.getId();
//
//        //When
//        taskFinancialDetailsDao.save(taskFinancialDetails);
//        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
//
//        //Then
//        assertEquals(4, resultList.size());

        //CleanUp
        //taskFinancialDetailsDao.deleteById(id);
        taskFinancialDetailsDao.deleteAll();
    }
}