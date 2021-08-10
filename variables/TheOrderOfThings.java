package com.sg.foundations.variables;

public class TheOrderOfThings {

    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "rectangle";
        color = "black";
        origin = "Martian";
        material = "stainless steel";
        purpose = "good";

        noun = "birds";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
    }
}
