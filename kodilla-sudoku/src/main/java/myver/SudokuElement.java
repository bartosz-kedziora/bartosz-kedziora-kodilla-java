package myver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuElement {
    public static int EMPTY = -1;
    public static int POSSIBLEVALUES = 9;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    private Integer value;

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    private List<Integer> possibleValues = new ArrayList<>();

    SudokuElement() {
        this.value = EMPTY;
        IntStream.range(0, POSSIBLEVALUES).forEach(i -> possibleValues.add(i + 1));
    }

    public String printMark() {
        if (value == EMPTY) {
            return " ";
        }
        return value.toString();
    }
}
