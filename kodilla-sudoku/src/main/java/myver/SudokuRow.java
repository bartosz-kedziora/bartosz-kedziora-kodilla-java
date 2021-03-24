package myver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    public static int ELEMENTSQUANTITYINROW = 9;

    public static int getELEMENTSQUANTITYINROW() {
        return ELEMENTSQUANTITYINROW;
    }

    public List<SudokuElement> getSudokuElementsInRow() {
        return sudokuElementsInRow;
    }

    private List<SudokuElement> sudokuElementsInRow = new ArrayList<>();

    SudokuRow() {
        IntStream.range(0, ELEMENTSQUANTITYINROW).forEach(i -> sudokuElementsInRow.add(new SudokuElement()));
    }

    @Override
    public String toString() {
        return "| " + sudokuElementsInRow.get(0).printMark() +
                " | " + sudokuElementsInRow.get(1).printMark() +
                " | " + sudokuElementsInRow.get(2).printMark() +
                " || " + sudokuElementsInRow.get(3).printMark() +
                " | " + sudokuElementsInRow.get(4).printMark() +
                " | " + sudokuElementsInRow.get(5).printMark() +
                " || " + sudokuElementsInRow.get(6).printMark() +
                " | " + sudokuElementsInRow.get(7).printMark() +
                " | " + sudokuElementsInRow.get(8).printMark() + " |";
    }


}
