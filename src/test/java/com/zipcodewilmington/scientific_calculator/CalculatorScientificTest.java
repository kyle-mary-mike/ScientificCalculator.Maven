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
}