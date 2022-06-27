package com.zipcodewilmington.scientificcalculator;

public class CalculatorScientific {

//- Switch display mode (binary, octal, decimal, hexadecimal)
//  - `switchDisplayMode()` should rotate through the options
//  - `switchDisplayMode(String mode)` should set the display to the mode given

//- Switch trig units mode (Degrees, Radians)
//- `switchUnitsMode()` should rotate through the options



    //DISPLAY MODES
    //public double toBinary (int num1) {    }






    //SET MEMORY
    public static class memory {
        double memValue = 0;
        public double  memSet(double num1) {
            memValue = num1;
            return memValue;
        }
        public double memClear() {
            memValue = 0;
            return memValue;
        }
        public double memRecall() {
            return memValue;
        }
    }
    //SINE
    public static double sine(double num1) {
        return Math.sin(num1);
    }
    //COSINE
    public static double cosine(double num1) {
        return Math.cos(num1);
    }
    //TANGENT
    public static double tangent(double num1) {
        return Math.tan(num1);
    }
    //ARCSINE AKA INVERSE SINE
    public static double inverseSine(double num1) {
        return Math.asin(num1);
    }
    //ARC COSINE AKA INVERSE COSINE
    public static double inverseCosine(double num1) {
        return Math.acos(num1);
    }
    //ARC TANGENT AKA INVERSE TANGENT
    public static double inverseTangent(double num1) {
        return Math.atan(num1);
    }
    //DEGREES TO RADIANS
    public static double degreesToRadians(double num1) {
        return Math.toRadians(num1);
    }
    //RADIANS TO DEGREES
    public static double radiansToDegrees(double num1) {
        return Math.toDegrees(num1);
    }
    //LOG
    public static double log(double num1) {
        return Math.log(num1);
    }
    //ANTILOG
    public static double iLog(double num1) {
        return Math.pow(10, num1);
    }
    //NATURAL LOG (Ln)
    public static double natLog(double num1) {
        return Math.log1p(num1);
    }
    //INVERSE NATURAL LOGARITHM
    public static double inverseLn(double num1) {
        return Math.pow(Math.E, num1);
    }
    //FACTORIAL
    public static double fact(double num1) {
        double y = 1;
        for (int x = 2; x <= num1; x++) {
            y = y * x;
        }
        return y;
        }
}

