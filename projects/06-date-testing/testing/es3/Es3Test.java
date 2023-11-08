package testing.es3;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Es3Test {

    private final Es3 testing = new Es3();

    @Test
    void dateFormat() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.dateFormat(myDate);
        assertEquals("01 marzo 2023", result);
    }

    @Test
    void dateFormatNull() {
        OffsetDateTime myDate = null;
        String result = testing.dateFormat(myDate);
        assertNull(result);
    }
}