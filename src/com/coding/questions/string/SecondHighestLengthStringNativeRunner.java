package com.coding.questions.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestLengthStringNativeRunner {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("kiwi", "apple", "banana", "dragon fruit", "pomegranate","grapes");
        String result = SecondHighestLengthStringNative.secondHighestLengthStringNative(fruits);
        //System.out.println("Result: " + result);

        String secondLongest = fruits.stream().sorted((a,b) -> Integer.compare(b.length(),a.length())).distinct().skip(1).findFirst().orElse(null);
        System.out.println("Result: " + secondLongest);
    }
}
