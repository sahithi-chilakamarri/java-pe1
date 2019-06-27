package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.junit.Between.between;
import static com.stackroute.junit.Literals.literals;
import static org.junit.Assert.*;

public class LiteralsTest {
    public Literals lit;
    @Before
    public void setUp(){
        System.out.println("Before");
        lit=new Literals();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        lit=null;
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


