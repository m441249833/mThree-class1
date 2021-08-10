package com.sg.foundations.variables;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MenuOfChampions {
    public static void main(String[] args) {
        Map<String,Double> menu= new HashMap<>();

        menu.put("Cheese Burger",4.95);
        menu.put("Pizza",8.99);
        menu.put("Fries",1.99);
        menu.put("Soup",2.99);

        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");
        System.out.println("               WELCOME TO MY RESTAURANT");
        System.out.println("               Here is today's menu...");
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");
        menu.forEach((food,price)->{
            System.out.println("               "+food+"                    \t$ "+price);
        });
        System.out.println();


    }
}
