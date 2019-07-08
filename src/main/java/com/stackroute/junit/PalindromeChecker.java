package com.stackroute.junit;
//This is used to check whether the given input number is palindrome or not.

public class PalindromeChecker {

    public String isPalindrome(int inputNumber) {
        int number = inputNumber;
        String string = "";
        int remainder, palindrome = 0, sum = 0;
        if (inputNumber < 0) {
            string = "Number cannot be negative";
        }
        //This is used to get the individual digits from the given number.
            while (number != 0) {
                remainder = number % 10;
                palindrome = palindrome * 10 + remainder;
                number = number / 10;
        }
        //Getting the sum of all individual digits in the palindrome number.
        if (inputNumber == palindrome) {
            while (palindrome != 0) {
                remainder = palindrome % 10;
                sum = sum + remainder;
                palindrome = palindrome / 10;

            }
            if (sum > 25) {
                string = inputNumber + "is a palindrome and sum is greater than 25";

            } else {
                string = inputNumber + "is a palindrome and sum is less than 25";
            }
        } else {
            string = inputNumber + "is not a palindrome";

        }
        return string;
    }

}

