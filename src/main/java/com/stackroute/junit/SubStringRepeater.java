package com.stackroute.junit;
//This is used to repeat the string for the given number of times.
public class SubStringRepeater {
    public String repeat(String word,int number)
    {
        int length;
        String resultString="";
        if(word==null){
            resultString="Error";
        }
        if(word!=null){
            length=word.length();
            if(word.equals("")){
                resultString="Error";
            }
            //Repeat the characters from the number given number of times
        else if(length>0){
            String substring=word.substring(length-number,length);
            for(int i=0;i<number;i++) {
                resultString = resultString + substring;
            }
            resultString=word+resultString;

            }
        }

        return resultString;
    }
}
