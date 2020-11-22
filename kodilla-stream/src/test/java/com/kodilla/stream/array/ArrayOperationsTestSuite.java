package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite
{
    @Test
    void testGetAverage()
    {
        //Given
        int [] array = new int[20];
        for (int i=0; i<array.length; i++)
        {
            array[i]=i;
        }
        //When
        Double avgNumbers = getAverage(array);
        //Then
        assertEquals(9.5, avgNumbers);
    }
}

