package com.stackroute.junit;

public class Alphabets {
    public static String alphabets(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                result += "Vowel";
            } else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                result += "Consonant";

            }
        }

        return result.trim();
    }
}