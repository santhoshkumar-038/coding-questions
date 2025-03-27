package com.coding.questions.string;

public class StringContainsOnlyLettersRunner {
    public static void main(String[] args) {
        boolean result1 = StringContainsOnlyLetters.stringContainsOnlyLettersUsingIsLetter("abcdef");
        boolean result2 = StringContainsOnlyLetters.stringContainsOnlyLettersUsingRegex("Abacedf");
        boolean result3 = StringContainsOnlyLetters.stringContainsOnlyLetterUsingStreams("ABCDEF");

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
    }
}
