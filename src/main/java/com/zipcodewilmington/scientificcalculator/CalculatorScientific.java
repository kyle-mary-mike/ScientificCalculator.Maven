package com.zipcodewilmington.scientificcalculator;

public class CalculatorScientific {

//science calc with correct number of decimals: https://www.eeweb.com/tools/online-scientific-calculator/

//- Switch display mode (binary, octal, decimal, hexadecimal)
//  - `switchDisplayMode()` should rotate through the options
//  - `switchDisplayMode(String mode)` should set the display to the mode given
//XXXX- Memory - Store up to one numeric value in memory for recall later (default to 0) *
//XXXX            - (`M+` key) Add the currently displayed value to the value in memory (store in memory and update display) *
//XXXX            - (`MC` key) Reset memory *
//XXXX            - (`MRC` key) Recall the current value from memory to the display *
//XXXX- Trig functions
//XXXX- Sine - Calculate the sine of the displayed value and display it
//XXXX- Cosine - Calculate the cosine of the displayed value and display it
//XXXX- Tangent - Calculate the tangent of the displayed value and display it
//XXXX- Inverse Sine
//XXXX- Inverse Cosine
//XXXX- Inverse Tangent
//- Switch trig units mode (Degrees, Radians)
//- `switchUnitsMode()` should rotate through the options
//- `switchUnitsMode(String mode)` should set the trig units to the type given
//- Logarithmic functions
//XXXX- Log
//- 10<sup>x</sup> (inverse logarithm)
//- Ln (natural logarithm)
//- e<sup>x</sup> (inverse natural logarithm)
//- Factorial function

//    public static double switchDisplayMode(String dispInput){
//        dispInput = "0";
//    }

    //SWITCH DISPLAY MODES








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
    public double cosine(double num1) {
        return Math.cos(num1);
    }
    //TANGENT
    public double tangent(double num1) {
        return Math.tan(num1);
    }
    //ARCSINE AKA INVERSE SINE
    public double inverseSine(double num1) {
        return Math.asin(num1);
    }
    //ARC COSINE AKA INVERSE COSINE
    public double inverseCosine(double num1) {
        return Math.acos(num1);
    }
    //ARC TANGENT AKA INVERSE TANGENT
    public double inverseTangent(double num1) {
        return Math.atan(num1);
    }
    //DEGREES TO RADIANS
    public double degreesToRadians(double num1) {
        return Math.toRadians(num1);
    }
    //RADIANS TO DEGREES
    public double radiansToDegrees(double num1) {
        return Math.toDegrees(num1);
    }
    //LOG
    public double log(double num1) {
        return Math.log(num1);
    }
    //ANTILOG
    public double iLog(double num1) {
        num1 = Math.pow(num1, 10);
        return num1;
    }
    //NATURAL LOG (Ln)






}

