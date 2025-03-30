package com.coding.questions.number;

public class DigitCounter {
    public static int digitCounter(int num){
        if(num == 0){
            return 1;
        }

        int count = 0, temp = num;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }

        return count;
    }
}
