package testing.es3;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class Es3Test {

    private final Es3 testing = new Es3();

    @Test
    void dateFormat() {
        String date = "2023-03-01T13:00:00Z";
        String result = testing.dateFormat(date);
        assertEquals("01 marzo 2023", result);
    }

    @Test
    void dateFormatNull() {
        String date = null;
        String result = testing.dateFormat(date);
        assertEquals("Can't parse null", result);
    }

    @Test
    void dateFormatWrongString() {
        String date = "-03-01T13:00:00Z";
        Exception e = assertThrows(DateTimeParseException.class,()->testing.dateFormat(date));
        assertEquals("Can't parse, give a correct String",e.getMessage());
    }
}