package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        System.out.print("I need a noun:");
        a1 = sc.nextLine();
        System.out.print("Now an adjective:");
        a2 = sc.nextLine();
        System.out.print("Another noun:");
        a3 = sc.nextLine();
        System.out.print("And a number:");
        a4 = sc.nextLine();
        System.out.print("Another adjective:");
        a5 = sc.nextLine();
        System.out.print("A plural noun:");
        a6 = sc.nextLine();
        System.out.print("Another one:");
        a7 = sc.nextLine();
        System.out.print("One more:");
        a8 = sc.nextLine();
        System.out.print("A verb (infinitive form):");
        a9 = sc.nextLine();
        System.out.print("Same verb (past participle):");
        a10 = sc.nextLine();
        System.out.println();
        System.out.println(a1+": the "+a2+" frontier. These are the \n" +
                "voyages of the starship "+a3+". Its "+a4+"-year\n" +
                "mission: to explore strange "+a5+" "+a6+", \n" +
                "to seek out "+a5+" "+a7+" and "+a5+" "+a8+", to boldly \n" +
                a9+" where no one has "+a10+" before.");



    }
}
