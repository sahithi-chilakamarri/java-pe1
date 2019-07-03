package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddingNumbersTest {

    public AddingNumbers addingNumbers;

    @Before
    public void setUp(){

        addingNumbers =new AddingNumbers();
    }

    @After
    public void tearDown(){
        addingNumbers =null;
    }

    @Test
    public void givenOneStringOfNumbersShouldReturnTotal(){
        //arrange
        //act
        String result= addingNumbers.add("20 25 5");
        //assert
        assertEquals("50",result);
    }

    @Test
    public void givenOneStringShouldReturnError(){
        //arrange
        //act
        String result= addingNumbers.add("20 25 ch");
        //assert
        assertEquals("Error",result);
    }

    @Test
    public void givenOneNegativeNumberShouldReturnSum(){
        //arrange
        //act
        String result= addingNumbers.add("10 25 -5");
        //assert
        assertEquals("30",result);
    }

}