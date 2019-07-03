package com.stackroute.junit;
//This is used to check whether the guess is equal to target.
public class GuessTarget {

    public static String guessTarget(int guess, int target){
        String string="";
        //When number is greater than the guess.
        if(target>guess)
            string="Number generated is less than original number";
        //When the number is equal to guess
   else if(target==guess)
            string="Number generated is equal to original number";
   //When the number is less than guess.
    else if(target<guess)
            string="Number generated is more than original number";
    else
        {
            string="Number not found";

        }
    return string;
    }
}
