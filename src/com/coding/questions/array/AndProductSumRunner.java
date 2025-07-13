package com.coding.questions.array;

import java.util.List;

public class AndProductSumRunner {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3);
        long sum = AndProductSum.andProductSum(arr);
        System.out.println("And Product Sum: " + sum);
    }
}
