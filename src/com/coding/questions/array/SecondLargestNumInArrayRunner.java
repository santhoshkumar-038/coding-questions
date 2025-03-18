package com.coding.questions.array;

public class SecondLargestNumInArrayRunner {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 8, 10};
        SecondLargestNumInArray secondLargestNumInArray = new SecondLargestNumInArray();
        int result = secondLargestNumInArray.secondLargestNumInArray(arr);
        System.out.println(result);
    }
}
