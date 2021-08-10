package com.sg.foundations.variables;

public class AllAboutMe {
    public static void main(String[] args) {

        String myName = "Ke";
        String favoriteFood = "Ramen";
        int numOfPets = 0;
        String location = "a big city where most people speak French";
        String skill = "code in Java";

        System.out.println(
                "My name is " + myName
                + ".\nMy favorite food is " + favoriteFood
                + ".\nI have " + ((numOfPets>0)?numOfPets+" pet(s)":"no pet")
                + ".\nI live in " + location
                + ".\nIt is true I know how to " + skill + "."
        );
    }
}
