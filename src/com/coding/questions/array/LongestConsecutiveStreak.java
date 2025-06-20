package com.coding.questions.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveStreak {

    public static int longestConsecutiveStreak(int[] nums){
        // Edge case: if input array is null or empty, return 0
        if(nums == null || nums.length == 0){
            return 0;
        }

        // Create a HashSet to store all numbers from the array
        // This allows for quick lookup (O(1) time complexity)
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        // Variable to keep track of the longest streak found
        int longestStreak = 0;

        // Loop through each number in the array
        for(int num : nums) {

            // Only start counting if 'num - 1' is NOT in the set
            // This ensures we only start at the beginning of a sequence
            if(!set.contains(num - 1)){
                int currentNum = num;        // Start of the current streak
                int currentStreak = 1;       // Length of current streak

                // Check for the next numbers in the sequence
                while(set.contains(currentNum + 1)){
                    currentNum += 1;         // Move to the next number
                    currentStreak += 1;      // Increase streak count
                }

                // Update the longest streak if current one is longer
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        // Return the length of the longest consecutive sequence found
        return longestStreak;
    }
}
