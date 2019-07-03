package com.stackroute.junit;
//This class is used to iterate the given input number.
public class NumberIteration {
    //This is method is used to print the numbers in the loop.
public static String loop(int number){
    String string="";
    for(int i=1;i<=number;i++)
    {
        for(int j=1;j<=i;j++){
            string=string+i;
        }
    }
    //If number is less than zero then return error.
if(number<=0) {
    string = "Error";
    return string;
}
return string;
}
}

