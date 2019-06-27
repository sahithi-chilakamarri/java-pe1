package com.stackroute.junit;

public class AddingNumbers {
    public static String add(String digit){
        int total=0;
        String string="";
        String[] array=digit.split(" ");
        int arr[]=new int[array.length];
        try{
            for(int i=0;i<array.length;i++){
                arr[i]=Integer.parseInt(array[i]);
            }
        }
        catch(Exception exception){
            string="Error";
            return string;
        }
    for(int i=0;i<array.length;i++){
        total =arr[i]+total;
    }
    string=""+total;
    return (string);
    }

}
