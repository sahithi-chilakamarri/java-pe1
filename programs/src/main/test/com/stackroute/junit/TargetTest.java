package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Target.target;
import static org.junit.Assert.*;

public class TargetTest {
    public Target tar;
    @Before
    public void setUp(){
        System.out.println("Before");
        tar=new Target();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        tar=null;
    }
    @Test
    public void givenTwoNumbersShouldReturntheTarget(){
        //arrange
        //act
        String result=target(23,23);
        //Assert
        assertEquals("Number generated is equal to original number",result);
    }
    @Test
    public void givenTwoNumbersShouldReturntheTargetLessThanGuess(){
        //arrange
        //act
        String result=target(67,104);
        //Assert
        assertEquals("Number generated is less than original number",result);
    }
    @Test
    public void givenTwoNumbersShouldReturntheTargetGreaterThanGuess(){
        //arrange
        //act
        String result=target(67,57);
        //Assert
        assertEquals("Number generated is more than original number",result);
    }
    }

