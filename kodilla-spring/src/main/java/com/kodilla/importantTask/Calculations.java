package com.kodilla.importantTask;

import java.util.*;

public class Calculations {

    public double calculateBestAverage(Map<Student, Grades> scores) {

        return 0;
    }



    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {
        return null;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {
        return null;
    }

    private Map<Student, Grades> prepareData() {
        Map<Student, Grades> entries = new HashMap<>();
        List<Integer> example1 = Arrays.asList(2, 3, 4, 5, 1);
        List<Integer> example2 = Arrays.asList(2, 5, 5, 5, 5);
        List<Integer> example3 = Arrays.asList(2, 3, 4, 5, 5, 5, 2);
        entries.put(new Student("Jan", "Kowalski"), new Grades(example1, example2, example3));
        entries.put(new Student("Magda", "Nowak", "EN"), new Grades(example3, example3, example1));
        entries.put(new Student("Kamila", "Los", "PL"), new Grades(example2, example2, example3));
        return entries;
    }

    public static void main(String args[]) {
        Calculations calculations = new Calculations();
        Map<Student, Grades> entries = calculations.prepareData();

        //when
        double result = calculations.calculateBestAverage(entries);

    }

}

