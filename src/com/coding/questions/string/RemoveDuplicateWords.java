package com.coding.questions.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static String removeDuplicateWords(String str){
        Set<String> wordSet = new HashSet<>();
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");

        for(String word: words) {
            if(!wordSet.contains(word)){
                wordSet.add(word);
                result.append(word).append(" ");
            }
        }

        return result.toString();
    }
}
