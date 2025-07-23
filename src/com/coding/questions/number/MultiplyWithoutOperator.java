package com.coding.questions.number;

public class MultiplyWithoutOperator {
    public static int multiply(int a, int b){
        if(b == 0){
            return 0;
        }
        if(b < 0){
            return -multiply(a, b-1);
        }
        return a + multiply(a, b-1);
    }
}
