package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorCore;
import com.zipcodewilmington.scientificcalculator.CalculatorScientific;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class CalculatorScientificTest {
    private CalculatorScientific objCalcUnderTest;

    @Before
    public void setUp() {
        objCalcUnderTest = new CalculatorScientific();
    }

    @Test
    public void sinTest() {
        //If
        double firstValue = 10;
        double expected = -0.54;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.sine(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void cosineTest() {
        //If
        double firstValue = 10;
        double expected = -0.83;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.cosine(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void tanTest() {
        //If
        double firstValue = 10;
        double expected = 0.64;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.tangent(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void inverseSineTest() {
        //If
        double firstValue = 10;
        double expected = Math.asin(10);

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.inverseSine(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void inverseCosineTest() {
        //If
        double firstValue = 10;
        double expected = Math.acos(10);

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.inverseCosine(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void inverseTangentTest() {
        //If
        double firstValue = 10;
        double expected = Math.atan(10);

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.inverseTangent(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void degreeToRadiansTest() {
        //If
        double firstValue = 10;
        double expected = 0.17;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.degreesToRadians(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void radiansToDegreesTest() {
        //If
        double firstValue = 1;
        double expected = 57.29;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.radiansToDegrees(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void logTest() {
        //If
        double firstValue = 145.256;
        double expected = 4.97;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.log(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void iLogTest() {
        //If
        double firstValue = 2;
        double expected = 100;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.iLog(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void natLogTest() {
        //If
        double firstValue = 2.0;
        double expected = 1.09;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.natLog(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void inverseLnTest() {
        //If
        double firstValue = 2.0;
        double expected = Math.pow(Math.E, firstValue);

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.inverseLn(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    } // idk how to return the output in a normal number. tried google

    @Test
    public void factTest() {
        //If
        double firstValue = 3;
        double expected = 6;

        //When
        CalculatorScientific calculator = new CalculatorScientific();
        double actual = calculator.fact(firstValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }
}