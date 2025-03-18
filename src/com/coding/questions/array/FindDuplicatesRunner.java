package com.coding.questions.array;

import java.util.List;

public class FindDuplicatesRunner {
    public static void main(String[] args) {
      List<Integer> result = FindDuplicates.findDuplicatesUsingMap(new int[]{1,2,3,4,2,5,5,5,6,9,7,8,6});
        System.out.println("Duplicates in Array: " + result.toString());
    }
}

