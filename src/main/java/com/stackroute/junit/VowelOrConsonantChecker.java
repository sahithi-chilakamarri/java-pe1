package com.stackroute.junit;

public class VowelOrConsonantChecker {
    //This method is used to differentiate vowels and consonants.
    public String isVowelOrConsonant(String string) {
        String result = "";
        if(string==null) {
            result = "Null is not accepted";
        }
        else if(string==" "){
            result="Empty String";
        }
        else{
            for (int i = 0; i < string.length(); i++) {
                char letter = string.charAt(i);
                //Check for the vowels.
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    result += "Vowel";
                } else {
                    result += "Consonant";

                }
            }

    }
            //Trim the extra space on the both sides.
        return result.trim();
    }
}