package com.coding.questions.string;

//Aim:- Write a Java program to find the longest contiguous substring of digits in a given alphanumeric string.
//Aim:- Write a Java program to find the longest contiguous substring of digits in a given alphanumeric string.

//We need to scan through the string and:
//
//Track the current sequence of digits using a StringBuilder.
//Compare it to the longest sequence found so far.
//Reset the current sequence when a non-digit character is encountered.
//At the end of the loop, check if the last sequence was the longest.


public class LongestDigitSubstring {
    public static String findLongestDigitSubstring(String str){
        String longest = "";
        StringBuilder current = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
                current.append(ch);
            }else{
                if(current.length() > longest.length()){
                    longest = current.toString();
                }
                current.setLength(0);
            }
        }

        if(current.length() > longest.length()){
            longest = current.toString();
        }
        return longest;
    }
}
