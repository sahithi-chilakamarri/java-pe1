package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    public StringReverse string;
    @Before
    public void setUp(){
        string=new StringReverse();
    }
    @After
    public void tearDown(){
        string=null;
    }

    @Test
    public void givenOneStringShouldReturnReverseString(){
        //arrange
        //act
        String result= string.reverseTheString("Sahithi");
        //assert
        assertEquals("ihtihaS",result);
    }
    @Test
    public void givenEmptyStringShouldReturnError(){
        //arrange
        //act
        String result= string.reverseTheString("");
        //assert
        assertEquals("Empty String",result);
    }
    @Test
    public void givenOneStringShouldReturnReverseOfString(){
        //arrange
        //act
        String result= string.reverseTheString("Premika");
        //assert
        assertEquals("akimerP",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage(){
        //arrange
        //act
        String result= string.reverseTheString(null);
        //assert
        assertEquals("Null is not accepted",result);
    }

}