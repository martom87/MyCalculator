package com.example.sda.mycalculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

/**
 * Created by sda on 15.07.17.
 */

public class MyCalculatorTest {

    private Operations classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Operations();
    }

    @Test
    public void shouldAddCorrectly() {
        int result = 2 + 4;
        assertEquals(result, classUnderTest.add(2, 4), 0);
    }

    @Test
    public void shouldSubtractCorrectly() {
        int result = 2 - 4;
        assertEquals(result, classUnderTest.subtract(2, 4), 0);
    }

    @Test
    public void shouldMultiplyCorrectly() {
        int result = 2 * 4;
        assertEquals(result, classUnderTest.multiply(2, 4), 0);
        // z hamcreastem
        int expected = 8;
        assertThat(result, is(expected));
    }

    @Test
    public void shouldDivideCorrectly() {
        int result = 2 / 4;

        assertEquals(result, classUnderTest.divide(2, 4), 0.5);


    }

    @Test
    public void shouldCatchException() {
        double result = Double.POSITIVE_INFINITY;
        assertEquals(result, classUnderTest.divide(5, 0), 0.5);
        // można też skorzystać z hamcreasta
        double expected = Double.POSITIVE_INFINITY;
        assertThat(result, is(expected));
    }

    // testy nie zwiazany z kalkulatorem czy na danej liscie jest dana liczba czy na liscie hjest trojka

    @Test
    public void checkIsThereThree() {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        //proba bez hamcreast
      /*  int result = 3;
        for (int i = 0; i < integers.size(); i++) {
            assertEquals(result, integers.contains(3));
        }*/

// hamcreast
        assertThat("list integers should have three", integers, hasItem(3));
    }

}




