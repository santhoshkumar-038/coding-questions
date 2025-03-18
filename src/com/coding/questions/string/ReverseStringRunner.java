package com.coding.questions.string;

public class ReverseStringRunner {
    public static void main(String[] args) {
        String word = "Santhosh";
        ReverseString reverseString = new ReverseString();
        String result1 = reverseString.reverseStringWithForLoop(word);
        System.out.println("Reverse String with For Loop " + result1);

        String result2 = reverseString.reverseStringWithStringBuilder(word);
        System.out.println("Reverse String with StringBuilder " + result2);
    }
}
