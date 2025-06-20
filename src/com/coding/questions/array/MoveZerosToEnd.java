package com.coding.questions.array;

public class MoveZerosToEnd {

    public static int[] moveZerosToEnd(int[] arr){
        // This variable keeps track of the position where the next non-zero element should go.
        int nonZeroIndex = 0;

        // Loop through the entire array
        for(int i = 0; i < arr.length; i++){

            // If the current element is not zero, we need to move it to the front
            if(arr[i] != 0){

                // If current index 'i' is not the same as 'nonZeroIndex', we need to swap
                // This happens when there have been zeros before index 'i'
                if(i != nonZeroIndex){
                    // Swap current element with the element at nonZeroIndex
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }

                // Move the nonZeroIndex forward to the next position
                nonZeroIndex++;
            }
            // If arr[i] == 0, we do nothing and just continue looping.
            // The nonZeroIndex stays where it is, waiting for the next non-zero element to come.
        }

        // After the loop ends, all non-zero elements will have been moved to the front
        // and all zeros will be shifted to the end of the array.
        return arr;
    }
}

