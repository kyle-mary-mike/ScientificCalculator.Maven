package com.zipcodewilmington.scientificcalculator;

public class CalculatorCore {



    public static double addition(double num1, double num2) {
        double solution;
        solution = num1 + num2;
        return solution;
    }

    public static double subtraction(double num1, double num2) {
        double solution;
        solution = num1 - num2;
        return solution;
    }


    public static double multiplication(double num1, double num2) {
        double solution;
        solution = num1 * num2;
        return solution;
    }

    public static double division(double num1, double num2) {
        double solution;
        solution = num1 / num2;
        return solution;
    }

    public static double modulus(double num1, double num2) {
        double solution;
        solution = num1 % num2;
        return solution;
    }

    public static double square(double num1) {
        double solution;
        solution = num1 * num1;
        return solution;
    }
    public static double sqrt(double num1) {
        double solution;
        solution = Math.sqrt(num1);
        return solution;
    }
    public static double exponent(double num1, double num2) {
        double solution;
        solution = Math.pow(num1, num2);
        return solution;
    }
    public static double inverse(double num1) {
        double solution;
        solution = 1 / num1;
        return solution;
    }
    public static double changeSign(double num1) {
        double solution;
        solution = -num1;
        return solution;
    }
}