package com.sg.foundations.scanner;

import java.util.Scanner;

public class BiggerBetterAdder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a1,a2,a3;
        int op1,op2,op3;


        try{
            System.out.println("Please enter the first number.");
            a1 = sc.nextLine();
            op1 = Integer.parseInt(a1);
            System.out.println("Please enter the second number.");
            a2 = sc.nextLine();
            op2 = Integer.parseInt(a2);
            System.out.println("Please enter the third number.");
            a3 = sc.nextLine();
            op3 = Integer.parseInt(a3);

            System.out.println(op1 + " + " + op2 + " + " + op3 + " = " + (op1+op2+op3));
        }catch (Exception e){
            System.out.println("invalid number entered.");
            System.exit(130);
        }



    }
}
