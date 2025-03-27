package com.coding.questions.string;

public class StringContainsDigitRunner {
    public static void main(String[] args) {
      boolean result1 = StringContainsDigit.stringContainsDigitUsingIsDigit("123456");
      System.out.println("Result1: " + result1);

      boolean result2 = StringContainsDigit.stringContainsDigitUsingRegex("1234560a");
      System.out.println("Result2: " + result2);

      boolean result3 = StringContainsDigit.stringContainsDigitUsingStream("12345678");
      System.out.println("Result3: " + result3);
    }
}
