package com.stackroute.junit;
//This is used to add the numbers which are in array.
public class AddingNumbers {
    //Method is used to add numbers.
    public String add(String digit){
        int total=0;
        String string="";
        //Used to split the array
        String[] array=digit.split(" ");
        int arr[]=new int[array.length];
        //parses the array.
        try{
            for(int i=0;i<array.length;i++){
                arr[i]=Integer.parseInt(array[i]);
            }
        }
        //If an exception occurs in the try block it catches the exception.
        catch(Exception exception){
            string="Error";
            return string;
        }
        //Add the numbers.
    for(int i=0;i<array.length;i++){
        total =arr[i]+total;
    }
    string=""+total;
    return (string);
    }
}
