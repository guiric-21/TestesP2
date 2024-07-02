package br.upe.atvTeste;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class floatAritmeticaTest {

    DecimalFormat dFormat = new DecimalFormat("#, ###.###");
    RoundingMode rmHalfUp = RoundingMode.HALF_UP;
    BigDecimal bdNumE = new BigDecimal (5.2).setScale(1, rmHalfUp);
    BigDecimal bdNumF = new BigDecimal (3.1).setScale(1, rmHalfUp);
    BigDecimal bdNumG = new BigDecimal (8.3).setScale(1, rmHalfUp);
    BigDecimal bdNumH = new BigDecimal (2.1).setScale(1, rmHalfUp);
    BigDecimal bdNumI = new BigDecimal (16.12).setScale(2, rmHalfUp);
    BigDecimal bdNumJ = new BigDecimal (1.6774193548).setScale(10, rmHalfUp);

    @Test
    void testAddFloat(){
        assertEquals(bdNumG, floatAritmetica.add(bdNumE,bdNumF));

    }
    @Test
    void testSubtractFloat(){
        assertEquals(bdNumH, floatAritmetica.subtract(bdNumE,bdNumF));

    }
    @Test
    void testMultiplyFloat(){
        assertEquals(bdNumI, floatAritmetica.multiply(bdNumE,bdNumF));

    }
    @Test
    void testDivideFloat(){
        assertEquals(bdNumJ, floatAritmetica.divide(bdNumE,bdNumF,10, rmHalfUp));

    }
    @Test
    void testExpoentFloat(){
        assertEquals(165.80986483300362, floatAritmetica.exponent(5.2,3.1));

    }
    @Test
    void testSquareRoot(){
        assertEquals(2.280350850198276, floatAritmetica.squareRoot(5.2));

    }
    @Test
    void testCubeRoot(){
        assertEquals(1.7324782106818055, floatAritmetica.cubeRoot(5.2));

    }
    @Test
    void testAbsoluteValue(){
        assertEquals(9,floatAritmetica.absoluteVal(-9));

    }
}