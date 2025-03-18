package com.coding.questions.string;

public class OnlyDigitCheckerRunner {
    public static void main(String[] args) {
        boolean result1 = OnlyDigitChecker.containsOnlyDigitUsingMatches("12345");
        boolean result2 = OnlyDigitChecker.containsOnlyDigitUsingMatches("12a345");
        boolean result3 = OnlyDigitChecker.containsOnlyDigitUsingMatches("");
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
