package com.coding.questions.array;

public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] arr){
        int nonZeroIndex = 0;
        //we are using nonZeroIndex in such a way that, it stops at zero, when current element
        //is a zero, we are not entering into if block, then nonZeroIndex stops at zero, current i
        // it is equal to it, then we are swapping.
        //1, 2, 0, 4, 0, 5
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                if(i!=nonZeroIndex){
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
        return arr;
    }
}
