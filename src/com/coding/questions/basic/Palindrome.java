package com.coding.questions.basic;

public class Palindrome {

    public boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
