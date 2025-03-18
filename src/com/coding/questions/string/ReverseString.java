package com.coding.questions.string;

public class ReverseString {
    public String reverseStringWithForLoop(String str){
        String reversedString = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public String reverseStringWithStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
