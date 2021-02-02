package com.kodilla.sudoku;

public class SudokuElement {
    public static int EMPTY = -1;
    
    private int value;

    public int getValue() {
        return value;
    }

    public SudokuElement() {
        this.value = EMPTY;
        //IntStream.range(0, POSSIBLEVALUES).forEach(i -> possibleValues.add(i + 1));
    }

    public void setValue(int value) {
        this.value = value;
    }
}
