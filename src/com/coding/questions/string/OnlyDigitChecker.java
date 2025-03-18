package com.coding.questions.string;

//Write a Java program to check if a string contains only digits (0-9) without using built-in functions
// like matches() or Character.isDigit().
public class OnlyDigitChecker {

    public static boolean containsOnlyDigit(String str){
        if(str == null || str.isEmpty()){
            return false;
        }

        char[] charArray = str.toCharArray();
        for(char ch: charArray){
            if(ch < '0' || ch > '9'){
                return false;
            }
        }

        return true;
    }

    public static boolean containsOnlyDigitUsingIsDigit(String str){
        if(str == null || str.isEmpty()){
            return false;
        }

        char[] charArray = str.toCharArray();
        for(char ch: charArray) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigitUsingMatches(String str){
        return str!=null && str.matches("\\d+");
    }
}
