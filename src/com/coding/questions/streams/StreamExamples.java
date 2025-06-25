package com.coding.questions.streams;

import java.net.Inet4Address;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,7,8,9,1,12,19,17,13,3);
        List<Integer> nums = List.of(2,4,6,8,10,12);
        List<String> names = List.of("santhosh", "ranbir", "ananya pandey", "dua lipa");
        List<List<String>> listOfLists = List.of(List.of("A", "B"), List.of("C", "D"));
        String str = "santhosh";

        //maximum number in the list; note: max always takes a comparator and returns optional.
        Optional<Integer> result = numbers.stream().max(Integer::compare);
        result.ifPresent(ans -> System.out.println("maximum number in list: " + ans));

        //count even numbers in a list
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Even numbers in a list: " + count);

        //convert list of strings to uppercase
        names.stream().map(String::toUpperCase).forEach(name -> System.out.print(name + " "));

        //Filter name starting with 'A'
        System.out.println();
        names.stream()
             .filter(name -> name.startsWith("a"))
             .forEach(name -> System.out.println("Name starts with a: " + name));

        //Find duplicates elements in a list
        List<Integer> list = List.of(1,2,2,3,4,8,9,7,9);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = list.stream().filter(n -> !seen.add(n)).toList();
        System.out.println("Duplicates: " + duplicates);

        //Get First 3 elements in a list
        List<Integer> firstThree = list.stream().limit(3).toList();
        System.out.println("First Three: " + firstThree);

        //Skip First 2 elements
        List<Integer> skipTwo = list.stream().skip(2).toList();
        System.out.println("Skip Two: " + skipTwo);

        //Sum of all numbers in a list
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers in a list: " + sum);

        //check if all numbers are even
        boolean allEven = nums.stream().allMatch(n -> n%2==0);
        System.out.println("All numbers are even: " + allEven);

        //check any number is divisible by 5
        boolean anyNumDivisibleBy5 = nums.stream().anyMatch(num -> num % 5 == 0);
        System.out.println("Any num divisible by 5: " + anyNumDivisibleBy5);

        //sort list in descending order
        List<Integer> sortedListInDescendingOrder = nums.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted list in descending order: " + sortedListInDescendingOrder);

        //sort list in ascending order
        List<Integer> sortedListInAscendingOrder = nums.stream().sorted().toList();
        System.out.println("Sorted list in ascending order: " + sortedListInAscendingOrder);

        //remove duplicates in a list
        List<Integer> unique = list.stream().distinct().toList();
        System.out.println("Unique elements: " + unique);

        //average of a list of numbers
        double avg = nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average of list of numbers: " + avg);

        //group stings by length
        Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped Strings by length: " + groupedByLength);

        //join all strings by ','
        String joinStrings = names.stream().collect(Collectors.joining(", "));
        System.out.println("Join Strings by delimiter: " + joinStrings);

        //Partition list into even and odd
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                      .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("Partition List into even and odd: " + partitioned);

        //Second Highest number
        Optional<Integer> secondHighest = numbers.stream()
                                                 .sorted(Comparator.reverseOrder())
                                                 .skip(1)
                                                 .findFirst();
        secondHighest.ifPresent(num -> System.out.println("Second Highest: " + num));

        //FlatMap list of lists,
        List<String> streamOfLists = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println("Flat map list of lists: " + streamOfLists);

        //Find frequency of each character in a string
        Map<Character, Long> frequencyMap = str.chars()
                                               .mapToObj(c -> (char)c)
                                               .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Frequency Map: " + frequencyMap);

        //Get Top 3 highest numbers
        List<Integer> top3 = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("Top 3 highest numbers: " + top3);
    }
}
