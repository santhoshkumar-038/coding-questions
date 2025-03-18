package com.coding.questions.array;

public class MissingNumberFinderRunner {
    public static void main(String[] args) {
       int result1 = MissingNumberFinder.findMissingNumber(new int[]{1, 2, 4, 5, 6});
       System.out.println("Result 1: " + result1);

       int result2 = MissingNumberFinder.findMissingNumber(new int[]{3, 7, 1, 2, 8, 4, 5});
       System.out.println("Result 2: " + result2);
    }
}
