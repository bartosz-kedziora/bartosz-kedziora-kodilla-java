package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks()
    {
        //Given
        Library adventureBooks = new Library("Adventure Books");
        adventureBooks.getBooks().add(new Book("Hobbit", "J.F.Tolkien",
                        LocalDate.of(1912, Month.JANUARY, 3)));
        adventureBooks.getBooks().add(new Book("Shining", "S.King",
                LocalDate.of(1978, Month.MAY, 23)));

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = adventureBooks.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = adventureBooks.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        int result = adventureBooks.books.size();
        int resultShallowCopy = clonedLibrary.books.size();
        int resultDeepCopy = deepClonedLibrary.books.size();

        //Then
        assertEquals(2, result);
        assertEquals(2, resultShallowCopy);
        assertEquals(2, resultDeepCopy);
    }
}
