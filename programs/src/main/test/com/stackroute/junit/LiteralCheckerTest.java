package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.LiteralChecker.literals;
import static org.junit.Assert.*;

public class LiteralCheckerTest {
    public LiteralChecker literalChecker;
    @Before
    public void setUp(){
        literalChecker =new LiteralChecker();
    }
    @After
    public void tearDown(){
        literalChecker =null;
    }
    @Test
    public void givenOneCharacterShouldReturnCapitalLetter(){
        //arrange
        //act
        String result=literals('A');
        //Assert
        assertEquals("Capital Letter",result);
    }

    @Test
    public void givenOneCharacterShouldReturnSmallLetter() {
        //arrange
        //act
        String result = literals('z');
        //Assert
        assertEquals("Small Letter", result);
    }
        @Test
        public void givenOneCharacterShouldReturnDigit(){
            //arrange
            //act
            String result=literals('6');
            //Assert
            assertEquals("Number",result);

        }

    @Test
    public void givenOneCharacterShouldReturnSpecialSymbol(){
        //arrange
        //act
        String result=literals('*');
        //Assert
        assertEquals("Special Symbol",result);

    }



}


