package com.stackroute.junit;
//This class is used to check the given Character
public class LiteralChecker{
    //This is used to check whether the given input is number or capital letter or Small letter or Special Symbol.
    public String literals(char character){
        String string="";
        if(string==null)
        {
            string="Null is not accepted.";
        }
       else if(Character.isUpperCase(character)) {
            string = "Capital Letter";
        }
      else if(Character.isLowerCase(character)) {
            string = "Small Letter";
        }
      else if(Character.isDigit(character)) {
            string = "Number";
        }
else {
            string = "Special Symbol";
        }
return string;
    }
}
