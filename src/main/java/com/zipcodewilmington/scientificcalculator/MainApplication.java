package com.zipcodewilmington.scientificcalculator;

import javax.naming.NameNotFoundException;
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
                "'Disp' -- Display current value\n" +
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
            try {
            System.out.println("What would you like to do? \n" + "Type ? for big beautiful guide");
            userChoice = scan.nextLine();
            if (userChoice.equals("exit")) {
                System.out.println("Ok, bye!");
                loop = false;
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
            else if (userChoice.equalsIgnoreCase("sub")||userChoice.equalsIgnoreCase("-")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.addition(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("mult")||userChoice.equalsIgnoreCase("*")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.multiplication(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("div")||userChoice.equalsIgnoreCase("/")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
                currentValue = CalculatorCore.division(currentValue, d1);
                System.out.println(currentValue);
//                try { String s = String.valueOf(d1); my attempt at error handling... does this even go here? -mike
//                    s = "0";
//                }
//                catch (NumberFormatException e){
//                    System.out.println("Error");
//                };
//                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("mod")||userChoice.equalsIgnoreCase("%")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.modulus(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("disp")) {
                System.out.println("Current Value = " + currentValue);
            }
            else if (userChoice.equalsIgnoreCase("sqr")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.square(currentValue);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Sqrt")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.squareroot(currentValue);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Exp")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.square(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Invs")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.inverse(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("+/-")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.changeSign(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("SwDis")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.swDis(currentValue, d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("M+")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.m(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("MC")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.mc();
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("MRC")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.mrc();
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Sin")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.sin(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Cos")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.cos(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Tan")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.tan(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("aSin")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.aSin(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("aCos")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.aCos(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("aTan")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.aTan(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Deg")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.deg(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Rad")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.rad(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Log")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.log(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("iLog")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.iLog(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Ln")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.ln(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("e")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.e(d1);
                System.out.println(currentValue);
            }
            else if (userChoice.equalsIgnoreCase("Fact")) {
                System.out.println("Current Value = " + currentValue + "\nEnter Second Number");
                double d1 = Double.parseDouble(scan.nextLine());
//                currentValue = CalculatorCore.iLog(d1);
                System.out.println(currentValue);
            }
            else {
                System.out.print("Not recognized. Try again. ");}

            } catch (Exception e) {
                System.out.println("Something went wrong! Please make sure you are entering the correct value for the prompt.");
            }

        }

    }


}