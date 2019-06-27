package com.stackroute.junit;

public class Between {
    public static String between(int i){
        String string="";
        if ( i > 20 && i < 30) {
            if (i % 2 == 0) {
                string = "Jerry";
            }
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
