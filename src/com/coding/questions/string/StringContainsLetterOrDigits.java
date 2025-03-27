package com.coding.questions.string;

public class StringContainsLetterOrDigits {
    public static boolean stringContainsLetterOrDigitsUsingIsLetterOrDigit(String str){
        char[] charArray = str.toCharArray();
        for(char ch: charArray){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
        }

        return true;
    }

    public static boolean stringContainsLetterOrDigitsUsingRegex(String str){
        return str.matches("[a-zA-Z0-9]+");
    }

    public static boolean stringContainsLetterOrDigitsUsingStreams(String str){
        return str.chars().allMatch(Character::isLetterOrDigit);
    }
}
