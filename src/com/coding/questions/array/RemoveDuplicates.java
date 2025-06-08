package com.coding.questions.array;

import com.coding.questions.string.Panagram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums){
        Set<Integer> numSet = new LinkedHashSet<>();
        for(int n: nums){
            numSet.add(n);
        }

        int[] arr = new int[numSet.size()];
        int index = 0;
        for(int n: numSet){
            arr[index] = n;
            index++;
        }
        return arr;
    }
}
