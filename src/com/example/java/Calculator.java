package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {

    private static final String RED = "RED";

    /**
     * Don't let anyone else instantiate this class
     */


    public static void main(String[] args) {
        String sthuing = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /):");
        getColors();


    }

    private static void getColors() {
        List<String> colors = new ArrayList<>();
        colors.add(RED);
        colors.add("BLUE");
        colors.add("YELLOW");
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }



}
