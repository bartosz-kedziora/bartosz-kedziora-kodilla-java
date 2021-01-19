package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLog()
    {
        //Given
        Logger logger = new Logger();
        logger.log("Log Test");
        //When
        String logName = logger.getLastLog();
        //Then
        assertEquals("Log Test", logName);
    }
}
