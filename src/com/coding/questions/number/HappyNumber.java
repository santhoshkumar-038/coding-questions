package com.coding.questions.number;

public class HappyNumber {

    public static boolean isHappy(int num){
        int slow = num, fast = num;
        do{
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        }while (slow != fast);

        return slow == 1;
    }

    private static int getSumOfSquares(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
}
