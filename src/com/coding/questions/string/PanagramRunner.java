package com.coding.questions.string;

public class PanagramRunner {
    public static void main(String[] args) {
       boolean result1 = Panagram.isPanagram("The quick brown fox jumps over the lazy dog");
       boolean result2 = Panagram.isPanagram("Hello World!");
       System.out.println("Result 1: " + result1);
       System.out.println("Result 2: " + result2);
    }
}
