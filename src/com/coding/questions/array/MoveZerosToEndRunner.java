package com.coding.questions.array;

import java.util.Arrays;

public class MoveZerosToEndRunner {
    public static void main(String[] args) {
        int[] result = MoveZerosToEnd.moveZerosToEnd(new int[]{1, 2, 0, 4, 0, 5});
        System.out.println("Result 1 " + Arrays.toString(result));
    }
}
