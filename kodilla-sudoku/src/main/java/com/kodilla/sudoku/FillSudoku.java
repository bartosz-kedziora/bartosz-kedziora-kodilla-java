package com.kodilla.sudoku;

import java.util.Random;

public class FillSudoku {
    private static final Random RANDOM = new Random();
    private SudokuBoard board;

    public FillSudoku(SudokuBoard board) {
        this.board = board;
    }

    int random()
    {
        return RANDOM.nextInt(9)+1;
    }

    public void fillBoard() {
//            int x = random();
//            int y = random();
//            int z = random();

                for (int columnIndex = 0; columnIndex < 9; columnIndex++)
                {
                    for (int rowIndex = 0; rowIndex < 9; rowIndex++)
                    {
                        //board.getValue(row, column);
                    }
                }


//        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
//            try {
//                board.getValue(x, y);
//            } catch (IncorrectValueException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
//            try {
//                board.getValue(row, column);
//            } catch (IncorrectValueException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
//            for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
//                try {
//                    board.getValue(row, column);
//                } catch (IncorrectValueException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

    }
}
