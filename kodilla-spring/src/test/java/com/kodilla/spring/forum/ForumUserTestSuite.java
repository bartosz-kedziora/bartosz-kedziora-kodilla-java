package com.kodilla.spring.forum;

import com.kodilla.forum.ForumUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ForumUserTestSuite {
    @Test
    void testGetUsername() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.forum");

        //When
        String name = context.getBean(ForumUser.class).getUsername();

        //Then
        assertEquals("John Smith", name);
    }
}
