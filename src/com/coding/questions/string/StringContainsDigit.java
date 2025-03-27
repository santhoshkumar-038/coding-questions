package com.coding.questions.string;

public class StringContainsDigit {
    public static boolean stringContainsDigitUsingIsDigit(String str){
        for(char ch: str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

    public static boolean stringContainsDigitUsingRegex(String str){
        return str.matches("\\d+");
    }

    public static boolean stringContainsDigitUsingStream(String str){
        return str.chars().allMatch(Character::isDigit);
    }
}
