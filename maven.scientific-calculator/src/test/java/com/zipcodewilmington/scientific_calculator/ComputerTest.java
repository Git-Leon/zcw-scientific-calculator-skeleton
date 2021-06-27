package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Computer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/27/21 11:49 AM
 */
public class ComputerTest {
    @Test
    public void addTest() {
        // given
        Computer computer = new Computer();
        double firstValue = 10;
        double secondValue = 200;
        double expectedValue = 210;

        // when
        double actualValue = computer.add(firstValue, secondValue);

        // then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void subtractTest() {
        // given
        Computer computer = new Computer();
        double firstValue = 10;
        double secondValue = 200;
        double expectedValue = 190;

        // when
        double actualValue = computer.subtract(firstValue, secondValue);

        // then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
