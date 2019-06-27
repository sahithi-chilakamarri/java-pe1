package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static com.stackroute.junit.Itreration.loop;
import static org.junit.Assert.*;

public class ItrerationTest {
    public ItrerationTest itr;
    @Before
    public void setUp(){
        System.out.println("Before");
        itr=new ItrerationTest();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        itr=null;
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
}