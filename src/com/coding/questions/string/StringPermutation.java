package com.coding.questions.string;

public class StringPermutation {
    public static void stringPermutation(String str, String result){
        if (str.isEmpty()){
            System.out.println(result);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i+1);
            stringPermutation(remaining, result + ch);
        }
    }
}
