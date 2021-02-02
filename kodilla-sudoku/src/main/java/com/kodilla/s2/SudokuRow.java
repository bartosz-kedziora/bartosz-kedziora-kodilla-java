package com.kodilla.s2;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public List<SudokuElement> sudokuElements;

    public SudokuRow(List<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
