package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student janKowalski = new Student("Jan Kowalski");
        Student alicjaKnot = new Student("Alicja Knot");
        Student majaKaja = new Student("Maja Kaja");

        Mentor marcinWas = new Mentor("Marcin Was");
        Mentor tomaszGniot = new Mentor("Tomasz Gniot");

        janKowalski.registerObserver(marcinWas);
        alicjaKnot.registerObserver(marcinWas);
        majaKaja.registerObserver(tomaszGniot);

        //When
        janKowalski.addTask("task 1");
        janKowalski.addTask("task 2");
        alicjaKnot.addTask("task 1");
        majaKaja.addTask("task 1");
        majaKaja.addTask("task 2");

        //Then
        assertEquals(3, marcinWas.getUpdateCount());
        assertEquals(2, tomaszGniot.getUpdateCount());
    }
}