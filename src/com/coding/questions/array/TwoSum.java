package com.coding.questions.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int pair = target - arr[i];
            if(map.containsKey(pair)){
                return new int[]{map.get(pair), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
}
