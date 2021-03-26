package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void upDate(Student student) {
        System.out.println("Mentor " + name);
        System.out.println("Student " + student.getName() + " - number of tasks: " + student.getTasks().size());
        updateCount++;
    }
}