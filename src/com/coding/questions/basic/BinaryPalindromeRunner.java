package com.coding.questions.basic;

public class BinaryPalindromeRunner {
    public static void main(String[] args){
        int num = 5;
        float floatNum = 5.0f;
        double doubleNum = 5.0;
       boolean result = BinaryPalindrome.binaryPalindrome(doubleNum);
       if(result){
           System.out.println("The binary representation of " + doubleNum + " is a palindrome.");
       }else{
           System.out.println("The binary representation of " + doubleNum + " is not a palindrome.");
       }
    }
}
