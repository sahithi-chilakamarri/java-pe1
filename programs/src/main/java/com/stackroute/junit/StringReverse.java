package com.stackroute.junit;
//This is used to reverse the string.
public class StringReverse{
    public static String reverseTheString(String inputString){
        String string="";
        if(inputString==null){
            string="Null is not accepted";
        }
    else if(inputString=="") {
            string = "Empty String";
        }
    else {
//It takes the input as string and reverse the string.
            int length = inputString.length();
            for (int i = length - 1; i >= 0; i--)
                string = string + inputString.charAt(i);
        }
    return string;
    }

}
