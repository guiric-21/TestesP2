package br.upe.atvTeste;

public class aritimetica {

    public static int add(int intNum1, int intNum2) {
        return intNum1 + intNum2;
    }


    public static int subtract(int intNum1, int intNum2) {

        return intNum1 - intNum2;

    }


    public static int multiply(int intNum1, int intNum2) {
        return intNum1 * intNum2;
    }


    public static int divide(int intDividend, int intDivisor) {
        return intDividend / intDivisor;
    }


    public static int modulo(int intDividend, int intDivisor) {
        return intDividend % intDivisor;
    }


    public static int exponent(int base, int power) {
        return (int) Math.pow(base, power);
    }


}
