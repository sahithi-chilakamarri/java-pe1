package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.AddingNumbers.add;
import static org.junit.Assert.*;

public class AddingNumbersTest {
    public AddingNumbers ad;
    @Before
    public void setUp(){
        System.out.println("Before");
        ad=new AddingNumbers();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        ad=null;
    }
    @Test
    public void givenOneStringShouldReturnTotal(){
        //arrange
        //act
        String result=ad.add("20 25 5");
        //assert
        assertEquals("50",result);
    }
    @Test
    public void givenOneStringShouldReturnError(){
        //arrange
        //act
        String result=ad.add("20 25 ch");
        //assert
        assertEquals("Error",result);
    }
    @Test
    public void givenOneNullShouldReturnError(){
        //arrange
        //act
        String result=ad.add("null");
        //assert
        assertEquals("Error",result);
    }



}