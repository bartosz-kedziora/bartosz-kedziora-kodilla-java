package com.kodilla.spring.library;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

//@Service
public class Library {
//    private final List<String> books = new ArrayList<>();
//    private final LibraryDbControlle libraryDbController;
//
//    public Library(final LibraryDbControlle libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }
//
//    public void saveToDb() {
//        libraryDbController.saveData();
//    }
//
//    public void loadFromDb() {
//        libraryDbController.loadData();
//    }

//    private final List<String> books = new ArrayList<>();
//    private LibraryDbControlle libraryDbController;
//
//    @Autowired
//    public Library(final LibraryDbControlle libraryDbController) {
//        this.libraryDbController = libraryDbController;
//    }
//
//    public Library() {
//        // do nothing
//    }
//
//    public void saveToDb() {
//        libraryDbController.saveData();
//    }
//
//    public void loadFromDb() {
//        libraryDbController.loadData();
//    }

//    private final List<String> books = new ArrayList<>();
//
//    @Autowired
//    private LibraryDbControlle libraryDbController;
//
//    public void saveToDb() {
//        libraryDbController.saveData();
//    }
//
//    public void loadFromDb() {
//        libraryDbController.loadData();
//    }

    private final List<String> books = new ArrayList<>();
    private LibraryDbControlle libraryDbController;

    public Library(final LibraryDbControlle libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
