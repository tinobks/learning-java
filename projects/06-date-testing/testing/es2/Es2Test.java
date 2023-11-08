package testing.es2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Es2Test {

    private final Es2 testing = new Es2();

    @Test
    void dateFull() {
        OffsetDateTime myDate = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String result = testing.dateFull(myDate);
        assertEquals("venerdì 1 marzo 2002",result);
    }

    @Test
    void dateMedium() {
        OffsetDateTime myDate = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String result = testing.dateMedium(myDate);
        assertEquals("1 mar 2002",result);
    }

    @Test
    void dateShort() {
        OffsetDateTime myDate = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String result = testing.dateShort(myDate);
        assertEquals("01/03/02",result);
    }
}