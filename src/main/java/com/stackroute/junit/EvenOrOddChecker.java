package com.stackroute.junit;

public class EvenOrOddChecker {
    //This method checks whether the given input is between even or odd and between 20 and 30
    public String isEvenOrOdd(int number){
        String string="";
        //If it is even and between 20 and 30 then it is Jerry
        if(number<=0){
            string="Number can't be negative and zero";
        }
        else if ( number > 20 && number < 30) {
            if (number % 2 == 0) {
                string = "Jerry";
            }
            //If it is odd and between 20 and 30 then it is Tom
                else{
                    string = "Tom";
                }
            }

            else {
                string = "Error";

            }
        return string;

    }

}
