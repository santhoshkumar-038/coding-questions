package com.coding.questions.array;

import java.util.Arrays;

public class ReverseArrayRunner {
    public static void main(String[] args) {
        int[] result = ReverseArray.reverseArray(new int[]{10, 2, 8, 4, 6});
        Arrays.stream(result).forEach(System.out::println);
    }
}
