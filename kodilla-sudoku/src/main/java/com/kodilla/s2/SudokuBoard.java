package com.kodilla.s2;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public List<SudokuRow> getSudokuRow() {
        return sudokuRow;
    }

    public List<SudokuRow> sudokuRow = new ArrayList<>();

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    result += " " + "   ";
                } else if (i == 0) {
                    result += j + "   ";
                }

                else if (j == 0) {
                    result += i + " | ";
                }

                else result += "_" + " | ";
            }
            result += "\n";
        }
        return result;
    }
}

