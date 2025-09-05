package com.coding.questions.array;

public class MaxSumSubArrayRunner {
    public static void main(String[] args){
        int[] arr = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        int k = 5;

        int result = MaxSumSubArray.findMaxSumSubArray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " = " + result);
    }
}
