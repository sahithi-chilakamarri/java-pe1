package com.stackroute.junit;

public class Target {
    public static String target(int guess,int target){
        String string="";
        if(target>guess)
            string="Number generated is less than original number";
   else if(target==guess)
            string="Number generated is equal to original number";
    else if(target<guess)
            string="Number generated is more than original number";
    else
        {
            string="Number not found";

        }
    return string;
    }
}
