package com.stackroute.junit;

public class palindrome {
    public static String palindrome(int i) {
        int n = i;
        String str="";
        int r, p = 0, s = 0;
        while (n != 0) {
            r = n % 10;
            p = p * 10 + r;
            n = n / 10;
        }
        if (i == p) {
            while (p != 0) {
                r = p % 10;
                s = s + r;
                p = p / 10;

            }
            if (s > 25) {
                 str = i + "is a palindrome and sum is greater than 25";

            } else {
                 str = i + "is a palindrome and sum is less than 25";
            }
        } else {
             str = i + "is not a palindrome";

        }
return str;
    }

}

