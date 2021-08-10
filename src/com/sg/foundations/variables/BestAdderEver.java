package com.sg.foundations.variables;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BestAdderEver {

    public static void main(String[] args) {

        int operand1 = 3;
        double operand2 = 5.5;
        float operand3 = 10.3f;

        NumberFormat formatter = new DecimalFormat("#0.0");

        System.out.println(operand1 + " + " + operand2 + " + " + operand3 + " = " + formatter.format(operand1 + operand2 + operand3));

    }
}
