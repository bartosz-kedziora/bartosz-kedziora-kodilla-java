package com.kodilla.sudoku;

import java.util.Random;

public class Test {
    static int x;
    static int y;
    static int z;
    public static void main(String[] args) {

        random();
        System.out.println(x + " " + y + " " + z);
        random();
        System.out.println(x + " " + y + " " + z);
        random();
        System.out.println(x + " " + y + " " + z);

    }
    static  void random()
    {
        SudokuBoard board = new SudokuBoard();
        Random RANDOM2 = new Random();

        x = RANDOM2.nextInt(9)+1;
        y = RANDOM2.nextInt(9)+1;
        z = RANDOM2.nextInt(9)+1;
    }

}
