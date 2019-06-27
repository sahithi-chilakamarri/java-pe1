package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitTest {
    public Digit digit;

    @Before
    public void setUp(){
        System.out.println("Before");
        digit=new Digit();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        digit=null;
    }
    @Test
    public void givenOneNumberShouldSortNumberSumIsLow(){
        //arrange
        //act
        Digit.Result result=Digit.sum(27584);
        //assert
       assertEquals("87542",result.order);
       assertEquals(14,result.total);
       assertEquals(false,result.value);

    }
    @Test
    public void givenIntegerShouldReturnSortedNumber(){
        //arrange
        //act
        Digit.Result result=Digit.sum(3894);
        //assert
        assertEquals("9843",result.order);
        assertEquals(12,result.total);
        assertEquals(false,result.value);

    }
    @Test
    public void givenIntegerShouldReturnHighSum(){
        //arrange
        //act
        Digit.Result result=Digit.sum(2468);
        //assert
        assertEquals("8642",result.order);
        assertEquals(20,result.total);
        assertEquals(true,result.value);

    }

}