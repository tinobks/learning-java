package testing.es5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class Es5Test {

    private final Es5 testing = new Es5();

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
        assertThrows(DateTimeParseException.class,()-> testing.stringParser(date));
    }

    @Test
    void addYear() {
        String date = "2023-03-01T13:00:00Z";
        String datePlusYear = "2024-03-01T13:00:00Z";
        OffsetDateTime expected = testing.stringParser(datePlusYear);
        OffsetDateTime actual = testing.addYear(testing.stringParser(date),1);
        assertEquals(expected,actual);
    }

    @Test
    void reduceMonth() {
        String date = "2023-03-01T13:00:00Z";
        String dateMinusMonth = "2023-02-01T13:00:00Z";
        OffsetDateTime expected = testing.stringParser(dateMinusMonth);
        OffsetDateTime actual = testing.reduceMonth(testing.stringParser(date),1);
        assertEquals(expected,actual);
    }

    @Test
    void addDays() {
        String date = "2023-03-01T13:00:00Z";
        String datePlusDays = "2023-03-08T13:00:00Z";
        OffsetDateTime expected = testing.stringParser(datePlusDays);
        OffsetDateTime actual = testing.addDays(testing.stringParser(date),7);
        assertEquals(expected,actual);
    }

    @Test
    void dateItaly() {
        String date = "2023-03-01T13:00:00Z";
        assertEquals("marzo 01, 2023 13:00:00",testing.dateItaly(testing.stringParser(date)));
    }
}