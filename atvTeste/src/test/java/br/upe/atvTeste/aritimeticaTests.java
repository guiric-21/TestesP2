package br.upe.atvTeste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class aritimeticaTests {

    @Test
    void testAdd( ) {
        assertEquals(8,aritimetica.add(5,3));
    }
    @Test
    void testSubtract( ) {
        assertEquals(2,aritimetica.subtract(5,3));
    }
    @Test
    void testMultiply() {
        assertEquals(15,aritimetica.multiply(5,3));
    }
    @Test
    void testDivide( ) {
        assertEquals(4,aritimetica.divide(8,2));
    }
    @Test
    void testModulo( ) {
        assertEquals(2,aritimetica.modulo(5,3) );
    }
    @Test
    void testExponent( ) {
        assertEquals(125,aritimetica.exponent(5,3));
    }

}
