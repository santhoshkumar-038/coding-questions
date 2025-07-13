package com.coding.questions.array;

import java.util.List;

public class AndProductSum {
    public static long andProductSum(List<Integer> arr){
        int n = arr.size();
        long sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum += arr.get(i) & arr.get(j);
            }
        }
        return sum;
    }
}
