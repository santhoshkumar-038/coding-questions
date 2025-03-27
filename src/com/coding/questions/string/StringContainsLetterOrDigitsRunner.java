package com.coding.questions.string;

public class StringContainsLetterOrDigitsRunner {
    public static void main(String[] args) {
        boolean result1 = StringContainsLetterOrDigits.stringContainsLetterOrDigitsUsingIsLetterOrDigit("abc123A");
        boolean result2 = StringContainsLetterOrDigits.stringContainsLetterOrDigitsUsingRegex("abc123A");
        boolean result3 = StringContainsLetterOrDigits.stringContainsLetterOrDigitsUsingRegex("abc123AB");

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}
