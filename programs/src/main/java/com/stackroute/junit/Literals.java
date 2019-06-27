package com.stackroute.junit;

public class Literals {
    public static String literals(char character){
        String string="";
        if(Character.isUpperCase(character))
            string="Capital Letter";
      else if(Character.isLowerCase(character))
            string="Small Letter";
      else if(Character.isDigit(character))
            string="Number";
else
    string="Special Symbol";
return string;
    }
}
