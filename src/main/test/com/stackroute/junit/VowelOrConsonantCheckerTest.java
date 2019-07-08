package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantCheckerTest {
    public VowelOrConsonantChecker literals;
@Before
    public void setUp()
{
    literals=new VowelOrConsonantChecker();
}
  @After
  public void tearDown()
  {
      literals=null;
}
@Test
public void givenOneStringShouldReturnVowelOrConsonant() {
    //arrange
    //act
    String result =literals.isVowelOrConsonant("aS");
    //assert
    assertEquals("VowelConsonant", result);
}

    @Test
    public void givenOneStringShouldReturnVowel() {
        //arrange
        //act
        String result =literals.isVowelOrConsonant("U");
        //assert
        assertEquals("Vowel", result);
    }
    @Test
    public void givenOneStringShouldReturnConsonant() {

        //arrange
        //act
        String result =literals.isVowelOrConsonant("S");
        //assert
        assertEquals("Consonant", result);
    }
    @Test
    public void giveNullShouldReturnError() {

        //arrange
        //act
        String result =literals.isVowelOrConsonant(null);
        //assert
        assertEquals("Null is not accepted", result);
    }
    @Test
    public void giveEmptyStringShouldReturnError() {

        //arrange
        //act
        String result =literals.isVowelOrConsonant(" ");
        //assert
        assertEquals("Empty String", result);
    }


}
