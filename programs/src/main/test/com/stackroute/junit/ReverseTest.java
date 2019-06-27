package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    public Reverse string;
    @Before
    public void setUp(){
        System.out.println("Before");
        string=new Reverse();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        string=null;
    }

    @Test
    public void givenOneStringShouldReturnReverseString(){
        //arrange
        //act
        String result= string.reverse("Sahithi");
        //assert
        assertEquals("ihtihaS",result);
    }
    @Test
    public void givenEmptyStringShouldReturnError(){
        //arrange
        //act
        String result= string.reverse("");
        //assert
        assertEquals("Empty String",result);
    }
    @Test
    public void givenOneStringShouldReturnReverseOfString(){
        //arrange
        //act
        String result= string.reverse("Premika");
        //assert
        assertEquals("akimerP",result);
    }

}