package com.coding.questions.array;

//Write a Java program to find the missing number in an array containing N distinct numbers from 1 to N+1.
//(Only one number is missing, and no duplicates exist.)
public class MissingNumberFinder {

    public static int findMissingNumber(int[] numArray){
        int n = numArray.length + 1;
        int expectedSum = (n * (n+1)) / 2;
        int actualSum = 0;
        for(int i: numArray){
            actualSum += i;
        }

        int missingNumber  = expectedSum - actualSum;
        return missingNumber;
    }
}
