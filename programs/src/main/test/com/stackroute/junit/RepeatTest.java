package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatTest {
    public Repeat string;
    @Before
    public void setUp(){
        System.out.println("Before");
        string=new Repeat();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        string=null;
    }
    @Test
    public void givenOneStringShouldRepeatString(){
        //arrange
        //act
        String result=string.repeat("Stack",3);
        //assert
        assertEquals("Stackackackack",result);
    }
    @Test
    public void givenNullShouldReturnError(){
        //arrange
        //act
        String result=string.repeat(null,3);
        //assert
        assertEquals("Error",result);
    }
    @Test
    public void givenOneEmptyStringShouldReturnerror(){
        //arrange
        //act
        String result=string.repeat("",3);
        //assert
        assertEquals("Error",result);
    }
}