package com.coding.questions.string;

public class ValidParenthesesRunner {
    public static void main(String[] args) {
        String word1 = "({[]})";
        String word2 = "({[})";
        boolean result1 = ValidParentheses.isValid(word1);
        boolean result2 = ValidParentheses.isValid(word2);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
