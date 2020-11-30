package com.kodilla.rps;

import java.util.Random;

public class Computer
{
    Items playComputer()
    {
        Random randomGenerator = new Random();
        int computerChoose=randomGenerator.nextInt(3)+1;
        if(computerChoose==1)
        {
            return new Rock();
        }
        else if(computerChoose==2)
        {
            return new Paper();
        }
        else
        {
            return new Scissors();
        }
    }
}
