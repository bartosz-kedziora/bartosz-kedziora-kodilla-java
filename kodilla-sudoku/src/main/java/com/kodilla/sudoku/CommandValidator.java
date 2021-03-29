package com.kodilla.sudoku;

import static java.lang.Character.isDigit;

public class CommandValidator {

    public CommandValidator() {
    }

    public boolean validate(String command) {
        boolean isValidated = true;

        if (command.length()==3) {
            for (int i=0; i<command.length(); i++) {
                if (!isDigit(command.charAt(i))) {
                    System.out.println("Incorrect digit at position " + (i + 1));
                    isValidated = false;
                }
            }
        } else {
            System.out.println("Incorrect input type, it should be like '123'");
            isValidated = false;
        }
        if (!isValidated) {
            System.out.println("Please try again!");
        }
        return isValidated;
    }
}
