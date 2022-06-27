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
    public void additionTest() {
        //Gerkin Statement IF WHEN THEN
        //If
        double firstValue = 1.5;
        double secondValue = 2;
        double expected = 3.5;

        //When
        CalculatorCore calculator = new CalculatorCore();
        double actual = calculator.addition(firstValue, secondValue);

        //Then
        assertEquals(actual, expected, 0.01d);
    }
}