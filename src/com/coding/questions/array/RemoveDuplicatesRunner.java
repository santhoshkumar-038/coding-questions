package com.coding.questions.array;

public class RemoveDuplicatesRunner {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int[] result1 = RemoveDuplicates.removeDuplicates(arr);
        for(int num: result1){
            System.out.println(num);
        }
    }
}
