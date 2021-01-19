package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

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
        //When
        int result = adventureBooks.books.size();

        //Then
        Assertions.assertEquals(2, result);
    }
}
