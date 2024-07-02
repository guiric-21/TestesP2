package br.upe.atvTeste;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class floatAritmetica {

    public static BigDecimal add(BigDecimal bdNum1, BigDecimal bdNum2) {

        return bdNum1.add(bdNum2);

    }

    public static BigDecimal subtract(BigDecimal dblNum1, BigDecimal dblNum2) {

        return dblNum1.subtract(dblNum2);

    }

    public static BigDecimal multiply(BigDecimal dblNum1, BigDecimal dblNum2) {

        return dblNum1.multiply(dblNum2);

    }

    public static BigDecimal divide(BigDecimal bdDividend, BigDecimal bdDivisor, int scale, RoundingMode roundingMode) {

        return bdDividend.divide(bdDivisor, scale, roundingMode);

    }

    public static double exponent(double base, double power) {
        return Math.pow(base, power);
    }

    public static double squareRoot(double number) {

        return Math.sqrt(number);

    }

    public static double cubeRoot(double number) {

        return Math.cbrt(number);

    }

    public static double absoluteVal(double number) {

        return Math.abs(number);

    }




}
