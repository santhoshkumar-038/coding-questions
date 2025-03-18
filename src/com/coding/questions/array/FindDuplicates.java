package com.coding.questions.array;

import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr){
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(int num: arr){
            if(seen.contains(num)){
                duplicates.add(num);
            }else{
                seen.add(num);
            }
        }

        return duplicates;
    }

    public static List<Integer> findDuplicatesUsingMap(int[] arr){
        List<Integer> duplicates = new ArrayList<>();
        HashMap<Integer, Integer> freqCount = new HashMap<>();

        for(int num: arr){
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: freqCount.entrySet()){
            if(entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
