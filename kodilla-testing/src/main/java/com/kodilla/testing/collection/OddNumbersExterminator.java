package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator
{
    public List<Integer> exterminate(List<Integer> numbers)
    {
        if(numbers.isEmpty())
        {
            numbers=null;
            return numbers;
        }
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number: numbers)
        {
            if(number%2==0)
            {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
