package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.GuessTarget.guessTarget;

import static org.junit.Assert.*;

public class GuessTargetTest {
    public GuessTarget guessTarget;
    @Before
    public void setUp(){
        guessTarget =new GuessTarget();
    }
    @After
    public void tearDown(){
        guessTarget =null;
    }
    @Test
    public void givenTwoNumbersShouldReturntheTarget(){
        //arrange
        //act
        String result=guessTarget(23,23);
        //Assert
        assertEquals("Number generated is equal to original number",result);
    }
    @Test
    public void givenTwoNumbersShouldReturntheTargetLessThanGuess(){
        //arrange
        //act
        String result=guessTarget(67,104);
        //Assert
        assertEquals("Number generated is less than original number",result);
    }
    @Test
    public void givenTwoNumbersShouldReturntheTargetGreaterThanGuess(){
        //arrange
        //act
        String result=guessTarget(67,57);
        //Assert
        assertEquals("Number generated is more than original number",result);
    }
    @Test
    public void givenOneNegatveNumberShouldReturntheTarget(){
        //arrange
        //act
        String result=guessTarget(-5,-5);
        //Assert
        assertEquals("Number generated is equal to original number",result);
    }
    }

