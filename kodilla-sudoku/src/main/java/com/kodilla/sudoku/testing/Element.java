package com.kodilla.sudoku.testing;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private final List<Integer> availableValues = new ArrayList<>();
    private int value;

    public Element(int value) {
        this.value = value;
        for (int i=0; i<10; i++) {
            if (i!=value) {
                availableValues.add(i);
            }
        }
    }

    public List<Object> getAvailableValues() {
        return null;
    }

    public int getValue() {
        return 0;
    }

    public void setValue(int i) {
    }
}
