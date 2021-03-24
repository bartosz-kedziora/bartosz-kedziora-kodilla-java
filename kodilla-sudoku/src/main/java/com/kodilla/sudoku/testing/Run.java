package com.kodilla.sudoku.testing;

import java.util.List;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        boolean gameFinished = false;
        List<List<Element>> board;

        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        Game game = new Game();
        board = game.createNewGame();

        while (!gameFinished) {

            game.printArray();
            String command = scanner.nextLine();
            switch (command) {
                case "new game":
                    board = game.createNewGame();
                    break;
                case "sudoku":

                    Solver solver = new Solver(board);
                    //analiza
                    if (solver.solveSudoku(0,0)) {
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                board.get(i).get(j).getAvailableValues().clear();
                                board.get(i).get(j).getAvailableValues().add(0);
                            }
                        }
                    } else {
                        System.out.println("Sudoku has no solution! please modify element in Sudoku..");
                    }
                    break;
                case "exit":
                    gameFinished = true;
                    break;
                default:
                    if (Validator.validate(command)) {
                        board = game.fillSudokuArray(command);
                    }
            }
        }
    }
}
