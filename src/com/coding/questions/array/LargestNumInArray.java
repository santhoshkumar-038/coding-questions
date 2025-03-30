package com.coding.questions.array;

public class LargestNumInArray {
    public static int largestNumInArray(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int num: nums){
            if(num > largest){
                largest = num;
            }
        }

        return (largest == Integer.MIN_VALUE) ? -1 : largest;
    }
}
