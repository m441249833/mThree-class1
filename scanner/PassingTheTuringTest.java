package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name,color,fruit,numberString;
        int number;

        System.out.println("Hello stranger!");
        System.out.println("What's your name?");
        name = sc.nextLine();

        System.out.println("Hi, " + name + "!  I'm Alice.");
        System.out.println("What's your favorite color?");
        color = sc.nextLine();

        System.out.println("Huh, " + color + "? Mine's Black.");

        System.out.println("I really like bananas. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name + "?");
        fruit = sc.nextLine();

        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite integer number?");

        numberString = sc.nextLine();

        try{
            number = Integer.parseInt(numberString);
            System.out.println(numberString + " is a cool number. Mine's 8.");
            System.out.println("Did you know " + number + " * "+ 8 +" is " + number * 8 + "? That's a cool number too!");
        }catch (Exception e){
            System.out.println("Seems like you didn't give me a correct integer number.");
        }

        System.out.println("Well, thanks for talking to me, " + name + "!");



    }
}
