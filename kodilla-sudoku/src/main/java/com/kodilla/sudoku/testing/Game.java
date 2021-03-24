package com.kodilla.sudoku.testing;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int EMPTY = 0;
    private List<List<Element>> sudokuBoard;


    public List<List<Element>> createNewGame() {

        sudokuBoard = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            List<Element> rowList = new ArrayList<>();
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                rowList.add(new Element(EMPTY));
            }
            sudokuBoard.add(rowList);
        }
        return sudokuBoard;

    }

    public void printArray() {
        List<Element> row;
        System.out.println("\n  r \\ c    1   2   3   4   5   6   7   8   9           Sudoku Game help:\n                                                       ......................................");
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            row = sudokuBoard.get(rowIndex);
            System.out.print("  " + (rowIndex + 1) + "      |");
            for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
                if (row.get(columnIndex).getValue() == EMPTY) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + row.get(columnIndex).getValue() + " |");
                }
                if (columnIndex == 8) {
                    switch (rowIndex) {
                        case 0:
                            System.out.print("            r - row (1..9)");
                            break;
                        case 1:
                            System.out.print("            c - column (1..9)");
                            break;
                        case 2:
                            System.out.print("            v - value (1..9 or 0 to empty)");
                            break;
                        case 3:
                            System.out.print("          type 'rcv' to insert values");
                            break;
                        case 4:
                            System.out.print("          type 'exit' to finish");
                            break;
                        case 5:
                            System.out.print("          type 'sudoku' to find a solution");
                            break;
                        case 6:
                            System.out.print("          type 'new game' to reset");
                            break;
                        case 7:
                            System.out.print("         .......................................");
                            break;
                        case 8:
                            System.out.print("                                      good luck!");
                            break;
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public List<List<Element>> fillSudokuArray(String command) {
        return null;
    }
}
