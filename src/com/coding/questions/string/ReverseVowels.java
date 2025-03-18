package com.coding.questions.string;

//Write a method that takes a string as input and reverses only the vowels,
//while keeping the other characters in their original positions.
public class ReverseVowels {
    public static String reverseVowels(String str){
        if(str == null || str.isEmpty()){
            return str;
        }

        char[] chars = str.toCharArray();
        int left=0, right=chars.length-1;
        String vowels = "aeiouAEIOU";

        while (left < right){
            // Move left pointer until it finds a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1){
                left++;
            }

            // Move right pointer until it finds a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1){
                right--;
            }

            // Swap vowels at left and right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
