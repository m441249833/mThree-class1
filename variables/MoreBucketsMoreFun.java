package com.sg.foundations.variables;

public class MoreBucketsMoreFun {
    public static void main(String[] args) {

        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;

        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        //The dog ate a bug, so we use unary operator -- to represent the deduction of butterflies (a bug).
        //when we change the number of butterflies,
        //the number of bugs won't change since we have not assign the value to bugs variable.
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
}
