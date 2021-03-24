package com.kodilla.sudoku.testing;

import java.util.List;

public class Solver {
    List<List<Element>> Array;

    public Solver(List<List<Element>> Array) {
        this.Array = Array;
    }

    public boolean solveSudoku(int row, int column) {
        Element element = Array.get(row).get(column);
        if (element.getValue()==0) {
            for (int i=1; i<10; i++) {
                if (isAvailable(row,column,i)) {
                    element.setValue(i);
                    if (nextSudokuElement(row, column)) {
                        return true;
                    }
                }
            }
            element.setValue(0);
            return false;
        }
        return nextSudokuElement(row, column);
    }

    private boolean nextSudokuElement(int row, int column) {
        return false;
    }

    boolean isAvailable(int row, int column, int value) {
        boolean isAvailable = true;
        for(int i = 0; i < 9; i++) {
            if (value == Array.get(row).get(i).getValue() ||
                    value == Array.get(i).get(column).getValue()) {
                isAvailable = false;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (value == Array.get(row / 3 * 3 + i).get(column / 3 * 3 + j).getValue()) {
                    isAvailable = false;
                }
            }
        }
        return isAvailable;
    }
}
