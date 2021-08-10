package com.sg.foundations.scanner;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a1;
        int age;
        System.out.println("What is your age?");
        a1 = sc.nextLine();
        try{
            age = Integer.parseInt(a1);
            int maxHeartRate = 220-age;
            System.out.println();
            System.out.println("Your maximum heart rate should be "+maxHeartRate+" beats per minute.");
            System.out.println("Your target HR Zone is "+(int)(0.5*maxHeartRate)+" - "+(int)(0.85*maxHeartRate)+" beats per minute.");
        }catch (Exception e){
            System.out.println("invalid age number entered.");
        }
        System.out.println();
    }
}
