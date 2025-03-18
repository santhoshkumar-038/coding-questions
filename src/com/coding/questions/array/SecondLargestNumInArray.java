package com.coding.questions.array;

public class SecondLargestNumInArray {

    public int secondLargestNumInArray(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Array must have at least two distinct elements.");
        }

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = num;
            }else if(num > secondLargestNumber && num < largestNumber){
                secondLargestNumber = num;
            }
        }

        return (secondLargestNumber == Integer.MIN_VALUE) ? -1 : secondLargestNumber;
    }
}
