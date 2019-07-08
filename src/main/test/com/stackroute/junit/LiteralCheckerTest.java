package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        String result=literalChecker.literals('A');
        //Assert
        assertEquals("Capital Letter",result);
    }

    @Test
    public void givenOneCharacterShouldReturnSmallLetter() {
        //arrange
        //act
        String result =literalChecker.literals('z');
        //Assert
        assertEquals("Small Letter", result);
    }
        @Test
        public void givenOneCharacterShouldReturnDigit(){
            //arrange
            //act
            String result=literalChecker.literals('6');
            //Assert
            assertEquals("Number",result);

        }

    @Test
    public void givenOneCharacterShouldReturnSpecialSymbol(){
        //arrange
        //act
        String result=literalChecker.literals('*');
        //Assert
        assertEquals("Special Symbol",result);

    }



}


