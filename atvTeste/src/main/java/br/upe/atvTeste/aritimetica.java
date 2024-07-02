package br.upe.atvTeste;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class aritimetica {

    public static int add(int intNum1,int intNum2){
        return intNum1 + intNum2;
    }

    public static BigDecimal add(BigDecimal bdNum1, BigDecimal bdNum2) {

        return bdNum1.add(bdNum2);

    }

    public static int subtract(int intNum1, int intNum2) {

        return intNum1 - intNum2;

    }

    public static BigDecimal subtract(BigDecimal dblNum1, BigDecimal dblNum2) {

        return dblNum1.subtract(dblNum2);

    }

    public static int multiply(int intNum1, int intNum2) {
        return intNum1 * intNum2;
    }

    public static BigDecimal multiply(BigDecimal dblNum1, BigDecimal dblNum2) {

        return dblNum1.multiply(dblNum2);

    }

    public static int divide(int intDividend, int intDivisor) {
        return intDividend / intDivisor;
    }

    public static BigDecimal divide(BigDecimal bdDividend, BigDecimal bdDivisor, int scale, RoundingMode roundingMode) {

        return bdDividend.divide(bdDivisor, scale, roundingMode);

    }



    public static int modulo(int intDividend, int intDivisor) {
        return intDividend % intDivisor;
    }


    public static int exponent(int base, int power) {
        return (int) Math.pow(base, power);
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


    public static void main(String[] args) {
        int intNumA = 5;
        int intNumB = 3;
        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal (0.1).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal (0.2).setScale(1, rmHalfUp);
        double dbNumbC = 5.2;
        double dbNumbD = 3.1;
        DecimalFormat dFormat = new DecimalFormat("#, ###.###");

        System.out.println (bdNumE + " + " + bdNumF + " = " +add (bdNumE, bdNumF));
        System.out.println(bdNumE + " - " + bdNumF + " = " + subtract(bdNumE,bdNumF));
        System.out.println(bdNumE + " x " + bdNumF + " = " + multiply(bdNumE,bdNumF));
        System.out.println(bdNumE + " " + (char)247 + " " + bdNumF + " = "+ divide(bdNumE, bdNumF, 10, rmHalfUp));
        System.out.println(dbNumbC + " to the power of " + dbNumbD + " = " + exponent(dbNumbC,dbNumbD));
        System.out.println("The sguare root of " + dbNumbC + " = " + squareRoot(dbNumbC));
        System.out.println("The cube root of " + dbNumbC + " = " + cubeRoot(dbNumbC));
        System.out.println("The absolute value of " + dbNumbC + " = "  +  absoluteVal(dbNumbC));


        System.out.println(intNumA + " + " + intNumB + " = " + add(intNumA,intNumB));
        System.out.println(intNumA + " - " + intNumB + " = " + subtract(intNumA,intNumB));
        System.out.println(intNumA + " x " + intNumB + " = " + multiply(intNumA,intNumB));
        System.out.println(intNumA + " " + (char)247 + " " + intNumB + " = "+ divide(intNumA,intNumB));
        System.out.println(intNumA + " mod " + intNumB + " = " + modulo(intNumA, intNumB));
        System.out.println(intNumA + " to the power of " + intNumB + " = " + exponent (intNumA, intNumB));




    }
}
