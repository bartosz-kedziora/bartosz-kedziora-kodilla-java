package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestAdvStatistics
{
    private static int testCounter = 0;

    @Mock
    private Statistics statisticsMock;

    @BeforeEach()
    public void beforeEveryTest()
    {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @DisplayName("Test when the number of posts = 0")
    @Test
    void calculateAdvStatisticsPostIsO()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 0;
        int numberComments = 0;
        List<String> usersNames= new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(NaN, resultAvgPostsUsers);
        assertEquals(NaN, resultAvgCommentsUsers);
        assertEquals(NaN, resultAvgCommentsPosts);
    }

    @DisplayName("Test when the number of posts = 1000")
    @Test
    void calculateAdvStatisticsPostIs1000()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 1000;
        int numberComments = 2000;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("Jan Nowak");
        usersNames.add("Jacek kowalski");
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(500, resultAvgPostsUsers);
        assertEquals(1000, resultAvgCommentsUsers);
        assertEquals(2, resultAvgCommentsPosts);
    }

    @DisplayName("Test when the number of comments = 0")
    @Test
    void calculateAdvStatisticsCommentsIs0()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 1000;
        int numberComments = 0;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("Jan Nowak");
        usersNames.add("Jacek kowalski");
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(500, resultAvgPostsUsers);
        assertEquals(0, resultAvgCommentsUsers);
        assertEquals(0, resultAvgCommentsPosts);
    }

    @DisplayName("Test when the number of comments is less than the number of posts")
    @Test
    void calculateAdvStatisticsCommentsIsLessThanPosts()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 10000;
        int numberComments = 5000;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("Jan Nowak");
        usersNames.add("Jacek kowalski");
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(5000, resultAvgPostsUsers);
        assertEquals(2500, resultAvgCommentsUsers);
        assertEquals(0.5, resultAvgCommentsPosts);
    }

    @DisplayName("Test when the number of comments is higher than the number of posts")
    @Test
    void calculateAdvStatisticsCommentsIsHigherThanPosts()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 10000;
        int numberComments = 25000;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("Jan Nowak");
        usersNames.add("Jacek kowalski");
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(5000, resultAvgPostsUsers);
        assertEquals(12500, resultAvgCommentsUsers);
        assertEquals(2.5, resultAvgCommentsPosts);
    }

    @DisplayName("Test when the number of users = 0")
    @Test
    void calculateAdvStatisticsUsersIsO()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 0;
        int numberComments = 0;
        List<String> usersNames= new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(NaN, resultAvgPostsUsers);
        assertEquals(NaN, resultAvgCommentsUsers);
        assertEquals(NaN, resultAvgCommentsPosts);
    }

    @DisplayName("Test when the number of users = 100")
    @Test
    void calculateAdvStatisticsUsersIs100()
    {
        //Given
        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        int numberPosts = 1000;
        int numberComments = 2500;
        List<String> usersNames= new ArrayList<>();
        for(int i = 0; i<100; i++)
        {
            usersNames.add("User nr: " + i);
        }
        when(statisticsMock.postsCount()).thenReturn(numberPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberComments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        // When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double resultAvgPostsUsers = advStatistics.getAvgPostsUsers();
        double resultAvgCommentsUsers = advStatistics.getAvgCommentsUsers();
        double resultAvgCommentsPosts = advStatistics.getAvgCommentsPosts();
        advStatistics.showStatistics();

        // Then
        assertEquals(10, resultAvgPostsUsers);
        assertEquals(25, resultAvgCommentsUsers);
        assertEquals(2.5, resultAvgCommentsPosts);
    }
}
