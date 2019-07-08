package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringRepeaterTest {
    public SubStringRepeater string;
    @Before
    public void setUp(){
        string=new SubStringRepeater();
    }
    @After
    public void tearDown(){
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