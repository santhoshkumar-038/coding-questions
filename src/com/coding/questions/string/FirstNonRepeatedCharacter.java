package com.coding.questions.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public Character firstNonRepeatedCharacter(String str){
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char c: str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for(char c: str.toCharArray()){
            if(charCountMap.get(c) == 1){
                return c;
            }
        }

        return null;
    }

    public Character firstNonRepeatedCharacterWithContainsKey(String str){
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: str.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            }else{
                charCount.put(c, 1);
            }
        }

        for(char c: str.toCharArray()){
            if(charCount.get(c) == 1){
                return c;
            }
        }

        return null;
    }

    public int firstNonRepeatedCharacterIndex(String str){
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for(int i=0; i<str.length(); i++){
            char key = str.charAt(i);
            if(charCount.get(key) == 1){
                return i;
            }
        }
        return -1;
    }
}
