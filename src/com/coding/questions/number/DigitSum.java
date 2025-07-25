package com.coding.questions.number;

public class DigitSum {
    public static int getSingleDigit(int num){
        while (num > 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
