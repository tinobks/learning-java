package testing;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {

    private final Test1 testing = new Test1();

    @org.junit.jupiter.api.Test
    void somma2integer() {
        Integer result = testing.sum(1,2);
        assertEquals(3,result,"1+2=3");
    }

    @org.junit.jupiter.api.Test
    void somma2integer_negativi() {
        Integer result = testing.sum(-1,2);
        assertEquals(1,result,"-1+2=1");
    }

    @org.junit.jupiter.api.Test
    void somma_integer_null() {
        Integer result = testing.sum(null,2);
        assertNull(result,"se uno dei parametri e' null anche il risultato e' null");
    }

    @org.junit.jupiter.api.Test
    void moltiplicazione2integer() {
        Integer result = testing.multiply(1,2);
        assertEquals(2, result, "2 x 2 = 2");
    }

    @org.junit.jupiter.api.Test
    void moltiplicazione2integer_null() {
        Integer result = testing.multiply(null,2);
        assertNull(result);
    }

}