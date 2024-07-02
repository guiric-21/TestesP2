package br.upe.atvTeste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        int intNumA = 5;
        int intNumB = 3;
        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal (5.2).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal (3.1).setScale(1, rmHalfUp);
        double dbNumbC = 5.2;
        double dbNumbD = 3.1;
        DecimalFormat dFormat = new DecimalFormat("#, ###.###");

        System.out.println (bdNumE + " + " + bdNumF + " = " + floatAritmetica.add (bdNumE, bdNumF));
        System.out.println(bdNumE + " - " + bdNumF + " = " +  floatAritmetica.subtract(bdNumE,bdNumF));
        System.out.println(bdNumE + " x " + bdNumF + " = " +  floatAritmetica.multiply(bdNumE,bdNumF));
        System.out.println(bdNumE + " " + (char)247 + " " + bdNumF + " = "+  floatAritmetica.divide(bdNumE, bdNumF, 10, rmHalfUp));
        System.out.println(dbNumbC + " to the power of " + dbNumbD + " = " +  floatAritmetica.exponent(dbNumbC,dbNumbD));
        System.out.println("The sguare root of " + dbNumbC + " = " +  floatAritmetica.squareRoot(dbNumbC));
        System.out.println("The cube root of " + dbNumbC + " = " +  floatAritmetica.cubeRoot(dbNumbC));
        System.out.println("The absolute value of " + dbNumbC + " = "  +   floatAritmetica.absoluteVal(dbNumbC));


        System.out.println(intNumA + " + " + intNumB + " = " + aritimetica.add(intNumA,intNumB));
        System.out.println(intNumA + " - " + intNumB + " = " + aritimetica.subtract(intNumA,intNumB));
        System.out.println(intNumA + " x " + intNumB + " = " + aritimetica.multiply(intNumA,intNumB));
        System.out.println(intNumA + " " + (char)247 + " " + intNumB + " = "+ aritimetica.divide(intNumA,intNumB));
        System.out.println(intNumA + " mod " + intNumB + " = " + aritimetica.modulo(intNumA, intNumB));
        System.out.println(intNumA + " to the power of " + intNumB + " = " + aritimetica.exponent(intNumA, intNumB));


    }
}

