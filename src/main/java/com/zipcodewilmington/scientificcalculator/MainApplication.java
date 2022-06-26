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


    public static String printGuide() {
        String guide =
                "Use these commands to access functions of this awesome calculator:\n" +
                "'Add'  or '+' -- Add two numbers together\n" +
                "'Sub'  or '-' -- Subtract second number from first number\n" +
                "'Mult' or '*' -- Multiply two numbers together\n" +
                "'Div'  or '/' -- Divide second number into first number\n" +
                "'Mod'  or '%' -- Modulus, Divide second number from first and show the remainder\n" +
                "'Sqr'  -- Square the number\n" +
                "'Sqrt' -- Get the square root of the number\n" +
                "'Exp'  -- Current value to the power of entered number\n" +
                "'Invs' -- Calculate the inverse of the current number (1/x)\n" +
                "'+/-' -- Invert current value. Change from positive to negative or negative to positive\n" +
                "'SwDis'-- Switch display mode.  Rotate between binary, octal, decimal, hexadecimal\n" +
                "'M+'   -- Store current value in memory\n" +
                "'MC'   -- Clear value stored in memory\n" +
                "'MRC'  -- Recall stored value\n" +
                "'Sin'  -- Calculate the sin of current value\n" +
                "'Cos'  -- Calculate the cosine of current value\n" +
                "'Tan'  -- Calculate the tangent of the current value\n" +
                "'aSin' -- Calculate Arc Sine aka Inverse Sine of current value\n" +
                "'aCos' -- Calculate Arc Cosine aka Inverse Cosine of current value\n" +
                "'aTan' -- Calculate Arc Tangent aka Inverse Tangent of current value\n" +
                "'Deg'  -- Convert current value to degrees\n" +
                "'Rad'  -- Convert current value to radians\n" +
                "'Log'  -- Get the log of current value\n" +
                "'iLog' -- Get the inverse log of the current value\n" +
                "'Ln'   -- Natural Logarithm of current value\n" +
                "'e'    -- Inverse natural logarithm of current value\n" +
                "'Fact' -- Factorial of current value";
        return guide;
    }



    public static void main(String[] args) {

        double currentValue = 0;
        double memValue = 0;

        Scanner scan = new Scanner(System.in);
        String userChoice = "";

        boolean loop = true;
        while(loop) {
            System.out.println("What would you like to do? \n" + "Type ? for big beautiful guide");
            userChoice = scan.nextLine();
            if (userChoice.equals("exit")) {
                System.out.println("Ok, bye!");
                break;
            }
            else if (userChoice.equals("?")) {
                System.out.println(printGuide());
            }
            else if (userChoice.equalsIgnoreCase("add")||userChoice.equalsIgnoreCase("+")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.addition(currentValue, d1);
                System.out.println(currentValue);

//                double d1 = Double.parseDouble(scan.nextLine());
//                System.out.println("Enter second number");
//                double d2 = Double.parseDouble(scan.nextLine());
//                double currentValue = CalculatorCore.addition(d1, d2);
//                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("addition")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
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

    }


}