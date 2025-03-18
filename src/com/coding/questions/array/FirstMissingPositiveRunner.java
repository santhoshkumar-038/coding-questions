package com.coding.questions.array;

public class FirstMissingPositiveRunner {
    public static void main(String[] args) {
        int result1 = FirstMissingPositive.firstMissingPositive(new int[]{3, 4, 1, -1});
        System.out.println("Result1: " + result1);

        int result2 = FirstMissingPositive.firstMissingPositive(new int[]{2,3,4,-1});
        System.out.println("Result2: " + result2);
    }
}
