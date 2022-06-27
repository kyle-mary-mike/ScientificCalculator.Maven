package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorCore;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class CalculatorCoreTest {
    private CalculatorCore objCalcUnderTest;

    @Before
    public void setUp() {
        objCalcUnderTest = new CalculatorCore();
    }

    @Test
    public void additionTest() {
        //Gerkin Statement IF WHEN THEN
        //If
        double firstValue = 1.5; double secondValue = 2;
        double expected = 3.5;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.addition(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void subtractionTest() {
        //If
        double firstValue = 5.5; double secondValue = 2.0;
        double expected = 3.5;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.subtraction(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void multiplicationTest() {
        //If
        double firstValue = 5; double secondValue = 2;
        double expected = 10;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.multiplication(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void divisionTest() {
        //If
        double firstValue = 6; double secondValue = 2;
        double expected = 3;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.division(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void squareTest() {
        //If
        double num1 = 5;
        double expected = 25;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.square(num1);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void modulusTest() {
        //If
        double num1 = 5;
        double num2 = 3;
        double expected = 2;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.modulus(num1, num2);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void sqrtTest() {
        //If
        double num1 = 25;
        double expected = 5;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.sqrt(num1);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void exponentTest() {
        //If
        double num1 = 10;
        double num2 = 2;
        double expected = 100;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.exponent(num1, num2);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void inverseTest() {
        //If
        double num1 = 3;
        double expected = 0.33;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.inverse(num1);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

    @Test
    public void changeSignTest() {
        //If
        double num1 = -3;
        double expected = 3;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.changeSign(num1);

        //Then
        assertEquals(actual, expected, 0.01d);
    }

}
