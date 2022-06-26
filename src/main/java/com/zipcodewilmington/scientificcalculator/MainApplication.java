package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class MainApplication {
//    public static void main(String[] args) {
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
//    }






    public static void main(String[] args) {

        double currentValue = 0;
        double memValue = 0;

        Scanner scan = new Scanner(System.in);
        String userChoice = "";

        boolean loop = true;
        while(loop) {
            System.out.println("What would you like to do? \n" + "? for help");
            userChoice = scan.nextLine();
            if (userChoice.equals("exit")) {
                System.out.println("Ok, bye!");
                break;
            }
            else if (userChoice.equals("?")) {
                System.out.println("Beautiful massive guide here");
            }
            else if (userChoice.equalsIgnoreCase("addition")) {
                System.out.println("Current Value = " + currentValue + "\n  Enter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.addition(currentValue, d1);
                System.out.println(currentValue);

//                double d1 = Double.parseDouble(scan.nextLine());
//                System.out.println("Enter second number");
//                double d2 = Double.parseDouble(scan.nextLine());
//                double currentValue = CalculatorCore.addition(d1, d2);
//                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("subtraction")) {
                System.out.println("Current Value = " + currentValue + " + Enter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.subtraction(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("multiplication")) {
                System.out.println("Current Value = " + currentValue + " + Enter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.multiplication(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("division")) {
                System.out.println("Current Value = " + currentValue + " + Enter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.division(currentValue, d1);
                System.out.println(currentValue);
            }
            else {
                System.out.print("Not recognized. Try again. ");
            }

        }


//        System.out.println("Hello! Welcome to the best calculator in the world!\n" +
//                "What function would you like to access? Enter the number at the beginning of the line: \n" +
//                "1) Basic calculator functions\n" +
//                "2) Scientific calculator functions");
//        userChoice = scan.nextLine();
//        if (userChoice.equals("1")) {
//            System.out.println("Good Choice! Here are the basic calculator functions available:\n" +
//                    "1) Add\n" +
//                    "2) Subtract\n" +
//                    "3) Multiply\n" +
//                    "4) Divide\n" +
//                    "5) Modulus (Find Remainder)\n" +
//                    "6) Square (^2)\n" +
//                    "7) Square Root\n" +
//                    "8) Calculate Exponentiation\n" +
//                    "9) Calculate The Inverse (1/x)\n" +
//                    "10) Invert Your Number (+/-)");
//        }

//        else if (userChoice.equals("2")) {
//            System.out.println("Great! Here are the scientific functions you can choose:\n" +
//                    "1) Change "
//
//
//
//
//
//            )
//        }

    }


}