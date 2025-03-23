package com.coding.questions.number;

//Reverse an Integer Without Using String
public class ReverseNumber {
    public int reverseNumber(int num){
        if(num < 0){
            return -1;
        }

        int reversed = 0;
        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return reversed;
    }
}
