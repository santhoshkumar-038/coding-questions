package com.coding.questions.array;

public class TwoSumRunner {
    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 11};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
