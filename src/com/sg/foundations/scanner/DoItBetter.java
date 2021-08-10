package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a1,a2,a3;
        int n1,n2,n3;

        System.out.println("How many miles you can run?");
        a1 = sc.nextLine();
        try{
            n1 = Integer.parseInt(a1);
            System.out.println("That's nice ! , but I can run "+ (n1*2+1) + " miles!");
        }catch (Exception e){
            System.out.println(a1+" is not a valid number.");
        }
        System.out.println();
        System.out.println("How many hot dogs you can eat?");
        a2 = sc.nextLine();
        try{
            n2 = Integer.parseInt(a2);
            System.out.println("That's nice ! , but I can eat "+ (n2*2+1) + " hot dogs!");
        }catch (Exception e){
            System.out.println(a2+" is not a valid number.");
        }
        System.out.println();
        System.out.println("How many languages can you speak?");
        a3 = sc.nextLine();
        try{
            n3 = Integer.parseInt(a3);
            System.out.println("That's nice ! , but I can speak "+ (n3*2+1) + " languages!");
        }catch (Exception e){
            System.out.println(a3+" is not a valid number.");
        }

    }
}
