package br.upe.atvTeste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class aritimeticaTests {

    DecimalFormat dFormat = new DecimalFormat("#, ###.###");
    RoundingMode rmHalfUp = RoundingMode.HALF_UP;
    BigDecimal bdNumE = new BigDecimal (5.2).setScale(1, rmHalfUp);
    BigDecimal bdNumF = new BigDecimal (3.1).setScale(1, rmHalfUp);
    BigDecimal bdNumG = new BigDecimal (8.3).setScale(1, rmHalfUp);
    BigDecimal bdNumH = new BigDecimal (2.1).setScale(1, rmHalfUp);
    BigDecimal bdNumI = new BigDecimal (16.12).setScale(2, rmHalfUp);
    BigDecimal bdNumJ = new BigDecimal (1.6774193548).setScale(10, rmHalfUp);

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
    @Test
    void testAddFloat(){
        assertEquals(bdNumG, aritimetica.add(bdNumE,bdNumF));

    }
    @Test
    void testSubtractFloat(){
        assertEquals(bdNumH, aritimetica.subtract(bdNumE,bdNumF));

    }
    @Test
    void testMultiplyFloat(){
        assertEquals(bdNumI, aritimetica.multiply(bdNumE,bdNumF));

    }
    @Test
    void testDivideFloat(){
        assertEquals(bdNumJ, aritimetica.divide(bdNumE,bdNumF,10, rmHalfUp));

    }
    @Test
    void testExpoentFloat(){
        assertEquals(165.80986483300362, aritimetica.exponent(5.2,3.1));

    }
    @Test
    void testSquareRoot(){
        assertEquals(2.280350850198276, aritimetica.squareRoot(5.2));

    }
    @Test
    void testCubeRoot(){
        assertEquals(1.7324782106818055, aritimetica.cubeRoot(5.2));

    }
    @Test
    void testAbsoluteValue(){
        assertEquals(9,aritimetica.absoluteVal(-9));

    }







}
