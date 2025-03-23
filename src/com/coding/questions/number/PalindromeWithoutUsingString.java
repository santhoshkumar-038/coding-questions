package com.coding.questions.number;

public class PalindromeWithoutUsingString {
    public static boolean palindrom(int num){
        int reversed = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if(reversed == num){
            return true;
        }
        return false;
    }
}
