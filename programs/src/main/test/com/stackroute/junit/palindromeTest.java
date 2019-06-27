package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    public palindrome num;
    @Before
    public void setUp(){
        System.out.println("Before");
        num=new palindrome();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        num=null;
    }
    @Test
    public void givenOneIntegerShouldReturnNotPalindrome(){
        //arrange
                //act
        String result= num.palindrome(42567);
        //assert
        assertEquals("42567is not a palindrome",result);
    }
    @Test
    public void givenOneIntegerShouldReturnLesserThanPalindrome(){
        //arrange
        //act
        String result= num.palindrome(63236);
        //assert
        assertEquals("63236is a palindrome and sum is less than 25",result);
    }
    @Test
    public void givenOneIntegerShouldReturnGreaterThanPalindrome(){
        //arrange
        //act
        String result= num.palindrome(63936);
        //assert
        assertEquals("63936is a palindrome and sum is greater than 25",result);
    }

}