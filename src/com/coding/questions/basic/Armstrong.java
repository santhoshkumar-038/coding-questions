package com.coding.questions.basic;

//An Armstrong number (also called a Narcissistic number)
//of n digits is a number where the sum of its digits raised to the power n is equal to the number itself.
public class Armstrong {
    public static boolean getArmstrong(int num){
        if(num < 0){
            return false;
        }
        int originalNum = num;
        int n = String.valueOf(num).length();
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num = num / 10;
        }

       return originalNum == sum;
    }
}
