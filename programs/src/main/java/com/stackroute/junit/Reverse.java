package com.stackroute.junit;

public class Reverse {
    public static String reverse(String word){
        String str="";
        if(word==null){
            str="Error";
        }
    else if(word=="")
        str="Empty String";
    int length=word.length();
    for(int i=length-1;i>=0;i--)
        str=str+word.charAt(i);
    return str;
    }

}
