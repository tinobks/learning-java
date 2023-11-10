package testing.es4;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class Es4Test {
    private final Es4 testing = new Es4();

    @Test
    void stringParserRightString() {
        String date = "2023-03-01T13:00:00Z";
        assertNotNull(testing.stringParser(date),"this is a correct string so i obtained a correct parsing");
    }
    @Test
    void stringParserNull() {
        String date = null;
        assertNull(testing.stringParser(date),"null string, can't parse");
    }
    @Test
    void stringParserWrongString() {
        String date = "-03-01T13:00:00Z";
        Exception e = assertThrows(DateTimeParseException.class,()-> testing.stringParser(date));
        assertEquals("Can't parse, give a correct String",e.getMessage());
    }
    @Test
    void stringParserEmptyString() {
        String date = "";
        assertNull(testing.stringParser(date),"empty string, can't parse");
    }

    @Test
    void year() {
        String date = "2023-03-01T13:00:00Z";
        assertEquals(2023,testing.year(testing.stringParser(date)));
    }

    @Test
    void month() {
        String date = "2023-03-01T13:00:00Z";
        assertEquals(Month.MARCH,testing.month(testing.stringParser(date)));
    }

    @Test
    void dayOfMonth() {
        String date = "2023-03-01T13:00:00Z";
        assertEquals(1,testing.dayOfMonth(testing.stringParser(date)));
    }

    @Test
    void dayOfWeek() {
        String date = "2023-03-01T13:00:00Z";
        assertEquals(DayOfWeek.WEDNESDAY,testing.dayOfWeek(testing.stringParser(date)));
    }
}