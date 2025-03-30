package com.coding.questions.array;

public class ReverseArray {
    public static int[] reverseArray(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return nums;
    }
}
