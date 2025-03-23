package com.coding.questions.array;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {
       int[] result = SelectionSort.selectionSort(new int[]{399, 899, 1999, 1199, 1299});
       Arrays.stream(result).forEach(System.out::println);
    }
}
