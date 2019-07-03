package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.NumberIteration.loop;
import static org.junit.Assert.*;

public class NumberIterationTest {
    public NumberIterationTest numberIterationTest;
    @Before
    public void setUp()
    {
        numberIterationTest =new NumberIterationTest();
    }
    @After
    public void tearDown()
    {
        numberIterationTest =null;
    }
    @Test
    public void givenOneIntegerShouldReturnInLoop(){
        //arrange
        //act
        String result=loop(5);
        //assert
        assertEquals("122333444455555",result);
    }
    @Test
    public void givenOneIntegerShouldReturnInString(){
        //arrange
        //act
        String result=loop(3);
        //assert
        assertEquals("122333",result);
    }
    @Test
    public void givenNegativeValueShouldReturnInError(){
        //arrange
        //act
        String result=loop(-6);
        //assert
        assertEquals("Error",result);
    }
    @Test
    public void givenNumberZeroShouldReturnInError(){
        //arrange
        //act
        String result=loop(0);
        //assert
        assertEquals("Error",result);
    }
}