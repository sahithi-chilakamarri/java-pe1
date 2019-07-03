package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.EvenOrOddChecker.isEvenOrOdd;

import static org.junit.Assert.*;

public class EvenOrOddCheckerTest {
public EvenOrOddChecker evenOrOddChecker;

@Before
 public void setUp()
{
   evenOrOddChecker =new EvenOrOddChecker();
  }

  @After
 public void tearDown()
  {
   evenOrOddChecker =null;
  }

  @Test
 public void givenOneIntegerShouldReturnJerry(){
   //arrange
   //act
   String result=isEvenOrOdd(24);
   //Assert
   assertEquals("Jerry",result);
  }

    @Test
    public void givenOneIntegerShouldReturnTom(){
        //arrange
        //act
        String result=isEvenOrOdd(29);
        //Assert
        assertEquals("Tom",result);
    }

 @Test
public void givenOneIntegerShouldReturnError(){
        //arrange
        //act
        String result=isEvenOrOdd(35);
        //Assert
        assertEquals("Error",result);
        }
        @Test
    public void givenIntegerZeroShouldReturnError(){
        //arrange
        //act
        String result=isEvenOrOdd(0);
        //Assert
        assertEquals("Number can't be negative and zero",result);
    }
    @Test
    public void givenINegativeNumberZeroShouldReturnError(){
        //arrange
        //act
        String result=isEvenOrOdd(-5);
        //Assert
        assertEquals("Number can't be negative and zero",result);
    }
}

