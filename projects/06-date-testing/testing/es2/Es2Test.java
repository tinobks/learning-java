package testing.es2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class Es2Test {

    private final Es2 testing = new Es2();

    @Test
    void dateFull() {
        String date = "2002-03-01T13:00:00Z";
        assertEquals("venerdì 1 marzo 2002",testing.dateFull(date));
    }
    @Test
    void dateFullNull() {
        String date = null;
        assertEquals("Cannot parse null",testing.dateFull(null));
    }
    @Test
    void dateFullWrongString() {
        String date = "-03-01T13:00:00Z";
        Exception e = assertThrows(DateTimeParseException.class,()->testing.dateFull(date));
        assertEquals("Wrong String",e.getMessage());
    }

    @Test
    void dateMedium() {
        String date = "2002-03-01T13:00:00Z";
        assertEquals("1 mar 2002",testing.dateMedium(date));
    }
    @Test
    void dateMediumNull() {
        String date = null;
        assertEquals("Cannot parse null",testing.dateMedium(null));
    }
    @Test
    void dateMediumWrongString() {
        String date = "-03-01T13:00:00Z";
        Exception e = assertThrows(DateTimeParseException.class,()->testing.dateMedium(date));
        assertEquals("Wrong String",e.getMessage());
    }

    @Test
    void dateShort() {
        String date = "2002-03-01T13:00:00Z";
        assertEquals("01/03/02",testing.dateShort(date));
    }
    @Test
    void dateShortNull() {
        String date = null;
        assertEquals("Cannot parse null",testing.dateShort(null));
    }
    @Test
    void dateShortWrongString() {
        String date = "-03-01T13:00:00Z";
        Exception e = assertThrows(DateTimeParseException.class,()->testing.dateShort(date));
        assertEquals("Wrong String",e.getMessage());
    }
}