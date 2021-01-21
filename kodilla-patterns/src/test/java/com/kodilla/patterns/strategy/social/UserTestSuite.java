package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies()
    {
        //Given
        User david = new Millenials("David Kowalsky");
        User adam = new YGeneration("Adam Novak");
        User jessica = new ZGeneration("Jessica Alba");

        //When
        String davidShare = david.sharePost();
        System.out.println("David share post: " + davidShare);
        String adamShare = adam.sharePost();
        System.out.println("Adam share post: " + adamShare);
        String jessicaShare = jessica.sharePost();
        System.out.println("jessica share post: " + jessicaShare);

        //Then
        assertEquals("Facebook", davidShare);
        assertEquals("Snapchat", adamShare);
        assertEquals("Twitter", jessicaShare);
    }


    @Test
    void testIndividualSharingStrategy()
    {
        //Given
        User david = new Millenials("David Kowalsky");

        //When
        String davidShare = david.sharePost();
        System.out.println("David share post: " + davidShare);
        david.setSocialPublisher(new TwitterPublisher());
        davidShare = david.sharePost();
        System.out.println("David now share post: " + davidShare);

        //Then
        assertEquals("Twitter", davidShare);
    }
}
