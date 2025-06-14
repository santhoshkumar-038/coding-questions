package com.coding.questions.string;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {
    public static String longestUniqueSubString(String str){
        Set<Character> charSet = new HashSet<>();
        int left = 0, maxLength = 0, startIndex = 0;
        String longestSubString = "";
        //right moves forward to detect the duplicates....
        for(int right = 0; right < str.length(); right++){
            //if the duplicate is found we remove from the left until the duplicate is removed.
            while(charSet.contains(str.charAt(right))){
                charSet.remove(str.charAt(right));
                left++;
            }

            charSet.add(str.charAt(right));

            if(right-left+1 > maxLength){
                maxLength = right - left + 1;
                startIndex = left;
                longestSubString = str.substring(startIndex, startIndex + maxLength);
            }
        }

        return longestSubString;
    }
}
