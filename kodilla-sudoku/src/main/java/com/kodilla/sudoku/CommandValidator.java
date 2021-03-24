package com.kodilla.sudoku;

import static java.lang.Character.isDigit;
// Walidator poleceń - poprawność poleceń do wstawiania liczb
public class CommandValidator {
    //wartość przecinka jako Integer, ma wartość 44
    private final static Integer COMA_CHAR_VALUE = 44;

    public CommandValidator() {
    }
    //metoda zwracajaca czy walidacja jest porawna czy nie
    public boolean validate(String command) {
        boolean isValidated = true;

        if (command.length()%4 == 0) {
            for (int i=0; i<command.length(); i++) {
                //chartAt - zwraca znak o podanym indeksie w ciągu
                //isDigit - określa, czy określony znak jest cyfrą.
                //warunke if sprawdza czy znak jest cyfrą oraz czy długość znaku jest odpowiednia ()
                if (((i+1)%4 != 0) && !isDigit(command.charAt(i))) {
                    System.out.println("incorrect digit at position " + (i + 1));
                    isValidated = false;
                }
                //tu chodzi o przecinek na końcu - DO USUNIECIE od 22 do 25
                if (((i+1)%4 == 0) && (command.charAt(i) != COMA_CHAR_VALUE)) {
                    System.out.println("incorrect coma at position " + (i + 1));
                    isValidated = false;
                }
            }
        } else {
            System.out.println("incorrect input type, it should be like '123,' or '123,321,654,'etc.");
            isValidated = false;
        }
        if (!isValidated) {
            System.out.println("Please try again!");
        }
        return isValidated;
    }
}
