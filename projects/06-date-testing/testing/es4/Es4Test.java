package testing.es4;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Es4Test {
    private final Es4 testing = new Es4();

    @Test
    void year() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(2023,testing.year(myDate));
    }

    @Test
    void month() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(Month.MARCH,testing.month(myDate));
    }

    @Test
    void dayOfMonth() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(1,testing.dayOfMonth(myDate));
    }

    @Test
    void dayOfWeek() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(DayOfWeek.WEDNESDAY,testing.dayOfWeek(myDate));
    }
}