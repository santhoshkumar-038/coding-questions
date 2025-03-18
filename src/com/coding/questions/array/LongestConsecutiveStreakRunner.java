package com.coding.questions.array;

public class LongestConsecutiveStreakRunner {
    public static void main(String[] args) {
       int result1 = LongestConsecutiveStreak.longestConsecutiveStreak(new int[]{0,3,7,2,5,8,4,6,0,1});
       int result2 = LongestConsecutiveStreak.longestConsecutiveStreak(new int[]{100, 4, 200, 1, 3, 2});

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
