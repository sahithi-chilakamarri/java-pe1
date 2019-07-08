package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    public PalindromeChecker palindromeChecker;
    @Before
    public void setUp(){
        palindromeChecker =new PalindromeChecker();
    }
    @After
    public void tearDown(){

        palindromeChecker =null;
    }
    @Test
    public void givenOneIntegerShouldReturnNotPalindrome(){
        //arrange
                //act
        String result= palindromeChecker.isPalindrome(42567);
        //assert
        assertEquals("42567is not a palindrome",result);
    }
    @Test
    public void givenOneIntegerShouldReturnLesserThanPalindrome(){
        //arrange
        //act
        String result= palindromeChecker.isPalindrome(63236);
        //assert
        assertEquals("63236is a palindrome and sum is less than 25",result);
    }
    @Test
    public void givenOneIntegerShouldReturnGreaterThanPalindrome(){
        //arrange
        //act
        String result= palindromeChecker.isPalindrome(63936);
        //assert
        assertEquals("63936is a palindrome and sum is greater than 25",result);
    }
}