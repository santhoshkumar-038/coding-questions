package com.coding.questions.array;

public class MaxSumSubArray {

    public static int findMaxSumSubArray(int[] arr, int k){
        if(arr.length < k){
            return -1;
        }

        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int maxSum = sum;
        for(int i=k; i<arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
