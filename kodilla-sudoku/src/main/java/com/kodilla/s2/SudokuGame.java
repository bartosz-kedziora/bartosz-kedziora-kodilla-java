package com.kodilla.s2;

public class SudokuGame {
    private SudokuBoard board;
    public boolean resolveSudoku() {
        board = new SudokuBoard();
        System.out.println(board.toString());
        return true;
    }
}
