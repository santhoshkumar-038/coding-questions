package com.coding.questions.string;

//  Remove Consecutive Duplicates from a String

public class RemoveConsecutiveDuplicates{
    public static String removeConsecutiveDuplicates(String str){
        if(str == null || str.isEmpty()){
            return str;
        }

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) != str.charAt(i)){
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
