package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class NumberIterationTest {
    public NumberIteration numberIteration;
    @Before
    public void setUp()
    {
        numberIteration =new NumberIteration();
    }
    @After
    public void tearDown()
    {
        numberIteration =null;
    }
    @Test
    public void givenOneIntegerShouldReturnInLoop(){
        //arrange
        //act
        String result=numberIteration.loop(5);
        //assert
        assertEquals("122333444455555",result);
    }
    @Test
    public void givenOneIntegerShouldReturnInString(){
        //arrange
        //act
        String result=numberIteration.loop(3);
        //assert
        assertEquals("122333",result);
    }
    @Test
    public void givenNegativeValueShouldReturnInError(){
        //arrange
        //act
        String result=numberIteration.loop(-6);
        //assert
        assertEquals("Error",result);
    }
    @Test
    public void givenNumberZeroShouldReturnInError(){
        //arrange
        //act
        String result=numberIteration.loop(0);
        //assert
        assertEquals("Error",result);
    }
}