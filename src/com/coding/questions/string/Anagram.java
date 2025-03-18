package com.coding.questions.string;

import java.util.Arrays;

// Anagram Definition: Two strings are anagrams if they contain the same characters
// in the same frequency but in a different order.
public class Anagram {

    public boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char[] str1CharArray = str1.toLowerCase().toCharArray();
        char[] str2CharArray = str2.toLowerCase().toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        return Arrays.equals(str1CharArray, str2CharArray);
    }
}
