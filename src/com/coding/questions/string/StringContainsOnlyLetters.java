package com.coding.questions.string;

public class StringContainsOnlyLetters {

    public static boolean stringContainsOnlyLettersUsingIsLetter(String str){
        char[] charArr = str.toCharArray();
        for(char ch: charArr){
            if(!Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }

    public static boolean stringContainsOnlyLettersUsingRegex(String str){
        return str.matches("[a-zA-Z]+");
    }

    public static boolean stringContainsOnlyLetterUsingStreams(String str){
        return str.chars().allMatch(Character::isLetter);
    }
}
