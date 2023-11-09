package testing.es5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Es5Test {

    private final Es5 testing = new Es5();

    @Test
    void addYear() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime myDatePlusYear = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        assertEquals(myDatePlusYear,testing.addYear(myDate,1));
    }

    @Test
    void reduceMonth() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime myDateMinusMonth = OffsetDateTime.parse("2023-02-01T13:00:00Z");
        assertEquals(myDateMinusMonth,testing.reduceMonth(myDate,1));
    }

    @Test
    void addDays() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime myDateAdd7Days = OffsetDateTime.parse("2023-03-08T13:00:00Z");
        assertEquals(myDateAdd7Days,testing.addDays(myDate,7));
    }

    @Test
    void dateItaly() {
        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("marzo 01, 2023 13:00:00",testing.dateItaly(myDate));
    }
}