package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Alphabets.alphabets;
import static org.junit.Assert.*;

public class AlphabetsTest {
    public Alphabets literals;
@Before
    public void setUp() {
    System.out.println("Before");
    literals=new Alphabets();
}
  @After
  public void tearDown(){
      System.out.println("After");
      literals=null;
}
@Test
public void givenOneStringShouldCheckAlphabet() {
    //arrange
    //act
    String result =alphabets("aS");
    //assert
    assertEquals("VowelConsonant", result);
}
    @Test
    public void givenOneStringShouldCheckVowel() {
        //arrange
        //act
        String result =alphabets("U");
        //assert
        assertEquals("Vowel", result);
    }
    @Test
    public void givenOneStringShouldCheckConsonant() {

        //arrange
        //act
        String result =alphabets("S");
        //assert
        assertEquals("Consonant", result);
    }


}
