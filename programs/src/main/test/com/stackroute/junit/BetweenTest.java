package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Between.between;
import static org.junit.Assert.*;

public class BetweenTest {
public Between bet;
  @Before
 public void setUp(){
   System.out.println("Before");
   bet=new Between();
  }
  @After
 public void tearDown(){
   System.out.println("After");
   bet=null;
  }
  @Test
 public void givenOneIntegerShouldReturnJerry(){
   //arrange
   //act
   String result=  between(24);
   //Assert
   assertEquals("Jerry",result);
  }

    @Test
    public void givenOneIntegerShouldReturnTom(){
        //arrange
        //act
        String result=  between(29);
        //Assert
        assertEquals("Tom",result);
    }

 @Test
public void givenOneIntegerShouldReturnError(){
        //arrange
        //act
        String result=  between(35);
        //Assert
        assertEquals("Error",result);
        }
        }
