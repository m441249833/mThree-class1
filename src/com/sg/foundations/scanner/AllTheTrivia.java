package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer1,answer2,answer3,answer4;

        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        answer1 = sc.nextLine();

        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        answer2 = sc.nextLine();

        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        answer3 = sc.nextLine();

        System.out.println("What is the most abundant element in the earth's atmosphere?");
        answer4 = sc.nextLine();

        System.out.println();
        System.out.println("Wow, 1,024 Gigabytes is a "+answer4+"!\n" +
                "I didn't know that the largest ever volcano was discovered on "+answer3+"!\n" +
                "That's amazing that "+answer2+" is the most abundant element in the atmosphere...\n" +
                answer1 + " is the only planet that rotates clockwise, neat!");
    }
}
