package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheNumbersTest {
    public SortingTheNumbers digit;

    @Before
    public void setUp() {

        digit = new SortingTheNumbers();
    }

    @After
    public void tearDown() {

        digit = null;
    }

    @Test
    public void givenOneIntegerShouldReturnSum() {

        int result=digit.sum(24513);
        //Act
//       Assert
        assertEquals(6,result);

    }
    @Test
    public void givenOneIntegerShouldReturnSumResult() {

        boolean result=digit.sumCheck(24513);
        //Act
//       Assert
        assertEquals(false,result);

    }
    @Test
    public void givenOneIntegerShouldReturnOrder() {

        int[] result=digit.order(2451,4);
        //Act
//       Assert
        assertNotEquals(new int[]{5, 4, 2, 1},result);

    }

}