package switchTest;

import static org.junit.jupiter.api.Assertions.*;

class Switch1Test {

    @org.junit.jupiter.api.Test
    void dayOfWeek() {
        assertEquals("Monday", Switch1.DayOfWeek(1));
        assertEquals("Tuesday", Switch1.DayOfWeek(2));
        assertEquals("Wednesday", Switch1.DayOfWeek(3));
        assertEquals("Thursday", Switch1.DayOfWeek(4));
        assertEquals("Friday", Switch1.DayOfWeek(5));
        assertEquals("Saturday", Switch1.DayOfWeek(6));
        assertEquals("Sunday", Switch1.DayOfWeek(7));
    }

    @org.junit.jupiter.api.Test
    void dayOfWeek_numAbove7() {
        assertEquals("ERROR: Insert numbers only between 1 and 7.", Switch1.DayOfWeek(8));
    }

    @org.junit.jupiter.api.Test
    void dayOfWeek_numUnder1() {
        assertEquals("ERROR: Insert numbers only between 1 and 7.", Switch1.DayOfWeek(0));
    }

    @org.junit.jupiter.api.Test
    void dayOfWeek_numNegative() {
        assertEquals("ERROR: Insert numbers only between 1 and 7.", Switch1.DayOfWeek(-1));
    }
}