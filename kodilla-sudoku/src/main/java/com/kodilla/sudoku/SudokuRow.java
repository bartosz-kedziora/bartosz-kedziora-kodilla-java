package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow(){
        for(int i=0; i<9; i++) {
            sudokuElements.add(i,new SudokuElement());
        }
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
