package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private final List<Integer> availableValues = new ArrayList<>();
    private int value;

    public SudokuElement(int value) {
        this.value = value;
        for (int i=0; i<10; i++) {
            if (i!=value) {
                availableValues.add(i);
            }
        }
    }
//wartosc jest rowna wolnym polu
    public final boolean isAvailable(int value) {
        return availableValues.stream().anyMatch(t->t==value);
    }
//metoda ustawiająca
    public boolean setValue(int value) {
        if (isAvailable(value) || value==0) {
            addToAvailableValues(this.value);
            this.value = value;
            for (int i=0; i<availableValues.size(); i++) {
                if (availableValues.get(i)==value) {
                    availableValues.remove(i);
                }
            }
            return true;
        } else {
            return false;
        }
    }
    //metoda usuwa z listy tylko wartosci 0...9
    public void removeFromAvailableValues(int value) {
        if (isAvailable(value)) {
            for (int i=0; i<availableValues.size(); i++) {
                if (availableValues.get(i)==value) {
                    availableValues.remove(i);
                }
            }
        }
    }
    //metoda dodaje do listy tylko wartosci ktore sa inne niż wartość 0..9
    public void addToAvailableValues(int value) {
        if (!isAvailable(value)) {
            availableValues.add(value);
        }
    }

    public int getValue() {
        return this.value;
    }

    public List<Integer> getAvailableValues() {
        return availableValues;
    }
}
