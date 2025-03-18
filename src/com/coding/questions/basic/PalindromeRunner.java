package com.coding.questions.basic;

public class PalindromeRunner {
    public static void main(String[] args) {
        String word = "racecara";
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(word);
        if(result){
            System.out.println("Given word is Palindrome " + word);
        }else{
            System.out.println("Given word is not a Palindrome " + word);
        }
    }
}
